package managers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classes.Account;
import db.DBConnection;

public class AccountManager {
	
	public AccountManager() {
	}
	
	public void createAccount(Account account) {
		String sql = "INSERT INTO tbl_account (accountNo, accountName, contactNo, email, accountType, balance) VALUES (?,?,?,?,?,?);";
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getAccountNo());
			pstmt.setString(2, account.getAccountName());
			pstmt.setString(3, account.getContactNo());
			pstmt.setString(4, account.getEmail());
			pstmt.setInt(5, account.getAccountType());
			pstmt.setFloat(6, account.getBalance());
			
			pstmt.executeUpdate();
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		public ArrayList<Account> getAllAccounts(){
			String sql = "SELECT * FROM tbl_account;";
			Connection conn = DBConnection.getConnection();
			ArrayList<Account> accountList = new ArrayList<Account>();
			
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					Account account = new Account();
					account.setAccountId(rs.getInt("accountId"));
					account.setBankId(rs.getInt("bankId"));
					account.setAccountNo(rs.getString("accountNo"));
					account.setAccountName(rs.getString("accountName"));
					account.setContactNo(rs.getString("contactNo"));
					account.setEmail(rs.getString("email"));
					account.setAccountType(rs.getInt("accountType"));
					account.setBalance(rs.getFloat("balance"));
					
					accountList.add(account);
				}
			} catch (SQLException e) {
					e.printStackTrace();
			}
			
			return accountList;
		}
	

}
