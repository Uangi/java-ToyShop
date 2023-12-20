package main.toyshop.view;

import main.toyshop.controller.StockController;
import main.toyshop.model.MenuItem;

public class InputView {
	StockController stockcontroller = new StockController();
	
	public void resultBalance(int resultmoney) {	// Payment���� ��ȯ�� resultmoney�� ���⼭ ���
		System.out.println("�ܾ��� : " + resultmoney + "���Դϴ�.");
	}
	
	public void resultStock(String selectedMenuName, MenuItem totalStock, int quantityToBuy) {
		System.out.println(selectedMenuName + " �� ���� ���� : "  
		+ stockcontroller.remainingStock(totalStock, quantityToBuy) + "�� �Դϴ�.");
	}
	
	public void buyConfirm(int pay) {
		System.out.print("�� ������ �ݾ��� " + pay 
				+ "���Դϴ�.   �����Ͻðڽ��ϱ�? ");
	}
}
