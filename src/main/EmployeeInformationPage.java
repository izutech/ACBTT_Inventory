package main;

import javax.swing.JPanel;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;

import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class EmployeeInformationPage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtfldTitle;
	private JTextField txtfldFirstName;
	private JTextField txtfldMiddleName;
	private JTextField txtfldLastName;
	private JTextField txtfldPosition;
	private JTextField txtfldJobDescription;
	private JTextField txtfldRateHour;
	private JTextField txtfldDateHired;
	private JTextField txtfldDateReleased;
	private JTextField txtfldTin;
	private JTextField txtfldSss;
	private JTextField txtfldPhic;
	private JTextField txtfldBuildingHouseNo;
	private JTextField txtfldStreet;
	private JTextField txtfldTownCity;
	private JTextField txtfldCountyProvince;
	private JTextField txtfldStateProvince;
	private JTextField txtfldZipPostalCode;
	private JTextField txtfldGender;
	private JTextField txtfldDateOfBirth;
	private JTextField txtfldPlaceOfBirth;
	private JTextField txtfldTelephoneNo;
	private JTextField txtfldMobileNo;
	private JTextField txtfldEmail;
	private JTextField txtfldPersonToContact;
	private JTextField txtfldContactTelephoneNo;

	/**
	 * Create the panel.
	 */
	public EmployeeInformationPage() {
		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("", "[][][][grow][][grow][][]", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea, "cell 0 0");
		
		Component horizontalStrut = Box.createHorizontalStrut(15);
		add(horizontalStrut, "cell 1 0");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(15);
		add(horizontalStrut_1, "cell 6 0");
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(10);
		add(horizontalStrut_2, "cell 7 0");
		
		JLabel lblEmployeeInformation = new JLabel("EMPLOYEE INFORMATION");
		lblEmployeeInformation.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblEmployeeInformation, "cell 1 1 3 1");
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.setFocusPainted(false);
		btnAddEmployee.setContentAreaFilled(false);
		add(btnAddEmployee, "cell 5 1 2 2,alignx right,aligny top");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 2");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		add(panel, "cell 1 3 6 1,grow");
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblEmployeeDetails = new JLabel("Employee Details");
		lblEmployeeDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmployeeDetails.setForeground(new Color(255, 255, 255));
		panel.add(lblEmployeeDetails, "cell 0 0");
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, "cell 0 4");
		
		JLabel lblEmployee = new JLabel("Employee");
		add(lblEmployee, "cell 2 5");
		
		JComboBox cmbEmployee = new JComboBox();
		cmbEmployee.setBackground(new Color(255, 255, 255));
		cmbEmployee.setFocusable(false);
		add(cmbEmployee, "cell 3 4 3 2,growx,aligny bottom");
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		add(verticalStrut_2, "cell 0 6");
		
		txtfldTitle = new JTextField();
		txtfldTitle.setEditable(false);
		txtfldTitle.setText("Title");
		add(txtfldTitle, "cell 2 7,growx");
		txtfldTitle.setColumns(10);
		
		txtfldFirstName = new JTextField();
		txtfldFirstName.setEditable(false);
		txtfldFirstName.setText("First Name");
		add(txtfldFirstName, "cell 3 7,growx");
		txtfldFirstName.setColumns(20);
		
		txtfldMiddleName = new JTextField();
		txtfldMiddleName.setEditable(false);
		txtfldMiddleName.setText("Middle Name");
		add(txtfldMiddleName, "cell 4 7,growx");
		txtfldMiddleName.setColumns(20);
		
		txtfldLastName = new JTextField();
		txtfldLastName.setEditable(false);
		txtfldLastName.setText("Last Name");
		add(txtfldLastName, "cell 5 7,growx");
		txtfldLastName.setColumns(20);
		
		Component verticalStrut_3 = Box.createVerticalStrut(10);
		add(verticalStrut_3, "cell 0 8");
		
		JLabel lblPosition = new JLabel("Position");
		add(lblPosition, "cell 2 9");
		
		txtfldPosition = new JTextField();
		txtfldPosition.setEditable(false);
		add(txtfldPosition, "cell 3 9 3 1,growx");
		txtfldPosition.setColumns(20);
		
		JLabel lblJobDescription = new JLabel("Job Description");
		add(lblJobDescription, "cell 2 10");
		
		txtfldJobDescription = new JTextField();
		txtfldJobDescription.setEditable(false);
		add(txtfldJobDescription, "cell 3 10 3 1,growx,aligny top");
		txtfldJobDescription.setColumns(30);
		
		JLabel lblRatehour = new JLabel("Rate/Hour");
		add(lblRatehour, "cell 2 11");
		
		txtfldRateHour = new JTextField();
		txtfldRateHour.setEditable(false);
		add(txtfldRateHour, "cell 3 11 3 1,growx");
		txtfldRateHour.setColumns(10);
		
		JLabel lblDateHired = new JLabel("Date Hired");
		add(lblDateHired, "cell 2 12");
		
		txtfldDateHired = new JTextField();
		txtfldDateHired.setEditable(false);
		add(txtfldDateHired, "cell 3 12 3 1,growx");
		txtfldDateHired.setColumns(10);
		
		JLabel lblDateReleased = new JLabel("Date Released");
		add(lblDateReleased, "cell 2 13");
		
		txtfldDateReleased = new JTextField();
		txtfldDateReleased.setEditable(false);
		add(txtfldDateReleased, "cell 3 13 3 1,growx");
		txtfldDateReleased.setColumns(10);
		
		Component verticalStrut_4 = Box.createVerticalStrut(10);
		add(verticalStrut_4, "cell 0 14");
		
		JLabel lblTin = new JLabel("TIN");
		add(lblTin, "cell 2 15");
		
		txtfldTin = new JTextField();
		txtfldTin.setEditable(false);
		add(txtfldTin, "cell 3 15 3 1,growx");
		txtfldTin.setColumns(20);
		
		JLabel lblSss = new JLabel("SSS");
		add(lblSss, "cell 2 16");
		
		txtfldSss = new JTextField();
		txtfldSss.setEditable(false);
		add(txtfldSss, "cell 3 16 3 1,growx");
		txtfldSss.setColumns(20);
		
		JLabel lblPhic = new JLabel("PHIC");
		add(lblPhic, "cell 2 17");
		
		txtfldPhic = new JTextField();
		txtfldPhic.setEditable(false);
		add(txtfldPhic, "cell 3 17 3 1,growx");
		txtfldPhic.setColumns(20);
		
		Component verticalStrut_5 = Box.createVerticalStrut(10);
		add(verticalStrut_5, "cell 0 18");
		
		JLabel lblBuildingHouseNo = new JLabel("Building/House No.");
		add(lblBuildingHouseNo, "flowx,cell 2 19");
		
		txtfldBuildingHouseNo = new JTextField();
		txtfldBuildingHouseNo.setEditable(false);
		add(txtfldBuildingHouseNo, "cell 3 19,growx,aligny top");
		txtfldBuildingHouseNo.setColumns(10);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(10);
		add(horizontalStrut_6, "flowx,cell 4 19");
		
		JLabel lblCountyProvince = new JLabel("County/Province");
		add(lblCountyProvince, "cell 4 19");
		
		txtfldCountyProvince = new JTextField();
		txtfldCountyProvince.setEditable(false);
		add(txtfldCountyProvince, "cell 5 19,growx");
		txtfldCountyProvince.setColumns(20);
		
		JLabel lblStreet = new JLabel("Street");
		add(lblStreet, "cell 2 20");
		
		txtfldStreet = new JTextField();
		txtfldStreet.setEditable(false);
		add(txtfldStreet, "cell 3 20,growx");
		txtfldStreet.setColumns(15);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(10);
		add(horizontalStrut_7, "flowx,cell 4 20");
		
		JLabel lblStateProvince = new JLabel("State/Province");
		add(lblStateProvince, "cell 4 20");
		
		txtfldStateProvince = new JTextField();
		txtfldStateProvince.setEditable(false);
		add(txtfldStateProvince, "cell 5 20,growx");
		txtfldStateProvince.setColumns(20);
		
		JLabel lblTownCity = new JLabel("Town/City");
		add(lblTownCity, "cell 2 21");
		
		txtfldTownCity = new JTextField();
		txtfldTownCity.setEditable(false);
		add(txtfldTownCity, "cell 3 21,growx");
		txtfldTownCity.setColumns(20);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(10);
		add(horizontalStrut_8, "flowx,cell 4 21");
		
		JLabel lblZipPostalCode = new JLabel("ZIP/Postal Code");
		add(lblZipPostalCode, "cell 4 21");
		
		txtfldZipPostalCode = new JTextField();
		txtfldZipPostalCode.setEditable(false);
		add(txtfldZipPostalCode, "cell 5 21,growx");
		txtfldZipPostalCode.setColumns(10);
		
		Component verticalStrut_6 = Box.createVerticalStrut(10);
		add(verticalStrut_6, "cell 0 22");
		
		JLabel lblGender = new JLabel("Gender");
		add(lblGender, "cell 2 23");
		
		txtfldGender = new JTextField();
		txtfldGender.setEditable(false);
		add(txtfldGender, "cell 3 23,growx");
		txtfldGender.setColumns(8);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(10);
		add(horizontalStrut_3, "flowx,cell 4 23");
		
		JLabel lblTelephoneNo = new JLabel("Telephone No.");
		add(lblTelephoneNo, "cell 4 23,alignx trailing");
		
		txtfldTelephoneNo = new JTextField();
		txtfldTelephoneNo.setEditable(false);
		add(txtfldTelephoneNo, "cell 5 23,growx");
		txtfldTelephoneNo.setColumns(12);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		add(lblDateOfBirth, "cell 2 24");
		
		txtfldDateOfBirth = new JTextField();
		txtfldDateOfBirth.setEditable(false);
		add(txtfldDateOfBirth, "cell 3 24,growx");
		txtfldDateOfBirth.setColumns(10);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(10);
		add(horizontalStrut_4, "flowx,cell 4 24");
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		add(lblMobileNo, "cell 4 24,alignx trailing");
		
		txtfldMobileNo = new JTextField();
		txtfldMobileNo.setEditable(false);
		add(txtfldMobileNo, "cell 5 24,growx");
		txtfldMobileNo.setColumns(15);
		
		JLabel lblPlaceOfBirth = new JLabel("Place of Birth");
		add(lblPlaceOfBirth, "cell 2 25");
		
		txtfldPlaceOfBirth = new JTextField();
		txtfldPlaceOfBirth.setEditable(false);
		add(txtfldPlaceOfBirth, "cell 3 25,growx");
		txtfldPlaceOfBirth.setColumns(20);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(10);
		add(horizontalStrut_5, "flowx,cell 4 25");
		
		JLabel lblEmail = new JLabel("E-mail");
		add(lblEmail, "cell 4 25,alignx trailing");
		
		txtfldEmail = new JTextField();
		txtfldEmail.setEditable(false);
		add(txtfldEmail, "cell 5 25,growx");
		txtfldEmail.setColumns(25);
		
		Component verticalStrut_7 = Box.createVerticalStrut(10);
		add(verticalStrut_7, "cell 0 26");
		
		JLabel lblPersonToContact = new JLabel("Person to Contact In Case of Emergency");
		add(lblPersonToContact, "flowx,cell 2 27 2 1");
		
		txtfldPersonToContact = new JTextField();
		txtfldPersonToContact.setEditable(false);
		add(txtfldPersonToContact, "cell 4 27 2 1,growx");
		txtfldPersonToContact.setColumns(30);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(10);
		add(horizontalStrut_9, "cell 2 19");
		
		JLabel lblContactTelephoneNo = new JLabel("Contact Telephone No.");
		add(lblContactTelephoneNo, "cell 2 28 2 1");
		
		txtfldContactTelephoneNo = new JTextField();
		txtfldContactTelephoneNo.setEditable(false);
		add(txtfldContactTelephoneNo, "cell 4 28 2 1,growx");
		txtfldContactTelephoneNo.setColumns(20);
		
		JLabel lblDependents = new JLabel("Dependents");
		add(lblDependents, "cell 2 29");
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, "cell 4 29 2 1,growx");
		
		JTextArea txtareaDependents = new JTextArea();
		txtareaDependents.setBackground(new Color(240, 240, 240));
		scrollPane.setViewportView(txtareaDependents);
		txtareaDependents.setWrapStyleWord(true);
		txtareaDependents.setLineWrap(true);
		txtareaDependents.setTabSize(10);
		txtareaDependents.setRows(2);
		
		Component verticalStrut_8 = Box.createVerticalStrut(10);
		add(verticalStrut_8, "cell 0 30");

	}

}
