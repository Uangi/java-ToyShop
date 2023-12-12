package controller;

import java.util.Scanner;

import model.Client;
import model.Toy;

public class Toymanagement {

	// 돈 계산
	Scanner sc = new Scanner(System.in);
	Client client = new Client();
	Toy toy = new Toy();
//	private int balance = 0;
	public int balance;
	
	public int toyPay() {	// pay만큼 차감
	client.readymoneyInput();
	toy.chooseToy();
	balance = client.readymoney -= toy.getPay();
	return balance;	// 여기까진 차감액이 잘 들어옴
	
	}

	public int getBalance() {
		return balance;
	}

	

}
