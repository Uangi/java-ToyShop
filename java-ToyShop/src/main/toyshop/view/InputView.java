package main.toyshop.view;

import java.util.Scanner;
import main.toyshop.controller.StockController;
import main.toyshop.model.MenuItem;

public class InputView {
	Scanner sc = new Scanner(System.in);
	StockController stockcontroller = new StockController();
	
	public void resultBalance(int resultmoney) {	// Payment���� ��ȯ�� resultmoney�� ���⼭ ���
		System.out.println("�ܾ��� : " + resultmoney + "���Դϴ�.");
	}
	
	public void resultStock(String selectedMenuName, MenuItem totalStock, int quantityToBuy) {
		System.out.println(selectedMenuName + " �� ���� ���� : "  
		+ stockcontroller.remainingStock(totalStock, quantityToBuy) + "�� �Դϴ�.");
	}
	
	public void getTotalPayment() {
		System.out.println("�� ������ �ݾ��� ");	// pay �� �޾ƿ���?
	}
}
