package main.toyshop.controller;

import java.util.Scanner;

enum FinalDecision {
	OK, HATE;
}

public class PurchaseController {

		Scanner scanner = new Scanner(System.in);
		String str1, str2;
//		OrderController oc = new OrderController();
		
	    public boolean purchaseDecision() {
	        try (Scanner scanner = new Scanner(System.in)) {
				do {
				    System.out.println("�� ������ �ݾ��� "
					+ "���Դϴ�.   �����Ͻðڽ��ϱ�? ");
				    String userInput = scanner.next().toUpperCase();

				    try {
				    	FinalDecision decision = FinalDecision.valueOf(userInput);
				        performAction(decision);
				    } catch (IllegalArgumentException e) {
				        System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
				    }

				} while (true);
	        }
	    }

	    private boolean performAction(FinalDecision decision) {
	        switch (decision) {
	            case OK:	// ����
	                break;	// return true;
	                
	            case HATE:	//  �� ��
	            	System.out.println("�ٽ� ��� �׷�");
	                return false;
	        }
			return false;
	    }
	}



