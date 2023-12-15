package main.toyshop.model;

import java.util.Scanner;
import main.toyshop.controller.OrderController;

public class Clerk {	// menuItem�� ������� Ŀ�Ǹ� �����.
	Scanner sc = new Scanner(System.in);
	private int quantity;
	
	public Toy takeToy(MenuItem menuItem) {
		Toy toy = new Toy(menuItem);	// �ֹ��ߴ� �޴��� ���� ������ ���� Ŀ��
		return toy;
	}
	
	public int requestQuantityToBuy(Scanner scanner) {	// �ִ� �ߵ�
		quantity = sc.nextInt();
		return quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public static void run() {
		OrderController oc = new OrderController();
		oc.order();
	}
}
