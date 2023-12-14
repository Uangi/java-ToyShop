package main.toyshop.controller;

import java.awt.Cursor;
import java.util.Scanner;

import main.toyshop.model.Clerk;
import main.toyshop.model.Customer;
import main.toyshop.model.Toy;
import main.toyshop.model.MenuItem;
import main.toyshop.view.InputView;
import main.toyshop.view.Menu;

public class OrderController {
	
//	MenuItem mi = new MenuItem();	// 생성자 초기화없이 넣는법?
	Menu menu = new Menu();
	Clerk clerk = new Clerk();
	InputView iv = new InputView();
	MenuItem menuItem = menu.choose();
	Toy toy = clerk.takeToy(menuItem);
	Customer cm = new Customer();
	Scanner sc = new Scanner(System.in);
	String menuName;
	private int quantity;
	private int resultmoney;
	
	public int getResultmoney() {
		return resultmoney;
	}

	public void order() {
		/* 메뉴판에서 메뉴를 골라 해당 메뉴에 맞는 이름을 찾아와 menuItem에 넣는다.
		고른 물건을 가져와 그 아이템에 맞게 객체 생성 */
		
		cm.MoneyInput();
		toy.Sell();	// 뭐 살지 물어보기
		Payment();
		iv.resultMoney(resultmoney);	
		// resultMoney()를 호출하며 Payment에서 반환했던 resultMoney 대입
	}
	
	public int Payment() {
		int pay = menuItem.cost();	// 가격
		iv.quantity = iv.requestQuantityToBuy();	// 물건 개수
		pay = pay * quantity;	// 가격 * 수량 
		resultmoney = cm.getBalance() - pay;	// 여기까지 잘 됨 
		return resultmoney;
	}
	
}
