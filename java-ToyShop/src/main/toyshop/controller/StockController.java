package main.toyshop.controller;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.toyshop.model.Clerk;
import main.toyshop.model.MenuItem;
import main.toyshop.model.Toy;
import main.toyshop.view.InputView;
import main.toyshop.view.Menu;

enum ToyStock {
	APEACH {
		int decreaseStock(int quantity) {
			return 10 - quantity;
		}
	},
	CHUNSIK {
		int decreaseStock(int quantity) {
			return 7 - quantity;
		}
	},
	LION {
		int decreaseStock(int quantity) {
			return 5 - quantity;
		}
	};
	abstract int decreaseStock(int quantity);	// �߻�
	
	}

	public class StockController {	// ��� ����
//		private final ToyStock toystock;
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		private int quantity;
		private int totalStock;
//		private ToyStock selectedToyStock;
		private List<Toy> stockList = new ArrayList<>();
//		private ToyStock selectedToyStock = ToyStock.valueOf(selectedMenuName);
		public int requestQuantityToBuy() {	// �ִ� �ߵ�
			quantity = sc.nextInt();
			return quantity;
		}
		
//		public int remainingStock() {
//			totalStock = selectedToyStock.decreaseStock(quantity);
//			return totalStock;
//		}

		// menu���� �ڲ� null���� ����. --> �̰� �ذ�Ǿ�� ������ �ذᰡ��
		public String getSelectedMenuName() {
			String selectedMenuName = menu.getName();
			return selectedMenuName;
		}

		public int getTotalStock() {
			return totalStock;
		}

//		public ToyStock getSelectedToyStock() {
//			
//			return selectedToyStock;
//		}

	}
