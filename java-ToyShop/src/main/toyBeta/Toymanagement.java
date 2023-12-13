package main.toyBeta;

import java.util.Scanner;

public class Toymanagement {

	// 돈 계산
	Scanner sc = new Scanner(System.in);
	Client client = new Client();
	Toy toy = new Toy();
	shoppingCart cart = new shoppingCart();
	public int balance;
	
	public int toyPay() {	// pay만큼 차감
	client.readymoneyInput();
	toy.chooseToy();
	balance = client.readymoney - toy.totalPrice;
	return balance;	// 여기까진 차감액이 잘 들어옴
	}

	public int getBalance() {
		return balance;
	}
	
	// 재고 계산
	

}
