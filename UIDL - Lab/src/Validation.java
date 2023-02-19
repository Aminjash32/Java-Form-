import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Validation extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel L3;
	private JLabel L4;
	private JTextField textField_2;
	private JLabel L5;
	private JLabel lblEnterPhNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Validation frame = new Validation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Validation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 453);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel L1 = new JLabel("Name");
		L1.setHorizontalAlignment(SwingConstants.RIGHT);
		L1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		L1.setBounds(43, 37, 46, 33);
		contentPane.add(L1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if((!(Character.isAlphabetic(c))) && (!(Character.isSpaceChar(c))) && (c != KeyEvent.VK_SPACE) && (c != KeyEvent.VK_PERIOD ) && (c != KeyEvent.VK_BACK_SPACE)) 
				{
					JOptionPane.showMessageDialog(null,"Invalid Character for Name");
					e.consume();			
				}
			}
		});
		textField.setBackground(SystemColor.activeCaptionBorder);
		textField.setBounds(99, 37, 175, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.activeCaptionBorder);
		textField_1.setColumns(10);
		textField_1.setBounds(99, 114, 175, 33);
		contentPane.add(textField_1);
		
		JLabel L2 = new JLabel("Address");
		L2.setHorizontalAlignment(SwingConstants.RIGHT);
		L2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		L2.setBounds(20, 114, 69, 33);
		contentPane.add(L2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				
				String address = textField_1.getText();
			}
		});
		btnNewButton.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textField.getText().trim().isBlank())
				{
					L3.setText("Name is Empty");
				}
				if(textField_1.getText().trim().isBlank())
				{
					L4.setText("Address is Empty");
				}
				else {
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
		btnNewButton.setBounds(99, 237, 111, 41);
		contentPane.add(btnNewButton);
		
		L3 = new JLabel("Enter Name");
		L3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		L3.setBounds(297, 37, 96, 33);
		contentPane.add(L3);
		
		L4 = new JLabel("Enter Address");
		L4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		L4.setBounds(297, 114, 96, 33);
		contentPane.add(L4);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int i = e.getKeyChar();
				
				if((!(Character.isDigit(i))) && (!(Character.isSpaceChar(i))) && (i != KeyEvent.VK_SPACE))
					{
					JOptionPane.showMessageDialog(null,"Invalid Character for Ph no.");
					e.consume();	
					}
			}
		});
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.activeCaptionBorder);
		textField_2.setBounds(99, 179, 175, 33);
		contentPane.add(textField_2);
		
		L5 = new JLabel("Ph No.");
		L5.setHorizontalAlignment(SwingConstants.RIGHT);
		L5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		L5.setBounds(20, 179, 69, 33);
		contentPane.add(L5);
		
		lblEnterPhNo = new JLabel("Enter Ph No.");
		lblEnterPhNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEnterPhNo.setBounds(286, 179, 96, 33);
		contentPane.add(lblEnterPhNo);
	}
}
