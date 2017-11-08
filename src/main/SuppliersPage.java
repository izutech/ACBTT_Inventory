package main;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SuppliersPage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtfldTitle;
	private JTextField txtfldFirstName;
	private JTextField txtfldMiddleName;
	private JTextField txtfldLastName;
	private JTextField txtfldCompany;
	private JTextField txtfldTin;
	private JTextField txtfldBuildingHouseNo;
	private JTextField txtfldStreet;
	private JTextField txtfldTownCity;
	private JTextField txtfldCountyProvince;
	private JTextField txtfldStateProvince;
	private JTextField txtfldZIPPostalCode;
	private JTextField txtfldTelephoneNo;
	private JTextField txtfldFax;
	private JTextField txtfldEmail;
	private JTextField txtfldWebsite;
	private JTextField txtfldContactPerson;
	private JTextField txtfldContactTelephoneNo;
	private JTextField txtfldPreferredPaymentMethod;
	private JTextField txtfldTerms;
	private JTextField txtfldOpeningBalance;
	private JTextField txtfldAsOf;

	/**
	 * Create the panel.
	 */
	public SuppliersPage() {
		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea, "cell 0 0");
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(10);
		add(horizontalStrut_5, "cell 7 0");
		
		JLabel lblSuppliers = new JLabel("SUPPLIERS");
		lblSuppliers.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblSuppliers, "cell 1 1 2 1");
		
		JButton btnAddSupplier = new JButton("Add Supplier");
		btnAddSupplier.setFocusPainted(false);
		btnAddSupplier.setContentAreaFilled(false);
		add(btnAddSupplier, "cell 5 1 2 2,alignx right,aligny top");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 2");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		add(panel, "cell 1 3 6 1,grow");
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblSupplierProfile = new JLabel("Supplier Profile");
		lblSupplierProfile.setForeground(new Color(255, 255, 255));
		lblSupplierProfile.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblSupplierProfile, "cell 0 0");
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, "cell 0 4");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(15);
		add(horizontalStrut_1, "flowx,cell 1 4");
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(15);
		add(horizontalStrut_4, "cell 6 4");
		
		JLabel lblSupplier = new JLabel("Supplier");
		add(lblSupplier, "cell 2 5");
		
		JComboBox cmbCustomers = new JComboBox();
		cmbCustomers.setBackground(new Color(255, 255, 255));
		cmbCustomers.setFocusable(false);
		add(cmbCustomers, "cell 3 4 3 2,growx,aligny bottom");
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		add(verticalStrut_2, "cell 0 6");
		
		txtfldTitle = new JTextField();
		txtfldTitle.setText("Title");
		txtfldTitle.setEditable(false);
		add(txtfldTitle, "cell 2 7,growx");
		txtfldTitle.setColumns(10);
		
		txtfldFirstName = new JTextField();
		txtfldFirstName.setText("First Name");
		txtfldFirstName.setEditable(false);
		add(txtfldFirstName, "cell 3 7,growx");
		txtfldFirstName.setColumns(20);
		
		txtfldMiddleName = new JTextField();
		txtfldMiddleName.setText("Middle Name");
		txtfldMiddleName.setEditable(false);
		add(txtfldMiddleName, "cell 4 7,growx");
		txtfldMiddleName.setColumns(20);
		
		txtfldLastName = new JTextField();
		txtfldLastName.setText("Last Name");
		txtfldLastName.setEditable(false);
		add(txtfldLastName, "cell 5 7,growx");
		txtfldLastName.setColumns(20);
		
		Component verticalStrut_3 = Box.createVerticalStrut(10);
		add(verticalStrut_3, "cell 0 8");
		
		JLabel lblCompany = new JLabel("Company");
		add(lblCompany, "cell 2 9");
		
		txtfldCompany = new JTextField();
		txtfldCompany.setEditable(false);
		add(txtfldCompany, "cell 3 9 3 1,growx");
		txtfldCompany.setColumns(50);
		
		JLabel lblTin = new JLabel("TIN");
		add(lblTin, "cell 2 10");
		
		txtfldTin = new JTextField();
		txtfldTin.setEditable(false);
		add(txtfldTin, "cell 3 10 3 1,growx");
		txtfldTin.setColumns(30);
		
		Component verticalStrut_4 = Box.createVerticalStrut(10);
		add(verticalStrut_4, "cell 0 11");
		
		JLabel lblBuildingHouseNo = new JLabel("Building/House No.");
		add(lblBuildingHouseNo, "cell 2 12");
		
		txtfldBuildingHouseNo = new JTextField();
		txtfldBuildingHouseNo.setEditable(false);
		add(txtfldBuildingHouseNo, "cell 3 12 3 1,growx");
		txtfldBuildingHouseNo.setColumns(5);
		
		JLabel lblStreet = new JLabel("Street");
		add(lblStreet, "cell 2 13");
		
		txtfldStreet = new JTextField();
		txtfldStreet.setEditable(false);
		add(txtfldStreet, "cell 3 13 3 1,growx");
		txtfldStreet.setColumns(20);
		
		JLabel lblTownCity = new JLabel("Town/City");
		add(lblTownCity, "cell 2 14");
		
		txtfldTownCity = new JTextField();
		txtfldTownCity.setEditable(false);
		add(txtfldTownCity, "cell 3 14 3 1,growx");
		txtfldTownCity.setColumns(30);
		
		JLabel lblCountyProvince = new JLabel("County/Province");
		add(lblCountyProvince, "cell 2 15");
		
		txtfldCountyProvince = new JTextField();
		txtfldCountyProvince.setEditable(false);
		add(txtfldCountyProvince, "cell 3 15 3 1,growx");
		txtfldCountyProvince.setColumns(30);
		
		JLabel lblStateProvince = new JLabel("State/Province");
		add(lblStateProvince, "cell 2 16");
		
		txtfldStateProvince = new JTextField();
		txtfldStateProvince.setEditable(false);
		add(txtfldStateProvince, "cell 3 16 3 1,growx");
		txtfldStateProvince.setColumns(30);
		
		JLabel lblZippostalCode = new JLabel("ZIP/Postal Code");
		add(lblZippostalCode, "cell 2 17");
		
		txtfldZIPPostalCode = new JTextField();
		txtfldZIPPostalCode.setEditable(false);
		add(txtfldZIPPostalCode, "cell 3 17 3 1,growx");
		txtfldZIPPostalCode.setColumns(10);
		
		Component verticalStrut_5 = Box.createVerticalStrut(10);
		add(verticalStrut_5, "cell 0 18");
		
		JLabel lblTelephoneNo = new JLabel("Telephone No.");
		add(lblTelephoneNo, "cell 2 19");
		
		txtfldTelephoneNo = new JTextField();
		txtfldTelephoneNo.setEditable(false);
		add(txtfldTelephoneNo, "cell 3 19 3 1,growx");
		txtfldTelephoneNo.setColumns(20);
		
		JLabel lblFaxNo = new JLabel("Fax No.");
		add(lblFaxNo, "cell 2 20");
		
		txtfldFax = new JTextField();
		txtfldFax.setEditable(false);
		add(txtfldFax, "cell 3 20 3 1,growx");
		txtfldFax.setColumns(20);
		
		JLabel lblEmail = new JLabel("E-mail");
		add(lblEmail, "cell 2 21");
		
		txtfldEmail = new JTextField();
		txtfldEmail.setEditable(false);
		add(txtfldEmail, "cell 3 21 3 1,growx");
		txtfldEmail.setColumns(30);
		
		JLabel lblWebsite = new JLabel("Website");
		add(lblWebsite, "cell 2 22");
		
		txtfldWebsite = new JTextField();
		txtfldWebsite.setEditable(false);
		add(txtfldWebsite, "cell 3 22 3 1,growx");
		txtfldWebsite.setColumns(50);
		
		Component verticalStrut_6 = Box.createVerticalStrut(10);
		add(verticalStrut_6, "cell 0 23");
		
		JLabel lblPersondepartmentToContact = new JLabel("Person/Department to Contact");
		add(lblPersondepartmentToContact, "flowx,cell 2 24");
		
		txtfldContactPerson = new JTextField();
		txtfldContactPerson.setEditable(false);
		add(txtfldContactPerson, "cell 3 24 3 1,growx");
		txtfldContactPerson.setColumns(10);
		
		JLabel lblContactTelephoneNo = new JLabel("Contact Telephone No.");
		add(lblContactTelephoneNo, "cell 2 25");
		
		txtfldContactTelephoneNo = new JTextField();
		txtfldContactTelephoneNo.setEditable(false);
		add(txtfldContactTelephoneNo, "cell 3 25 3 1,growx");
		txtfldContactTelephoneNo.setColumns(20);
		
		Component verticalStrut_7 = Box.createVerticalStrut(10);
		add(verticalStrut_7, "cell 0 26");
		
		JLabel lblPreferredPaymentMethod = new JLabel("Preferred Payment Method");
		add(lblPreferredPaymentMethod, "cell 2 27");
		
		txtfldPreferredPaymentMethod = new JTextField();
		txtfldPreferredPaymentMethod.setEditable(false);
		add(txtfldPreferredPaymentMethod, "cell 3 27 3 1,growx");
		txtfldPreferredPaymentMethod.setColumns(10);
		
		JLabel lblTerms = new JLabel("Terms");
		add(lblTerms, "cell 2 28");
		
		txtfldTerms = new JTextField();
		txtfldTerms.setEditable(false);
		add(txtfldTerms, "cell 3 28 3 1,growx");
		txtfldTerms.setColumns(10);
		
		Component verticalStrut_8 = Box.createVerticalStrut(10);
		add(verticalStrut_8, "cell 0 29");
		
		JLabel lblOpeningBalance = new JLabel("Opening Balance");
		add(lblOpeningBalance, "cell 2 30,alignx trailing");
		
		txtfldOpeningBalance = new JTextField();
		txtfldOpeningBalance.setEditable(false);
		add(txtfldOpeningBalance, "cell 3 30,growx,aligny top");
		txtfldOpeningBalance.setColumns(20);
		
		JLabel lblAsOf = new JLabel("As of");
		add(lblAsOf, "cell 4 30,alignx trailing");
		
		txtfldAsOf = new JTextField();
		txtfldAsOf.setEditable(false);
		add(txtfldAsOf, "cell 5 30,growx");
		txtfldAsOf.setColumns(10);
		
		Component verticalStrut_9 = Box.createVerticalStrut(10);
		add(verticalStrut_9, "cell 0 31");
		
		Component horizontalStrut = Box.createHorizontalStrut(10);
		add(horizontalStrut, "cell 2 24");
		
	}

}
