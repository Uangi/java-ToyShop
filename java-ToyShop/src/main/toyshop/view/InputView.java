package main.toyshop.view;

import java.util.Scanner;

import main.toyshop.controller.OrderController;
import main.toyshop.model.Customer;

public class InputView {
	public int quantity;
	Scanner sc = new Scanner(System.in);
	
	public int requestQuantityToBuy() {	// ����īƮ�� ��� ���ǵ�
		System.out.print("�� �� �췡 :  ");
		quantity = sc.nextInt();
		return quantity;
	}
	
	public void resultMoney(int resultmoney) {	// Payment���� ��ȯ�� resultmoney�� ���⼭ ���
		System.out.println("�ܾ��� : " + resultmoney + "���Դϴ�.");
	}
}
