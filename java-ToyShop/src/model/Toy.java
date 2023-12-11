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
	
	public void chooseToy() {	// �峭���� ���� ������
		System.out.print("� �峭���� ���� 0/1/2 : ");
		int choiceToy = sc.nextInt();
		ToyType selectedToyType = ToyType.values()[choiceToy]; // �ε����� �峭�� ����
		
		Toy sell = new Toy(selectedToyType);	// �Էµ� �ε����� �峭�� �Ǻ�
		pay = sell.sellToy();	// ������ �峭���� ������ pay�� ����
		
	}
	
	public int getPay() {
		return pay;
	}
	
}

