package main.toyshop.model;

import main.toyshop.controller.OrderController;

public class Clerk {	// menuItem을 기반으로 커피를 만든다.
	
	public Toy takeToy(MenuItem menuItem) {
		Toy toy = new Toy(menuItem);	// 주문했던 메뉴에 대한 정보를 담은 커피
		return toy;
	}
	
	public static void run() {
		OrderController oc = new OrderController();
		oc.order();
	}
	
}
