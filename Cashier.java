package sutda;

import java.util.*;
public class Cashier {
	
	// 캐셔의 기능은 클릭과 gui로 구현할 것 
	
	public void Identify(Player p) {
		Scanner scan = new Scanner(System.in);
		String tname;
		String tpassword;
		while(true) {
		System.out.println("Please enter your name!");
		tname = scan.nextLine();
		System.out.println("Please enter your password!");
		tpassword = scan.nextLine();
		
		if(tpassword == p.password) {
			System.out.println("How can I help you?\n 1. Deposit  2. Withdraw");
			break;
		} 
		else {
			System.out.println("Wrong ID, Password!");
		}
		}
	}
	
	public void Deposit(Player P) {
		System.out.println("How much will you deposit?");
		Scanner scan = new Scanner(System.in);
		String temp;
		temp = scan.nextLine();
		int k = Integer.parseInt(temp);
		
		if(k<P.money) {
			P.money -= k;
			P.balance += k ;
		}
		else {
			System.out.println("Not enough money in your hand!");
		}

		
	}
	
	public void Withdraw(Player P) {
		System.out.println("How much will you withdraw?");
		Scanner scan = new Scanner(System.in);
		String temp;
		temp = scan.nextLine();
		int k = Integer.parseInt(temp);
		if(k<P.balance) {
			P.balance -= k ;
			P.money += k;
		}
		else {
			System.out.println("Not enough money in your balance!");
		}
	}
	
}
