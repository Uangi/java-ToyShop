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
		/* �޴��ǿ��� �޴��� ��� �ش� �޴��� �´� �̸��� ã�ƿ� menuItem�� �ִ´�.
		�� ������ ������ �� �����ۿ� �°� ��ü ���� */
		customer.moneyInput();
		int quantityToBuy = clerk.requestQuantityToBuy();
		String selectedMenuName = menuItem.getName();	// �� �췡?
		toy.Sell();
		inputview.resultStock(selectedMenuName, menuItem, quantityToBuy);
		Payment(quantityToBuy);	// ���� �Է� �� ���� �ݾ� ���
		inputview.resultBalance(resultmoney); // resultMoney()�� ȣ���ϸ� Payment���� ��ȯ�ߴ� resultMoney ����
	}
	
	public int Payment(int quantityToBuy) {
		int pay = menuItem.cost() * quantityToBuy;	// ���� * ���� 
		resultmoney = customer.getBalance() - pay;	
		stockcontroller.remainingStock(menuItem, quantityToBuy); 
		return resultmoney;
	}
	
	
}
