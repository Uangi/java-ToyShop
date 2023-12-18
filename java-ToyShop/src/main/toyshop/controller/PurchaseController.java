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
				    System.out.println("총 지불할 금액은 "
					+ "원입니다.   구매하시겠습니까? ");
				    String userInput = scanner.next().toUpperCase();

				    try {
				    	FinalDecision decision = FinalDecision.valueOf(userInput);
				        performAction(decision);
				    } catch (IllegalArgumentException e) {
				        System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				    }

				} while (true);
	        }
	    }

	    private boolean performAction(FinalDecision decision) {
	        switch (decision) {
	            case OK:	// 구매
	                break;	// return true;
	                
	            case HATE:	//  안 삼
	            	System.out.println("다시 골라 그럼");
	                return false;
	        }
			return false;
	    }
	}



