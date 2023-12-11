package controller;

import java.util.Scanner;

import model.Client;
import model.Toy;

public class Toymanagement {

	// 돈 계산
	Scanner sc = new Scanner(System.in);
	Client client = new Client();
	Toy toy = new Toy();
	
	public int toyPay() {	// pay만큼 차감
		
	toy.chooseToy();
	return client.readymoney - toy.getPay();
	
	}	
	

}
