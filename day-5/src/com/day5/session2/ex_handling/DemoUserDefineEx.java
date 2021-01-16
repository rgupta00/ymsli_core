package com.day5.session2.ex_handling;

//some user define ex

class AccountCreationException extends RuntimeException{

	public AccountCreationException(String message) {
		super(message);
	}
	
}

class NotSufficientFundException extends RuntimeException{

	public NotSufficientFundException(String message) {
		super(message);	
	}
}


class OverFundException extends RuntimeException{

	public OverFundException(String message) {
		super(message);
	}
}


class Account {
	private int id;
	private String name;
	private double balance;

	// init deposit must be min 1000
	public Account(int id, String name, double balance) {
		if(balance <1000)
			throw new AccountCreationException("account creation is not possble with "+ balance +" rupees");
		this.id = id;
		this.name = name;
		this.balance = balance;
		
	}

	//5L not allow
	public void deposit(double amount){
		double tempTotal=balance+ amount;
		if(tempTotal >=50_00_00) {
			throw new OverFundException("your deposit will exceed over 5 L, go for current acc");
		}
		balance=tempTotal;
	}
	
	public void withdraw(double amount) {
		double tempTotal=balance- amount;
		if(tempTotal < 1_000) {
			throw new NotSufficientFundException("your balance would be less then 1000 if u withdraw money");
			
		}
		balance=tempTotal;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}
}

public class DemoUserDefineEx {

	public static void main(String[] args) {

		Account account;
		try {
			account = new Account(121, "raj", 4000);
			account.deposit(5000);
			account.withdraw(450000);
			System.out.println(account);
			
		} catch (AccountCreationException e) {
			System.out.println(e.getMessage());
		}catch(OverFundException e) {
			System.out.println(e.getMessage());
		} catch (NotSufficientFundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("hello");
		
		
	}

}














