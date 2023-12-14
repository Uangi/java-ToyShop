package main.toyshop.view;

import java.util.Scanner;

import main.toyshop.controller.OrderController;
import main.toyshop.model.Customer;

public class InputView {
	public int quantity;
	Scanner sc = new Scanner(System.in);
	
	public int requestQuantityToBuy() {	// 쇼핑카트에 담긴 물건들
		System.out.print("몇 개 살래 :  ");
		quantity = sc.nextInt();
		return quantity;
	}
	
	public void resultMoney(int resultmoney) {	// Payment에서 반환된 resultmoney가 여기서 사용
		System.out.println("잔액은 : " + resultmoney + "원입니다.");
	}
}
