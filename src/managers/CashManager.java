package managers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classes.Cash;
import db.DBConnection;

public class CashManager {

	public CashManager() {
	}
	
	public void createCash(Cash cash) {
		String sql = "INSERT INTO tbl_cash (cashBalance) VALUES (?);";
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setFloat(1, cash.getCashBalance());
			
			
			pstmt.executeUpdate();
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Cash> getAllCash(){
		String sql = "SELECT * FROM tbl_cash;";
		Connection conn = DBConnection.getConnection();
		ArrayList<Cash> cashList = new ArrayList<Cash>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Cash cash = new Cash();
				cash.setCashId(rs.getInt("cashId"));
				cash.setCashBalance(rs.getFloat("cashBalance"));;
				
				
				cashList.add(cash);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return cashList;
	}
	
}
