package main.toyshop.model;

import java.util.Scanner;

public class Customer {

	Scanner sc = new Scanner(System.in);
	private int balance;
	
	public Customer() {	// ÀÜ¾×
		this.balance = getBalance();
		
	}

	public int getBalance() {
		return balance;
	}
	
	public int MoneyInput() {
		System.out.print("µ· ¾ó¸¶ ÀÖ¾î? ");
		Scanner sc = new Scanner(System.in);
		int readymoney = sc.nextInt();
		balance = readymoney;
		return balance;
	}
	
}
