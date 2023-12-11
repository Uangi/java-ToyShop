package controller;

import model.Client;
import model.Toy;

public class startController {

	public static void main(String[] args) {
		
		Client client = new Client();
		Toy toy = new Toy();
		Toymanagement tm = new Toymanagement();
		
		client.readymoneyInput();
		tm.toyPay();
		System.out.println("³²Àº ÀÜ¾×Àº : " + client.readymoney);
	}

}
