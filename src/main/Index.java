package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.Panel;

import javax.swing.Box;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;


public class Index {

	private JFrame indexPage;
	private JPanel pnlContent;
	private JPanel pnlLanding;
	
	private Sidebar pnlSidebar;
	private AboutUsPage pnlAboutUs;
	private BankingPage pnlBanking;
	private InvoicingPage pnlInvoicing;
	private SalesTransactionPage pnlSalesTransaction;
	private CustomersPage pnlCustomers;
	private OperatingExpensePage pnlOperatingExpense;
	private CompanyOrderPage pnlCompanyOrder;
	private ProductsPage pnlProducts;
	private SuppliersPage pnlSuppliers;
	private CompanySnapshotPage pnlCompanySnapshot;
	private ProfitAndLossPage pnlProfitAndLoss;
	private BalanceSheetPage pnlBalanceSheet;
	private ArAgeingSummaryPage pnlArAgeingSummary;
	private ExpenseBySupplierPage pnlExpenseBySupplier;
	private ApAgeingSummaryPage pnlApAgeingSummary;
	private ChartOfAccountPage pnlChartOfAccount;
	private EmployeeInformationPage pnlEmployeeInformation;
	private PayrollPage pnlPayroll;
	
	
	private JMenuBar menuBar;
	private JMenu mnAccount;
	private JMenuItem mntmSettings;
	private JMenuItem mntmLogOut;
	private Component horizontalGlue;
	private Component horizontalStrut;
	private JLabel lblAcLogo;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
					window.indexPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		indexPage = new JFrame();
		indexPage.setResizable(false);
		indexPage.setBackground(new Color(255, 255, 255));
		indexPage.setTitle("A&C Basic Trend Trading Company");
		indexPage.setSize(1024, 730);
		indexPage.setLocationRelativeTo(null);
		indexPage.setMinimumSize(new Dimension(1024, 730));
		indexPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		indexPage.getContentPane().setLayout(null);
		
		pnlAboutUs = new AboutUsPage();
		pnlBanking = new BankingPage();
		pnlInvoicing = new InvoicingPage();
		pnlSalesTransaction = new SalesTransactionPage();
		pnlCustomers = new CustomersPage();
		pnlOperatingExpense = new OperatingExpensePage();
		pnlCompanyOrder = new CompanyOrderPage();
		pnlProducts = new ProductsPage();
		pnlSuppliers = new SuppliersPage();
		pnlCompanySnapshot = new CompanySnapshotPage();
		pnlProfitAndLoss = new ProfitAndLossPage();
		pnlBalanceSheet = new BalanceSheetPage();
		pnlArAgeingSummary = new ArAgeingSummaryPage();
		pnlExpenseBySupplier = new ExpenseBySupplierPage();
		pnlApAgeingSummary = new ApAgeingSummaryPage();
		pnlChartOfAccount = new ChartOfAccountPage();
		pnlEmployeeInformation = new EmployeeInformationPage();
		pnlPayroll = new PayrollPage();
		
		Panel pnlMain = new Panel();
		pnlMain.setBounds(0, 0, 1018, 680);
		indexPage.getContentPane().add(pnlMain);
		pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.X_AXIS));
		
		pnlSidebar = new Sidebar();
		pnlSidebar.getBtnAboutUs().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlAboutUs);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnBanking().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlContent.removeAll();
				pnlContent.add(pnlBanking);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlBanking.getBtnViewAccountSummary().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlContent.removeAll();
				pnlContent.add(pnlAboutUs); //change panel
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnInvoicing().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlContent.removeAll();
				pnlContent.add(pnlInvoicing);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnSalesTransactions().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlSalesTransaction);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnCustomers().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlContent.removeAll();
				pnlContent.add(pnlCustomers);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnOperatingExpense().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlOperatingExpense);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnCompanyOrder().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlCompanyOrder);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnProducts().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlProducts);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnSuppliers().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlContent.removeAll();
				pnlContent.add(pnlSuppliers);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnCompanySnapshot().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlCompanySnapshot);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnProfitAndLoss().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlProfitAndLoss);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnBalanceSheet().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlBalanceSheet);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnArAgeingSummary().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlArAgeingSummary);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnExpenseBySupplier().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlExpenseBySupplier);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnApAgeingSummary().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlApAgeingSummary);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnChartOfAccount().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlChartOfAccount);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnEmployeeInformation().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlEmployeeInformation);
				pnlContent.repaint();
				pnlContent.revalidate();
			}
		});
		
		pnlSidebar.getBtnPayroll().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlContent.removeAll();
				pnlContent.add(pnlPayroll);
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
		pnlLanding.setLayout(new MigLayout("", "[]", "[][]"));
		
		JLabel lblCompanyName = new JLabel("A&C Basic Trend Trading Company");
		lblCompanyName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnlLanding.add(lblCompanyName, "cell 0 1");
		
		menuBar = new JMenuBar();
		menuBar.setForeground(new Color(211, 211, 211));
		menuBar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		menuBar.setBackground(new Color(255, 255, 255));
		indexPage.setJMenuBar(menuBar);
		
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
					indexPage.dispose();
					
				}
				
			}
		});
		mntmLogOut.setFont(new Font("Tahoma", Font.PLAIN, 12));
		mnAccount.add(mntmLogOut);
	}
}
