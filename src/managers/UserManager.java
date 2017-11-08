package managers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classes.User;
import db.DBConnection;

public class UserManager {

	public UserManager() {
		
	}
	
	public void createUser(User user) {
		String sql = "INSERT INTO tbl_user (firstName, lastName, username, password, position) VALUES (?,?,?,?,?);";
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getLastName());
			pstmt.setString(3, user.getUsername());
			pstmt.setString(4, user.getPassword());
			pstmt.setString(5, user.getPosition());
			
			pstmt.executeUpdate();
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<User> getAllUsers(){
		String sql = "SELECT * FROM tbl_user;";
		Connection conn = DBConnection.getConnection();
		ArrayList<User> userList = new ArrayList<User>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				User user = new User();
				user.setUserId(rs.getInt("userId"));
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setPosition(rs.getString("position"));
				
				userList.add(user);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return userList;
	}
}
