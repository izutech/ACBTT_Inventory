package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class LoginPage {

	private JFrame loginPage;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.loginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginPage = new JFrame();
		loginPage.getContentPane().setBackground(Color.DARK_GRAY);
		loginPage.setTitle("Login");
		//loginPage.setBounds(100, 100, 400, 300);
		loginPage.setSize(400, 300);
		loginPage.setLocationRelativeTo(null);
		loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginPage.setResizable(false);
		loginPage.getContentPane().setLayout(new MigLayout("", "[grow][65px,grow][][150px,grow][grow]", "[20px,grow][][][20px][][25px][grow]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		loginPage.getContentPane().add(rigidArea, "cell 0 0");
		
		Component horizontalStrut = Box.createHorizontalStrut(10);
		loginPage.getContentPane().add(horizontalStrut, "cell 2 0");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		loginPage.getContentPane().add(horizontalStrut_1, "cell 4 0");
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		loginPage.getContentPane().add(lblUsername, "cell 1 1");
		
		txtUsername = new JTextField();
		loginPage.getContentPane().add(txtUsername, "cell 3 1,growx");
		txtUsername.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(10);
		loginPage.getContentPane().add(verticalStrut, "cell 0 2");
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		loginPage.getContentPane().add(lblPassword, "cell 1 3");
		
		pwdPassword = new JPasswordField();
		loginPage.getContentPane().add(pwdPassword, "cell 3 3,growx");
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Index.main(null);
				loginPage.dispose();
			}
		});
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(30, 144, 255));
		btnLogin.setFocusPainted(false);
		loginPage.getContentPane().add(btnLogin, "cell 3 5,growx");
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		loginPage.getContentPane().add(verticalStrut_1, "cell 0 4");
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		loginPage.getContentPane().add(verticalStrut_2, "cell 0 6");
		
	}
}
