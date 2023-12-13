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
		/* 메뉴판에서 메뉴를 골라 해당 메뉴에 맞는 이름을 찾아와 menuItem에 넣는다.
		고른 물건을 가져와 그 아이템에 맞게 객체 생성 */
		toy.Sell();
	}
	
	public void Payment(String name, int price) {
		
	}
	
}
