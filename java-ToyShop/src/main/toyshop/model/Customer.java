package main.toyshop.model;

import java.util.Scanner;

public class Customer {
	Scanner sc = new Scanner(System.in);
	private int balance;
	
	public Customer() {	// �ܾ�
		this.balance = getBalance();
		
	}

	public int getBalance() {
		return balance;
	}
	
	public int moneyInput() {
		System.out.print("�� �� �־�? ");
		Scanner sc = new Scanner(System.in);
		int readymoney = sc.nextInt();
		balance = readymoney;
		return balance;
	}
	
}
