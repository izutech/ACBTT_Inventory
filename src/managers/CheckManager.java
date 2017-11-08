package managers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classes.Check;
import db.DBConnection;

public class CheckManager {
	
	public CheckManager() {
	}
	
	public void createCheck(Check check) {
		String sql = "INSERT INTO tbl_check (checkNo) VALUES (?);";
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, check.getCheckNumber());
			
			pstmt.executeUpdate();
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Check> getAllChecks(){
		String sql = "SELECT * FROM tbl_check;";
		Connection conn = DBConnection.getConnection();
		ArrayList<Check> checkList = new ArrayList<Check>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Check check = new Check();
				check.setCheckId(rs.getInt("checkId"));
				check.setBankId(rs.getInt("bankId"));
				check.setAccountId(rs.getInt("accountId"));;
				check.setCheckNumber(rs.getString("checkNumber"));
				
				checkList.add(check);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return checkList;
	}

}
