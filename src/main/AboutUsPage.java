package main;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;

import managers.AboutUsManager;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutUsPage extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtfldCompanyName;
	private JTextField txtfldBuildingHouseNumber;
	private JTextField txtfldStreet;
	private JTextField txtfldTownCity;
	private JTextField txtfldCountyProvince;
	private JTextField txtfldStateProvince;
	private JTextField txtfldZipPostalCode;
	private JTextField txtfldTelephoneNumber;
	private JTextField txtfldFaxNumber;
	private JTextField txtfldEmail;
	private JTextField txtfldWebsite;
	private JTextField txtfldPersonDepartmentToContact;
	private JTextField txtfldContactTelephoneNumber;
	private JLabel lblAboutUs;
	private JButton btnEditProfile;
	private JLabel lblCompanyDetails;
	private JLabel lblCompanyName;
	private JLabel lblCompanyAddress;
	private JLabel lblBuildingHouseNo;
	private JLabel lblStreet;
	private JLabel lblTownCity;
	private JLabel lblCountyProvince;
	private JLabel lblStateProvince	;
	private JLabel lblZipPostalCode;
	private JLabel lblTelephoneNo;
	private JLabel lblFaxNo;
	private JLabel lblEmail;
	private JLabel lblWebsite;
	private JLabel lblPersonDepartmentToContact;
	private JLabel lblContactTelephoneNo;
	private JButton btnSave;
	private JButton btnCancel;
	private Component horizontalStrut_2;
	private Component horizontalStrut_3;
	private Component verticalStrut_4;
	
	public AboutUsPage() {
		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("", "[][][grow][][grow][][]", "[][][][][][][][][][][][][][][][][][][][][][][][][]"));
		
		Component topRigidArea = Box.createRigidArea(new Dimension(10, 10));
		add(topRigidArea, "cell 0 0");
		
		horizontalStrut_2 = Box.createHorizontalStrut(15);
		add(horizontalStrut_2, "cell 1 0");
		
		horizontalStrut_3 = Box.createHorizontalStrut(15);
		add(horizontalStrut_3, "cell 5 0");
		
		Component horizontalStrut = Box.createHorizontalStrut(10);
		add(horizontalStrut, "cell 6 0");
		
		lblAboutUs = new JLabel("ABOUT US");
		lblAboutUs.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblAboutUs, "cell 1 1 2 1,aligny center");
		
		Component horizontalStrut2 = Box.createHorizontalStrut(20);
		add(horizontalStrut2, "cell 3 1");
		
		btnEditProfile = new JButton("Edit Profile");
		btnEditProfile.setFocusPainted(false);
		btnEditProfile.setContentAreaFilled(false);
		btnEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnEditProfile.setEnabled(false);
				txtfldCompanyName.setEditable(true);
				txtfldBuildingHouseNumber.setEditable(true);
				txtfldStreet.setEditable(true);
				txtfldTownCity.setEditable(true);
				txtfldCountyProvince.setEditable(true);
				txtfldStateProvince.setEditable(true);
				txtfldZipPostalCode.setEditable(true);
				txtfldTelephoneNumber.setEditable(true);
				txtfldFaxNumber.setEditable(true);
				txtfldEmail.setEditable(true);
				txtfldWebsite.setEditable(true);
				txtfldPersonDepartmentToContact.setEditable(true);
				txtfldContactTelephoneNumber.setEditable(true);
				
				Component verticalStrut_3 = Box.createVerticalStrut(10);
				add(verticalStrut_3, "cell 0 23");
				
				Component horizontalStrut_1 = Box.createHorizontalStrut(10);
				add(horizontalStrut_1, "cell 1 24");
				
				btnSave = new JButton("Save");
				btnSave.setFocusPainted(false);
				btnSave.setContentAreaFilled(false);
				btnSave.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						AboutUsManager aboutUsManager = new AboutUsManager();
						aboutUsManager.saveSettings();
						
						btnEditProfile.setEnabled(true);
						txtfldCompanyName.setEditable(false);
						txtfldBuildingHouseNumber.setEditable(false);
						txtfldStreet.setEditable(false);
						txtfldTownCity.setEditable(false);
						txtfldCountyProvince.setEditable(false);
						txtfldStateProvince.setEditable(false);
						txtfldZipPostalCode.setEditable(false);
						txtfldTelephoneNumber.setEditable(false);
						txtfldFaxNumber.setEditable(false);
						txtfldEmail.setEditable(false);
						txtfldWebsite.setEditable(false);
						txtfldPersonDepartmentToContact.setEditable(false);
						txtfldContactTelephoneNumber.setEditable(false);
						
						remove(btnSave);
						remove(btnCancel);
						remove(verticalStrut_3);
						remove(horizontalStrut_1);
						invalidate();
						repaint();
					}
				});
				add(btnSave, "flowx,cell 2 24,alignx left");
				
				btnCancel = new JButton("Cancel");
				btnCancel.setFocusPainted(false);
				btnCancel.setContentAreaFilled(false);
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						btnEditProfile.setEnabled(true);
						txtfldCompanyName.setEditable(false);
						txtfldBuildingHouseNumber.setEditable(false);
						txtfldStreet.setEditable(false);
						txtfldTownCity.setEditable(false);
						txtfldCountyProvince.setEditable(false);
						txtfldStateProvince.setEditable(false);
						txtfldZipPostalCode.setEditable(false);
						txtfldTelephoneNumber.setEditable(false);
						txtfldFaxNumber.setEditable(false);
						txtfldEmail.setEditable(false);
						txtfldWebsite.setEditable(false);
						txtfldPersonDepartmentToContact.setEditable(false);
						txtfldContactTelephoneNumber.setEditable(false);
						
						remove(btnSave);
						remove(btnCancel);
						remove(verticalStrut_3);
						remove(horizontalStrut_1);
						invalidate();
						repaint();
					}
				});
				add(btnCancel, "cell 2 24,alignx left");
				
				revalidate();
				validate();
			}
		});
		add(btnEditProfile, "cell 4 1 2 2,alignx right,aligny top");
		
		Component verticalStrut1 = Box.createVerticalStrut(10);
		add(verticalStrut1, "cell 0 2");
		
		JPanel pnlCompanyDetails = new JPanel();
		pnlCompanyDetails.setBackground(new Color(30, 144, 255));
		add(pnlCompanyDetails, "cell 1 3 5 1,grow");
		pnlCompanyDetails.setLayout(new MigLayout("", "[][][grow]", "[]"));
		
		lblCompanyDetails = new JLabel("Company Details");
		lblCompanyDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCompanyDetails.setForeground(new Color(255, 255, 255));
		pnlCompanyDetails.add(lblCompanyDetails, "cell 0 0 3 1");
		
		Component verticalStrut2 = Box.createVerticalStrut(10);
		add(verticalStrut2, "cell 0 4");
		
		lblCompanyName = new JLabel("Company Name");
		add(lblCompanyName, "cell 2 5");
		
		txtfldCompanyName = new JTextField();
		txtfldCompanyName.setEditable(false);
		txtfldCompanyName.setText("A & C Basic Trend Trading Company");
		add(txtfldCompanyName, "flowx,cell 4 5,growx");
		txtfldCompanyName.setColumns(30);
		
		Component verticalStrut3 = Box.createVerticalStrut(10);
		add(verticalStrut3, "cell 0 6");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		add(panel, "cell 1 7 5 1,grow");
		panel.setLayout(new MigLayout("", "[][][grow]", "[]"));
		
		lblCompanyAddress = new JLabel("Company Address");
		lblCompanyAddress.setForeground(new Color(255, 255, 255));
		lblCompanyAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(lblCompanyAddress, "cell 0 0 3 1");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 8");
		
		lblBuildingHouseNo = new JLabel("Building/House No.");
		add(lblBuildingHouseNo, "cell 2 9");
		
		txtfldBuildingHouseNumber = new JTextField();
		txtfldBuildingHouseNumber.setEditable(false);
		txtfldBuildingHouseNumber.setText("Unit #8 G7 Place Bldg");
		add(txtfldBuildingHouseNumber, "flowx,cell 4 9,growx");
		txtfldBuildingHouseNumber.setColumns(30);
		
		lblStreet = new JLabel("Street");
		add(lblStreet, "cell 2 10");
		
		txtfldStreet = new JTextField();
		txtfldStreet.setEditable(false);
		txtfldStreet.setText("Gloria Diaz St. BF Resort Village");
		add(txtfldStreet, "flowx,cell 4 10,growx");
		txtfldStreet.setColumns(30);
		
		lblTownCity = new JLabel("Town/City");
		add(lblTownCity, "cell 2 11");
		
		txtfldTownCity = new JTextField();
		txtfldTownCity.setEditable(false);
		txtfldTownCity.setText("Talon Dos, Las Piñas City");
		add(txtfldTownCity, "flowx,cell 4 11,growx");
		txtfldTownCity.setColumns(30);
		
		lblCountyProvince = new JLabel("County/Province");
		add(lblCountyProvince, "cell 2 12");
		
		txtfldCountyProvince = new JTextField();
		txtfldCountyProvince.setEditable(false);
		add(txtfldCountyProvince, "flowx,cell 4 12,growx");
		txtfldCountyProvince.setColumns(30);
		
		lblStateProvince = new JLabel("State/Province");
		add(lblStateProvince, "cell 2 13");
		
		txtfldStateProvince = new JTextField();
		txtfldStateProvince.setEditable(false);
		add(txtfldStateProvince, "flowx,cell 4 13,growx");
		txtfldStateProvince.setColumns(30);
		
		lblZipPostalCode = new JLabel("ZIP/Postal Code");
		add(lblZipPostalCode, "cell 2 14");
		
		txtfldZipPostalCode = new JTextField();
		txtfldZipPostalCode.setEditable(false);
		txtfldZipPostalCode.setText("1740");
		add(txtfldZipPostalCode, "flowx,cell 4 14,growx");
		txtfldZipPostalCode.setColumns(30);
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, "cell 0 15");
		
		lblTelephoneNo = new JLabel("Telephone No.");
		add(lblTelephoneNo, "cell 2 16");
		
		txtfldTelephoneNumber = new JTextField();
		txtfldTelephoneNumber.setEditable(false);
		txtfldTelephoneNumber.setText("(02) 7827841");
		add(txtfldTelephoneNumber, "flowx,cell 4 16,growx");
		txtfldTelephoneNumber.setColumns(30);
		
		lblFaxNo = new JLabel("Fax No.");
		add(lblFaxNo, "cell 2 17");
		
		txtfldFaxNumber = new JTextField();
		txtfldFaxNumber.setEditable(false);
		add(txtfldFaxNumber, "flowx,cell 4 17,growx");
		txtfldFaxNumber.setColumns(30);
		
		lblEmail = new JLabel("E-mail");
		add(lblEmail, "cell 2 18");
		
		txtfldEmail = new JTextField();
		txtfldEmail.setEditable(false);
		txtfldEmail.setText("a.and.c.supplies@gmail.com");
		add(txtfldEmail, "flowx,cell 4 18,growx");
		txtfldEmail.setColumns(30);
		
		lblWebsite = new JLabel("Website");
		add(lblWebsite, "cell 2 19");
		
		txtfldWebsite = new JTextField();
		txtfldWebsite.setEditable(false);
		txtfldWebsite.setText("-");
		add(txtfldWebsite, "flowx,cell 4 19,growx");
		txtfldWebsite.setColumns(30);
		
		Component verticalStrut_2 = Box.createVerticalStrut(10);
		add(verticalStrut_2, "cell 0 20");
		
		lblPersonDepartmentToContact = new JLabel("Person/Department to Contact");
		add(lblPersonDepartmentToContact, "cell 2 21");
		
		txtfldPersonDepartmentToContact = new JTextField();
		txtfldPersonDepartmentToContact.setEditable(false);
		txtfldPersonDepartmentToContact.setText("Cheryll S. Li");
		add(txtfldPersonDepartmentToContact, "flowx,cell 4 21,growx");
		txtfldPersonDepartmentToContact.setColumns(30);
		
		lblContactTelephoneNo = new JLabel("Contact Telephone No.");
		add(lblContactTelephoneNo, "cell 2 22");
		
		txtfldContactTelephoneNumber = new JTextField();
		txtfldContactTelephoneNumber.setEditable(false);
		txtfldContactTelephoneNumber.setText("09255007888 / 09179888872");
		add(txtfldContactTelephoneNumber, "flowx,cell 4 22,growx");
		txtfldContactTelephoneNumber.setColumns(30);
		
		verticalStrut_4 = Box.createVerticalStrut(10);
		add(verticalStrut_4, "cell 0 23");
		

	}

}
