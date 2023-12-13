package main.toyBeta;

import java.util.Scanner;

public class userView {

	Scanner sc = new Scanner(System.in);
	
	public void Basket() {	// 쇼핑카트에 담긴 물건들
		System.out.println("쇼핑카트에 있는 목록은 ");
	}
	
	public void resultBalanceAndinventoryList() {	// 남은 잔액, 재고목록 출력
		
	}
	
	public void notEnough() {
		System.out.println("잔액이 부족합니다.");
	}
}
