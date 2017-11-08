package main;

import javax.swing.JPanel;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;

public class CompanySnapshotPage extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public CompanySnapshotPage() {
		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("", "[][][]", "[][][]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 10));
		add(rigidArea, "cell 0 0");
		
		Component horizontalStrut = Box.createHorizontalStrut(15);
		add(horizontalStrut, "cell 1 0");
		
		JLabel lblCompanySnapshot = new JLabel("COMPANY SNAPSHOT");
		lblCompanySnapshot.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblCompanySnapshot, "cell 1 1 2 1");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 2");

	}

}
