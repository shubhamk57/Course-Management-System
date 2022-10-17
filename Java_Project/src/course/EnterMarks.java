package course;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.*;

public class EnterMarks implements ActionListener {

	JFrame frame;
	JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b1,b2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnterMarks window = new EnterMarks();
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
	public EnterMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		JLabel label = new JLabel();
		label.setBounds(0, 0, 500, 550);
		frame.add(label);

        l1 = new JLabel("Enter marks of Student");
        l1.setFont(new Font("serif", Font.BOLD, 30));
        l1.setBounds(50,0,500,80);
        label.add(l1);

        l2 = new JLabel("Enter Roll Number");
        l2.setBounds(50,70,200,40);
        label.add(l2);

        t1 = new JTextField();
        t1.setBounds(180,80,200,20);
        label.add(t1);

        l3 = new JLabel("Enter Subject");
        l3.setBounds(50,150,200,40);
        label.add(l3);

        l4 = new JLabel("Enter Marks");
        l4.setBounds(250,150,200,40);
        label.add(l4);

        t2 = new JTextField();
        t2.setBounds(50,200,200,20);
        label.add(t2);

        t3 = new JTextField();
        t3.setBounds(250,200,200,20);
        label.add(t3);

        t4 = new JTextField();
        t4.setBounds(50,230,200,20);
        label.add(t4);

        t5 = new JTextField();
        t5.setBounds(250,230,200,20);
        label.add(t5);

        t6 = new JTextField();
        t6.setBounds(50,260,200,20);
        label.add(t6);

        t7 = new JTextField();
        t7.setBounds(250,260,200,20);
        label.add(t7);

        t8 = new JTextField();
        t8.setBounds(50,290,200,20);
        label.add(t8);

        t9 = new JTextField();
        t9.setBounds(250,290,200,20);
        label.add(t9);

        t10 = new JTextField();
        t10.setBounds(50,320,200,20);
        label.add(t10);

        t11 = new JTextField();
        t11.setBounds(250,320,200,20);
        label.add(t11);

        b1 = new JButton("Submit");
        b1.setBounds(50,360,150,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(b1.getFont().deriveFont(20.0f));
        label.add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Clear");
        b2.setBounds(300, 360, 150, 30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.red);
        b2.setFont(b2.getFont().deriveFont(20.0f));
        label.add(b2);
        b2.addActionListener(this);
		
        frame.setSize(500,550);
        frame.setLocation(400,200);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b2) {
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			t10.setText("");
			t11.setText("");
		}
		else if(e.getSource() == b1) {
			try {
				Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/course_management","root", "12345");
				PreparedStatement st = (PreparedStatement) connection.prepareStatement("insert into marks_values (?,?,?,?,?,?,?,?,?,?,?);");
				
				st.setString(1, t1.getText());
				st.setString(2, t2.getText());
				st.setString(3, t3.getText());
				st.setString(4, t4.getText());
				st.setString(5, t5.getText());
				st.setString(6, t6.getText());
				st.setString(7, t7.getText());
				st.setString(8, t8.getText());
				st.setString(9, t9.getText());
				st.setString(10, t10.getText());
				st.setString(11, t11.getText());
				
				st.executeUpdate();
				JOptionPane.showMessageDialog(b1, "Marks update sucessfully.");
				frame.setVisible(false);
				new MarksDetails().frame.setVisible(true);
			}
			catch(Exception exception) {
				exception.printStackTrace();
			}
		}
	}

}
