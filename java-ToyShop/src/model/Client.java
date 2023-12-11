package model;

import java.util.Scanner;

import view.userView;

public class Client {
	
	Scanner sc = new Scanner(System.in);
	public int readymoney = 0;
	
	public int readymoneyInput() {	// 현금 입력
		System.out.print("현금을 입력해 : ");
		return readymoney = sc.nextInt();
		
	}
	
	
}
