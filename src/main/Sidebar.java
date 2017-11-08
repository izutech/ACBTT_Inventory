package main;

import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;

public class Sidebar extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnAboutUs;
    private JLabel lblCompanyProfile;
    private JButton btnBanking;
    private JLabel lblSales;
    private JButton btnInvoicing;
    private JButton btnSalesTransactions;
    private JButton btnCustomers;
    private JLabel lblExpense;
    private JButton btnOperatingExpense;
    private JButton btnCompanyOrder;
    private JLabel lblInventory;
    private JButton btnProducts;
    private JButton btnSuppliers;
    private JLabel lblReports;
    private JButton btnCompanySnapshot;
    private JButton btnProfitAndLoss;
    private JButton btnBalanceSheet;
    private JButton btnArAgeingSummary;
    private JButton btnExpenseBySupplier;
    private JButton btnApAgeingSummary;
    private JLabel lblTaxes;
    private JLabel lblAccounting;
    private JButton btnChartOfAccount;
    private JLabel lblEmployees;
    private JButton btnEmployeeInformation;
    private JButton btnPayroll;
    private Component verticalStrut;
    private Component verticalStrut_1;
    private Component verticalStrut_2;
    private Component verticalStrut_3;
    private Component verticalStrut_4;
    private Component verticalStrut_5;
    private Component verticalStrut_6;
    private Component rigidArea;


	/**
	 * Create the application.
	 */
	public Sidebar() {
		setBackground(new Color(255, 255, 255));
		setMaximumSize(new Dimension (250, 705));
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		Component topRigidArea = Box.createRigidArea(new Dimension(20, 15));
		add(topRigidArea);
		
		lblCompanyProfile = new JLabel("  Company Profile");
		lblCompanyProfile.setForeground(new Color(255, 255, 255));
		lblCompanyProfile.setBackground(new Color(30, 144, 255));
		lblCompanyProfile.setMaximumSize(new Dimension(200, 20));
		lblCompanyProfile.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCompanyProfile.setOpaque(true);
		add(lblCompanyProfile);
		
		btnAboutUs = new JButton("About Us");
		btnAboutUs.setForeground(new Color(0, 0, 0));
		btnAboutUs.setBorderPainted(false);
		btnAboutUs.setFocusPainted(false);
		btnAboutUs.setContentAreaFilled(false);
		add(btnAboutUs);
		
		btnBanking = new JButton("Banking");
		btnBanking.setForeground(new Color(0, 0, 0));
		btnBanking.setBorderPainted(false);
		btnBanking.setFocusPainted(false);
		btnBanking.setContentAreaFilled(false);
		add(btnBanking);
		
		verticalStrut = Box.createVerticalStrut(5);
		add(verticalStrut);
		
		lblSales = new JLabel("  Sales");
		lblSales.setForeground(new Color(255, 255, 255));
		lblSales.setBackground(new Color(30, 144, 255));
		lblSales.setMaximumSize(new Dimension(200, 20));
		lblSales.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSales.setOpaque(true);
		add(lblSales);
		
		btnInvoicing = new JButton("Invoicing");
		btnInvoicing.setForeground(new Color(0, 0, 0));
		btnInvoicing.setBorderPainted(false);
		btnInvoicing.setFocusPainted(false);
		btnInvoicing.setContentAreaFilled(false);
		add(btnInvoicing);
		
		btnSalesTransactions = new JButton("Sales Transactions");
		btnSalesTransactions.setForeground(new Color(0, 0, 0));
		btnSalesTransactions.setBorderPainted(false);
		btnSalesTransactions.setFocusPainted(false);
		btnSalesTransactions.setContentAreaFilled(false);
		add(btnSalesTransactions);
		
		btnCustomers = new JButton("Customers");
		btnCustomers.setForeground(new Color(0, 0, 0));
		btnCustomers.setBorderPainted(false);
		btnCustomers.setFocusPainted(false);
		btnCustomers.setContentAreaFilled(false);
		add(btnCustomers);
		
		verticalStrut_1 = Box.createVerticalStrut(5);
		add(verticalStrut_1);
		
		lblExpense = new JLabel("  Expense");
		lblExpense.setForeground(new Color(255, 255, 255));
		lblExpense.setBackground(new Color(30, 144, 255));
		lblExpense.setMaximumSize(new Dimension(200, 20));
		lblExpense.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblExpense.setOpaque(true);
		add(lblExpense);
		
		btnOperatingExpense = new JButton("Operating Expense");
		btnOperatingExpense.setForeground(new Color(0, 0, 0));
		btnOperatingExpense.setBorderPainted(false);
		btnOperatingExpense.setFocusPainted(false);
		btnOperatingExpense.setContentAreaFilled(false);
		add(btnOperatingExpense);
		
		btnCompanyOrder = new JButton("Company Order");
		btnCompanyOrder.setForeground(new Color(0, 0, 0));
		btnCompanyOrder.setBorderPainted(false);
		btnCompanyOrder.setFocusPainted(false);
		btnCompanyOrder.setContentAreaFilled(false);
		add(btnCompanyOrder);
		
		verticalStrut_2 = Box.createVerticalStrut(5);
		add(verticalStrut_2);
		
		lblInventory = new JLabel("  Inventory");
		lblInventory.setForeground(new Color(255, 255, 255));
		lblInventory.setBackground(new Color(30, 144, 255));
		lblInventory.setMaximumSize(new Dimension(200, 20));
		lblInventory.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInventory.setOpaque(true);
		add(lblInventory);
		
		btnProducts = new JButton("Products");
		btnProducts.setForeground(new Color(0, 0, 0));
		btnProducts.setBorderPainted(false);
		btnProducts.setFocusPainted(false);
		btnProducts.setContentAreaFilled(false);
		add(btnProducts);
		
		btnSuppliers = new JButton("Suppliers");
		btnSuppliers.setForeground(new Color(0, 0, 0));
		btnSuppliers.setBorderPainted(false);
		btnSuppliers.setFocusPainted(false);
		btnSuppliers.setContentAreaFilled(false);
		add(btnSuppliers);
		
		verticalStrut_3 = Box.createVerticalStrut(5);
		add(verticalStrut_3);
		
		lblReports = new JLabel("  Reports");
		lblReports.setForeground(new Color(255, 255, 255));
		lblReports.setBackground(new Color(30, 144, 255));
		lblReports.setMaximumSize(new Dimension(200, 20));
		lblReports.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblReports.setOpaque(true);
		add(lblReports);
		
		btnCompanySnapshot = new JButton("Company Snapshot");
		btnCompanySnapshot.setForeground(new Color(0, 0, 0));
		btnCompanySnapshot.setBorderPainted(false);
		btnCompanySnapshot.setFocusPainted(false);
		btnCompanySnapshot.setContentAreaFilled(false);
		add(btnCompanySnapshot);
		
		btnProfitAndLoss = new JButton("Profit and Loss");
		btnProfitAndLoss.setForeground(new Color(0, 0, 0));
		btnProfitAndLoss.setBorderPainted(false);
		btnProfitAndLoss.setFocusPainted(false);
		btnProfitAndLoss.setContentAreaFilled(false);
		add(btnProfitAndLoss);
		
		btnBalanceSheet = new JButton("Balance Sheet");
		btnBalanceSheet.setForeground(new Color(0, 0, 0));
		btnBalanceSheet.setBorderPainted(false);
		btnBalanceSheet.setFocusPainted(false);
		btnBalanceSheet.setContentAreaFilled(false);
		add(btnBalanceSheet);
		
		btnArAgeingSummary = new JButton("A/R Ageing Summary");
		btnArAgeingSummary.setForeground(new Color(0, 0, 0));
		btnArAgeingSummary.setBorderPainted(false);
		btnArAgeingSummary.setFocusPainted(false);
		btnArAgeingSummary.setContentAreaFilled(false);
		add(btnArAgeingSummary);
		
		btnExpenseBySupplier = new JButton("Expense by Supplier Summary");
		btnExpenseBySupplier.setForeground(new Color(0, 0, 0));
		btnExpenseBySupplier.setBorderPainted(false);
		btnExpenseBySupplier.setFocusPainted(false);
		btnExpenseBySupplier.setContentAreaFilled(false);
		add(btnExpenseBySupplier);
		
		btnApAgeingSummary = new JButton("A/P Ageing Summary");
		btnApAgeingSummary.setForeground(new Color(0, 0, 0));
		btnApAgeingSummary.setBorderPainted(false);
		btnApAgeingSummary.setFocusPainted(false);
		btnApAgeingSummary.setContentAreaFilled(false);
		add(btnApAgeingSummary);
		
		verticalStrut_4 = Box.createVerticalStrut(5);
		add(verticalStrut_4);
		
		lblTaxes = new JLabel("  Taxes");
		lblTaxes.setForeground(new Color(255, 255, 255));
		lblTaxes.setBackground(new Color(30, 144, 255));
		lblTaxes.setMaximumSize(new Dimension(200, 20));
		lblTaxes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTaxes.setOpaque(true);
		add(lblTaxes);
		
		verticalStrut_5 = Box.createVerticalStrut(5);
		add(verticalStrut_5);
		
		lblAccounting = new JLabel("  Accounting");
		lblAccounting.setForeground(new Color(255, 255, 255));
		lblAccounting.setBackground(new Color(30, 144, 255));
		lblAccounting.setMaximumSize(new Dimension(200, 20));
		lblAccounting.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAccounting.setOpaque(true);
		add(lblAccounting);
		
		btnChartOfAccount = new JButton("Chart of Account");
		btnChartOfAccount.setForeground(new Color(0, 0, 0));
		btnChartOfAccount.setBorderPainted(false);
		btnChartOfAccount.setFocusPainted(false);
		btnChartOfAccount.setContentAreaFilled(false);
		add(btnChartOfAccount);
		
		verticalStrut_6 = Box.createVerticalStrut(5);
		add(verticalStrut_6);
		
		lblEmployees = new JLabel("  Employees");
		lblEmployees.setForeground(new Color(255, 255, 255));
		lblEmployees.setBackground(new Color(30, 144, 255));
		lblEmployees.setMaximumSize(new Dimension(200, 20));
		lblEmployees.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmployees.setOpaque(true);
		add(lblEmployees);
		
		btnEmployeeInformation = new JButton("Employee Information");
		btnEmployeeInformation.setForeground(new Color(0, 0, 0));
		btnEmployeeInformation.setBorderPainted(false);
		btnEmployeeInformation.setFocusPainted(false);
		btnEmployeeInformation.setContentAreaFilled(false);
		add(btnEmployeeInformation);
		
		btnPayroll = new JButton("Payroll");
		btnPayroll.setForeground(new Color(0, 0, 0));
		btnPayroll.setBorderPainted(false);
		btnPayroll.setFocusPainted(false);
		btnPayroll.setContentAreaFilled(false);
		add(btnPayroll);
		
		rigidArea = Box.createRigidArea(new Dimension(20, 15));
		add(rigidArea);
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		new JPanel();
	}

	public JButton getBtnAboutUs() {
		return btnAboutUs;
	}

	public void setBtnAboutUs(JButton btnAboutUs) {
		this.btnAboutUs = btnAboutUs;
	}

	public JButton getBtnBanking() {
		return btnBanking;
	}

	public void setBtnBanking(JButton btnBanking) {
		this.btnBanking = btnBanking;
	}

	public JButton getBtnInvoicing() {
		return btnInvoicing;
	}

	public void setBtnInvoicing(JButton btnInvoicing) {
		this.btnInvoicing = btnInvoicing;
	}

	public JButton getBtnSalesTransactions() {
		return btnSalesTransactions;
	}

	public void setBtnSalesTransactions(JButton btnSalesTransactions) {
		this.btnSalesTransactions = btnSalesTransactions;
	}

	public JButton getBtnCustomers() {
		return btnCustomers;
	}

	public void setBtnCustomers(JButton btnCustomers) {
		this.btnCustomers = btnCustomers;
	}

	public JButton getBtnOperatingExpense() {
		return btnOperatingExpense;
	}

	public void setBtnOperatingExpense(JButton btnOperatingExpense) {
		this.btnOperatingExpense = btnOperatingExpense;
	}

	public JButton getBtnCompanyOrder() {
		return btnCompanyOrder;
	}

	public void setBtnCompanyOrder(JButton btnCompanyOrder) {
		this.btnCompanyOrder = btnCompanyOrder;
	}

	public JButton getBtnProducts() {
		return btnProducts;
	}

	public void setBtnProducts(JButton btnProducts) {
		this.btnProducts = btnProducts;
	}

	public JButton getBtnSuppliers() {
		return btnSuppliers;
	}

	public void setBtnSuppliers(JButton btnSuppliers) {
		this.btnSuppliers = btnSuppliers;
	}

	public JButton getBtnCompanySnapshot() {
		return btnCompanySnapshot;
	}

	public void setBtnCompanySnapshot(JButton btnCompanySnapshot) {
		this.btnCompanySnapshot = btnCompanySnapshot;
	}

	public JButton getBtnProfitAndLoss() {
		return btnProfitAndLoss;
	}

	public void setBtnProfitAndLoss(JButton btnProfitAndLoss) {
		this.btnProfitAndLoss = btnProfitAndLoss;
	}

	public JButton getBtnBalanceSheet() {
		return btnBalanceSheet;
	}

	public void setBtnBalanceSheet(JButton btnBalanceSheet) {
		this.btnBalanceSheet = btnBalanceSheet;
	}

	public JButton getBtnArAgeingSummary() {
		return btnArAgeingSummary;
	}

	public void setBtnArAgeingSummary(JButton btnArAgeingSummary) {
		this.btnArAgeingSummary = btnArAgeingSummary;
	}

	public JButton getBtnExpenseBySupplier() {
		return btnExpenseBySupplier;
	}

	public void setBtnExpenseBySupplier(JButton btnExpenseBySupplier) {
		this.btnExpenseBySupplier = btnExpenseBySupplier;
	}

	public JButton getBtnApAgeingSummary() {
		return btnApAgeingSummary;
	}

	public void setBtnApAgeingSummary(JButton btnApAgeingSummary) {
		this.btnApAgeingSummary = btnApAgeingSummary;
	}

	public JLabel getLblTaxes() {
		return lblTaxes;
	}

	public void setLblTaxes(JLabel lblTaxes) {
		this.lblTaxes = lblTaxes;
	}

	public JButton getBtnChartOfAccount() {
		return btnChartOfAccount;
	}

	public void setBtnChartOfAccount(JButton btnChartOfAccount) {
		this.btnChartOfAccount = btnChartOfAccount;
	}

	public JButton getBtnEmployeeInformation() {
		return btnEmployeeInformation;
	}

	public void setBtnEmployeeInformation(JButton btnEmployeeInformation) {
		this.btnEmployeeInformation = btnEmployeeInformation;
	}

	public JButton getBtnPayroll() {
		return btnPayroll;
	}

	public void setBtnPayroll(JButton btnPayroll) {
		this.btnPayroll = btnPayroll;
	}
	
	

}
