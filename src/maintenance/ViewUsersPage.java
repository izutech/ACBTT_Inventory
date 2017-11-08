package maintenance;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import classes.User;
import managers.UserManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewUsersPage extends JPanel{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tblUsers;
	private String[] colHeader;
	private JScrollPane scrollPane;

	public ViewUsersPage() {
		setBackground(new Color(255, 255, 255));
		setLayout(new MigLayout("", "[][grow][]", "[][][][][][][][grow]"));
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		add(rigidArea, "cell 0 0");
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		add(horizontalStrut_2, "cell 2 0");
		
		JLabel lblUserAccounts = new JLabel("User Accounts");
		lblUserAccounts.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblUserAccounts, "cell 1 1");
		
		Component verticalStrut = Box.createVerticalStrut(10);
		add(verticalStrut, "cell 0 2");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		add(panel, "cell 1 3,growx");
		panel.setLayout(new MigLayout("", "[]", "[]"));
		
		JLabel lblTableOfUser = new JLabel("Table of User Accounts");
		lblTableOfUser.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTableOfUser.setForeground(new Color(255, 255, 255));
		panel.add(lblTableOfUser, "cell 0 0");
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		add(verticalStrut_1, "cell 0 4");
		DefaultTableModel tblModel = new DefaultTableModel(0,0) {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		colHeader = new String[] {"User ID", "First Name", "Last Name", "Username", "Password", "Position"};
		tblModel.setColumnIdentifiers(colHeader);
		
		try {
			ArrayList<User> userList = new UserManager().getAllUsers();
			for(int i=0; i<userList.size(); i++) {
				tblModel.addRow(new Object[] {userList.get(i).getUserId(), userList.get(i).getFirstName(), userList.get(i).getLastName(),
						userList.get(i).getUsername(), userList.get(i).getPassword(),
						userList.get(i).getPosition()});
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			String message = "Error fetching users table";
			JOptionPane.showMessageDialog(null,  message);
		}
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tblModel.fireTableDataChanged();
			}
		});
		add(btnRefresh, "cell 1 5,alignx right");
		
		Component horizontalStrut = Box.createHorizontalStrut(15);
		add(horizontalStrut, "flowx,cell 1 6");
		
		tblUsers = new JTable();
		tblUsers.setFillsViewportHeight(true);
		tblUsers.setModel(tblModel);
		tblUsers.getTableHeader().setReorderingAllowed(false);
		tblUsers.getTableHeader().setResizingAllowed(false);
		scrollPane = new JScrollPane(tblUsers);
		add(scrollPane, "cell 1 6,growx");
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(15);
		add(horizontalStrut_1, "cell 1 6");
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		add(verticalStrut_2, "cell 0 7");
	}
}
