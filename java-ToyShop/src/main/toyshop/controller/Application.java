package main.toyshop.controller;

import main.toyshop.view.Menu;

public class Application {

	public static void main(String[] args) {

		Menu m = new Menu();
		OrderController oc = new OrderController();
		oc.order();
		
	}

}
