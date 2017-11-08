package managers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classes.CreditCard;
import db.DBConnection;

public class CreditCardManager {
	
	public CreditCardManager() {
	}
	
	public void createCreditCard(CreditCard creditCard) {
		String sql = "INSERT INTO tbl_creditCard (cardNumber) VALUES (?);";
		Connection conn = DBConnection.getConnection();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, creditCard.getCardNumber());
			
			pstmt.executeUpdate();
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<CreditCard> getAllCreditCards(){
		String sql = "SELECT * FROM tbl_creditCard;";
		Connection conn = DBConnection.getConnection();
		ArrayList<CreditCard> creditCardList = new ArrayList<CreditCard>();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CreditCard creditCard = new CreditCard();
				creditCard.setCardId(rs.getInt("cardId"));
				creditCard.setBankId(rs.getInt("bankId"));
				creditCard.setAccountId(rs.getInt("accountId"));
				creditCard.setCardNumber(rs.getString("cardNumber"));
				
				
				creditCardList.add(creditCard);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return creditCardList;
	}

}
