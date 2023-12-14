package main.toyshop.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.toyshop.model.MenuItem;

public class Menu {

	
	private List<MenuItem> items;	// 메뉴판 - 메뉴들을 자료형으로 삼는 객체 생성
	private String name;
	
	Scanner sc = new Scanner(System.in);
	
	public Menu() {
		this.items = new ArrayList<>();
		items.add(new MenuItem("APEACH", 1000));	// MenuItem 클래스 생성자에 name, price가 있어서 가능
		items.add(new MenuItem("CHUNSIK", 2000));
		items.add(new MenuItem("LION", 3000));
	}
	
	public MenuItem choose() {	// 메뉴 고르기
		System.out.print("뭐 살래? ");
		String name = sc.next();
		for(MenuItem doll : items) {	// 
			if(doll.getName().equals(name)) {
				return doll;	// 장난감 반환
			}
		} 
		return null;
	}

	public String getName() {
		return name;
	}
}
