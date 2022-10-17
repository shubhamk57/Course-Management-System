package course;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class StudentFeeForm implements ActionListener {

	JFrame frame;
    JButton b1,b2;
    Choice c1,c2,c3,j2;
    JTextField t3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentFeeForm window = new StudentFeeForm();
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
	public StudentFeeForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Fee Form");
		
		JLabel label = new JLabel();
		label.setSize(550, 550);
		frame.add(label);
		
		JLabel roll = new JLabel("Select Roll No");
		roll.setForeground(Color.blue);
		roll.setBounds(80, 45, 110, 50);
		roll.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.add(roll);
		
		c1 = new Choice();
		c1.setBounds(280, 60, 156, 30);
		try {
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "12345");
			PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from students");
			ResultSet rs = st.executeQuery();
			while(rs.next()){
                c1.add(rs.getString("rollno"));    
            }
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
		label.add(c1);
		
		JLabel l3 = new JLabel("Course");
		l3.setForeground(Color.blue);
		l3.setFont(new Font("Tahoma", Font.BOLD, 15));
		l3.setBounds(80, 105, 110, 22);
		label.add(l3);
		
		c2 = new Choice();
		c2.add("B.Tech");
		c2.setForeground(Color.blue);
		c2.setFont(new Font("Tahoma", Font.BOLD, 15));
		c2.setBounds(280, 110, 156, 30);
		label.add(c2);
		
		JLabel l4 = new JLabel("Branch");
		l4.setForeground(Color.blue);
		l4.setFont(new Font("Tahoma", Font.BOLD, 15));
		l4.setBounds(80, 155, 110, 22);
		label.add(l4);
		
        c3 = new Choice();
		c3.setForeground(Color.blue);
		c3.setFont(new Font("Tahoma", Font.BOLD, 15));
		c3.setBounds(280, 160, 156, 20);
		c3.add("CSE");
		c3.add("ME");
		c3.add("EC");
		c3.add("IT");
		c3.add("ECE");
		label.add(c3);
		
		JLabel l5 = new JLabel("Semester");
		l5.setForeground(Color.blue);
		l5.setFont(new Font("Tahoma", Font.BOLD, 15));
		l5.setBounds(80, 205, 110, 22);
		label.add(l5);
		
		j2 = new Choice();
		j2.setForeground(Color.blue);
		j2.setFont(new Font("Tahoma", Font.BOLD, 15));
		j2.setBounds(280, 210, 156, 20);
		j2.add("1st");
		j2.add("2nd");
		j2.add("3rd");
		j2.add("4th");
		j2.add("5th");
		j2.add("6th");
		j2.add("7th");
		j2.add("8th");
		label.add(j2);
		
		JLabel l6 = new JLabel("Total Amount");
		l6.setForeground(Color.blue);
		l6.setFont(new Font("Tahoma", Font.BOLD, 15));
		l6.setBounds(80, 255, 110, 22);
		label.add(l6);
		
		t3 = new JTextField();
		t3.setForeground(Color.blue);
		t3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		t3.setBounds(280, 260, 156, 20);
		label.add(t3);
		
		b1 = new JButton("Pay Amount");
		b1.setForeground(Color.white);
		b1.setBackground(Color.black);
		b1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		b1.setBounds(80, 320, 355, 30);
		label.add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Cancel");
		b2.setForeground(Color.red);
		b2.setBackground(Color.black);
		b2.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		b2.setBounds(80, 390, 355, 30);
		label.add(b2);
		b2.addActionListener(this);
		
		frame.setBounds(500, 100, 550, 550);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1)
		{
			try {
				Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "nirmal@1999");
				PreparedStatement st = (PreparedStatement) connection.prepareStatement("insert into fee(rollno,course,branch,semester,amount) values (?,?,?,?,?);");
				
				st.setString(1, c1.getSelectedItem());
				st.setString(2, c2.getSelectedItem());
				st.setString(3, c3.getSelectedItem());
				st.setString(4, j2.getSelectedItem());
				st.setString(5, t3.getText());
				
				st.executeUpdate();
				JOptionPane.showMessageDialog(b1, "Payment sucessfully.");
				frame.setVisible(false);
				new StudentFeeDetail().frame.setVisible(true);
			}
			catch(Exception exception) {
				exception.printStackTrace();
			}
		}
		else if(e.getSource() == b2) {
			frame.setVisible(false);
		}
		
	}

}
