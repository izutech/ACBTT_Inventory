package maintenance;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import classes.User;
import managers.UserManager;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateUserPage extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCreateNewUser;
	private JLabel lblUserDetails;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblConfirmPassword;
	private JLabel lblPosition;
	private JTextField txtfldFirstName;
	private JTextField txtfldLastName;
	private JTextField txtfldUsername;
	private JPasswordField passfldPassword;
	private JPasswordField passfldConfirmPassword;
	private JComboBox<Object> cmbPosition;
	private String[] positions;
	
	private JCheckBox chckbxSelectAll;
	private JCheckBox chckbxExpense;
	private JCheckBox chckbxReports;
	private JCheckBox chckbxTaxes;
	private JCheckBox chckbxAccounting;
	private JCheckBox chckbxInventory;
	private JCheckBox chckbxEmployees;
	private JCheckBox chckbxCompanyProfile;
	private JCheckBox chckbxAboutUs;
	private JCheckBox chckbxBanking;
	private JCheckBox chckbxSales;		
	private JCheckBox chckbxInvoicing;
	private JCheckBox chckbxSalesTransactions;
	private JCheckBox chckbxCustomers;
	private JCheckBox chckbxOperatingExpense;
	private JCheckBox chckbxCompanyOrder;
	private JCheckBox chckbxProducts;
	private JCheckBox chckbxSuppliers;
	private JCheckBox chckbxCompanySnapshot;
	private JCheckBox chckbxProfitAndLoss;
	private JCheckBox chckbxBalanceSheet;
	private JCheckBox chckbxArAgeingSummary;
	private JCheckBox chckbxExpenseBySupplier;
	private JCheckBox chckbxApAgeingSummary;
	private JCheckBox chckbxChartOfAccount;
	private JCheckBox chckbxEmployeeInformation;
	private JCheckBox chckbxPayroll;
	
	private JButton btnCreate;
	
	public CreateUserPage() {
		initialize();
	}

	private void initialize() {
		setBackground(Color.WHITE);
		setLayout(new MigLayout("", "[][grow][][grow][][grow][][grow][]", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		add(rigidArea, "cell 0 0");
		
		Component horizontalStrut = Box.createHorizontalStrut(10);
		add(horizontalStrut, "cell 2 0");
		
		Component horizontalStrut_13 = Box.createHorizontalStrut(10);
		add(horizontalStrut_13, "cell 4 0");
		
		Component horizontalStrut_35 = Box.createHorizontalStrut(10);
		add(horizontalStrut_35, "cell 6 0");
		
		Component horizontalStrut_34 = Box.createHorizontalStrut(20);
		add(horizontalStrut_34, "cell 8 0");
		
		lblCreateNewUser = new JLabel("Create New User");
		lblCreateNewUser.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblCreateNewUser, "cell 1 1");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 2");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		add(panel, "cell 1 3 7 1,growx");
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		lblUserDetails = new JLabel("User Details");
		panel.add(lblUserDetails, "cell 0 0");
		lblUserDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUserDetails.setForeground(new Color(255, 255, 255));
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, "cell 0 4");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(15);
		add(horizontalStrut_1, "flowx,cell 1 5");
		
		lblFirstName = new JLabel("First Name");
		add(lblFirstName, "cell 1 5");
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(15);
		add(horizontalStrut_2, "flowx,cell 1 6");
		
		lblLastName = new JLabel("Last Name");
		add(lblLastName, "cell 1 6");
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		add(verticalStrut_2, "cell 0 7");
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(15);
		add(horizontalStrut_3, "flowx,cell 1 8");
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(15);
		add(horizontalStrut_4, "flowx,cell 1 9");
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(15);
		add(horizontalStrut_5, "flowx,cell 1 10");
		
		lblUsername = new JLabel("Username");
		add(lblUsername, "cell 1 8");
		
		lblPassword = new JLabel("Password");
		add(lblPassword, "cell 1 9");
		
		lblConfirmPassword = new JLabel("Confirm Password");
		add(lblConfirmPassword, "cell 1 10");
		
		Component verticalStrut_3 = Box.createVerticalStrut(10);
		add(verticalStrut_3, "cell 0 11");
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(15);
		add(horizontalStrut_6, "flowx,cell 1 12");
		
		lblPosition = new JLabel("Position");
		add(lblPosition, "cell 1 12");
		
		Component verticalStrut_4 = Box.createVerticalStrut(10);
		add(verticalStrut_4, "cell 0 13");
		
		txtfldFirstName = new JTextField();
		add(txtfldFirstName, "flowx,cell 3 5 3 1,growx");
		txtfldFirstName.setColumns(30);
		
		txtfldLastName = new JTextField();
		add(txtfldLastName, "flowx,cell 3 6 3 1,growx");
		txtfldLastName.setColumns(30);
		
		txtfldUsername = new JTextField();
		add(txtfldUsername, "flowx,cell 3 8 3 1,growx");
		txtfldUsername.setColumns(30);
		
		passfldPassword = new JPasswordField();
		add(passfldPassword, "flowx,cell 3 9 3 1,growx");
		passfldPassword.setColumns(30);
		
		passfldConfirmPassword = new JPasswordField();
		add(passfldConfirmPassword, "flowx,cell 3 10 3 1,growx");
		passfldConfirmPassword.setColumns(30);
		
		positions = new String[] {"","Employee", "General Manager",
				"Banking Manager", "Sales Manager", "Expense Manager",
				"Inventory Manager", "Reports Manager", "Accounting Manager",
				"System Administrator"};
		cmbPosition = new JComboBox<Object>(positions);
		cmbPosition.setBackground(new Color(255, 255, 255));
		cmbPosition.setFocusable(false);
		add(cmbPosition, "flowx,cell 3 12 3 1,growx");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(30, 144, 255));
		add(panel_1, "cell 1 14 7 1,growx");
		panel_1.setLayout(new MigLayout("", "[grow]", "[]"));
		
		JLabel lblPermissions = new JLabel("Permissions");
		lblPermissions.setToolTipText("Setting permissions limits the user's access.");
		panel_1.add(lblPermissions, "cell 0 0");
		lblPermissions.setForeground(new Color(255, 255, 255));
		lblPermissions.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		Component verticalStrut_5 = Box.createVerticalStrut(10);
		add(verticalStrut_5, "cell 0 15");
		
		chckbxSelectAll = new JCheckBox("Select All");
		chckbxSelectAll.setBackground(new Color(255, 255, 255));
		chckbxSelectAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == chckbxSelectAll) {
					
					//Select all child modules
					if(chckbxSelectAll.isSelected() == true) {
						chckbxCompanyProfile.setSelected(true);
						chckbxAboutUs.setSelected(true);
						chckbxBanking.setSelected(true);
						chckbxSales.setSelected(true);
						chckbxInvoicing.setSelected(true);
						chckbxSalesTransactions.setSelected(true);
						chckbxCustomers.setSelected(true);
						chckbxExpense.setSelected(true);
						chckbxOperatingExpense.setSelected(true);
						chckbxCompanyOrder.setSelected(true);
						chckbxInventory.setSelected(true);
						chckbxProducts.setSelected(true);
						chckbxSuppliers.setSelected(true);
						chckbxReports.setSelected(true);
						chckbxCompanySnapshot.setSelected(true);
						chckbxProfitAndLoss.setSelected(true);
						chckbxBalanceSheet.setSelected(true);
						chckbxArAgeingSummary.setSelected(true);
						chckbxExpenseBySupplier.setSelected(true);
						chckbxApAgeingSummary.setSelected(true);
						chckbxTaxes.setSelected(true);
						chckbxAccounting.setSelected(true);
						chckbxChartOfAccount.setSelected(true);
						chckbxEmployees.setSelected(true);
						chckbxEmployeeInformation.setSelected(true);
						chckbxPayroll.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxCompanyProfile.setSelected(false);
						chckbxAboutUs.setSelected(false);
						chckbxBanking.setSelected(false);
						chckbxSales.setSelected(false);
						chckbxInvoicing.setSelected(false);
						chckbxSalesTransactions.setSelected(false);
						chckbxCustomers.setSelected(false);
						chckbxExpense.setSelected(false);
						chckbxOperatingExpense.setSelected(false);
						chckbxCompanyOrder.setSelected(false);
						chckbxInventory.setSelected(false);
						chckbxProducts.setSelected(false);
						chckbxSuppliers.setSelected(false);
						chckbxReports.setSelected(false);
						chckbxCompanySnapshot.setSelected(false);
						chckbxProfitAndLoss.setSelected(false);
						chckbxBalanceSheet.setSelected(false);
						chckbxArAgeingSummary.setSelected(false);
						chckbxExpenseBySupplier.setSelected(false);
						chckbxApAgeingSummary.setSelected(false);
						chckbxTaxes.setSelected(false);
						chckbxAccounting.setSelected(false);
						chckbxChartOfAccount.setSelected(false);
						chckbxEmployees.setSelected(false);
						chckbxEmployeeInformation.setSelected(false);
						chckbxPayroll.setSelected(false);
					}
				}
			}
		});
		add(chckbxSelectAll, "flowy,cell 1 16");
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		add(separator, "cell 1 17 7 1,growx");
		
		Component horizontalStrut_14 = Box.createHorizontalStrut(15);
		add(horizontalStrut_14, "flowx,cell 1 18");
		
		
		
		Component horizontalStrut_15 = Box.createHorizontalStrut(30);
		add(horizontalStrut_15, "flowx,cell 1 19");
		
		Component horizontalStrut_21 = Box.createHorizontalStrut(15);
		add(horizontalStrut_21, "flowx,cell 3 19");
		
		Component horizontalStrut_25 = Box.createHorizontalStrut(15);
		add(horizontalStrut_25, "flowx,cell 5 19");
		
		Component horizontalStrut_16 = Box.createHorizontalStrut(30);
		add(horizontalStrut_16, "flowx,cell 1 20");
		
		Component horizontalStrut_22 = Box.createHorizontalStrut(15);
		add(horizontalStrut_22, "flowx,cell 3 20");
		
		Component horizontalStrut_26 = Box.createHorizontalStrut(15);
		add(horizontalStrut_26, "flowx,cell 5 20");
		
		Component horizontalStrut_31 = Box.createHorizontalStrut(15);
		add(horizontalStrut_31, "flowx,cell 7 20");
		
		Component horizontalStrut_17 = Box.createHorizontalStrut(15);
		add(horizontalStrut_17, "flowx,cell 1 21");
		
		Component horizontalStrut_27 = Box.createHorizontalStrut(15);
		add(horizontalStrut_27, "flowx,cell 5 21");
		
		Component horizontalStrut_18 = Box.createHorizontalStrut(30);
		add(horizontalStrut_18, "flowx,cell 1 22");
		
		Component horizontalStrut_23 = Box.createHorizontalStrut(15);
		add(horizontalStrut_23, "flowx,cell 3 22");
		
		Component horizontalStrut_28 = Box.createHorizontalStrut(15);
		add(horizontalStrut_28, "flowx,cell 5 22");
		
		Component horizontalStrut_32 = Box.createHorizontalStrut(15);
		add(horizontalStrut_32, "flowx,cell 7 22");
		
		Component horizontalStrut_19 = Box.createHorizontalStrut(30);
		add(horizontalStrut_19, "flowx,cell 1 23");
		
		Component horizontalStrut_24 = Box.createHorizontalStrut(15);
		add(horizontalStrut_24, "flowx,cell 3 23");
		
		Component horizontalStrut_29 = Box.createHorizontalStrut(15);
		add(horizontalStrut_29, "flowx,cell 5 23");
		
		Component horizontalStrut_33 = Box.createHorizontalStrut(15);
		add(horizontalStrut_33, "flowx,cell 7 23");
		
		Component horizontalStrut_20 = Box.createHorizontalStrut(30);
		add(horizontalStrut_20, "flowx,cell 1 24");
		
		chckbxCompanyProfile = new JCheckBox("Company Profile");
		chckbxCompanyProfile.setBackground(new Color(255, 255, 255));
		chckbxCompanyProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxCompanyProfile) {
					
					//Select all child modules
					if(chckbxCompanyProfile.isSelected() == true) {
						chckbxAboutUs.setSelected(true);
						chckbxBanking.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxAboutUs.setSelected(false);
						chckbxBanking.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
				
			}
		});
		add(chckbxCompanyProfile, "cell 1 18");
		
		chckbxAboutUs = new JCheckBox("About Us");
		chckbxAboutUs.setBackground(new Color(255, 255, 255));
		chckbxAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxAboutUs) {
					
					//Select parent if all child modules are selected
					if(chckbxBanking.isSelected() == true && chckbxAboutUs.isSelected() == true ) {
						if(chckbxCompanyProfile.isSelected() == false)
							chckbxCompanyProfile.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxCompanyProfile.isSelected() == true)
							chckbxCompanyProfile.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
				
			}
		});
		add(chckbxAboutUs, "cell 1 19");
		
		chckbxBanking = new JCheckBox("Banking");
		chckbxBanking.setBackground(new Color(255, 255, 255));
		chckbxBanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxBanking) {
					
					//Select parent if all child modules are selected
					if(chckbxBanking.isSelected() == true && chckbxAboutUs.isSelected() == true ) {
						if(chckbxCompanyProfile.isSelected() == false)
							chckbxCompanyProfile.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxCompanyProfile.isSelected() == true)
							chckbxCompanyProfile.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
				
			}
		});
		add(chckbxBanking, "cell 1 20");
		
		chckbxSales = new JCheckBox("Sales");
		chckbxSales.setBackground(new Color(255, 255, 255));
		chckbxSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxSales) {
					
					//Select all child modules
					if(chckbxSales.isSelected() == true) {
						chckbxInvoicing.setSelected(true);
						chckbxSalesTransactions.setSelected(true);
						chckbxCustomers.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxInvoicing.setSelected(false);
						chckbxSalesTransactions.setSelected(false);
						chckbxCustomers.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxSales, "cell 1 21");
		
		chckbxInvoicing = new JCheckBox("Invoicing");
		chckbxInvoicing.setBackground(new Color(255, 255, 255));
		chckbxInvoicing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxInvoicing) {
					
					//Select parent if all child modules are selected
					if(chckbxInvoicing.isSelected() == true && chckbxSalesTransactions.isSelected() == true && chckbxCustomers.isSelected() == true) {
						if(chckbxSales.isSelected() == false)
							chckbxSales.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxSales.isSelected() == true)
							chckbxSales.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxInvoicing, "cell 1 22");
		
		chckbxSalesTransactions = new JCheckBox("Sales Transactions");
		chckbxSalesTransactions.setBackground(new Color(255, 255, 255));
		chckbxSalesTransactions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxSalesTransactions) {
					
					//Select parent if all child modules are selected
					if(chckbxInvoicing.isSelected() == true && chckbxSalesTransactions.isSelected() == true && chckbxCustomers.isSelected() == true) {
						if(chckbxSales.isSelected() == false)
							chckbxSales.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxSales.isSelected() == true)
							chckbxSales.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxSalesTransactions, "cell 1 23");
		
		chckbxCustomers = new JCheckBox("Customers");
		chckbxCustomers.setBackground(new Color(255, 255, 255));
		chckbxCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxCustomers) {
					
					//Select parent if all child modules are selected
					if(chckbxInvoicing.isSelected() == true && chckbxSalesTransactions.isSelected() == true && chckbxCustomers.isSelected() == true) {
						if(chckbxSales.isSelected() == false)
							chckbxSales.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxSales.isSelected() == true)
							chckbxSales.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxCustomers, "cell 1 24");
		
		chckbxExpense = new JCheckBox("Expense");
		chckbxExpense.setBackground(new Color(255, 255, 255));
		chckbxExpense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxExpense) {
					
					//Select all child modules
					if(chckbxExpense.isSelected() == true) {
						chckbxOperatingExpense.setSelected(true);
						chckbxCompanyOrder.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxOperatingExpense.setSelected(false);
						chckbxCompanyOrder.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxExpense, "cell 3 18");
		
		chckbxOperatingExpense = new JCheckBox("Operating Expense");
		chckbxOperatingExpense.setBackground(new Color(255, 255, 255));
		chckbxOperatingExpense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxOperatingExpense) {
					
					//Select parent if all child modules are selected
					if(chckbxOperatingExpense.isSelected() == true && chckbxCompanyOrder.isSelected() == true) {
						if(chckbxExpense.isSelected() == false)
							chckbxExpense.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxExpense.isSelected() == true)
							chckbxExpense.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxOperatingExpense, "cell 3 19");
		
		chckbxCompanyOrder = new JCheckBox("Company Order");
		chckbxCompanyOrder.setBackground(new Color(255, 255, 255));
		chckbxCompanyOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxCompanyOrder) {
					
					//Select parent if all child modules are selected
					if(chckbxOperatingExpense.isSelected() == true && chckbxCompanyOrder.isSelected() == true) {
						if(chckbxExpense.isSelected() == false)
							chckbxExpense.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxExpense.isSelected() == true)
							chckbxExpense.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxCompanyOrder, "cell 3 20");
		
		chckbxInventory = new JCheckBox("Inventory");
		chckbxInventory.setBackground(new Color(255, 255, 255));
		chckbxInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxInventory) {
					
					//Select all child modules
					if(chckbxInventory.isSelected() == true) {
						chckbxProducts.setSelected(true);
						chckbxSuppliers.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxProducts.setSelected(false);
						chckbxSuppliers.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxInventory, "cell 3 21");
		
		chckbxProducts = new JCheckBox("Products");
		chckbxProducts.setBackground(new Color(255, 255, 255));
		chckbxProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxProducts) {
					
					//Select parent if all child modules are selected
					if(chckbxProducts.isSelected() == true && chckbxSuppliers.isSelected() == true) {
						if(chckbxInventory.isSelected() == false)
							chckbxInventory.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxInventory.isSelected() == true)
							chckbxInventory.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxProducts, "cell 3 22");
		
		chckbxSuppliers = new JCheckBox("Suppliers");
		chckbxSuppliers.setBackground(new Color(255, 255, 255));
		chckbxSuppliers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxSuppliers) {
					
					//Select parent if all child modules are selected
					if(chckbxProducts.isSelected() == true && chckbxSuppliers.isSelected() == true) {
						if(chckbxInventory.isSelected() == false)
							chckbxInventory.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxInventory.isSelected() == true)
							chckbxInventory.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxSuppliers, "cell 3 23");
		
		chckbxReports = new JCheckBox("Reports");
		chckbxReports.setBackground(new Color(255, 255, 255));
		chckbxReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxReports) {
					
					//Select all child modules
					if(chckbxReports.isSelected() == true) {
						chckbxCompanySnapshot.setSelected(true);
						chckbxProfitAndLoss.setSelected(true);
						chckbxBalanceSheet.setSelected(true);
						chckbxArAgeingSummary.setSelected(true);
						chckbxExpenseBySupplier.setSelected(true);
						chckbxApAgeingSummary.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxCompanySnapshot.setSelected(false);
						chckbxProfitAndLoss.setSelected(false);
						chckbxBalanceSheet.setSelected(false);
						chckbxArAgeingSummary.setSelected(false);
						chckbxExpenseBySupplier.setSelected(false);
						chckbxApAgeingSummary.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxReports, "cell 5 18");
		
		Component horizontalStrut_30 = Box.createHorizontalStrut(15);
		add(horizontalStrut_30, "flowx,cell 5 24");
		
		chckbxCompanySnapshot = new JCheckBox("Company Snapshot");
		chckbxCompanySnapshot.setBackground(new Color(255, 255, 255));
		chckbxCompanySnapshot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxCompanySnapshot) {
					
					//Select parent if all child modules are selected
					if(chckbxCompanySnapshot.isSelected() == true && chckbxProfitAndLoss.isSelected() == true
							&& chckbxBalanceSheet.isSelected() == true && chckbxArAgeingSummary.isSelected() == true
							&& chckbxExpenseBySupplier.isSelected() == true && chckbxApAgeingSummary.isSelected() == true) {
						if(chckbxReports.isSelected() == false)
							chckbxReports.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxReports.isSelected() == true)
							chckbxReports.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxCompanySnapshot, "cell 5 19");
		
		chckbxProfitAndLoss = new JCheckBox("Profit and Loss");
		chckbxProfitAndLoss.setBackground(new Color(255, 255, 255));
		chckbxProfitAndLoss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxProfitAndLoss) {
					
					//Select parent if all child modules are selected
					if(chckbxCompanySnapshot.isSelected() == true && chckbxProfitAndLoss.isSelected() == true
							&& chckbxBalanceSheet.isSelected() == true && chckbxArAgeingSummary.isSelected() == true
							&& chckbxExpenseBySupplier.isSelected() == true && chckbxApAgeingSummary.isSelected() == true) {
						if(chckbxReports.isSelected() == false)
							chckbxReports.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxReports.isSelected() == true)
							chckbxReports.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxProfitAndLoss, "cell 5 20");
		
		chckbxBalanceSheet = new JCheckBox("Balance Sheet");
		chckbxBalanceSheet.setBackground(new Color(255, 255, 255));
		chckbxBalanceSheet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxBalanceSheet) {
					
					//Select parent if all child modules are selected
					if(chckbxCompanySnapshot.isSelected() == true && chckbxProfitAndLoss.isSelected() == true
							&& chckbxBalanceSheet.isSelected() == true && chckbxArAgeingSummary.isSelected() == true
							&& chckbxExpenseBySupplier.isSelected() == true && chckbxApAgeingSummary.isSelected() == true) {
						if(chckbxReports.isSelected() == false)
							chckbxReports.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxReports.isSelected() == true)
							chckbxReports.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxBalanceSheet, "cell 5 21");
		
		chckbxArAgeingSummary = new JCheckBox("A/R Ageing Summary");
		chckbxArAgeingSummary.setBackground(new Color(255, 255, 255));
		chckbxArAgeingSummary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxArAgeingSummary) {
					
					//Select parent if all child modules are selected
					if(chckbxCompanySnapshot.isSelected() == true && chckbxProfitAndLoss.isSelected() == true
							&& chckbxBalanceSheet.isSelected() == true && chckbxArAgeingSummary.isSelected() == true
							&& chckbxExpenseBySupplier.isSelected() == true && chckbxApAgeingSummary.isSelected() == true) {
						if(chckbxReports.isSelected() == false)
							chckbxReports.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxReports.isSelected() == true)
							chckbxReports.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxArAgeingSummary, "cell 5 22");
		
		chckbxExpenseBySupplier = new JCheckBox("Expense by Supplier Summary");
		chckbxExpenseBySupplier.setBackground(new Color(255, 255, 255));
		chckbxExpenseBySupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxExpenseBySupplier) {
					
					//Select parent if all child modules are selected
					if(chckbxCompanySnapshot.isSelected() == true && chckbxProfitAndLoss.isSelected() == true
							&& chckbxBalanceSheet.isSelected() == true && chckbxArAgeingSummary.isSelected() == true
							&& chckbxExpenseBySupplier.isSelected() == true && chckbxApAgeingSummary.isSelected() == true) {
						if(chckbxReports.isSelected() == false)
							chckbxReports.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxReports.isSelected() == true)
							chckbxReports.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxExpenseBySupplier, "cell 5 23");
		
		chckbxApAgeingSummary = new JCheckBox("A/P Ageing Summary");
		chckbxApAgeingSummary.setBackground(new Color(255, 255, 255));
		chckbxApAgeingSummary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				if(e.getSource() == chckbxApAgeingSummary) {
					
					//Select parent if all child modules are selected
					if(chckbxCompanySnapshot.isSelected() == true && chckbxProfitAndLoss.isSelected() == true
							&& chckbxBalanceSheet.isSelected() == true && chckbxArAgeingSummary.isSelected() == true
							&& chckbxExpenseBySupplier.isSelected() == true && chckbxApAgeingSummary.isSelected() == true) {
						if(chckbxReports.isSelected() == false)
							chckbxReports.setSelected(true);
					}
					
					//De-select parent if one or more sibling modules is not selected
					else {
						if(chckbxReports.isSelected() == true)
							chckbxReports.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxApAgeingSummary, "cell 5 24");
		
		chckbxTaxes = new JCheckBox("Taxes");
		chckbxTaxes.setBackground(new Color(255, 255, 255));
		chckbxTaxes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxTaxes) {
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxTaxes, "cell 7 18");
		
		chckbxAccounting = new JCheckBox("Accounting");
		chckbxAccounting.setBackground(new Color(255, 255, 255));
		chckbxAccounting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxAccounting) {
					
					//Select all child modules
					if(chckbxAccounting.isSelected() == true) {
						chckbxChartOfAccount.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxChartOfAccount.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxAccounting, "cell 7 19");
		
		chckbxChartOfAccount = new JCheckBox("Chart of Account");
		chckbxChartOfAccount.setBackground(new Color(255, 255, 255));
		chckbxChartOfAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxChartOfAccount) {
					
					//Select all child modules
					if(chckbxChartOfAccount.isSelected() == true) {
						chckbxAccounting.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxAccounting.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxChartOfAccount, "cell 7 20");
		
		chckbxEmployees = new JCheckBox("Employees");
		chckbxEmployees.setBackground(new Color(255, 255, 255));
		chckbxEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxEmployees) {
					
					//Select all child modules
					if(chckbxEmployees.isSelected() == true) {
						chckbxEmployeeInformation.setSelected(true);
						chckbxPayroll.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxEmployeeInformation.setSelected(false);
						chckbxPayroll.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxEmployees, "cell 7 21");
		
		chckbxEmployeeInformation = new JCheckBox("Employee Information");
		chckbxEmployeeInformation.setBackground(new Color(255, 255, 255));
		chckbxEmployeeInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxEmployeeInformation) {
					
					//Select all child modules
					if(chckbxEmployeeInformation.isSelected() == true && chckbxPayroll.isSelected() == true) {
						chckbxEmployees.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxEmployees.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxEmployeeInformation, "cell 7 22");
		
		chckbxPayroll = new JCheckBox("Payroll");
		chckbxPayroll.setBackground(new Color(255, 255, 255));
		chckbxPayroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == chckbxPayroll) {
					
					//Select all child modules
					if(chckbxEmployeeInformation.isSelected() == true && chckbxPayroll.isSelected() == true) {
						chckbxEmployees.setSelected(true);
					}
					
					//De-select all child modules
					else {
						chckbxEmployees.setSelected(false);
					}
					
					//Select select all if all parent modules are selected
					if(chckbxCompanyProfile.isSelected() == true && chckbxSales.isSelected() == true
							&& chckbxExpense.isSelected() == true && chckbxInventory.isSelected() == true
							&& chckbxReports.isSelected() == true && chckbxTaxes.isSelected() == true
							&& chckbxAccounting.isSelected() == true && chckbxEmployees.isSelected() == true) {
						if(chckbxSelectAll.isSelected() == false) {
							chckbxSelectAll.setSelected(true);
						}
					}
					
					//De-select "select all" if any parent module is not selected
					else{
						if(chckbxSelectAll.isSelected() == true) {
							chckbxSelectAll.setSelected(false);
						}
					}
				}
			}
		});
		add(chckbxPayroll, "cell 7 23");
		
		Component verticalStrut_6 = Box.createVerticalStrut(10);
		add(verticalStrut_6, "cell 0 25");
		
		btnCreate = new JButton("Create");
		btnCreate.setFocusPainted(false);
		btnCreate.setContentAreaFilled(false);
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Get values of fields
				String fname = txtfldFirstName.getText();
				String lname = txtfldLastName.getText();
				String uname = txtfldUsername.getText();
				String pword = new String(passfldPassword.getPassword());
				String cpword = new String (passfldConfirmPassword.getPassword());
				String posi = (String) cmbPosition.getSelectedItem();
				
				//Check if all fields have input
				if(fname == null || fname.isEmpty()
						|| lname == null || lname.isEmpty()
						|| uname == null || uname.isEmpty()
						|| pword == null || pword.isEmpty()
						|| posi == null || posi.isEmpty()) {
					String message = "Please fill all required fields.";
					JOptionPane.showMessageDialog(null,  message);
					
				}
				else {
					//Check if passwords match
					if(!pword.equals(cpword)) {
						String message = "Passwords did not match.";
						JOptionPane.showMessageDialog(null,  message);
					}
					
					else {
						//Confirm Details
						String message = "Are you sure with these details?";
						String title = "Confirm Details";
						int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
						
						if(reply == JOptionPane.YES_OPTION) {
							//Create user
							createUser(fname, lname, uname, pword, posi);
						}
					}
				}
			}
		});
		add(btnCreate, "cell 7 26,alignx right");
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		add(verticalStrut_7, "cell 0 27");
	}
	
	private void createUser(String firstName, String lastName, String username, String password, String position) {
		try {
			User newUser = new User(firstName, lastName, username, password, position);
			UserManager userManager = new UserManager();
			userManager.createUser(newUser);
			
			String message = "Successfully created account";
			JOptionPane.showMessageDialog(null,  message);
			
			//Empty all fields
			txtfldFirstName.setText("");
			txtfldLastName.setText("");
			txtfldUsername.setText("");
			passfldPassword.setText("");
			passfldConfirmPassword.setText("");
			cmbPosition.setSelectedIndex(-1);
			
		}catch (Exception e) {
			e.printStackTrace();
			String message = "Error creating account";
			JOptionPane.showMessageDialog(null,  message);
		}
		
	}

}