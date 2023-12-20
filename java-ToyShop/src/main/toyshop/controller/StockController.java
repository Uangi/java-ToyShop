package main.toyshop.controller;

import java.util.Scanner;
import main.toyshop.model.Clerk;
import main.toyshop.model.MenuItem;

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
		Scanner scsc = new Scanner(System.in);
		Clerk clerk = new Clerk();
		private int totalStock;
		
		public int remainingStock(MenuItem menuitem, int quantityToBuy) {
			ToyStock selectedToyStock = ToyStock.valueOf(menuitem.getName());
			totalStock = selectedToyStock.decreaseStock(quantityToBuy);
			return totalStock;	
		}
	}
