package main;

import javax.swing.JPanel;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CompanyOrderPage extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtfldBrandName;
	private JTextField txtfldCategory;
	private JTextField txtfldDescription;
	private JTextField txtfldCost;
	private JTextField txtfldQty;
	private JTextField txtfldSellingPrice;
	private JTextField txtfldOrderNo;

	/**
	 * Create the panel.
	 */
	public CompanyOrderPage() {
		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("", "[][][grow][][grow][][]", "[][][][][][][][][][][][][][][][][][]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea, "cell 0 0");
		
		Component horizontalStrut = Box.createHorizontalStrut(15);
		add(horizontalStrut, "cell 1 0");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(10);
		add(horizontalStrut_1, "cell 3 0");
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(15);
		add(horizontalStrut_2, "cell 5 0");
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(10);
		add(horizontalStrut_3, "cell 6 0");
		
		JLabel lblCompanyOrder = new JLabel("COMPANY ORDER");
		lblCompanyOrder.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblCompanyOrder, "cell 1 1 2 1");
		
		JButton btnViewPriceList = new JButton("View Price List");
		btnViewPriceList.setFocusPainted(false);
		btnViewPriceList.setContentAreaFilled(false);
		add(btnViewPriceList, "cell 4 1 2 2,alignx right,aligny top");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 2");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		add(panel, "cell 1 3 5 1,grow");
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblInventoryReplenishment = new JLabel("Inventory Replenishment");
		lblInventoryReplenishment.setForeground(new Color(255, 255, 255));
		lblInventoryReplenishment.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblInventoryReplenishment, "cell 0 0");
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, "cell 0 4");
		
		JLabel lblOrderNo = new JLabel("Order No.");
		add(lblOrderNo, "cell 2 5");
		
		txtfldOrderNo = new JTextField();
		txtfldOrderNo.setEnabled(false);
		txtfldOrderNo.setEditable(false);
		add(txtfldOrderNo, "cell 4 5,growx");
		txtfldOrderNo.setColumns(10);
		
		Component verticalStrut_5 = Box.createVerticalStrut(10);
		add(verticalStrut_5, "cell 0 6");
		
		JLabel lblBrandName = new JLabel("Brand Name");
		add(lblBrandName, "cell 2 7");
		
		txtfldBrandName = new JTextField();
		txtfldBrandName.setEditable(false);
		add(txtfldBrandName, "cell 4 7,growx");
		txtfldBrandName.setColumns(30);
		
		JLabel lblCategory = new JLabel("Category");
		add(lblCategory, "cell 2 8");
		
		txtfldCategory = new JTextField();
		txtfldCategory.setEditable(false);
		add(txtfldCategory, "cell 4 8,growx");
		txtfldCategory.setColumns(30);
		
		JLabel lblDescription = new JLabel("Description");
		add(lblDescription, "cell 2 9");
		
		txtfldDescription = new JTextField();
		txtfldDescription.setEditable(false);
		add(txtfldDescription, "cell 4 9,growx");
		txtfldDescription.setColumns(30);
		
		JLabel lblQty = new JLabel("Qty.");
		add(lblQty, "cell 2 10");
		
		txtfldQty = new JTextField();
		txtfldQty.setEditable(false);
		add(txtfldQty, "cell 4 10,growx");
		txtfldQty.setColumns(10);
		
		JLabel lblCost = new JLabel("Cost");
		add(lblCost, "cell 2 11");
		
		txtfldCost = new JTextField();
		txtfldCost.setEditable(false);
		add(txtfldCost, "cell 4 11,growx");
		txtfldCost.setColumns(20);
		
		JLabel lblSellingPrice = new JLabel("Selling Price");
		add(lblSellingPrice, "cell 2 12");
		
		txtfldSellingPrice = new JTextField();
		txtfldSellingPrice.setEditable(false);
		add(txtfldSellingPrice, "cell 4 12,growx");
		txtfldSellingPrice.setColumns(10);
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		add(verticalStrut_2, "cell 0 13");
		
		JLabel lblPaymentMethod = new JLabel("Payment Method");
		add(lblPaymentMethod, "cell 2 14");
		
		JRadioButton rdbtnCash = new JRadioButton("Cash");
		rdbtnCash.setBackground(new Color(255, 255, 255));
		add(rdbtnCash, "flowx,cell 4 14");
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(10);
		add(horizontalStrut_5, "cell 4 14");
		
		JRadioButton rdbtnCheck = new JRadioButton("Check");
		rdbtnCheck.setBackground(new Color(255, 255, 255));
		add(rdbtnCheck, "cell 4 14");
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(10);
		add(horizontalStrut_6, "cell 4 14");
		
		JRadioButton rdbtnBank = new JRadioButton("Bank");
		rdbtnBank.setBackground(new Color(255, 255, 255));
		add(rdbtnBank, "cell 4 14,alignx right");
		
		JComboBox cmbBank = new JComboBox();
		cmbBank.setModel(new DefaultComboBoxModel(new String[] {"", "Hello", "World"}));
		cmbBank.setBackground(new Color(255, 255, 255));
		cmbBank.setFocusable(false);
		add(cmbBank, "cell 4 14,grow");
		Component verticalStrut_3 = Box.createVerticalStrut(10);
		add(verticalStrut_3, "cell 0 15");
		
		JButton btnFulfill = new JButton("Fulfill");
		btnFulfill.setFocusPainted(false);
		btnFulfill.setContentAreaFilled(false);
		add(btnFulfill, "flowx,cell 4 16,growx");
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(10);
		add(horizontalStrut_4, "cell 4 16");
		
		JButton btnPrintOrPreview = new JButton("Print or Preview");
		btnPrintOrPreview.setFocusPainted(false);
		btnPrintOrPreview.setContentAreaFilled(false);
		add(btnPrintOrPreview, "cell 4 16,growx");
		
		Component verticalStrut_4 = Box.createVerticalStrut(10);
		add(verticalStrut_4, "cell 0 17");

	}

}
