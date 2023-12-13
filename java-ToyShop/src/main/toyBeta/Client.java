package main.toyBeta;

import java.util.Scanner;

public class Client {
	
	Scanner sc = new Scanner(System.in);
	public int readymoney;
	

	public int getReadymoney() {
		return readymoney;
	}

	public int readymoneyInput() {	// 현금 입력
//		int readymoney = 0;
		System.out.print("현금을 입력해 : ");
		return readymoney = sc.nextInt();
	}

}
