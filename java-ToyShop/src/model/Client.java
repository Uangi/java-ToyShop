package model;

import java.util.Scanner;

import view.userView;

public class Client {
	
	Scanner sc = new Scanner(System.in);
	public int readymoney = 0;
	
	public int readymoneyInput() {	// ���� �Է�
		System.out.print("������ �Է��� : ");
		return readymoney = sc.nextInt();
		
	}
	
	
}
