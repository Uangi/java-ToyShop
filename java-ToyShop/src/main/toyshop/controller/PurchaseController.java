package main.toyshop.controller;

import java.util.Scanner;

enum FinalDecision {
	OK, NO;
}

public class PurchaseController {
		StockController stockcontroller = new StockController();
		
	    public boolean purchaseDecision() {
	        try (Scanner scpc = new Scanner(System.in)) {
				    String userInput = scpc.next().toUpperCase();

				    try {
				    	FinalDecision decision = FinalDecision.valueOf(userInput);
				        return performAction(decision);	// true
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



