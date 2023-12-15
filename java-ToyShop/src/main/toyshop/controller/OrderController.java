package main.toyshop.controller;

import java.util.Scanner;
import main.toyshop.model.Clerk;
import main.toyshop.model.Customer;
import main.toyshop.model.Toy;
import main.toyshop.model.MenuItem;
import main.toyshop.view.InputView;
import main.toyshop.view.Menu;

public class OrderController {
	
	Scanner sc = new Scanner(System.in);
	Menu menu = new Menu();
	MenuItem menuItem = menu.choose();
	Clerk clerk = new Clerk();
	InputView inputview = new InputView();
	Toy toy = clerk.takeToy(menuItem);
	Customer customer = new Customer();
	StockController stockcontroller = new StockController();
	
	private int resultmoney;

	public void order() {
		/* 메뉴판에서 메뉴를 골라 해당 메뉴에 맞는 이름을 찾아와 menuItem에 넣는다.
		고른 물건을 가져와 그 아이템에 맞게 객체 생성 */
		String selectedMenuName = menuItem.getName();	// 이름 가져오기
		customer.MoneyInput();
		toy.Sell();	// 뭐 살지 물어보기
		inputview.stockInput();	// 몇개 살지 물어보기
		Payment();	// 수량 입력 및 지불 금액 계산
		inputview.resultBalance(resultmoney); // resultMoney()를 호출하며 Payment에서 반환했던 resultMoney 대입
		inputview.resultStock(selectedMenuName, menuItem);
	}
	
	public int Payment() {
		int pay = menuItem.cost();	// 가격
		pay = pay * clerk.getQuantity();	// 가격 * 수량 
		resultmoney = customer.getBalance() - pay;	// 여기까지 잘 됨 
		return resultmoney;
	}
	
	public int getResultmoney() {
		return resultmoney;
	}
	
}
