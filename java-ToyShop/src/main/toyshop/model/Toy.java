package main.toyshop.model;

public class Toy {

	public static String name;
	private int price;
	
	public Toy(MenuItem menuItem) {
		this.name = menuItem.getName();	// ���õ� �޴��� �̸��� �����´�.
		this.price = menuItem.cost();
	}
	
	public void Sell() {
		System.out.println("������ �峭���� " + name + "�̸� " + price + "���Դϴ�.");
	}
}
