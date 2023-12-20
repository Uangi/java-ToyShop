package main.toyshop.controller;

import java.util.Scanner;

enum FinalDecision {
	OK, NO;
}

public class PurchaseController {

		Scanner scpc = new Scanner(System.in);
		StockController stockcontroller = new StockController();
		
	    public boolean purchaseDecision() {
	        try (Scanner scpc = new Scanner(System.in)) {
				    String userInput = scpc.next().toUpperCase();

				    try {
				    	FinalDecision decision = FinalDecision.valueOf(userInput);
				        return performAction(decision);	// true
				    } catch (IllegalArgumentException e) {
				        System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
				    }
	        }
			return false;
	    }
	    
	    private boolean performAction(FinalDecision decision) {
	        switch (decision) {
	            case OK:	// ����
	                return true;	// break
	                
	            case NO:	//  �� ��
	            	System.out.println("�ٽ� ��� �׷�");
	                return false;
	        }
			return false;
	    }
	}



