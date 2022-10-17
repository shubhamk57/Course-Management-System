package course;

import java.awt.*;

import javax.swing.*;

public class FeeStructure {

	JFrame jframe;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeStructure window = new FeeStructure();
					window.jframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FeeStructure() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		jframe = new JFrame();
		
		JLabel frame = new JLabel();
		frame.setSize(1300, 750);
		jframe.add(frame);
		
		i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.ITALIC,40));
        i1.setBounds(510,8,400,70);
        frame.add(i1);
        
        l1 = new JLabel("Particulars");
        l1.setBounds(80,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l1);
        
        l10 = new JLabel("Tuition Fees");
        l10.setBounds(80,170,150,40);
        l10.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l10);
        
        l11 = new JLabel("Reg./Adm. Fees");
        l11.setBounds(80,240,150,40);
        l11.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l11);
        
        l12 = new JLabel("Activity Fees");
        l12.setBounds(80,310,150,40);
        l12.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l12);
        
        l13 = new JLabel("Maint. Fees");
        l13.setBounds(80,380,150,40);
        l13.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l13);
        
        l14 = new JLabel("Exam Fees");
        l14.setBounds(80,450,150,40);
        l14.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l14);
        
        l15 = new JLabel("Card Fees.");
        l15.setBounds(80,520,150,40);
        l15.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l15);
        
        l16 = new JLabel("Hostel Fees");
        l16.setBounds(80,590,150,40);
        l16.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l16);
        
        l17 = new JLabel("Transport fees.");
        l17.setBounds(80,660,150,40);
        l17.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l17);
        
        l2 = new JLabel("1st Semester");
        l2.setBounds(230,100,100,40);
        l2.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l2);
        
        b1 = new JLabel("Rs 90000");
        b1.setBounds(230,170,100,40);
        b1.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(b1);
        
        b2 = new JLabel("Rs 500");
        b2.setBounds(230,240,100,40);
        b2.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(b2);
        
        b3 = new JLabel("Rs 1000");
        b3.setBounds(230,310,100,40);
        b3.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(b3);
        
        b4 = new JLabel("Rs 500");
        b4.setBounds(230,380,100,40);
        b4.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(b4);
        
        b5 = new JLabel("Rs 500");
        b5.setBounds(230,450,100,40);
        b5.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(b5);
        
        b6 = new JLabel("Rs 200");
        b6.setBounds(230,520,100,40);
        b6.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(b6);
        
        b7 = new JLabel("Rs 3000");
        b7.setBounds(230,590,100,40);
        b7.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(b7);
        
        b8 = new JLabel("Rs 3000");
        b8.setBounds(230,660,100,40);
        b8.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(b8);
        
        l3 = new JLabel("2nd Semester");
        l3.setBounds(380,100,100,40);
        l3.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l3);
        
        bb1 = new JLabel("Rs 90000");
        bb1.setBounds(380,170,100,40);
        bb1.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb1);
        
        bb2 = new JLabel("-");
        bb2.setBounds(380,240,100,40);
        bb2.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb2);
        
        bb3 = new JLabel("1000");
        bb3.setBounds(380,310,100,40);
        bb3.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb3);
        
        bb4 = new JLabel("Rs 500");
        bb4.setBounds(380,380,100,40);
        bb4.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb4);
        
        bb17 = new JLabel("Rs 500");
        bb17.setBounds(380,450,100,40);
        bb17.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb17);
        
        bb18 = new JLabel("Rs 200");
        bb18.setBounds(380,520,100,40);
        bb18.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb18);
        
        bb18 = new JLabel("Rs 3000");
        bb18.setBounds(380,590,100,40);
        bb18.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb18);
        
        bb18 = new JLabel("Rs 3000");
        bb18.setBounds(380,660,100,40);
        bb18.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb18);
        
        l4 = new JLabel("3rd Semester");
        l4.setBounds(520,100,100,40);
        l4.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l4);
        
        bb5 = new JLabel("Rs 90000");
        bb5.setBounds(520,170,150,40);
        bb5.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb5);
        
        bb6 = new JLabel("-");
        bb6.setBounds(520,240,150,40);
        bb6.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb6);
        
        bb7 = new JLabel("Rs 1000");
        bb7.setBounds(520,310,150,40);
        bb7.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb7);
        
        bb8 = new JLabel("Rs 500");
        bb8.setBounds(520,380,150,40);
        bb8.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb8);
        
        bb13 = new JLabel("Rs 500");
        bb13.setBounds(520,450,150,40);
        bb13.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb13);
        
        bb14 = new JLabel("Rs 200");
        bb14.setBounds(520,520,150,40);
        bb14.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb14);
        
        bb14 = new JLabel("Rs 3000");
        bb14.setBounds(520,590,150,40);
        bb14.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb14);
        
        bb14 = new JLabel("Rs 3000");
        bb14.setBounds(520,660,150,40);
        bb14.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb14);
        
        l5 = new JLabel("4th Semester");
        l5.setBounds(680,100,100,40);
        l5.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l5);
        
        bb9 = new JLabel("Rs 90000");
        bb9.setBounds(680,170,150,40);
        bb9.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb9);
        
        bb10 = new JLabel("-");
        bb10.setBounds(680,240,150,40);
        bb10.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb10);
        
        bb11 = new JLabel("Rs 1000");
        bb11.setBounds(680,310,150,40);
        bb11.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb11);
        
        bb12 = new JLabel("Rs 500");
        bb12.setBounds(680,380,150,40);
        bb12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb12);
        
        bb15 = new JLabel("Rs 500");
        bb15.setBounds(680,450,150,40);
        bb15.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb15);
        
        bb16 = new JLabel("Rs 200");
        bb16.setBounds(680,520,150,40);
        bb16.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb16);
        
        bb16 = new JLabel("Rs 3000");
        bb16.setBounds(680,590,150,40);
        bb16.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb16);
        
        bb16 = new JLabel("Rs 3000");
        bb16.setBounds(680,660,150,40);
        bb16.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(bb16);
        
        l6 = new JLabel("5th Semester");
        l6.setBounds(840,100,100,40);
        l6.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l6);
        
        m1 = new JLabel("Rs 90000");
        m1.setBounds(840,170,150,40);
        m1.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m1);
        
        m2 = new JLabel("-");
        m2.setBounds(840,240,150,40);
        m2.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m2);
        
        m3 = new JLabel("Rs 1000");
        m3.setBounds(840,310,150,40);
        m3.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m3);
        
        m4 = new JLabel("Rs 500");
        m4.setBounds(840,380,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m4);
        
        m4 = new JLabel("Rs 500");
        m4.setBounds(840,450,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m4);
        
        m4 = new JLabel("Rs 200");
        m4.setBounds(840,520,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m4);
        
        m4 = new JLabel("Rs 300");
        m4.setBounds(840,590,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m4);
        
        m4 = new JLabel("Rs 3000");
        m4.setBounds(840,660,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m4);
        
        l7 = new JLabel("6th Semester");
        l7.setBounds(1000,100,100,40);
        l7.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l7);
        
        m5 = new JLabel("Rs 90000");
        m5.setBounds(1000,170,150,40);
        m5.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m5);
        
        m6 = new JLabel("-");
        m6.setBounds(1000,240,150,40);
        m6.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m6);
        
        m7 = new JLabel("Rs 1000");
        m7.setBounds(1000,310,150,40);
        m7.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m7);
        
        m8 = new JLabel("Rs 500");
        m8.setBounds(1000,380,150,40);
        m8.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m8);
        
        m8 = new JLabel("Rs 500");
        m8.setBounds(1000,450,150,40);
        m8.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m8);
        
        m8 = new JLabel("Rs 200");
        m8.setBounds(1000,520,150,40);
        m8.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m8);
        
        m8 = new JLabel("Rs 3000");
        m8.setBounds(1000,590,150,40);
        m8.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m8);
        
        m8 = new JLabel("Rs 3000");
        m8.setBounds(1000,660,150,40);
        m8.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m8);
        
        l8 = new JLabel("7th Semester");
        l8.setBounds(1150,100,100,40);
        l8.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l8);
        
        m9 = new JLabel("Rs 90000");
        m9.setBounds(1150,170,150,40);
        m9.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m9);
        
        m10 = new JLabel("-");
        m10.setBounds(1150,240,150,40);
        m10.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m10);
        
        m11 = new JLabel("Rs 1000");
        m11.setBounds(1150,310,150,40);
        m11.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m11);
        
        m12 = new JLabel("Rs 500");
        m12.setBounds(1150,380,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m12);
        
        m12 = new JLabel("Rs 500");
        m12.setBounds(1150,450,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m12);
        
        m12 = new JLabel("Rs 200");
        m12.setBounds(1150,520,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m12);
        
        m12 = new JLabel("Rs 3000");
        m12.setBounds(1150,590,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m12);
        
        m12 = new JLabel("Rs 3000");
        m12.setBounds(1150,660,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m12);
        
        l13 = new JLabel("8th Semester");
        l13.setBounds(1150,100,100,40);
        l13.setFont(new Font("serif",Font.BOLD,15));
        frame.add(l13);
        
        l14 = new JLabel("Rs 90000");
        l14.setBounds(1150,170,150,40);
        l14.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(l14);
        
        l15 = new JLabel("-");
        l15.setBounds(1150,240,150,40);
        l15.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(l15);
        
        m11 = new JLabel("Rs 1000");
        m11.setBounds(1150,310,150,40);
        m11.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m11);
        
        m12 = new JLabel("Rs 500");
        m12.setBounds(1150,380,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m12);
        
        m12 = new JLabel("Rs 500");
        m12.setBounds(1150,450,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m12);
        
        m12 = new JLabel("Rs 200");
        m12.setBounds(1150,520,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m12);
        
        m12 = new JLabel("Rs 3000");
        m12.setBounds(1150,590,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m12);
        
        m12 = new JLabel("Rs 3000");
        m12.setBounds(1150,660,150,40);
        m12.setFont(new Font("serif",Font.PLAIN,15));
        frame.add(m12);

		jframe.setBounds(50, 10, 1300, 800);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
