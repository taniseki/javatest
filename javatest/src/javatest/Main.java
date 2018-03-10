package javatest;

public class Main {

	public static void main(String[] args) {

		human man = new human();
		machine ven = new machine();

		int inputMoney = man.getMoney();
		ven.setMoney(inputMoney);

		System.out.println("お金を入れました"+ven.getMoney()+"円");

		
	}

}
