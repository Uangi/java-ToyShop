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
	
	public int toyPay() {	// pay��ŭ ����
	client.readymoneyInput();
	toy.chooseToy();
	client.readymoney -= toy.getPay();
//	client.setBalance(client.balance);
	client.balance = client.readymoney;
	return client.balance;	// ������� �������� �� ����
	}

	

}
