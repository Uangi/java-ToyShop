package main.toyshop.model;

import java.util.Scanner;

public class Customer {
	Scanner scct = new Scanner(System.in);
	private int balance;
	private int readymoney;
	
	public Customer() {	// 잔액
		this.balance = getBalance();
		
	}

	public int getBalance() {
		return balance;
	}
	
	public int moneyInput() {
		try {
		System.out.print("돈 얼마 있어? ");
		Scanner scct = new Scanner(System.in);
		readymoney = scct.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력해");
		}
		balance = readymoney;
		return balance;
	}
}
