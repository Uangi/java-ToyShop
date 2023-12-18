package main.toyshop.view;

import java.util.Scanner;

import main.toyshop.controller.StockController;
import main.toyshop.model.MenuItem;

public class InputView {
	Scanner sc = new Scanner(System.in);
	StockController stockcontroller = new StockController();
	private int choice;
	
	public void resultBalance(int resultmoney) {	// Payment에서 반환된 resultmoney가 여기서 사용
		System.out.println("잔액은 : " + resultmoney + "원입니다.");
	}
	
	public void resultStock(String selectedMenuName, MenuItem totalStock, int quantityToBuy) {
		System.out.println(selectedMenuName + " 의 남은 재고는 : "  
		+ stockcontroller.remainingStock(totalStock, quantityToBuy) + "개 입니다.");
	}
}
