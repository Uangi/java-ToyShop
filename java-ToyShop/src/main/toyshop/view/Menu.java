package main.toyshop.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.toyshop.model.MenuItem;

public class Menu {

	private List<MenuItem> items;	// �޴��� - �޴����� �ڷ������� ��� ��ü ����
	private String name;
	Scanner sc = new Scanner(System.in);
	
	public Menu() {
		this.items = new ArrayList<>();
		items.add(new MenuItem("APEACH", 1000));	// MenuItem Ŭ���� �����ڿ� name, price�� �־ ����
		items.add(new MenuItem("CHUNSIK", 2000));
		items.add(new MenuItem("LION", 3000));
	}
	
	public MenuItem choose() {	// �޴� ����
		System.out.print("�� �췡? ");
		name = sc.next();
		for(MenuItem doll : items) {	// 
			if(doll.getName().equals(name)) {
				return doll;	// �峭�� ��ȯ
			}
		} 
		return null;
	}

	public String getName() {
		return name;
	}
}
