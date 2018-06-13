package sutda;

import java.util.*;


public class Player {
	
	String name;
	String password;
	int money;
	int Jokboscore;
	Card[] hand;
	int balance;
	boolean state; //true = keep betting false = dead
	boolean First; //true = 선베팅 false = 후베팅
	
	Player(){
		this.money = 5000000;
		this.balance = 0;
	}
	
	//Betting Skills
	public void half(Dealer D) {
		if(this.money > D.totalbet/2) {
			System.out.println("Half!");
			this.money -= D.totalbet/2;
			D.previousbet = D.totalbet/2;
			D.totalbet += D.totalbet/2;
			this.state = true;
		}
		else System.out.println("Not enough money!");
	}
	
	public void bbing(Dealer D) {
		if(this.money > D.normalbet) {
			System.out.println("BBing!");
			this.money -= D.normalbet;
			D.previousbet = D.normalbet;
			D.totalbet += D.normalbet;
			this.state = true;
		}
		else System.out.println("Not enough money!");	
	}
	
	public void call(Dealer D) {
		if(this.money > D.previousbet) {
			System.out.println("Call!");
			this.money -= D.previousbet;
			D.totalbet += D.previousbet;
			this.state = false;
		}
		else System.out.println("Not enough money!");	
	}
	
	public void die(Dealer D) {
		System.out.println("I'm dead.");	
		state = false;
	}
	
	public void ddadang(Dealer D) {		//전 순서의 베팅액에 2배를 베팅한다. 전 순서가 체크일 경우 기본베팅
		if(this.money > D.previousbet *2) {
			System.out.println("Ddadang!");
			this.money -= D.previousbet *2;
			D.previousbet = D.previousbet *2;
			D.totalbet += D.previousbet *2;	
			this.state = true;
		}
		else System.out.println("Not enough money!");
			
		
	}
	public void check(Dealer D) { //선을 잡은 플레이어가 처음에만 가능한 베팅, 돈을 내지않고 턴을 넘긴다.
		System.out.println("Check.");
		D.previousbet = 0;
		this.state = true;
	}
	
	public void discard() { //마우스클릭을 이용해 카드를 한장 버린다. 3장 게임일때만 필요한 기능
		Scanner scan = new Scanner(System.in);
		String choice;
		System.out.println("which cards to discard?");
		choice = scan.nextLine();
		int k = Integer.parseInt(choice);
		
		if(k==1) {
			this.hand[0] = this.hand[2];
		}
		else if(k==2) {
			this.hand[1] = this.hand[2];
		}
	
	}
	
	public void ShowCard(int Gametype) {
		for(int i=1; i<Gametype+1;i++) {
			if(this.hand[i-1].Light == true) 
				System.out.println("Card"+i+": "+ this.hand[i-1].month+"월"+" 광");
			else
				System.out.println("Card"+i+": "+ this.hand[i-1].month+"월");
		}
	}
}
