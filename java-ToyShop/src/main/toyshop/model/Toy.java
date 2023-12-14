package main.toyshop.model;

public class Toy {

	public static String name;
	private int price;
	
	public Toy(MenuItem menuItem) {
		this.name = menuItem.getName();	// 선택된 메뉴의 이름을 가져온다.
		this.price = menuItem.cost();
	}
	
	public void Sell() {
		System.out.println("구입한 장난감은 " + name + "이며 " + price + "원입니다.");
	}
}
