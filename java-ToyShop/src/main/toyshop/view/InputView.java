package main.toyshop.view;

import java.util.Scanner;

import main.toyshop.controller.OrderController;
import main.toyshop.controller.StockController;
import main.toyshop.model.Customer;

public class InputView {
	Scanner sc = new Scanner(System.in);
	StockController stockcontroller = new StockController();
	public void stockInput() {	// ����īƮ�� ��� ���ǵ�
		System.out.print("�� �� �췡 :  ");
	}
	
	public void resultBalance(int resultmoney) {	// Payment���� ��ȯ�� resultmoney�� ���⼭ ���
		System.out.println("�ܾ��� : " + resultmoney + "���Դϴ�.");
	}
	
	public void resultStock() {
		System.out.println(stockcontroller.getSelectedMenuName() + " �� ���� ���� :  �� �Դϴ�.");
	}
}
