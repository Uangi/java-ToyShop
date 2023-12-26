package main.toyshop.controller;

import java.util.Scanner;

import main.toyshop.model.Clerk;
import main.toyshop.model.Customer;
import main.toyshop.model.Toy;
import main.toyshop.model.MenuItem;
import main.toyshop.view.InputView;
import main.toyshop.view.Menu;

public class OrderController {
	
	Menu menu = new Menu();
	private MenuItem menuItem; // 클래스 멤버 변수로 선언
	Clerk clerk = new Clerk();
	InputView inputview = new InputView();
	Customer customer = new Customer();
	StockController stockcontroller = new StockController();
	PurchaseController purchaseController = new PurchaseController();
	
	private int resultmoney;
	private int pay;
	private boolean continueOrder = true;
	
	public void order() {
		/* 메뉴판에서 메뉴를 골라 해당 메뉴에 맞는 이름을 찾아와 menuItem에 넣는다.
		고른 물건을 가져와 그 아이템에 맞게 객체 생성 */
		
		try {
		do {
		Scanner sc = new Scanner(System.in);
		menuItem = menu.choose(sc);	// 뭐 살래?
		customer.moneyInput();	// 얼마있어?
		int quantityToBuy = clerk.requestQuantityToBuy();
		
		String selectedMenuName = menuItem.getName();	// 뭐 샀는지 이름받기
		Toy toy = clerk.takeToy(menuItem);
		
		toy.Sell();				// 구입한 장난감 설명
		
		pay = resultPay(quantityToBuy);	// 총 지불금액
		inputview.buyConfirm(pay);	// 최종 구매 결정
		
		if(purchaseController.purchaseDecision()) {	// true가 아니라면, 구매 의사 묻기
			inputview.resultStock(selectedMenuName, menuItem, quantityToBuy);
			Payment(quantityToBuy);	// 수량 입력 및 지불 금액 계산
			continueOrder = false;	// 잽싸게 반복문 탈출
		}
		else {
			continueOrder = true;
		}
		
			}while(continueOrder);	// while	
		} catch (Exception e) {
			System.out.println(e.getMessage());
            System.out.println("잔액이 부족합니다. 다시 골라주세욧.");
			}
		inputview.resultBalance(resultmoney); // resultMoney()를 호출하며 Payment에서 반환했던 resultMoney 대입
	}
	
	public int Payment(int quantityToBuy) {	// 결제 관련 로직
		pay = menuItem.cost() * quantityToBuy;	// 가격 * 수량 
		resultmoney = customer.getBalance() - pay;	
		stockcontroller.remainingStock(menuItem, quantityToBuy); 
		return resultmoney;
	}
	
	public int resultPay(int quantityToBuy) {
		pay = menuItem.cost() * quantityToBuy;
		return pay;
	}

	
	
	
}
