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
	abstract int decreaseStock(int quantity);	// 추상
	
	}

	public class StockController {	// 재고 관리
//		private final ToyStock toystock;
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		private int quantity;
		private int totalStock;
//		private ToyStock selectedToyStock;
		private List<Toy> stockList = new ArrayList<>();
//		private ToyStock selectedToyStock = ToyStock.valueOf(selectedMenuName);
		public int requestQuantityToBuy() {	// 애는 잘됨
			quantity = sc.nextInt();
			return quantity;
		}
		
//		public int remainingStock() {
//			totalStock = selectedToyStock.decreaseStock(quantity);
//			return totalStock;
//		}

		// menu에서 자꾸 null값이 들어옴. --> 이게 해결되어야 수량도 해결가능
		public String getSelectedMenuName() {
			String selectedMenuName = Toy.name;
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
