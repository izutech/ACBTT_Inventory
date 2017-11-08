package classes;

public class CreditCard {
	
	private int cardId;
	private int bankId;
	private int accountId;
	private String cardNumber;
	
	public CreditCard() {
	}
	
	public CreditCard(int bankId, int accountId, String cardNumber) {
		super();
		this.bankId = bankId;
		this.accountId = accountId;
		this.cardNumber = cardNumber;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
}
