package classes;

public class Account {
	
	private int bankId;
	private String accountNo;
	private String accountName;
	private String contactNo;
	private String email;
	private int accountType;
	private float balance;
	
	public Account() {
	}
	
	public Account(String accountNo, String accountName, String contactNo, String email, int accountType, float balance) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName ;
		this.contactNo = contactNo;
		this.email = email;
		this.accountType = accountType;
		this.balance = balance;
	}

	private int accountId;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAccountType() {
		return accountType;
	}
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	
	

}
