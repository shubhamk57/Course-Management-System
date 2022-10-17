package course;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class MarksDetails implements ActionListener {

	JFrame frame;
	JTable j1;
	JButton button;
	JTextField field;
	String h[] = {"Roll No.","Sub 1","Mark","Sub 2","Mark","Sub 3","Mark","Sub 4","Mark","Sub 5","Mark"};
	String d[][] = new String[15][11];
    int i=0,j=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarksDetails window = new MarksDetails();
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
	public MarksDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Marks Details");
		
		JLabel label = new JLabel("Enter Roll Number");
		label.setBounds(100, 300, 200, 30);
		label.setFont(label.getFont().deriveFont(20.0f));
		frame.add(label);
		
		field = new JTextField();
		field.setBounds(300, 305, 120, 25);
		field.setFont(field.getFont().deriveFont(15.0f));
		frame.add(field);
		
		button = new JButton("Delete Results");
		button.setFont(button.getFont().deriveFont(15.0f));
		button.setBounds(450, 305, 150, 25);
		button.setBackground(Color.red);
		button.setForeground(Color.white);
		frame.add(button);
		button.addActionListener(this);
		
		try {
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "12345");
			PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from marks_values");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				d[i][j++] = rs.getString("rollno");
				d[i][j++] = rs.getString("sub1");
				d[i][j++] = rs.getString("marks1");
				d[i][j++] = rs.getString("sub2");
				d[i][j++] = rs.getString("marks2");
				d[i][j++] = rs.getString("sub3");
				d[i][j++] = rs.getString("marks3");
				d[i][j++] = rs.getString("sub4");
				d[i][j++] = rs.getString("marks4");
				d[i][j++] = rs.getString("sub5");
				d[i][j++] = rs.getString("marks5");
				i++;
				j=0;
			}
			j1 = new JTable(d, h);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		JScrollPane s1 = new JScrollPane(j1);
		frame.add(s1);
		
		frame.setSize(1000, 400);
		frame.setLocation(400, 150);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			try {
				String a = field.getText();
				Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "nirmal@1999");
				PreparedStatement st = (PreparedStatement) connection.prepareStatement("delete from marks where rollno = '"+a+"'");
				st.executeUpdate();
				frame.setVisible(false);
                new MarksDetails().frame.setVisible(true);
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}

}
