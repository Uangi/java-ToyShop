package controller;

import java.util.Scanner;

import model.Client;
import model.Toy;

public class Toymanagement {

	// �� ���
	Scanner sc = new Scanner(System.in);
	Client client = new Client();
	Toy toy = new Toy();
	
	public int toyPay() {	// pay��ŭ ����
		
	toy.chooseToy();
	return client.readymoney - toy.getPay();
	
	}	
	

}
