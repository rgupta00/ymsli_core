
public class Account {
	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	
	//default ctr
	public Account() {
		this(1,"foo",9000.5);
		System.out.println("--default ctr");
	}
	
	//para ctr
	public Account(int accountId, String accountHolderName,double accountBalance ) {
		
		this.accountId=accountId;
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		System.out.println("-------para-------");
	}
	
	//copy ctr
	public Account(Account account) {
		this.accountId=account.getAccountId();
		this.accountHolderName=account.getAccountHolderName();
		this.accountBalance=account.getAccountBalance();
	}
	
	//getter :accountId
	public int getAccountId() {
		return accountId;
	}
	
	//getter :accountHolderName
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	//getter:accountBalance
	public double getAccountBalance() {
		return accountBalance;
	}
	
	//setter: accountBalance
	public void setAccountBalance(int accountBalance) {
		this.accountBalance=accountBalance;
	}
	
	public void printAccountDetails() {
		System.out.println("---------------------------");
		System.out.println("account id: "+ accountId);
		System.out.println("account holder name: "+ accountHolderName);
		System.out.println("account balance: "+ accountBalance);
		System.out.println("---------------------------");
	}
}







