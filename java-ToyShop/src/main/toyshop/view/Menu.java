package main.toyshop.view;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.toyshop.model.MenuItem;

public class Menu {
	private List<MenuItem> items;	// �޴��� - �޴����� �ڷ������� ��� ��ü ����
	private String name;
//	private boolean continueMenu = true;
	public Menu() {
		this.items = new ArrayList<>();
		items.add(new MenuItem("APEACH", 1000));	// MenuItem Ŭ���� �����ڿ� name, price�� �־ ����
		items.add(new MenuItem("CHUNSIK", 2000));
		items.add(new MenuItem("LION", 3000));
	}
	
public MenuItem choose(Scanner sc) {	// �޴� ����
	// do while true�ֱ�
	do {
		System.out.print("�� �췡? ");
		name =  sc.next();
		for(MenuItem toys : items) {	// 
			if(toys.getName().equals(name)) {
//				continueMenu = false;
				return toys;	// �峭�� ��ȯ
			}
		}
		System.out.println("���� �޴��� �ٽ� ���");
	} while(true);
	// ���� try-catch ���� �ִٸ� ������ catch������ ����
}
	public String getName() {
		return name;
	}
}
