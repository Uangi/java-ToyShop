package main.toyshop.model;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import main.toyshop.controller.OrderController;
import main.toyshop.controller.PurchaseController;

public class Clerk {	// menuItem�� ������� Ŀ�Ǹ� �����.
	Scanner scck = new Scanner(System.in);
	
	private int quantity;
	
	public Toy takeToy(MenuItem menuItem) {
		Toy toy = new Toy(menuItem);	// �ֹ��ߴ� �޴��� ���� ������ ���� Ŀ��
		return toy;
	}
	
	public int requestQuantityToBuy() {	// �ִ� �ߵ�
		System.out.print("�� �� �췡 ? ");
		quantity = scck.nextInt();
		return quantity;
	}
	
//	private static void Restart() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ ����");
//		int cho = sc.nextInt();
//		if(cho == 1) {
//			// �ݺ�
//		}
//		else if (cho == 2) {
//			System.exit(0);
//		}
//	}
	public static void run() {
		OrderController oc = new OrderController();
		
			oc.order();
//			Restart();
	}
}
