package managers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classes.Bank;
import db.DBConnection;

public class BankManager {
	
	public BankManager() {
	}
	
	public void createBank(Bank bank) {
		String sql = "INSERT INTO tbl_bank (bankCompany, address) VALUES (?,?);";
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bank.getBankcompany());
			pstmt.setString(2, bank.getAddress());
			
			pstmt.executeUpdate();
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Bank> getAllBanks(){
		String sql = "SELECT * FROM tbl_bank;";
		Connection conn = DBConnection.getConnection();
		ArrayList<Bank> bankList = new ArrayList<Bank>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Bank bank = new Bank();
				bank.setBankid(rs.getInt("bankId"));
				bank.setBankcompany(rs.getString("bankCompany"));
				bank.setAddress(rs.getString("address"));
				
				bankList.add(bank);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return bankList;
	}


}
