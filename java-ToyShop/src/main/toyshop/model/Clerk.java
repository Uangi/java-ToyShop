package main.toyshop.model;

public class Clerk {	// menuItem�� ������� Ŀ�Ǹ� �����.
	
	public Toy takeToy(MenuItem menuItem) {
		Toy toy = new Toy(menuItem);	// �ֹ��ߴ� �޴��� ���� ������ ���� Ŀ��
		return toy;
	}
}
