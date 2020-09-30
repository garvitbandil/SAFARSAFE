package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import theunkowon.welcomescreen;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class entrycheck extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entrycheck frame = new entrycheck();
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
	public entrycheck() {
		final String passcode;
		setTitle("ERROR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please conncet the module");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblNewLabel.setBounds(96, 32, 406, 49);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(278, 76, -129, 22);
		contentPane.add(passwordField);
				
		final JButton btnNewButton = new JButton("CONTINUE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String passcode;
				passcode=passwordField.getText();


				if(passcode=="aaa") {
					JOptionPane.showMessageDialog(btnNewButton, "LOGIN succesful");
					welcomescreen loginsu = new welcomescreen();
					loginsu.main(null);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "YOU FAILED");
				}

			}
		});
		btnNewButton.setBounds(187, 107, 151, 25);
		contentPane.add(btnNewButton);
						
	}
}
