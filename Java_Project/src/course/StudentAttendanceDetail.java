package course;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

public class StudentAttendanceDetail {

	JFrame frame;
	JTable j1;
    JButton b1;
    String h[]={"Roll Number","Date Time","First Half","Second Half"};
    String d[][]=new String[15][4];  
    int i=0,j=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentAttendanceDetail window = new StudentAttendanceDetail();
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
	public StudentAttendanceDetail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("View Students Attendance");
		
		try {
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "12345");
			PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from attendance_student");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				d[i][j++] = rs.getString("rollno");
				d[i][j++] = rs.getString("atten_date");
				d[i][j++] = rs.getString("first_half");
				d[i][j++] = rs.getString("second_half");
				i++;
				j=0;
			}
			j1 = new JTable(d, h);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		JScrollPane s1 = new JScrollPane(j1);
		frame.add(s1);
		
		b1=new JButton("Print");
        frame.add(b1,"South");
		
		frame.setSize(800,300);
        frame.setLocation(450,150);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
