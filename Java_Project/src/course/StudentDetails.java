package course;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class StudentDetails implements ActionListener {

	JFrame frame;
	JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"Name","Father's Name","Age","Date of Birth","Address","Phone","Email", "Aadhar No","Roll No","Course","Branch"};
    String y[][] = new String[20][13];
    int i = 0, j = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetails window = new StudentDetails();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Student Details");
		
		
		l1 = new JLabel("Enter roll number to delete Student : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        frame.add(l1);
        
        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        frame.add(t2);
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100 ,30);
        frame.add(b1);
        b1.addActionListener(this);
            
        l2 = new JLabel("Add New Student");
        l2.setBounds(50,450,400,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        frame.add(l2);
        
        b2 = new JButton("Add Student");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150 ,30);
        frame.add(b2);
        b2.addActionListener(this);
        
        try{
        	Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "12345");
			PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from students");
            ResultSet rs  = st.executeQuery();
            while(rs.next()){
                y[i][j++]=rs.getString("student_name");
                y[i][j++]=rs.getString("father_name");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("adhar");
                y[i][j++]=rs.getString("rollno");
                y[i][j++]=rs.getString("course");
                y[i][j++]=rs.getString("branch");
                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        frame.add(sp);
        
        frame.getContentPane().setBackground(Color.WHITE);
		
        frame.setSize(1260,550);
        frame.setLocation(200,100);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b2) {
			new AddStudent().frame.setVisible(true);
			frame.setVisible(false);
		}
		else if(e.getSource() == b1) {
			try {
				String a = t2.getText();
				Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "nirmal@1999");
				PreparedStatement st = (PreparedStatement) connection.prepareStatement("delete from students where rollno = '"+a+"'");
				st.executeUpdate();
				frame.setVisible(false);
                new StudentDetails().frame.setVisible(true);
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}
