package main.toyshop.model;

import java.util.Scanner;
import main.toyshop.controller.OrderController;
import main.toyshop.controller.PurchaseController;

public class Clerk {	// menuItem을 기반으로 커피를 만든다.
	Scanner sc = new Scanner(System.in);
	
	private int quantity;
	
	public Toy takeToy(MenuItem menuItem) {
		Toy toy = new Toy(menuItem);	// 주문했던 메뉴에 대한 정보를 담은 커피
		return toy;
	}
	
	public int requestQuantityToBuy() {	// 애는 잘됨
		System.out.print("몇 개 살래 ? ");
		quantity = sc.nextInt();
		return quantity;
	}
	
	public static void run() {
		OrderController oc = new OrderController();
			oc.order();
	}
}
