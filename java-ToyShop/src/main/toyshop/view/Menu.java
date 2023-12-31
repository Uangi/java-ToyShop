package main.toyshop.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.toyshop.model.MenuItem;

public class Menu {
	private List<MenuItem> items;	// 메뉴판 - 메뉴들을 자료형으로 삼는 객체 생성
	private String name;
	public Menu() {
		this.items = new ArrayList<>();
		items.add(new MenuItem("APEACH", 1000));	// MenuItem 클래스 생성자에 name, price가 있어서 가능
		items.add(new MenuItem("CHUNSIK", 2000));
		items.add(new MenuItem("LION", 3000));
	}
	
public MenuItem choose(Scanner sc) {	// 메뉴 고르기
	// do while true주기
	do {
		System.out.print("뭐 살래? ");
		name =  sc.next();
		for(MenuItem toys : items) {	// 
			if(toys.getName().equals(name)) {
				return toys;	// 장난감 반환
			}
		}
		System.out.println("없는 메뉴야 다시 골라");
	} while(true);
	// 만약 try-catch 문이 있다면 무조건 catch문으로 나감
}
	public String getName() {
		return name;
	}
}
