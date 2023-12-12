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
	private final ToyType type;	// enum ������  ����
	userView uv = new userView();
	public int quantity;
	public int totalPrice;
	List<Toy> toyList = new ArrayList<>();
	
	public Toy(ToyType type) {
		this.type = type;
		this.quantity = 0;
	}
	
	public Toy() {
		this.type = null;
		this.quantity = 0;
	}
	
	public int sellToy() {
		return type.sellToy();
	}
	
	public void chooseToy() {	// �峭���� ���� ������
		System.out.print("� �峭���� ���� 0/1/2 : ");
		int choiceToy = sc.nextInt();
		ToyType selectedToyType = ToyType.values()[choiceToy]; // �ε����� �峭�� ����
		
		Toy sell = new Toy(selectedToyType);	// �Էµ� �ε����� �峭�� �Ǻ�
		System.out.print("� �췡? : ");
		this.quantity = sc.nextInt();
		
		for(int i = 0; i < quantity; i++) {
			Toy toy = new Toy(selectedToyType);
			toyList.add(toy);
		}
		totalPrice = toyList.stream()		// toyList �� ��Ʈ������ ��ȯ -> 
				.mapToInt(Toy::sellToy)		
				// Toy ��ü�� ��Ʈ������ ��ȯ ��, �� 'Toy'��ü�� ���� sellToy �޼��� ȣ��
				// �� ����� ������ ���� �� �ջ� mapToInt
				.sum();
		
//		pay = sell.sellToy();	// ������ �峭���� ������ pay�� ����
		
	}
	
}

