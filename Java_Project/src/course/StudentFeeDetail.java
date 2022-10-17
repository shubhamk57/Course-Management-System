package course;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentFeeDetail {

	JFrame frame;
	JTable j1;
    JButton b1;
    String h[]={"Roll Number","Course","Branch","Semester","Total Amount"};
    String d[][]=new String[25][7];
    int i=0,j=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentFeeDetail window = new StudentFeeDetail();
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
	public StudentFeeDetail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        frame = new JFrame("View Students Fees Details");
		
        try {
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "12345");
			PreparedStatement st = (PreparedStatement) connection.prepareStatement("select * from fee");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				d[i][j++] = rs.getString("rollno");
				d[i][j++] = rs.getString("course");
				d[i][j++] = rs.getString("branch");
				d[i][j++] = rs.getString("semester");
				d[i][j++] = rs.getString("amount");
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
		
		frame.setSize(1000,400);
        frame.setLocation(400,150);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
