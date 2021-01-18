package com.day6.session1.io_serilization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable{
	private int id;
	private String name;
	private double balance;
	//serilization is not static data
	private static String bankName;
	
	//transient keyword
	private transient String password;
	
	//these method are used for customization of serilization
	
	//writeObject
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		//here u can write some extra logic to write some extra data
		 String pw= "121#"+password;
	     oos.writeObject(pw);
		
	}
	
	//readObject 
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException  {
		ois.defaultReadObject();
		//here u can wrire some extra code to customized deserilization process
		String pw= (String) ois.readObject();
        password =pw.substring(4);
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}

	public Account(int id, String name, double balance) {
		System.out.println(" ctr is called...");
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		System.out.println("default ctr is called...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
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
		builder.append(", bankName=");
		builder.append(bankName);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
