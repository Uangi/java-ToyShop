package main.toyshop.model;

import java.util.Scanner;

public class Customer {
	Scanner scct = new Scanner(System.in);
	private int balance;
	private int readymoney;
	
	public Customer() {	// �ܾ�
		this.balance = getBalance();
		
	}

	public int getBalance() {
		return balance;
	}
	
	public int moneyInput() {
		try {
		System.out.print("�� �� �־�? ");
		readymoney = scct.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է���");
		}
		balance = readymoney;
		return balance;
	}
}
