package classes;

public class Check {
	private int checkId;
	private int bankId;
	private int accountId;
	private String checkNumber;
	
	public Check() {
	}
	
	public Check(int bankId, int accountId, String checkNumber) {
		super();
		this.bankId = bankId;
		this.accountId = accountId;
		this.checkNumber = checkNumber;
	}
	public int getCheckId() {
		return checkId;
	}
	public void setCheckId(int checkId) {
		this.checkId = checkId;
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
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	
	

}
