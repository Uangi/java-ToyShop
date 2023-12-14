package main.toyBeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

enum Stock {
    APEACH_STOCK {
        int decreaseStock(int quantity) {
            return 10 - quantity;
        }
    },
    CHUNSIK_STOCK {
        int decreaseStock(int quantity) {
            return 5 - quantity;
        }
    },
    LION_STOCK {
        int decreaseStock(int quantity) {
            return 3 - quantity;
        }
    };

    abstract int decreaseStock(int quantity);
}

public class Toy {
    Scanner sc = new Scanner(System.in);
    private final ToyType type;

    userView uv = new userView();
    public int quantity;
    public int totalPrice;
    public int totalStock;
    public ToyType selectedToyType;
    
//    public ToyType getSelectedToyType() {
//		return selectedToyType;
//	}

	List<Toy> toyList = new ArrayList<>();

    public Toy(ToyType type) {
        this.type = type;
//        this.quantity = 0;
    }

//    public Toy() {
//        this.type = null;
//    }

    public Toy(Stock selectedToyStock) {
        this.type = null;
    }

    public int sellToy() {
        return type.sellToy();
    }

    public int chooseToy() {
        System.out.print("� �峭���� ���� 0/1/2 : ");
        int choiceToy = sc.nextInt();
        ToyType selectedToyType = ToyType.values()[choiceToy];
        Stock selectedToyStock = Stock.values()[choiceToy];

        
        System.out.print("� �췡? : ");
        this.quantity = sc.nextInt();
        for(int i = 0; i < quantity; i++) {
			Toy toy = new Toy(selectedToyType);
			toyList.add(toy);
		}
        totalPrice = toyList.stream()
                .mapToInt(Toy::sellToy)
                .sum();

        totalStock = selectedToyStock.decreaseStock(quantity);
        System.out.println(selectedToyType + "�� ���� ���� "+ totalStock + "��");
        sc.close();
        return totalStock;
    }
}