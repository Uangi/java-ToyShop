package main.toyBeta;

import java.util.Scanner;

public class Toymanagement {

	// �� ���
	Scanner sc = new Scanner(System.in);
	Client client = new Client();
	Toy toy = new Toy();
	shoppingCart cart = new shoppingCart();
	public int balance;
	
	public int toyPay() {	// pay��ŭ ����
	client.readymoneyInput();
	toy.chooseToy();
	balance = client.readymoney - toy.totalPrice;
	return balance;	// ������� �������� �� ����
	}

	public int getBalance() {
		return balance;
	}
	
	// ��� ���
	

}
