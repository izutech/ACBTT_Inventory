package classes;

public class Bank {
	
	private int bankId;
	private String bankCompany;
	private String address;
	
	public Bank() {
	}
	
	public Bank(String bankCompany, String address) {
		super();
		this.bankCompany = bankCompany;
		this.address = address;
		
	}
	
	public int getBankid() {
		return bankId;
	}
	public void setBankid(int bankid) {
		this.bankId = bankid;
	}
	public String getBankcompany() {
		return bankCompany;
	}
	public void setBankcompany(String bankcompany) {
		this.bankCompany = bankcompany;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
