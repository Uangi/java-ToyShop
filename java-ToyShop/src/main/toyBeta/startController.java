package main.toyBeta;


public class startController {

	public static void main(String[] args) {
		
		Client client = new Client();
		Toymanagement tm = new Toymanagement();
		Toy toy = new Toy();
		tm.toyPay();
		System.out.println("남은 잔액은 : " + tm.getBalance());
	//	System.out.println(toy.selectedToyType + "의 남은 재고는 "+ toy.totalStock + "개");
		// 
	}

}
