package main.toyshop.controller;

import java.util.Scanner;

enum FinalDecision {
	OK, NO;
}

public class PurchaseController {

		Scanner scanner = new Scanner(System.in);
		StockController stockcontroller = new StockController();
		
	    public boolean purchaseDecision() {
	        try (Scanner scanner = new Scanner(System.in)) {
				    String userInput = scanner.next().toUpperCase();

				    try {
				    	FinalDecision decision = FinalDecision.valueOf(userInput);
				        return performAction(decision);
				    } catch (IllegalArgumentException e) {
				        System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				    }
	        }
			return false;
	    }
	    
	    private boolean performAction(FinalDecision decision) {
	        switch (decision) {
	            case OK:	// 구매
	                return true;	// break
	                
	            case NO:	//  안 삼
	            	System.out.println("다시 골라 그럼");
	                return false;
	        }
			return false;
	    }
	}



