package controller;

import java.util.Scanner;

import model.Client;
import model.Toy;

public class Toymanagement {

	// �� ���
	Scanner sc = new Scanner(System.in);
	Client client = new Client();
	Toy toy = new Toy();
	shoppingCart cart = new shoppingCart();
	
//	private int balance = 0;
	public int balance;
	
	public int toyPay() {	// pay��ŭ ����
	client.readymoneyInput();
	toy.chooseToy();
//	balance = client.readymoney -= shoppingCart.getPay();
	balance = client.readymoney - toy.totalPrice;
	return balance;	// ������� �������� �� ����
	
	}

	public int getBalance() {
		return balance;
	}

	

}
