package main;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class OperatingExpensePage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtfldDate;
	private JTextField txtfldCardVoucherNo;
	private JTextField txtfldPayee;
	private JTextField txtfldCashBalance;
	private JTextField txtfldCheckBalance;
	private JTable table;
	private JTextField txtfldTotal;

	/**
	 * Create the panel.
	 */
	public OperatingExpensePage() {
		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("", "[][][grow][][grow][][grow][][grow][][]", "[][][][][][][][][][][][][][][][][]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea, "cell 0 0");
		
		Component horizontalStrut = Box.createHorizontalStrut(15);
		add(horizontalStrut, "cell 1 0");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(10);
		add(horizontalStrut_1, "cell 3 0");
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		add(horizontalStrut_2, "cell 5 0");
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(10);
		add(horizontalStrut_3, "cell 7 0");
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(15);
		add(horizontalStrut_4, "cell 9 0");
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(10);
		add(horizontalStrut_5, "cell 10 0");
		
		JLabel lblOperatingExpense = new JLabel("OPERATING EXPENSE");
		lblOperatingExpense.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblOperatingExpense, "cell 1 1 4 1");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 2");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		add(panel, "cell 1 3 9 1,grow");
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblCashcheckDisbursement = new JLabel("Cash/Check Disbursement");
		lblCashcheckDisbursement.setForeground(new Color(255, 255, 255));
		lblCashcheckDisbursement.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblCashcheckDisbursement, "cell 0 0");
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, "cell 0 4");
		
		JLabel lblDate = new JLabel("Date");
		add(lblDate, "cell 2 5");
		
		txtfldDate = new JTextField();
		txtfldDate.setEditable(false);
		add(txtfldDate, "cell 4 5,growx");
		txtfldDate.setColumns(15);
		
		JLabel lblCardVoucherNo = new JLabel("Card Voucher No.");
		add(lblCardVoucherNo, "cell 6 5");
		
		txtfldCardVoucherNo = new JTextField();
		txtfldCardVoucherNo.setEditable(false);
		add(txtfldCardVoucherNo, "cell 8 5,growx");
		txtfldCardVoucherNo.setColumns(15);
		
		JLabel lblPayee = new JLabel("Payee");
		add(lblPayee, "cell 2 6");
		
		txtfldPayee = new JTextField();
		txtfldPayee.setEditable(false);
		add(txtfldPayee, "cell 4 6,growx");
		txtfldPayee.setColumns(20);
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		add(verticalStrut_2, "cell 0 7");
		
		JLabel lblPaymentMethod = new JLabel("Payment Method");
		add(lblPaymentMethod, "cell 2 8 1 2");
		
		JRadioButton rdbtnCash = new JRadioButton("Cash");
		rdbtnCash.setBackground(new Color(255, 255, 255));
		add(rdbtnCash, "flowx,cell 4 8,growx");
		
		JLabel lblCashBalance = new JLabel("Balance:");
		add(lblCashBalance, "cell 6 8");
		
		txtfldCashBalance = new JTextField();
		txtfldCashBalance.setEditable(false);
		txtfldCashBalance.setText("0.00");
		add(txtfldCashBalance, "cell 8 8,growx");
		txtfldCashBalance.setColumns(20);
		
		JRadioButton rdbtnCheck = new JRadioButton("Check");
		rdbtnCheck.setBackground(new Color(255, 255, 255));
		add(rdbtnCheck, "flowx,cell 4 9,growx");
		
		JLabel lblCheckBalance = new JLabel("Balance:");
		add(lblCheckBalance, "cell 6 9");
		
		txtfldCheckBalance = new JTextField();
		txtfldCheckBalance.setEditable(false);
		txtfldCheckBalance.setText("0.00");
		add(txtfldCheckBalance, "cell 8 9,growx");
		txtfldCheckBalance.setColumns(20);
		
		Component verticalStrut_3 = Box.createVerticalStrut(10);
		add(verticalStrut_3, "cell 0 10");
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 2 11 7 1,grow");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Account Details", "Description", "Amount"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(1).setMinWidth(75);
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		
		Component verticalStrut_6 = Box.createVerticalStrut(10);
		add(verticalStrut_6, "cell 0 12");
		
		JButton btnAddLines = new JButton("Add Lines");
		btnAddLines.setFocusPainted(false);
		btnAddLines.setContentAreaFilled(false);
		add(btnAddLines, "cell 2 13,growx");
		
		JButton btnClearAll = new JButton("Clear All");
		btnClearAll.setFocusPainted(false);
		btnClearAll.setContentAreaFilled(false);
		add(btnClearAll, "cell 4 13,growx");
		
		JLabel lblTotal = new JLabel("TOTAL");
		add(lblTotal, "cell 6 13,alignx right");
		
		txtfldTotal = new JTextField();
		txtfldTotal.setEditable(false);
		add(txtfldTotal, "cell 8 13,growx");
		txtfldTotal.setColumns(20);
		
		Component verticalStrut_4 = Box.createVerticalStrut(10);
		add(verticalStrut_4, "cell 0 14");
		
		JButton btnPrintOrPreview = new JButton("Print or Preview");
		btnPrintOrPreview.setFocusPainted(false);
		btnPrintOrPreview.setContentAreaFilled(false);
		add(btnPrintOrPreview, "cell 8 15,growx");
		
		Component verticalStrut_5 = Box.createVerticalStrut(10);
		add(verticalStrut_5, "cell 0 16");

	}

}
