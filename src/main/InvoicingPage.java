package main;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;

import managers.GeneralManager;

import javax.swing.JEditorPane;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class InvoicingPage extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblInvoicing;
	private JLabel lblCustomer;
	private JLabel lblName;
	private JLabel lblCompanyName;
	private JLabel lblStreetAddress;
	private JLabel lblCitystZipCode;
	private JLabel lblPhone;
	private Component verticalStrut_1;
	private Component horizontalStrut;
	private JComboBox cmbCustomer;
	private JComboBox cmbName;
	private JTextField txtfldCompanyName;
	private JTextField txtfldStreetAddress;
	private JTextField txtfldCitySTZIPCode;
	private JTextField txtfldPhone;
	private Component horizontalStrut_1;
	private JLabel lblDate;
	private Component horizontalStrut_2;
	private JLabel lblInvoiceNo;
	private JLabel lblCustomerId;
	private JLabel lblPurchaseOrderNo;
	private JLabel lblTerm;
	private JLabel lblPaymentDue;
	private JTextField txtfldDate;
	private JTextField txtfldInvoiceNo;
	private JTextField txtfldCustomerId;
	private JTextField txtfldPurchaseOrderNo;
	private JTextField txtfldTerm;
	private JTextField txtfldPaymentDue;
	private Component horizontalStrut_3;
	private Component verticalStrut_2;
	private JLabel lblTotalSales;
	private JTextField txtfldTotalSales;
	private JLabel lblDiscount;
	private JTextField txtfldDiscount;
	private JLabel lblTotalAmountDue;
	private JTextField txtfldTotalAmountDue;
	private JButton btnAddItem;
	private JButton btnClearAll;
	private JTable tblLineItems;
	private JScrollPane scrollPane;
	private JTextArea txtareaSpecialNotes;
	private JLabel lblSpecialNotesAnd;
	private Component verticalStrut_3;
	private JLabel lblPaymentMethod;
	private JRadioButton rdbtnCash;
	private JRadioButton rdbtnCheck;
	private JRadioButton rdbtnBank;
	private JComboBox cmbBank;
	private JButton btnPrintOrPreview;
	private String dateToday;
	private JLabel lblDetails;
	private JPanel panel;
	private Component verticalStrut_4;
	private Component verticalStrut_5;
	private Component horizontalStrut_4;
	private Component horizontalStrut_5;
	private JScrollPane scrollPane_1;

	public InvoicingPage() {
		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("", "[][][][][][][][][][][grow]", "[][][][][][][][][][][][][][][][][][][][][]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea, "cell 0 0");
		
		horizontalStrut_4 = Box.createHorizontalStrut(15);
		add(horizontalStrut_4, "cell 1 0");
		
		horizontalStrut = Box.createHorizontalStrut(10);
		add(horizontalStrut, "cell 3 0");
		
		horizontalStrut_1 = Box.createHorizontalStrut(20);
		add(horizontalStrut_1, "cell 5 0");
		
		horizontalStrut_2 = Box.createHorizontalStrut(10);
		add(horizontalStrut_2, "cell 7 0");
		
		horizontalStrut_5 = Box.createHorizontalStrut(15);
		add(horizontalStrut_5, "cell 9 0");
		
		horizontalStrut_3 = Box.createHorizontalStrut(10);
		add(horizontalStrut_3, "cell 10 0");
		
		lblInvoicing = new JLabel("INVOICING");
		lblInvoicing.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblInvoicing, "cell 1 1 2 1");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 2");
		
		panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		add(panel, "cell 1 3 9 1,growx");
		panel.setLayout(new MigLayout("", "[grow]", "[]"));
		
		lblDetails = new JLabel("Invoice Details");
		lblDetails.setForeground(new Color(255, 255, 255));
		panel.add(lblDetails, "cell 0 0");
		lblDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		verticalStrut_4 = Box.createVerticalStrut(10);
		add(verticalStrut_4, "cell 0 4");
		
		lblCustomer = new JLabel("Customer");
		add(lblCustomer, "cell 2 5");
		
		cmbCustomer = new JComboBox();
		cmbCustomer.setModel(new DefaultComboBoxModel(new String[] {"", "Hello World"}));
		cmbCustomer.setBackground(new Color(255, 255, 255));
		cmbCustomer.setFocusable(false);
		add(cmbCustomer, "cell 4 4 1 2,growx,aligny bottom");
		
		lblDate = new JLabel("Date");
		add(lblDate, "cell 6 5");
		
		txtfldDate = new JTextField();
		txtfldDate.setEditable(false);
		add(txtfldDate, "cell 8 5,growx");
		txtfldDate.setColumns(15);
		dateToday = getDateToday();
		txtfldDate.setText(dateToday);
		
		lblName = new JLabel("Name");
		add(lblName, "cell 2 6");
		
		cmbName = new JComboBox();
		cmbName.setModel(new DefaultComboBoxModel(new String[] {"", "Juan Dela Cruz"}));
		cmbName.setBackground(new Color(255, 255, 255));
		cmbName.setFocusable(false);
		add(cmbName, "cell 4 6,growx");
		
		lblInvoiceNo = new JLabel("Invoice No.");
		add(lblInvoiceNo, "cell 6 6");
		
		txtfldInvoiceNo = new JTextField();
		txtfldInvoiceNo.setEditable(false);
		add(txtfldInvoiceNo, "cell 8 6,growx");
		txtfldInvoiceNo.setColumns(20);
		
		lblCompanyName = new JLabel("Company Name");
		add(lblCompanyName, "cell 2 7");
		
		txtfldCompanyName = new JTextField();
		txtfldCompanyName.setEditable(false);
		add(txtfldCompanyName, "cell 4 7,growx");
		txtfldCompanyName.setColumns(20);
		
		lblCustomerId = new JLabel("Customer ID");
		add(lblCustomerId, "cell 6 7");
		
		txtfldCustomerId = new JTextField();
		txtfldCustomerId.setEditable(false);
		add(txtfldCustomerId, "cell 8 7,growx");
		txtfldCustomerId.setColumns(20);
		
		lblStreetAddress = new JLabel("Street Address");
		add(lblStreetAddress, "cell 2 8");
		
		txtfldStreetAddress = new JTextField();
		txtfldStreetAddress.setEditable(false);
		add(txtfldStreetAddress, "cell 4 8,growx");
		txtfldStreetAddress.setColumns(20);
		
		lblPurchaseOrderNo = new JLabel("Purchase Order No.");
		add(lblPurchaseOrderNo, "cell 6 8");
		
		txtfldPurchaseOrderNo = new JTextField();
		txtfldPurchaseOrderNo.setEditable(false);
		add(txtfldPurchaseOrderNo, "cell 8 8,growx");
		txtfldPurchaseOrderNo.setColumns(20);
		
		lblCitystZipCode = new JLabel("City/ST ZIP Code");
		add(lblCitystZipCode, "cell 2 9");
		
		txtfldCitySTZIPCode = new JTextField();
		txtfldCitySTZIPCode.setEditable(false);
		add(txtfldCitySTZIPCode, "cell 4 9,growx");
		txtfldCitySTZIPCode.setColumns(20);
		
		lblTerm = new JLabel("Term");
		add(lblTerm, "cell 6 9");
		
		txtfldTerm = new JTextField();
		txtfldTerm.setEditable(false);
		add(txtfldTerm, "cell 8 9,growx");
		txtfldTerm.setColumns(20);
		
		lblPhone = new JLabel("Phone");
		add(lblPhone, "cell 2 10");
		
		txtfldPhone = new JTextField();
		txtfldPhone.setEditable(false);
		add(txtfldPhone, "cell 4 10,growx");
		txtfldPhone.setColumns(15);
		
		lblPaymentDue = new JLabel("Payment Due");
		add(lblPaymentDue, "cell 6 10");
		
		txtfldPaymentDue = new JTextField();
		txtfldPaymentDue.setEditable(false);
		add(txtfldPaymentDue, "cell 8 10,growx");
		txtfldPaymentDue.setColumns(15);
		
		verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, "cell 0 11");
		
		scrollPane = new JScrollPane();
		add(scrollPane, "cell 2 12 7 1,growx");
		
		tblLineItems = new JTable();
		tblLineItems.setModel(new DefaultTableModel(
			new Object[][] {
				{"Product", null, null, null, "2", "35.00", "70.00"},
				{"Service", null, null, null, "1", "35.00", "35.00"},
			},
			new String[] {
				"Sale", "Code", "Name", "Description", "Qty.", "Unit Price", "Line Total"
			}
		));
		tblLineItems.getColumnModel().getColumn(3).setPreferredWidth(100);
		tblLineItems.getColumnModel().getColumn(3).setMinWidth(50);
		tblLineItems.setFillsViewportHeight(true);
		tblLineItems.setEnabled(false);
		scrollPane.setViewportView(tblLineItems);
		
		verticalStrut_2 = Box.createVerticalStrut(10);
		add(verticalStrut_2, "cell 0 13");
		
		btnAddItem = new JButton("Add Item");
		btnAddItem.setFocusPainted(false);
		btnAddItem.setContentAreaFilled(false);
		add(btnAddItem, "cell 2 14,growx");
		
		btnClearAll = new JButton("Clear All");
		btnClearAll.setFocusPainted(false);
		btnClearAll.setContentAreaFilled(false);
		add(btnClearAll, "flowx,cell 4 14");
		
		lblTotalSales = new JLabel("Total Sales");
		add(lblTotalSales, "cell 6 14,alignx right");
		
		txtfldTotalSales = new JTextField();
		txtfldTotalSales.setHorizontalAlignment(SwingConstants.TRAILING);
		txtfldTotalSales.setText("105.00");
		txtfldTotalSales.setEditable(false);
		add(txtfldTotalSales, "cell 8 14,growx");
		txtfldTotalSales.setColumns(20);
		
		lblSpecialNotesAnd = new JLabel("Special Notes and Instructions");
		add(lblSpecialNotesAnd, "cell 2 15 3 1,growx");
		
		lblDiscount = new JLabel("Discount");
		add(lblDiscount, "cell 6 15,alignx right");
		
		txtfldDiscount = new JTextField();
		txtfldDiscount.setEditable(false);
		add(txtfldDiscount, "cell 8 15,growx");
		txtfldDiscount.setColumns(15);
		
		scrollPane_1 = new JScrollPane();
		add(scrollPane_1, "cell 2 16 3 2,growx,aligny top");
		
		txtareaSpecialNotes = new JTextArea();
		txtareaSpecialNotes.setWrapStyleWord(true);
		txtareaSpecialNotes.setRows(2);
		scrollPane_1.setViewportView(txtareaSpecialNotes);
		txtareaSpecialNotes.setTabSize(10);
		txtareaSpecialNotes.setBackground(new Color(255, 255, 255));
		txtareaSpecialNotes.setLineWrap(true);
		
		lblTotalAmountDue = new JLabel("TOTAL AMOUNT DUE");
		add(lblTotalAmountDue, "cell 6 16");
		
		txtfldTotalAmountDue = new JTextField();
		txtfldTotalAmountDue.setText("105.00");
		txtfldTotalAmountDue.setHorizontalAlignment(SwingConstants.TRAILING);
		txtfldTotalAmountDue.setEditable(false);
		add(txtfldTotalAmountDue, "cell 8 16,growx");
		txtfldTotalAmountDue.setColumns(20);
		
		verticalStrut_3 = Box.createVerticalStrut(10);
		add(verticalStrut_3, "cell 0 17");
		
		lblPaymentMethod = new JLabel("Payment Method");
		add(lblPaymentMethod, "cell 2 18 1 2,growx");
		
		rdbtnCash = new JRadioButton("Cash");
		add(rdbtnCash, "flowx,cell 4 18,growx");
		
		rdbtnBank = new JRadioButton("Bank");
		add(rdbtnBank, "flowx,cell 4 19,growx");
		
		rdbtnCheck = new JRadioButton("Check");
		add(rdbtnCheck, "cell 4 18,growx");
		
		cmbBank = new JComboBox();
		cmbBank.setModel(new DefaultComboBoxModel(new String[] {"", "Hello World"}));
		cmbBank.setBackground(new Color(255, 255, 255));
		cmbBank.setFocusable(false);
		add(cmbBank, "cell 4 19,grow");
		
		btnPrintOrPreview = new JButton("Print or Preview");
		btnPrintOrPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnPrintOrPreview.setFocusPainted(false);
		btnPrintOrPreview.setContentAreaFilled(false);
		add(btnPrintOrPreview, "cell 8 19,growx");
		
		verticalStrut_5 = Box.createVerticalStrut(10);
		add(verticalStrut_5, "cell 0 20");
		
	}

	public String getDateToday() {
		GeneralManager genMan = new GeneralManager();
		return genMan.getDateToday();
	}

}
