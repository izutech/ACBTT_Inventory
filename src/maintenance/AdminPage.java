package maintenance;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import main.LoginPage;
import net.miginfocom.swing.MigLayout;

import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class AdminPage {

	private JFrame adminPage;
	private JPanel pnlContent;
	private JPanel pnlLanding;
	
	private AdminSidebar pnlSidebar;
	private CreateUserPage pnlCreateUserPage;
	private ViewUsersPage pnlViewUsersPage;
	
	private JMenuBar menuBar;
	private JMenu mnAccount;
	private JMenuItem mntmSettings;
	private JMenuItem mntmLogOut;
	private Component horizontalGlue;
	private Component horizontalStrut;
	private JLabel lblAcLogo;
	private JSeparator separator;
	private JLabel lblWelcome;
	private JLabel lblUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
					window.adminPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		adminPage = new JFrame();
		adminPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminPage.setResizable(false);
		adminPage.setBackground(new Color(255, 255, 255));
		adminPage.setTitle("A&C Basic Trend Trading Company");
		adminPage.setSize(1024, 730);
		adminPage.setLocationRelativeTo(null);
		adminPage.setMinimumSize(new Dimension(1024, 730));
		adminPage.getContentPane().setLayout(null);
		
		Panel pnlMain = new Panel();
		pnlMain.setBounds(0, 0, 1018, 680);
		adminPage.getContentPane().add(pnlMain);
		pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.X_AXIS));
		
		pnlSidebar = new AdminSidebar();
		pnlSidebar.getBtnViewAllUser().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlContent.removeAll();
				pnlViewUsersPage.repaint();
				pnlViewUsersPage.revalidate();
				pnlContent.add(pnlViewUsersPage);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		pnlSidebar.getBtnAddUserAccount().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlContent.removeAll();
				pnlContent.add(pnlCreateUserPage);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		pnlMain.add(pnlSidebar);
		
		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		pnlMain.add(separator);
		
		pnlContent = new JPanel();
		pnlMain.add(pnlContent);
		pnlContent.setLayout(new CardLayout(0, 0));
		
		pnlLanding = new JPanel();
		pnlLanding.setBackground(new Color(255, 255, 255));
		pnlContent.add(pnlLanding);
		pnlLanding.setLayout(new MigLayout("", "[][]", "[][]"));
		
		lblWelcome = new JLabel("Welcome,");
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnlLanding.add(lblWelcome, "cell 0 1");
		
		lblUsername = new JLabel("username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnlLanding.add(lblUsername, "cell 1 1");
		
		menuBar = new JMenuBar();
		menuBar.setForeground(new Color(211, 211, 211));
		menuBar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		menuBar.setBackground(new Color(255, 255, 255));
		adminPage.setJMenuBar(menuBar);
		
		horizontalStrut = Box.createHorizontalStrut(10);
		menuBar.add(horizontalStrut);
		
		lblAcLogo = new JLabel("<Logo>");
		lblAcLogo.setFont(new Font("Tahoma", Font.BOLD, 12));
		menuBar.add(lblAcLogo);
		
		horizontalGlue = Box.createHorizontalGlue();
		menuBar.add(horizontalGlue);
		
		mnAccount = new JMenu("Account");
		mnAccount.setBackground(new Color(255, 255, 255));
		mnAccount.setIcon(new ImageIcon("C:\\Users\\Rod Arceo\\Desktop\\man-user.png"));
		mnAccount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(mnAccount);
		
		mntmSettings = new JMenuItem("Settings");
		mntmSettings.setBackground(new Color(255, 255, 255));
		mntmSettings.setIcon(new ImageIcon("C:\\Users\\Rod Arceo\\Desktop\\settings.png"));
		mntmSettings.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mnAccount.add(mntmSettings);
		
		mntmLogOut = new JMenuItem("Log Out");
		mntmLogOut.setBackground(new Color(255, 255, 255));
		mntmLogOut.setIcon(new ImageIcon("C:\\Users\\Rod Arceo\\Desktop\\exit.png"));
		mntmLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String message = "Are you sure you want to log out?";
				String title = "Confirm Logout";
				//Confirm Log Out
				int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
				
				if(reply == JOptionPane.YES_OPTION) {
					//Disconnect User from db
					
					//Redirect to log in page
					LoginPage.main(null);
					adminPage.dispose();
					
				}
				
			}
		});
		mntmLogOut.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mnAccount.add(mntmLogOut);
		
		pnlCreateUserPage = new CreateUserPage();
		pnlViewUsersPage = new ViewUsersPage();
	}

}
