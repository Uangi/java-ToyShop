package model;

import java.util.ArrayList;
import java.util.List;
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
	private final ToyType type;	// enum 변수에  접근
	userView uv = new userView();
	public int quantity;
	public int totalPrice;
	List<Toy> toyList = new ArrayList<>();
	
	public Toy(ToyType type) {
		this.type = type;	// 수량과 타입
		this.quantity = 0;
	}
	
	public Toy() {
		this.type = null;
		this.quantity = 0;
	}
	
	public int sellToy() {
		return type.sellToy();
	}
	
	public void chooseToy() {	// 장난감을 고르는 선택지
		System.out.print("어떤 장난감을 고를래 0/1/2 : ");
		int choiceToy = sc.nextInt();
		ToyType selectedToyType = ToyType.values()[choiceToy]; // 인덱스로 장난감 고르기
		
		Toy sell = new Toy(selectedToyType);	// 입력된 인덱스로 장난감 판별
		System.out.print("몇개 살래? : ");
		this.quantity = sc.nextInt();
		
		for(int i = 0; i < quantity; i++) {
			Toy toy = new Toy(selectedToyType);
			toyList.add(toy);
		}
		totalPrice = toyList.stream()		// toyList 를 스트림으로 변환 -> 
				.mapToInt(Toy::sellToy)		
				// Toy 객체를 스트림으로 변환 후, 각 'Toy'객체에 대해 sellToy 메서드 호출
				// 그 결과를 정수로 매핑 후 합산 mapToInt
				.sum();
		
//		pay = sell.sellToy();	// 구매할 장난감의 가격이 pay에 저장
		
	}
	
}

