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
	
//	MenuItem mi = new MenuItem();	// ������ �ʱ�ȭ���� �ִ¹�?
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
		/* �޴��ǿ��� �޴��� ��� �ش� �޴��� �´� �̸��� ã�ƿ� menuItem�� �ִ´�.
		�� ������ ������ �� �����ۿ� �°� ��ü ���� */
		
		cm.MoneyInput();
		toy.Sell();	// �� ���� �����
		Payment();
		iv.resultMoney(resultmoney);	
		// resultMoney()�� ȣ���ϸ� Payment���� ��ȯ�ߴ� resultMoney ����
	}
	
	public int Payment() {
		int pay = menuItem.cost();	// ����
		iv.quantity = iv.requestQuantityToBuy();	// ���� ����
		pay = pay * quantity;	// ���� * ���� 
		resultmoney = cm.getBalance() - pay;	// ������� �� �� 
		return resultmoney;
	}
	
}
