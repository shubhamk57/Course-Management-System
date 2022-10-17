package course;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;

public class AddStudent implements ActionListener{

	JFrame frame;
	JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1;
    Choice c1,c2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
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
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		id15=new JLabel();
        id15.setBounds(0,0,900,700);
		
		id8 = new JLabel("New Student Details");
        id8.setBounds(280,30,500,50);
        id8.setFont(new Font("serif",Font.BOLD,40));
        id8.setForeground(Color.RED);
        id15.add(id8);
        frame.add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        id15.add(t7);


        id11= new JLabel("Aadhar No.");
        id11.setBounds(400,300,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(600,300,150,30);
        id15.add(t10);

        id12= new JLabel("Roll No.");
        id12.setBounds(50,350,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,350,150,30);
        id15.add(t11);


        lab=new JLabel("Course");
        lab.setBounds(400,350,150,30);
	    lab.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab);
            
        c1 = new Choice();
        c1.setBackground(Color.WHITE);
        c1.setBounds(600,350,150,30);
        c1.add("B.Tech");
        id15.add(c1);
        
        lab2=new JLabel("Branch");
        lab2.setBounds(50,400,150,30);
	    lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);
        
        c2 = new Choice();
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,400,150,30);
        c2.add("CSE");
        c2.add("ME");
        c2.add("CE");
        c2.add("ECE");
        id15.add(c2);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(200,500,150,40);
        b.setFont(new Font("serif",Font.BOLD,20));
        id15.add(b);
        b.addActionListener(this);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(600,500,150,40);
        b1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(b1);
        b1.addActionListener(this);
		
		frame.setSize(900, 700);
		frame.setLocation(400, 100);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) {
			frame.setVisible(false);
		}
		else if(e.getSource() == b)
		{
			try {
				Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "12345");
				PreparedStatement st = (PreparedStatement) connection.prepareStatement("insert into students(student_name,father_name,age,dob,address,phone,email,adhar,rollno,course,branch) values (?,?,?,?,?,?,?,?,?,?,?);");
				
				st.setString(1, t1.getText());
				st.setString(2, t2.getText());
				st.setString(3, t3.getText());
				st.setString(4, t4.getText());
				st.setString(5, t5.getText());
				st.setString(6, t6.getText());
				st.setString(7, t7.getText());
				st.setString(8, t10.getText());
				st.setString(9, t11.getText());
				st.setString(10, c1.getSelectedItem());
				st.setString(11, c2.getSelectedItem());
				
				st.executeUpdate();
				JOptionPane.showMessageDialog(b, "Student Details added sucessfully.");
				frame.setVisible(false);
				new StudentDetails().frame.setVisible(true);
			}
			catch(Exception exception) {
				exception.printStackTrace();
			}
		}
	}

}
