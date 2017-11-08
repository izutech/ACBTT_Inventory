package maintenance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AdminSidebar extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblUserAccounts;
	private JButton btnCreateUserAccount;
	private JButton btnManageUserAccounts;
	private JButton btnViewAllUser;
	private JLabel lblLogs;
	private JButton btnViewAllLogs;
	private JButton btnBanking;
	private Component rigidArea_1;

	public AdminSidebar() {
		setBackground(new Color(255, 255, 255));
		setMaximumSize(new Dimension (250, 705));
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 15));
		add(rigidArea);
		
		lblUserAccounts = new JLabel("  User Accounts");
		lblUserAccounts.setForeground(new Color(255, 255, 255));
		lblUserAccounts.setBackground(new Color(30, 144, 255));
		lblUserAccounts.setMaximumSize(new Dimension(200, 20));
		lblUserAccounts.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUserAccounts.setOpaque(true);
		add(lblUserAccounts);
		
		btnCreateUserAccount = new JButton("Create User Account");
		btnCreateUserAccount.setForeground(new Color(0, 0, 0));
		btnCreateUserAccount.setBorderPainted(false);
		btnCreateUserAccount.setFocusPainted(false);
		btnCreateUserAccount.setContentAreaFilled(false);
		add(btnCreateUserAccount);
		
		btnManageUserAccounts = new JButton("Manage User Accounts");
		btnManageUserAccounts.setForeground(new Color(0, 0, 0));
		btnManageUserAccounts.setBorderPainted(false);
		btnManageUserAccounts.setFocusPainted(false);
		btnManageUserAccounts.setContentAreaFilled(false);
		add(btnManageUserAccounts);
		
		btnViewAllUser = new JButton("View All User Accounts");
		btnViewAllUser.setForeground(new Color(0, 0, 0));
		btnViewAllUser.setBorderPainted(false);
		btnViewAllUser.setFocusPainted(false);
		btnViewAllUser.setContentAreaFilled(false);
		add(btnViewAllUser);
		
		Component verticalStrut = Box.createVerticalStrut(5);
		add(verticalStrut);
		
		lblLogs = new JLabel("  Logs");
		lblLogs.setForeground(new Color(255, 255, 255));
		lblLogs.setBackground(new Color(30, 144, 255));
		lblLogs.setMaximumSize(new Dimension(200, 20));
		lblLogs.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLogs.setOpaque(true);
		
		add(lblLogs);
		
		btnViewAllLogs = new JButton("View All Logs");
		btnViewAllLogs.setForeground(new Color(0, 0, 0));
		btnViewAllLogs.setBorderPainted(false);
		btnViewAllLogs.setFocusPainted(false);
		btnViewAllLogs.setContentAreaFilled(false);
		add(btnViewAllLogs);	
		
		rigidArea_1 = Box.createRigidArea(new Dimension(20, 15));
		add(rigidArea_1);
		
		initialize();
	}
	
	public void initialize() {
		new JPanel();
	}

	public JButton getBtnAddUserAccount() {
		return btnCreateUserAccount;
	}

	public void setBtnAddUserAccount(JButton btnAddUserAccount) {
		this.btnCreateUserAccount = btnAddUserAccount;
	}

	public JButton getBtnManageUserAccounts() {
		return btnManageUserAccounts;
	}

	public void setBtnManageUserAccounts(JButton btnManageUserAccounts) {
		this.btnManageUserAccounts = btnManageUserAccounts;
	}

	public JButton getBtnViewAllUser() {
		return btnViewAllUser;
	}

	public void setBtnViewAllUser(JButton btnViewAllUser) {
		this.btnViewAllUser = btnViewAllUser;
	}

	public JButton getBtnViewAllLogs() {
		return btnViewAllLogs;
	}

	public void setBtnViewAllLogs(JButton btnViewAllLogs) {
		this.btnViewAllLogs = btnViewAllLogs;
	}

	public JButton getBtnBanking() {
		return btnBanking;
	}

	public void setBtnBanking(JButton btnBanking) {
		this.btnBanking = btnBanking;
	}

	

}
