package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JCheckBox;

public class form2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form2 frame = new form2();
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
	public form2() {
		setTitle("SAFE SAFAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Face Lock");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(8, 137, 113, 25);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Age lock");
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		chckbxNewCheckBox_1.setBounds(8, 180, 113, 25);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("drowsiness alert");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox_2.setBounds(8, 222, 148, 25);
		contentPane.add(chckbxNewCheckBox_2);
		
		JButton btnNewButton = new JButton("Manage Face Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(8, 273, 148, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("QUIT");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(261, 333, 75, 22);
		contentPane.add(btnNewButton_1);
		
		txtWelcome = new JTextField();
		txtWelcome.setEditable(false);
		txtWelcome.setFont(new Font("Segoe Print", Font.PLAIN, 28));
		txtWelcome.setBackground(UIManager.getColor("Button.background"));
		txtWelcome.setText("WELCOME");
		txtWelcome.setBounds(84, 13, 171, 41);
		contentPane.add(txtWelcome);
		txtWelcome.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("HELP");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_2.setBounds(8, 333, 75, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("       ");
		Image imgs = new ImageIcon(this.getClass().getResource("/pepe.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(imgs));
		lblNewLabel.setBounds(140, 45, 226, 264);
		contentPane.add(lblNewLabel);
		
		ButtonGroup group1= new ButtonGroup();
		
		String year[] = {"1st year", "2nd Year", "3rd Year","4th year"};
		
		String subjj[] = {"python", "java", "php","andstudio"};
	}
}
