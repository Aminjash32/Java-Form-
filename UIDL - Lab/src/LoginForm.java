import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

	private JFrame frame;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JTextField T4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
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
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frame.setBounds(100, 100, 421, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		T1 = new JTextField();
		T1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		T1.setHorizontalAlignment(SwingConstants.RIGHT);
		T1.setBackground(SystemColor.controlHighlight);
		T1.setBounds(132, 96, 238, 30);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel L1 = new JLabel("Student Name");
		L1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		L1.setBounds(10, 96, 112, 30);
		frame.getContentPane().add(L1);
		
		JLabel L2 = new JLabel("English");
		L2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		L2.setBounds(28, 248, 94, 30);
		frame.getContentPane().add(L2);
		
		T2 = new JTextField();
		T2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		T2.setHorizontalAlignment(SwingConstants.RIGHT);
		T2.setBackground(SystemColor.controlHighlight);
		T2.setColumns(10);
		T2.setBounds(132, 248, 238, 30);
		frame.getContentPane().add(T2);
		
		JLabel L3 = new JLabel("Maths");
		L3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		L3.setBounds(28, 288, 94, 30);
		frame.getContentPane().add(L3);
		
		T3 = new JTextField();
		T3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		T3.setHorizontalAlignment(SwingConstants.RIGHT);
		T3.setBackground(SystemColor.controlHighlight);
		T3.setColumns(10);
		T3.setBounds(132, 288, 238, 30);
		frame.getContentPane().add(T3);
		
		JLabel L4 = new JLabel("Science");
		L4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		L4.setBounds(28, 328, 94, 30);
		frame.getContentPane().add(L4);
		
		T4 = new JTextField();
		T4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		T4.setHorizontalAlignment(SwingConstants.RIGHT);
		T4.setBackground(SystemColor.controlHighlight);
		T4.setColumns(10);
		T4.setBounds(132, 328, 238, 30);
		frame.getContentPane().add(T4);
		
		JLabel lblNewLabel_4 = new JLabel("Form");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(181, 23, 110, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Subject Marks");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(148, 177, 178, 31);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JButton Submit = new JButton("Submit");
		Submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = T1.getText();
				int s1 = Integer.parseInt(T2.getText());
				int s2 = Integer.parseInt(T2.getText());
				int s3 = Integer.parseInt(T2.getText());
				
				int avg = s1 + s2 + s3 / 3;
				int per =  s1 + s2 + s3 /300 * 100;
				
				JOptionPane.showMessageDialog(null,"Name: " + name +"\n English: " + s1 +"\n Maths: "
				+ s2 +"\n Science: " + s3 +"\n Avg: " + avg +"\n Percentage: " + per);

				
			}
		});
		Submit.setBackground(SystemColor.textHighlight);
		Submit.setFont(new Font("Tahoma", Font.BOLD, 12));
		Submit.setBounds(132, 381, 94, 41);
		frame.getContentPane().add(Submit);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				T1.setText(null);
				T2.setText(null);
				T3.setText(null);
				T4.setText(null);
			}
		});
		Clear.setBackground(SystemColor.textHighlight);
		Clear.setFont(new Font("Tahoma", Font.BOLD, 12));
		Clear.setBounds(276, 381, 94, 41);
		frame.getContentPane().add(Clear);
	}
}
