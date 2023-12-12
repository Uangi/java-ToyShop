package controller;

import model.Client;
import model.Toy;

public class startController {

	public static void main(String[] args) {
		
		Client client = new Client();
		Toymanagement tm = new Toymanagement();
		tm.toyPay();
		System.out.println("³²Àº ÀÜ¾×Àº : " + client.getReadymoney());
	}

}
