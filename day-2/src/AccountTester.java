
public class AccountTester {

	public static void main(String[] args) {
		Account account1=new Account(121, "raj", 5000);
		Account account2=new Account(122, "ekta", 5000);
		
		account1.printAccountDetails();
		account2.printAccountDetails();
		
		Account account3=new Account();
		account3.printAccountDetails();
	}
}
