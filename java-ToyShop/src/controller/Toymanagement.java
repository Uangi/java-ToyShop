package controller;

import java.util.Scanner;

import model.Client;
import model.Toy;

public class Toymanagement {

	// �� ���
	Scanner sc = new Scanner(System.in);
	Client client = new Client();
	Toy toy = new Toy();
//	private int balance = 0;
	public int balance;
	
	public int toyPay() {	// pay��ŭ ����
	client.readymoneyInput();
	toy.chooseToy();
	balance = client.readymoney -= toy.getPay();
	return balance;	// ������� �������� �� ����
	
	}

	public int getBalance() {
		return balance;
	}

	

}
