package exam;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;



import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginpage extends JFrame {

	private JPanel contentPane;
	private JPasswordField tPassword;
	private JTextField textField;
	private JTextField txtEmailAndPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage frame = new loginpage();
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
	public loginpage() {
		setTitle("Login page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tPassword = new JPasswordField();
		tPassword.setBounds(208, 169, 116, 22);
		contentPane.add(tPassword);
		
		final JButton bLogin = new JButton("Login");
		bLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username, password;
				username=tUsername.getText();
				password=tPassword.getText();
				if(username.contains("e19cse416") && password.contains("e19cse416@bennett.edu.in")) {
					JOptionPane.showMessageDialog(bLogin, "Welcome Garvit Bandil");
					form2 loginsu = new form2();
					loginsu.main(null);
							
				}
				else {
					JOptionPane.showMessageDialog(bLogin, "LOGIN failed");
					tUsername.setText(null);
					tPassword.setText(null);
				}
			}
		});
		bLogin.setBounds(28, 310, 97, 25);
		contentPane.add(bLogin);
		
		JButton btnNewButton_2 = new JButton("exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(440, 310, 97, 25);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(208, 119, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtEmailAndPass = new JTextField();
		txtEmailAndPass.setEditable(false);
		txtEmailAndPass.setText("Email and PAss");
		txtEmailAndPass.setBounds(208, 83, 116, 22);
		contentPane.add(txtEmailAndPass);
		txtEmailAndPass.setColumns(10);
	}
}
