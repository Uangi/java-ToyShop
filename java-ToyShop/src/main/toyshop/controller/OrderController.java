package main.toyshop.controller;

import main.toyshop.model.Clerk;
import main.toyshop.model.Toy;
import main.toyshop.model.MenuItem;
import main.toyshop.view.Menu;

public class OrderController {
	
	String menuName;
	
	public static void order() {
		
		Menu menu = new Menu();
		Clerk clerk = new Clerk();
		
		MenuItem menuItem = menu.choose();
		Toy toy = clerk.takeToy(menuItem);
		/* �޴��ǿ��� �޴��� ��� �ش� �޴��� �´� �̸��� ã�ƿ� menuItem�� �ִ´�.
		�� ������ ������ �� �����ۿ� �°� ��ü ���� */
		toy.Sell();
	}
	
	public void Payment(String name, int price) {
		
	}
	
}
