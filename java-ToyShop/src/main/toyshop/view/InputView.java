package main.toyshop.view;

import java.util.Scanner;

import main.toyshop.controller.OrderController;
import main.toyshop.controller.StockController;
import main.toyshop.model.Customer;

public class InputView {
	Scanner sc = new Scanner(System.in);
	StockController stockcontroller = new StockController();
	public void stockInput() {	// 쇼핑카트에 담긴 물건들
		System.out.print("몇 개 살래 :  ");
	}
	
	public void resultBalance(int resultmoney) {	// Payment에서 반환된 resultmoney가 여기서 사용
		System.out.println("잔액은 : " + resultmoney + "원입니다.");
	}
	
	public void resultStock() {
		System.out.println(stockcontroller.getSelectedMenuName() + " 의 남은 재고는 :  개 입니다.");
	}
}
