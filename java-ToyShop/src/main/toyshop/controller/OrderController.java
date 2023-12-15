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
		customer.moneyInput();
		int quantityToBuy = clerk.requestQuantityToBuy();
		String selectedMenuName = menuItem.getName();	// 뭐 살래?
		toy.Sell();
		inputview.resultStock(selectedMenuName, menuItem, quantityToBuy);
		Payment(quantityToBuy);	// 수량 입력 및 지불 금액 계산
		inputview.resultBalance(resultmoney); // resultMoney()를 호출하며 Payment에서 반환했던 resultMoney 대입
	}
	
	public int Payment(int quantityToBuy) {
		int pay = menuItem.cost() * quantityToBuy;	// 가격 * 수량 
		resultmoney = customer.getBalance() - pay;	
		stockcontroller.remainingStock(menuItem, quantityToBuy); 
		return resultmoney;
	}
	
	
}
