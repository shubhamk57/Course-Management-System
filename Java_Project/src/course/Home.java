package course;

import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Home implements ActionListener {

	JFrame frame;
	private ImageIcon imageIcon;
	private JLabel iconLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		imageIcon = new ImageIcon(this.getClass().getResource("1.jpg"));
		iconLabel = new JLabel(imageIcon);
		iconLabel.setSize(1200, 700);
		
		JMenuBar mb  = new JMenuBar();
        JMenu admin = new JMenu("Admin");
        JMenuItem m1 = new JMenuItem("New Faculty");
        JMenuItem m2 = new JMenuItem("New Student Admission");
        admin.setForeground(Color.BLUE);
        admin.setFont(admin.getFont().deriveFont(20.0f));
        m1.addActionListener(this);
        m2.addActionListener(this);
        
        ImageIcon icon1 = new ImageIcon(this.getClass().getResource("icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setFont(new Font("monospaced",Font.BOLD,18));
        m1.setBackground(Color.WHITE);
        admin.add(m1);
        
        ImageIcon icon2 = new ImageIcon(this.getClass().getResource("icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setFont(new Font("monospaced",Font.BOLD,18));
        m2.setBackground(Color.WHITE);
        admin.add(m2);
        
        JMenu user = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.RED);
        user.setFont(user.getFont().deriveFont(20.0f));
        u1.addActionListener(this);
        u2.addActionListener(this);
        
        ImageIcon icon3 = new ImageIcon(this.getClass().getResource("icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image3));
        u1.setFont(new Font("monospaced",Font.BOLD,18));
        u1.setBackground(Color.WHITE);
        user.add(u1);
     
        ImageIcon icon4 = new ImageIcon(this.getClass().getResource("icon4.jpg"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image4));
        u2.setFont(new Font("monospaced",Font.BOLD,18));
        u2.setBackground(Color.WHITE);
        user.add(u2);
        
        JMenu attendance = new JMenu("Attendance");
        JMenuItem a1 = new JMenuItem("Student Attendance");
        JMenuItem a2 = new JMenuItem("Teacher Attendance");
        attendance.setForeground(Color.BLUE);
        attendance.setFont(attendance.getFont().deriveFont(20.0f));
        a1.addActionListener(this);
        a2.addActionListener(this);
        
        a1.setFont(new Font("monospaced",Font.BOLD,18));
        ImageIcon icon23 = new ImageIcon(this.getClass().getResource("icon14.jpg"));
        Image image24 = icon23.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a1.setIcon(new ImageIcon(image24));
        a1.setBackground(Color.WHITE);
        attendance.add(a1);
        
        a2.setFont(new Font("monospaced",Font.BOLD,18));
        ImageIcon icon25 = new ImageIcon(this.getClass().getResource("icon15.png"));
        Image image26 = icon25.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a2.setIcon(new ImageIcon(image26));
        a2.setBackground(Color.WHITE);
        attendance.add(a2);
		
        JMenu attendance_detail = new JMenu("Attendance Detail");
        JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");
        attendance_detail.setForeground(Color.RED);
        attendance_detail.setFont(attendance_detail.getFont().deriveFont(20.0f));
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        b1.setFont(new Font("monospaced",Font.BOLD,18));
        ImageIcon icon27 = new ImageIcon(this.getClass().getResource("icon14.jpg"));
        Image image28 = icon27.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(image28));
        b1.setBackground(Color.WHITE);
        attendance_detail.add(b1);
        
        b2.setFont(new Font("monospaced",Font.BOLD,18));
        ImageIcon icon29 = new ImageIcon(this.getClass().getResource("icon15.png"));
        Image image30 = icon29.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b2.setIcon(new ImageIcon(image30));
        b2.setBackground(Color.WHITE);
        attendance_detail.add(b2);
        
        JMenu exam = new JMenu("Examination");
        JMenuItem c2 = new JMenuItem("Marks Details");
        JMenuItem c1 = new JMenuItem("Enter Marks");
        exam.setForeground(Color.BLUE);
        exam.setFont(exam.getFont().deriveFont(20.0f));
        c1.addActionListener(this);
        c2.addActionListener(this);
        
        c1.setFont(new Font("monospaced",Font.BOLD,18));
        ImageIcon icon16 = new ImageIcon(this.getClass().getResource("icon17.png"));
        Image image16 = icon16.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c1.setIcon(new ImageIcon(image16));
        c1.setBackground(Color.WHITE);
        exam.add(c1);
        
        c2.setFont(new Font("monospaced",Font.BOLD,18));
        ImageIcon icon17 = new ImageIcon(this.getClass().getResource("icon16.png"));
        Image image17 = icon17.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c2.setIcon(new ImageIcon(image17));
        c2.setBackground(Color.WHITE);
        exam.add(c2);
        
        
        JMenu fee = new JMenu("Fee Details");
        JMenuItem s1 = new JMenuItem("Fee Structure");
        JMenuItem s2 = new JMenuItem("Student Fee Form");
        JMenuItem s3 = new JMenuItem("Student Fees Details");
        fee.setForeground(Color.RED);
        fee.setFont(fee.getFont().deriveFont(20.0f));
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        
        s1.setFont(new Font("monospaced",Font.BOLD,18));
        ImageIcon icon7 = new ImageIcon(this.getClass().getResource("icon7.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        s1.setIcon(new ImageIcon(image7));
        s1.setBackground(Color.WHITE);
        fee.add(s1);
        
        s2.setFont(new Font("monospaced",Font.BOLD,18));
        ImageIcon icon8 = new ImageIcon(this.getClass().getResource("icon8.png"));
        Image image8 = icon8.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        s2.setIcon(new ImageIcon(image8));
        s2.setBackground(Color.WHITE);
        fee.add(s2);
        
        s3.setFont(new Font("monospaced",Font.BOLD,18));
        ImageIcon icon9 = new ImageIcon(this.getClass().getResource("icon7.png"));
        Image image9 = icon9.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        s3.setIcon(new ImageIcon(image9));
        s3.setBackground(Color.WHITE);
        fee.add(s3);
        
        mb.add(admin);
        mb.add(user);
        mb.add(attendance);
        mb.add(attendance_detail);
        mb.add(exam);
        mb.add(fee);
        
        frame.add(iconLabel);
        frame.setJMenuBar(mb);
		frame.setSize(1200, 700);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		if(str.equals("New Faculty")) {
			new AddTeacher().frame.setVisible(true);
		}
		else if(str.equals("New Student Admission")) {
			new AddStudent().frame.setVisible(true);
		}
		else if(str.equals("Student Details")) {
			new StudentDetails().frame.setVisible(true);
		}
		else if(str.equals("Teacher Details")) {
			new TeacherDetails().frame.setVisible(true);
		}
		else if(str.equals("Student Attendance")) {
			new StudentAttendance().frame.setVisible(true);
		}
		else if(str.equals("Teacher Attendance")) {
			new TeacherAttendance().frame.setVisible(true);
		}
		else if(str.equals("Student Attendance Detail")) {
			new StudentAttendanceDetail().frame.setVisible(true);
		}
		else if(str.equals("Teacher Attendance Detail")) {
			new TeacherAttendanceDetail().frame.setVisible(true);
		}
		else if(str.equals("Marks Details")) {
			new MarksDetails().frame.setVisible(true);
		}
		else if(str.equals("Enter Marks")) {
			new EnterMarks().frame.setVisible(true);
		}
		else if(str.equals("Fee Structure")) {
			new FeeStructure().jframe.setVisible(true);
		}
		else if(str.equals("Student Fee Form")) {
			new StudentFeeForm().frame.setVisible(true);
		}
		else if(str.equals("Student Fees Details")) {
			new StudentFeeDetail().frame.setVisible(true);
		}
	}

}
