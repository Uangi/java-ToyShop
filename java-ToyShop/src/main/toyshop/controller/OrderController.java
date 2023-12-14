package main.toyshop.controller;

import java.awt.Cursor;
import java.nio.channels.SelectableChannel;
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
		customer.MoneyInput();
		toy.Sell();	// �� ���� �����
		inputview.stockInput();	// � ���� �����
		Payment();	// ���� �Է� �� ���� �ݾ� ���
		inputview.resultBalance(resultmoney); // resultMoney()�� ȣ���ϸ� Payment���� ��ȯ�ߴ� resultMoney ����
		inputview.resultStock();
	}
	
	public int Payment() {
		int pay = menuItem.cost();	// ����
		pay = pay * stockcontroller.requestQuantityToBuy();	// ���� * ���� 
		resultmoney = customer.getBalance() - pay;	// ������� �� �� 
		return resultmoney;
	}
	
	public int getResultmoney() {
		return resultmoney;
	}
	
}
