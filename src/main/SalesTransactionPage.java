package main;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class SalesTransactionPage extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tblTransactions;

	/**
	 * Create the panel.
	 */
	public SalesTransactionPage() {
		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("", "[][][grow][][]", "[][][][][][grow][][][]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea, "cell 0 0");
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(15);
		add(horizontalStrut_2, "cell 1 0");
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(15);
		add(horizontalStrut_4, "cell 3 0");
		
		Component horizontalStrut = Box.createHorizontalStrut(10);
		add(horizontalStrut, "cell 4 0");
		
		JLabel lblSalesTransactions = new JLabel("SALES TRANSACTIONS");
		lblSalesTransactions.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblSalesTransactions, "cell 1 1 2 1");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 2");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		add(panel, "cell 1 3 3 1,grow");
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblOutstandingTransactions = new JLabel("Outstanding Transactions");
		lblOutstandingTransactions.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOutstandingTransactions.setForeground(new Color(255, 255, 255));
		panel.add(lblOutstandingTransactions, "cell 0 0");
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, "cell 0 4");
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "flowx,cell 2 5,grow");
		
		tblTransactions = new JTable();
		tblTransactions.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "1001", null, null},
				{null, "1002", null, null},
			},
			new String[] {
				"", "Invoice Number", "Due Date", "Amount to Pay"
			}
		));
		tblTransactions.getColumnModel().getColumn(0).setPreferredWidth(15);
		tblTransactions.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTransactions);
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		add(verticalStrut_2, "cell 0 6");
		
		JButton btnCompleteTransaction = new JButton("Complete Transaction");
		btnCompleteTransaction.setFocusPainted(false);
		btnCompleteTransaction.setContentAreaFilled(false);
		add(btnCompleteTransaction, "flowx,cell 2 7,alignx right");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(10);
		add(horizontalStrut_1, "cell 2 7");
		
		JButton btnPrintOrPreview = new JButton("Print or Preview");
		btnPrintOrPreview.setFocusPainted(false);
		btnPrintOrPreview.setContentAreaFilled(false);
		add(btnPrintOrPreview, "cell 2 7,alignx right");
		
		Component verticalStrut_3 = Box.createVerticalStrut(10);
		add(verticalStrut_3, "cell 0 8");
		
	}

}
