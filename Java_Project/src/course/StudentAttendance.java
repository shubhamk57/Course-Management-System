package course;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class StudentAttendance implements ActionListener {

	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6,l7,lb,l,date;
    JTextField t1,t2,t3,t4,t5,t6,t7,dateField;
    JButton b1,b2;
    Choice c2,fh,sh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentAttendance window = new StudentAttendance();
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
	public StudentAttendance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		JLabel label = new JLabel();
		label.setBounds(0, 0, 550, 500);
		frame.add(label);
		
		lb = new JLabel("Student Attendance");
        lb.setBounds(100,10,500,50);
        lb.setFont(new Font("serif",Font.BOLD,30));
        lb.setForeground(Color.RED);
        label.add(lb);
        
        l = new JLabel("Select Roll Number");
        l.setFont(new Font("serif",Font.BOLD,15));
        l.setBounds(100, 90, 150, 50);
        label.add(l);
        
        c2 = new Choice();
        c2.setBounds(250, 100, 100, 50);
        try {
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "12345");
			PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from students");
			ResultSet rs = st.executeQuery();
			while(rs.next()){
                c2.add(rs.getString("rollno"));    
            }
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
        label.add(c2);
        
        date = new JLabel("Date");
        date.setFont(new Font("serif",Font.BOLD,15));
        date.setBounds(100, 155, 150, 50);
        label.add(date);
        
        dateField = new JTextField();
        dateField.setBounds(250, 165, 100, 25);
        label.add(dateField);
      
        l1 = new JLabel("First Half");
        l1.setFont(new Font("serif",Font.BOLD,15));
        l1.setBounds(100, 220, 100, 50);
        label.add(l1);
        
        fh = new Choice();
        fh.setBounds(250, 230, 100, 50);
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");
        label.add(fh);
        
        l2 = new JLabel("Second Half");
        l2.setFont(new Font("serif",Font.BOLD,15));
        l2.setBounds(100, 300, 100, 50);
        label.add(l2);
        
        sh = new Choice();
        sh.setBounds(250, 310, 100, 50);
        sh.add("Present");
        sh.add("Absent");
        sh.add("Leave");               
        label.add(sh);
       
        b1 =new JButton("Submit");
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBounds(100, 400, 100, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        label.add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBounds(250, 400, 100, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        label.add(b2);
        b2.addActionListener(this);

        frame.setSize(500,550);
        frame.setLocation(600,200);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b2) {
			frame.setVisible(false);
		}
		else if(e.getSource() == b1) {
			try {
				Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "12345");
				PreparedStatement st = (PreparedStatement) connection.prepareStatement("insert into attendance_student(rollno,atten_date,first_half,second_half) values (?,?,?,?);");
				
				st.setString(1, c2.getSelectedItem());
				st.setString(2, dateField.getText());
				st.setString(3, fh.getSelectedItem());
				st.setString(4, sh.getSelectedItem());
				
				st.executeUpdate();
				JOptionPane.showMessageDialog(b1, "Student Attendance added sucessfully.");
				frame.setVisible(false);
				new StudentAttendance().frame.setVisible(true);
			}
			catch(Exception exception) {
				exception.printStackTrace();
			}
		}
	}

}
