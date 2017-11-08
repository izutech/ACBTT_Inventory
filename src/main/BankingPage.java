package main;

import javax.swing.JPanel;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;

import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BankingPage extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblBanking;
	private JLabel lblBankDetails;
	private JLabel lblNameOfBank;
	private JComboBox cmbNameOfBank;
	private JLabel lblAddress;
	private JTextField txtfldAddress;
	private JLabel lblContactNumber;
	private JTextField txtfldContactNumber;
	private JLabel lblEmail;
	private JTextField txtfldEmail;
	private JLabel lblAccountNumber;
	private JLabel lblAccountName;
	private JTextField txtfldAccountName;
	private JComboBox cmbAccountNumber;
	private Component verticalStrut_2;
	private Component horizontalStrut_1;
	private JLabel lblBankBalance;
	private JTextField txtfldBankBalance;
	private Component verticalStrut_3;
	private JLabel lblCreditCardDetails;
	private JPanel pnlCreditCardDetails;
	private JButton btnViewAccountSummary;
	private JButton btnReconcile;
	private Component verticalStrut_4;
	private Component verticalStrut_5;
	private JLabel lblCreditCard;
	private JComboBox cmbCreditCard;
	private JLabel lblCardNumber;
	private JComboBox cmbCardNumber;
	private JLabel lblCardBalance;
	private JTextField txtfldCardBalance;
	private Component verticalStrut_6;
	private JLabel lblForDeposit;
	private JPanel pnlForDeposit;
	private Component verticalStrut_7;
	private Component horizontalStrut_3;
	private JLabel lblCashOnHand;
	private JLabel lblCashOnHandBalance;
	private JTextField txtfldCashOnHandBalance;
	private JButton btnCashOnHandDeposit;
	private JButton btnCashOnHandTransactionHistory;
	private Component verticalStrut_8;
	private Component verticalStrut_9;
	private JLabel lblCheckOnHand;
	private JLabel lblCheckOnHandBalance;
	private JTextField txtfldCheckOnHandBalance;
	private Component verticalStrut_10;
	private JButton btnCheckOnHandTransactionHistory;
	private JButton btnCheckOnHandDeposit;
	private Component horizontalStrut_4;
	private Component horizontalStrut_5;
	private Component horizontalStrut_2;
	private Component horizontalStrut_6;
	private Component verticalStrut_11;
	private Component horizontalStrut_7;
	private Component horizontalStrut_9;
	private JButton btnCreditCardTransactionHistory;
	private JButton btnSettleAccount;
	private Component verticalStrut_12;
	private JButton btnViewAllAccounts;
	private JButton btnViewAllCreditCards;
	/**
	 * Create the application.
	 */
	public BankingPage() {
		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("", "[][][grow][][grow][][grow][][]", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));
		//setLayout(new MigLayout("", "[][][][][][][][][]", "[][][][][][][][][][][][][][][][][][][][][][]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea, "cell 0 0");
		
		horizontalStrut_7 = Box.createHorizontalStrut(15);
		add(horizontalStrut_7, "cell 1 0");
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		add(horizontalStrut, "cell 3 0");
		
		horizontalStrut_1 = Box.createHorizontalStrut(20);
		add(horizontalStrut_1, "cell 5 0");
		
		horizontalStrut_9 = Box.createHorizontalStrut(15);
		add(horizontalStrut_9, "cell 7 0");
		
		horizontalStrut_3 = Box.createHorizontalStrut(10);
		add(horizontalStrut_3, "cell 8 0");
		
		lblBanking = new JLabel("BANKING");
		lblBanking.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblBanking, "cell 1 1 2 1");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 2");
		
		JPanel pnlBankDetails = new JPanel();
		pnlBankDetails.setBackground(new Color(30, 144, 255));
		add(pnlBankDetails, "cell 1 3 7 1,growx");
		pnlBankDetails.setLayout(new MigLayout("", "[]", "[]"));
		
		lblBankDetails = new JLabel("Bank Details");
		lblBankDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		pnlBankDetails.add(lblBankDetails, "cell 0 0");
		lblBankDetails.setForeground(new Color(255, 255, 255));
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, "cell 0 4");
		
		lblNameOfBank = new JLabel("Name of Bank");
		add(lblNameOfBank, "cell 2 5");
		
		cmbNameOfBank = new JComboBox();
		cmbNameOfBank.setModel(new DefaultComboBoxModel(new String[] {"", "Hello World"}));
		cmbNameOfBank.setBackground(new Color(255, 255, 255));
		cmbNameOfBank.setFocusable(false);
		add(cmbNameOfBank, "cell 4 4 1 2,growx,aligny bottom");
		
		lblAccountNumber = new JLabel("Account Number");
		add(lblAccountNumber, "cell 2 6");
		
		cmbAccountNumber = new JComboBox();
		cmbAccountNumber.setModel(new DefaultComboBoxModel(new String[] {"", "XXXX-XXXX-XXXX-XXXX"}));
		cmbAccountNumber.setBackground(new Color(255, 255, 255));
		cmbAccountNumber.setFocusable(false);
		add(cmbAccountNumber, "cell 4 6 1 2,growx,aligny top");
		
		lblBankBalance = new JLabel("Balance:");
		add(lblBankBalance, "flowx,cell 6 6");
		
		verticalStrut_2 = Box.createVerticalStrut(10);
		add(verticalStrut_2, "cell 0 7");
		
		lblAccountName = new JLabel("Account Name");
		add(lblAccountName, "cell 2 8");
		
		txtfldAccountName = new JTextField();
		txtfldAccountName.setEditable(false);
		add(txtfldAccountName, "flowx,cell 4 8 3 1,growx");
		txtfldAccountName.setColumns(30);
		
		lblAddress = new JLabel("Address");
		add(lblAddress, "cell 2 9");
		
		txtfldAddress = new JTextField();
		txtfldAddress.setEditable(false);
		add(txtfldAddress, "flowx,cell 4 9 3 1,growx");
		txtfldAddress.setColumns(40);
		
		lblContactNumber = new JLabel("Contact Number");
		add(lblContactNumber, "cell 2 10");
		
		txtfldContactNumber = new JTextField();
		txtfldContactNumber.setEditable(false);
		add(txtfldContactNumber, "flowx,cell 4 10 3 1,growx");
		txtfldContactNumber.setColumns(20);
		
		lblEmail = new JLabel("E-mail");
		add(lblEmail, "cell 2 11");
		
		txtfldEmail = new JTextField();
		txtfldEmail.setEditable(false);
		add(txtfldEmail, "flowx,cell 4 11 3 1,growx");
		txtfldEmail.setColumns(30);
		
		verticalStrut_3 = Box.createVerticalStrut(10);
		add(verticalStrut_3, "cell 0 12");
		
		btnViewAllAccounts = new JButton("View All");
		btnViewAllAccounts.setFocusPainted(false);
		btnViewAllAccounts.setContentAreaFilled(false);
		btnViewAllAccounts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					ViewAllAccounts.main(null);
			}
		});
		add(btnViewAllAccounts, "cell 2 13,growx");
		
		btnViewAccountSummary = new JButton("View Account Summary");
		btnViewAccountSummary.setFocusPainted(false);
		btnViewAccountSummary.setContentAreaFilled(false);
		add(btnViewAccountSummary, "cell 4 13,growx");
		
		btnReconcile = new JButton("Reconcile");
		btnReconcile.setFocusPainted(false);
		btnReconcile.setContentAreaFilled(false);
		add(btnReconcile, "flowx,cell 6 13,growx");
		
		verticalStrut_4 = Box.createVerticalStrut(10);
		add(verticalStrut_4, "cell 0 14");
		
		pnlCreditCardDetails = new JPanel();
		pnlCreditCardDetails.setBackground(new Color(30, 144, 255));
		add(pnlCreditCardDetails, "cell 1 15 7 1,growx");
		pnlCreditCardDetails.setLayout(new MigLayout("", "[]", "[]"));
		
		lblCreditCardDetails = new JLabel("Credit Card Details");
		pnlCreditCardDetails.add(lblCreditCardDetails, "cell 0 0");
		lblCreditCardDetails.setForeground(new Color(255, 255, 255));
		lblCreditCardDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		verticalStrut_5 = Box.createVerticalStrut(10);
		add(verticalStrut_5, "cell 0 16");
		
		lblCreditCard = new JLabel("Credit Card");
		add(lblCreditCard, "cell 2 17");
		
		cmbCreditCard = new JComboBox();
		cmbCreditCard.setModel(new DefaultComboBoxModel(new String[] {"", "Hello World"}));
		cmbCreditCard.setBackground(new Color(255, 255, 255));
		cmbCreditCard.setFocusable(false);
		add(cmbCreditCard, "cell 4 16 1 2,growx,aligny bottom");
		
		lblCardNumber = new JLabel("Card Number");
		add(lblCardNumber, "cell 2 18");
		
		cmbCardNumber = new JComboBox();
		cmbCardNumber.setModel(new DefaultComboBoxModel(new String[] {"", "XXXX-XXXX-XXXX-XXXX"}));
		cmbCardNumber.setBackground(new Color(255, 255, 255));
		cmbCardNumber.setFocusable(false);
		add(cmbCardNumber, "cell 4 18,growx");
		
		lblCardBalance = new JLabel("Balance:");
		add(lblCardBalance, "flowx,cell 6 18");
		
		verticalStrut_6 = Box.createVerticalStrut(10);
		add(verticalStrut_6, "cell 0 19");
		
		btnViewAllCreditCards = new JButton("View All");
		btnViewAllCreditCards.setFocusPainted(false);
		btnViewAllCreditCards.setContentAreaFilled(false);
		btnViewAllCreditCards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewAllCreditCards.main(null);
			}
		});
		add(btnViewAllCreditCards, "cell 2 20,growx");
		
		btnCreditCardTransactionHistory = new JButton("Transaction History");
		btnCreditCardTransactionHistory.setFocusPainted(false);
		btnCreditCardTransactionHistory.setContentAreaFilled(false);
		add(btnCreditCardTransactionHistory, "cell 4 20,growx");
		
		btnSettleAccount = new JButton("Settle Account");
		btnSettleAccount.setFocusPainted(false);
		btnSettleAccount.setContentAreaFilled(false);
		add(btnSettleAccount, "flowx,cell 6 20,growx");
		
		verticalStrut_12 = Box.createVerticalStrut(10);
		add(verticalStrut_12, "cell 0 21");
		
		pnlForDeposit = new JPanel();
		pnlForDeposit.setBackground(new Color(30, 144, 255));
		add(pnlForDeposit, "cell 1 22 7 1,growx");
		pnlForDeposit.setLayout(new MigLayout("", "[]", "[]"));
		
		lblForDeposit = new JLabel("For Deposit");
		lblForDeposit.setForeground(new Color(255, 255, 255));
		lblForDeposit.setFont(new Font("Tahoma", Font.BOLD, 11));
		pnlForDeposit.add(lblForDeposit, "cell 0 0");
		
		verticalStrut_7 = Box.createVerticalStrut(10);
		add(verticalStrut_7, "cell 0 23");
		
		lblCashOnHand = new JLabel("Cash on Hand");
		add(lblCashOnHand, "cell 2 24");
		
		lblCashOnHandBalance = new JLabel("Balance:");
		add(lblCashOnHandBalance, "flowx,cell 4 24");
		
		horizontalStrut_4 = Box.createHorizontalStrut(10);
		add(horizontalStrut_4, "cell 4 24");
		
		txtfldCashOnHandBalance = new JTextField();
		txtfldCashOnHandBalance.setEditable(false);
		txtfldCashOnHandBalance.setText("0.00");
		add(txtfldCashOnHandBalance, "cell 4 24,growx");
		txtfldCashOnHandBalance.setColumns(20);
		
		verticalStrut_8 = Box.createVerticalStrut(10);
		add(verticalStrut_8, "cell 0 25");
		
		btnCashOnHandTransactionHistory = new JButton("Transaction History");
		btnCashOnHandTransactionHistory.setFocusPainted(false);
		btnCashOnHandTransactionHistory.setContentAreaFilled(false);
		add(btnCashOnHandTransactionHistory, "cell 4 26,growx");
		
		btnCashOnHandDeposit = new JButton("Deposit");
		btnCashOnHandDeposit.setFocusPainted(false);
		btnCashOnHandDeposit.setContentAreaFilled(false);
		add(btnCashOnHandDeposit, "flowx,cell 6 26,growx");
		
		verticalStrut_9 = Box.createVerticalStrut(10);
		add(verticalStrut_9, "cell 0 27");
		
		lblCheckOnHand = new JLabel("Check on Hand");
		add(lblCheckOnHand, "cell 2 28");
		
		lblCheckOnHandBalance = new JLabel("Balance:");
		add(lblCheckOnHandBalance, "flowx,cell 4 28");
		
		horizontalStrut_5 = Box.createHorizontalStrut(10);
		add(horizontalStrut_5, "cell 4 28");
		
		txtfldCheckOnHandBalance = new JTextField();
		txtfldCheckOnHandBalance.setEditable(false);
		txtfldCheckOnHandBalance.setText("0.00");
		add(txtfldCheckOnHandBalance, "cell 4 28,growx");
		txtfldCheckOnHandBalance.setColumns(20);
		
		verticalStrut_10 = Box.createVerticalStrut(10);
		add(verticalStrut_10, "cell 0 29");
		
		btnCheckOnHandTransactionHistory = new JButton("Transaction History");
		btnCheckOnHandTransactionHistory.setFocusPainted(false);
		btnCheckOnHandTransactionHistory.setContentAreaFilled(false);		
		add(btnCheckOnHandTransactionHistory, "cell 4 30,growx");
		
		btnCheckOnHandDeposit = new JButton("Deposit");
		btnCheckOnHandDeposit.setFocusPainted(false);
		btnCheckOnHandDeposit.setContentAreaFilled(false);
		add(btnCheckOnHandDeposit, "flowx,cell 6 30,growx");
		
		horizontalStrut_2 = Box.createHorizontalStrut(10);
		add(horizontalStrut_2, "cell 6 6");
		
		txtfldBankBalance = new JTextField();
		txtfldBankBalance.setEditable(false);
		txtfldBankBalance.setText("0.00");
		add(txtfldBankBalance, "cell 6 6,growx");
		txtfldBankBalance.setColumns(20);
		
		horizontalStrut_6 = Box.createHorizontalStrut(10);
		add(horizontalStrut_6, "cell 6 18");
		
		txtfldCardBalance = new JTextField();
		txtfldCardBalance.setEditable(false);
		txtfldCardBalance.setText("0.00");
		add(txtfldCardBalance, "cell 6 18,growx");
		txtfldCardBalance.setColumns(20);
		
		verticalStrut_11 = Box.createVerticalStrut(10);
		add(verticalStrut_11, "cell 0 31");
	}
	public JButton getBtnViewAccountSummary() {
		return btnViewAccountSummary;
	}
	public void setBtnViewAccountSummary(JButton btnViewAccountSummary) {
		this.btnViewAccountSummary = btnViewAccountSummary;
	}
	
	
}
