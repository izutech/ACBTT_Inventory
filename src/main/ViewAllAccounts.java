package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class ViewAllAccounts {

	private JFrame frmViewAllBankAccounts;
	private JTable tblBankAccounts;
	private JButton btnAddAccount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAllAccounts window = new ViewAllAccounts();
					window.frmViewAllBankAccounts.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewAllAccounts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmViewAllBankAccounts = new JFrame();
		frmViewAllBankAccounts.getContentPane().setBackground(new Color(255, 255, 255));
		frmViewAllBankAccounts.getContentPane().setLayout(new MigLayout("", "[][][]", "[][][][][][][][]"));
		frmViewAllBankAccounts.setTitle("A&C Basic Trend Trading Company");
		frmViewAllBankAccounts.setResizable(false);
		frmViewAllBankAccounts.setBounds(100, 100, 450, 400);
		//frmViewAllBankAccounts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 10));
		frmViewAllBankAccounts.getContentPane().add(rigidArea, "cell 0 0");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(10);
		frmViewAllBankAccounts.getContentPane().add(horizontalStrut_1, "cell 2 0");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		frmViewAllBankAccounts.getContentPane().add(panel, "cell 1 2,growx");
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblBankAccounts = new JLabel("Bank Accounts");
		lblBankAccounts.setForeground(new Color(255, 255, 255));
		lblBankAccounts.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblBankAccounts, "cell 0 0");
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		frmViewAllBankAccounts.getContentPane().add(verticalStrut_1, "cell 0 3");
		
		Component horizontalStrut = Box.createHorizontalStrut(15);
		frmViewAllBankAccounts.getContentPane().add(horizontalStrut, "flowx,cell 1 4");
		
		JScrollPane scrollPane = new JScrollPane();
		frmViewAllBankAccounts.getContentPane().add(scrollPane, "cell 1 4,grow");
		
		tblBankAccounts = new JTable();
		tblBankAccounts.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
				{null, null, "Edit", "Delete"},
			},
			new String[] {
				"Bank Name", "Account No.", "", ""
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				String.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tblBankAccounts.getColumnModel().getColumn(0).setResizable(false);
		tblBankAccounts.getColumnModel().getColumn(2).setResizable(false);
		tblBankAccounts.getColumnModel().getColumn(2).setPreferredWidth(50);
		tblBankAccounts.getColumnModel().getColumn(3).setResizable(false);
		tblBankAccounts.getColumnModel().getColumn(3).setPreferredWidth(50);
		tblBankAccounts.setFillsViewportHeight(true);
		tblBankAccounts.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(tblBankAccounts);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(15);
		frmViewAllBankAccounts.getContentPane().add(horizontalStrut_2, "cell 1 4");
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		frmViewAllBankAccounts.getContentPane().add(verticalStrut_2, "cell 0 5");
		
		btnAddAccount = new JButton("Add Account");
		btnAddAccount.setFocusPainted(false);
		btnAddAccount.setContentAreaFilled(false);
		frmViewAllBankAccounts.getContentPane().add(btnAddAccount, "flowx,cell 1 6,alignx right");
		
		Component verticalStrut_3 = Box.createVerticalStrut(10);
		frmViewAllBankAccounts.getContentPane().add(verticalStrut_3, "cell 0 7");
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(15);
		frmViewAllBankAccounts.getContentPane().add(horizontalStrut_3, "cell 1 6");
		
		
		
	}

}
