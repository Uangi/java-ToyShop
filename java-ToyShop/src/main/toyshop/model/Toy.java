package main.toyshop.model;

public class Toy {

	private String name;
	private int price;
	
	public Toy(MenuItem menuItem) {
		this.name = menuItem.getName();	// ���õ� �޴��� �̸��� �����´�.
		this.price = menuItem.cost();
	}
	
	public String getName() {
		return name;
	}

	public void Sell() {
		System.out.println("������ �峭���� " + name + "�̸� " + price + "���Դϴ�.");
	}
}
