package model;

import java.util.Scanner;

import view.userView;

public class Client {
	
	Scanner sc = new Scanner(System.in);
	public int readymoney;
	

	public int getReadymoney() {
		return readymoney;
	}

	public int readymoneyInput() {	// ���� �Է�
//		int readymoney = 0;
		System.out.print("������ �Է��� : ");
		return readymoney = sc.nextInt();
	}

}
