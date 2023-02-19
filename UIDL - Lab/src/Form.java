import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form {

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
					Form window = new Form();
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
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setResizable(false);
		frame.setBounds(100, 100, 375, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		T1 = new JTextField();
		T1.setHorizontalAlignment(SwingConstants.RIGHT);
		T1.setBackground(Color.LIGHT_GRAY);
		T1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		T1.setBounds(107, 59, 229, 32);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JLabel L1 = new JLabel("Name");
		L1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		L1.setBounds(10, 59, 87, 32);
		frame.getContentPane().add(L1);
		
		T2 = new JTextField();
		T2.setHorizontalAlignment(SwingConstants.RIGHT);
		T2.setBackground(Color.LIGHT_GRAY);
		T2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		T2.setColumns(10);
		T2.setBounds(107, 112, 229, 32);
		frame.getContentPane().add(T2);
		
		JLabel L2 = new JLabel("Roll no");
		L2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		L2.setBounds(10, 112, 87, 32);
		frame.getContentPane().add(L2);
		
		T3 = new JTextField();
		T3.setHorizontalAlignment(SwingConstants.RIGHT);
		T3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int a = e.getKeyChar();
				
				//if((!(Character.isDigit(a))) && (!(Character.isSpaceChar(a))) && (a != KeyEvent.VK_BACK_SPACE));
				{
					//JOptionPane.showMessageDialog(null, "Invalid Character For Marks");
				}
			}
		});
		T3.setBackground(Color.LIGHT_GRAY);
		T3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		T3.setColumns(10);
		T3.setBounds(107, 163, 229, 32);
		frame.getContentPane().add(T3);
		
		JLabel L3 = new JLabel("Subject 1");
		L3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		L3.setBounds(10, 163, 87, 32);
		frame.getContentPane().add(L3);
		
		T4 = new JTextField();
		T4.setHorizontalAlignment(SwingConstants.RIGHT);
		T4.setBackground(Color.LIGHT_GRAY);
		T4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		T4.setColumns(10);
		T4.setBounds(107, 215, 229, 32);
		frame.getContentPane().add(T4);
		
		JLabel L4 = new JLabel("Subject 2");
		L4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		L4.setBounds(10, 215, 87, 32);
		frame.getContentPane().add(L4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String n = T1.getText();
				int r = Integer.parseInt(T2.getText());
				
				if(T1.getText().isBlank() || T2.getText().isBlank() || T3.getText().isBlank() || T4.getText().isBlank())
				{
					JOptionPane.showMessageDialog(null,"Please fill all details");
				}
				else {
					JOptionPane.showMessageDialog(null,"Name : " + n);
				}
			
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(161, 261, 87, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel L0 = new JLabel("Form");
		L0.setHorizontalAlignment(SwingConstants.CENTER);
		L0.setFont(new Font("Tahoma", Font.BOLD, 20));
		L0.setBounds(161, 10, 74, 32);
		frame.getContentPane().add(L0);
	}
}
//Copyright to Amin Jash
