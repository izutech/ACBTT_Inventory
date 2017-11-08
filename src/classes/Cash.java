package classes;

public class Cash {
	
	private int cashId;
	private float cashBalance;
	
	public Cash() {
	}
	
	public Cash(float cashBalance) {
		super();
		this.cashBalance = cashBalance;
	}
	public int getCashId() {
		return cashId;
	}
	public void setCashId(int cashId) {
		this.cashId = cashId;
	}
	public float getCashBalance() {
		return cashBalance;
	}
	public void setCashBalance(float cashBalance) {
		this.cashBalance = cashBalance;
	}
	

}
