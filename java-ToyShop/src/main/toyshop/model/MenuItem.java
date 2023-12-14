package main.toyshop.model;

public class MenuItem {	// 메뉴판 중 메뉴

	private String name;
	private int price;
	
	public MenuItem(String name, int price) {	// Menu에서 반환한 장난감 넘어옴
		this.name = name;
		this.price = price;
	}
	
	public int cost() {	// 가격
		return price;
	}
	
	public String getName() {	// 이름
		return name;
	}
}
