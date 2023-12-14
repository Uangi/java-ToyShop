package main.toyshop.model;

import main.toyshop.controller.OrderController;

public class Clerk {	// menuItem�� ������� Ŀ�Ǹ� �����.
	
	public Toy takeToy(MenuItem menuItem) {
		Toy toy = new Toy(menuItem);	// �ֹ��ߴ� �޴��� ���� ������ ���� Ŀ��
		return toy;
	}
	
	public static void run() {
		OrderController oc = new OrderController();
		oc.order();
	}
	
}
