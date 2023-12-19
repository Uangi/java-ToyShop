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
	private MenuItem menuItem; // Ŭ���� ��� ������ ����
	Clerk clerk = new Clerk();
	InputView inputview = new InputView();
	Customer customer = new Customer();
	StockController stockcontroller = new StockController();
	PurchaseController purchaseController = new PurchaseController();
	
	private int resultmoney;
	private int pay;
	private boolean continueOrder = true;
	
	public void order() {
		/* �޴��ǿ��� �޴��� ��� �ش� �޴��� �´� �̸��� ã�ƿ� menuItem�� �ִ´�.
		�� ������ ������ �� �����ۿ� �°� ��ü ���� */
		
		try {
		do {
		menuItem = menu.choose();	// �� �췡?
		customer.moneyInput();	// ���־�?
		int quantityToBuy = clerk.requestQuantityToBuy();
		String selectedMenuName = menuItem.getName();	// �� ����� �̸��ޱ�
		Toy toy = clerk.takeToy(menuItem);
		toy.Sell();				// ������ �峭�� ����
		pay = resultPay(quantityToBuy);	// �� ���ұݾ�
		inputview.buyConfirm(pay);
		
		if(purchaseController.purchaseDecision()) {	// true�� �ƴ϶��, ���� �ǻ� ����
			inputview.resultStock(selectedMenuName, menuItem, quantityToBuy);
			Payment(quantityToBuy);	// ���� �Է� �� ���� �ݾ� ���
			continueOrder = false;	// ��ΰ� �ݺ��� Ż��
		}
		else {
			continueOrder = true;
		}
		
			}while(continueOrder);	// while	
		} catch (Exception e) {
			System.out.println(e.getMessage());
            System.out.println("�ܾ��� �����մϴ�. �ٽ� ����ּ���.");
			}
		inputview.resultBalance(resultmoney); // resultMoney()�� ȣ���ϸ� Payment���� ��ȯ�ߴ� resultMoney ����
	}
	
	public int Payment(int quantityToBuy) {	// ���� ���� ����
		pay = menuItem.cost() * quantityToBuy;	// ���� * ���� 
		resultmoney = customer.getBalance() - pay;	
		stockcontroller.remainingStock(menuItem, quantityToBuy); 
		return resultmoney;
	}
	
	public int resultPay(int quantityToBuy) {
		pay = menuItem.cost() * quantityToBuy;	// ���� * ����
		return pay;
	}

	
	
	
}
