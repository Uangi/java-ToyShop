package model;

import java.util.Scanner;

import view.userView;

enum ToyType {
	
	
	APEACH {
		int sellToy() {
			return 1000;
		}
	},
	CHUNSIK {
		int sellToy() {
			return 2000;
		}
    },
    LION {
    	int sellToy() {
			return 3000;
		}
    };	
	
	
	abstract int sellToy();
	
}

public class Toy {
	Scanner sc = new Scanner(System.in);
//	private static final int APEACH_PRICE = 1000;
//	private static final int LION_PRICE = 2000;
//	private static final int CHUNSIK_PRICE = 3000;
	private final ToyType type;
	private int pay;
	userView uv = new userView();
	
	public Toy(ToyType type) {
		this.type = type;
	}
	
	public Toy() {
		this.type = null;
		
	}
	
	int sellToy() {
		return type.sellToy();
	}
	
	public void chooseToy() {	// 장난감을 고르는 선택지
		System.out.print("어떤 장난감을 고를래 0/1/2 : ");
		int choiceToy = sc.nextInt();
		ToyType selectedToyType = ToyType.values()[choiceToy]; // 인덱스로 장난감 고르기
		
		Toy sell = new Toy(selectedToyType);	// 입력된 인덱스로 장난감 판별
		pay = sell.sellToy();	// 구매할 장난감의 가격이 pay에 저장
		
	}
	
	public int getPay() {
		return pay;
	}
	
}

