package main.toyBeta;


public class startController {

	public static void main(String[] args) {
		
		Client client = new Client();
		Toymanagement tm = new Toymanagement();
		Toy toy = new Toy();
		tm.toyPay();
		System.out.println("���� �ܾ��� : " + tm.getBalance());
	//	System.out.println(toy.selectedToyType + "�� ���� ���� "+ toy.totalStock + "��");
		// 
	}

}
