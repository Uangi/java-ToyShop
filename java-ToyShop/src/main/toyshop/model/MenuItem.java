package main.toyshop.model;

public class MenuItem {	// �޴��� �� �޴�
	private String name;
	private int price;
	
	public MenuItem(String name, int price) {	// Menu���� ��ȯ�� �峭�� �Ѿ��
		this.name = name;
		this.price = price;
	}
	
	public int cost() {	// ����
		return price;
	}
	
	public String getName() {	// �̸�
		return name;
	}
}
