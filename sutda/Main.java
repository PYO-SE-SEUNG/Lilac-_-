package sutda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. 게임창 구현(인트로 +2카드인가 3카드인가+ 몇명이서 플레이할 것인가?)
		//2. 클릭으로 이름, 패스워드로 로그인 가능한 창 만들것
		//3. 베팅기능 선택 창 만들것 (클릭)
		//4. 캐셔기능 선택 창 만들것 (클릭)
		Scanner scan = new Scanner(System.in);
		
		
		Player P1 = new Player();
		Player P2 = new Player();
		Dealer D = new Dealer();
		Jokbo J= new Jokbo();
		Cashier C = new Cashier();
		LoginSystem Login= new LoginSystem();  
		ArrayList<Card> Deck = new ArrayList<Card>();
		D.GameStart();
		D.GameType = 2;
		D.normalbet = 500;
		
		
		boolean OS = true;
		while(OS) {
			
			System.out.println("1. Make new ID");
			System.out.println("2. Load ID");
			System.out.println("3. Start Game");
			System.out.println("4. Save ID");
			System.out.println("5. Cashier");
			System.out.println("6. Exit");
			String GS;
			GS = scan.nextLine();
			int j = Integer.parseInt(GS);
		
		switch(j) {
		case 1:
			System.out.println("Enter your name");
			String Sname = scan.nextLine();
			System.out.println("Enter your password");
			String Spassword = scan.nextLine();
			
			Player newID = new Player();
			newID = Login.NewID(Sname, Spassword);
			Login.SaveID(newID);
			break;
	
		case 2:
			System.out.println("Load your Two Player's ID");
			System.out.println("Enter your name");
			Sname = scan.nextLine();
			System.out.println("Enter your password");
			Spassword = scan.nextLine();
			P1 = Login.ReadID("IDList.csv", Sname, Spassword);
			System.out.println("Enter your name");
			Sname = scan.nextLine();
			System.out.println("Enter your password");
			Spassword = scan.nextLine();
			P2 = Login.ReadID("IDList.csv", Sname, Spassword);
			break;
		
		case 3:
			//게임을 시작한 후 
			P1.state = true;
			P2.state = true;
			System.out.println("2 Cards Game or 3 Cards Game?");
			String GT;
			GT = scan.nextLine();
			System.out.println("Gametype is "+GT+" Cards Game.");
			System.out.println("Normal Betting money is 500");
			
			while(D.state == true) {
			int k;
			String option;
			
			//게임 시작
			System.out.println("Let's start the Game!");
			Deck = D.MakeDeck();
			
			D.shuffle(Deck);
			P1.hand = D.distrib(Deck);
			P2.hand = D.distrib(Deck);
			
			D.FirstBetting(P1,P2);
			
			
			
			System.out.println("Let's start Betting!");
			if(P1.First == true && P2.First == false) {
				
				while(true) {
					
					// 플레이어1 베팅
					
					System.out.println("Player 1's Betting Turn!");
					System.out.println("What's your Betting?");
					P1.ShowCard(D.GameType);
					System.out.println("1.Check\n"
							+ "2.BBing\n"
							+ "3.Ddadang\n"
							+ "4.Half\n"
							+ "5.Call\n"
							+ "6.Die\n");
					option = scan.nextLine();
					k = Integer.parseInt(option);
					switch(k) {
					case 1 : 
						P1.check(D);
						break;
					case 2 :
						P1.bbing(D);
						break;
					case 3 :
						P1.ddadang(D);
						break;
					case 4 :
						P1.half(D);
						break;
					case 5 :
						P1.call(D);
						break;
					case 6 :
						P1.die(D);
						break;
					}
					
					if(P1.state == false) {
						System.out.println("Betting Stopped!");
						P1.First = false;
						P2.First = true;
						break;
					}
					
					//플레이어2 베팅
					System.out.println("Player 2's Betting Turn!");
					System.out.println("What's your Betting?");
					P2.ShowCard(D.GameType);
					System.out.println("1.Check\n"
							+ "2.BBing\n"
							+ "3.Ddadang\n"
							+ "4.Half\n"
							+ "5.Call\n"
							+ "6.Die\n");
					option = scan.nextLine();
					k = Integer.parseInt(option);
					switch(k) {
					case 1 : 
						P2.check(D); 
						break;
					case 2 :
						P2.bbing(D);
						break;
					case 3 :
						P2.ddadang(D);
						break;
					case 4 :
						P2.half(D);
						break;
					case 5 :
						P2.call(D);
						break;
					case 6 :
						P2.die(D);
						break;
					}
					if(P2.state == false) {
						System.out.println("Betting Stopped!");
						P1.First = false;
						P2.First = true;
						break;
					}
					
					if(D.GameType == 3) {
						P1.hand[3] = D.additionaldist(Deck);
						P2.hand[3] = D.additionaldist(Deck);
						D.GameType = 0;
					}
				}
			}
			if(P1.First == false && P2.First == true) {
					
				while(true) {
						
					// 플레이어2 베팅	
					System.out.println("Player 2's Betting Turn!");
					System.out.println("What's your Betting?");
					P2.ShowCard(D.GameType);
					System.out.println("1.Check\n"
							+ "2.BBing\n"
							+ "3.Ddadang\n"
							+ "4.Half\n"
							+ "5.Call\n"
							+ "6.Die\n");
					option = scan.nextLine();
					k = Integer.parseInt(option);
					switch(k) {
					case 1 : 
						P2.check(D); 
						break;
					case 2 :
						P2.bbing(D);
						break;
					case 3 :
						P2.ddadang(D);
						break;
					case 4 :
						P2.half(D);
						break;
					case 5 :
						P2.call(D);
						break;
					case 6 :
						P2.die(D);
						break;
					}
					if(P2.state == false) {
						System.out.println("Betting Stopped!");
						P1.First = true;
						P2.First = false;
						break;
					}
					// 플레이어1 베팅
					System.out.println("Player 1's Betting Turn!");
					System.out.println("What's your Betting?");
					P1.ShowCard(D.GameType);
					System.out.println("1.Check\n"
							+ "2.BBing\n"
							+ "3.Ddadang\n"
							+ "4.Half\n"
							+ "5.Call\n"
							+ "6.Die\n");
					option = scan.nextLine();
					k = Integer.parseInt(option);
					switch(k) {
					case 1 : 
						P1.check(D);
						break;
					case 2 :
					P1.bbing(D);
						break;
					case 3 :
						P1.ddadang(D);
						break;
					case 4 :
						P1.half(D);
						break;
					case 5 :
						P1.call(D);
						break;
					case 6 :
						P1.die(D);
						break;
					}
						
					if(P1.state == false) {
						System.out.println("Betting Stopped!");
						P1.First = true;
						P2.First = false;
						break;
					}
					
					if(D.GameType == 3) {           
						P2.hand[3] = D.additionaldist(Deck);
						P1.hand[3] = D.additionaldist(Deck);
						D.GameType = 0;
					}
				}
				
				if(D.GameType == 3) {
					
					P1.discard(); 
			
					P2.discard();
				}
				
				//족보 비교
				J.GetJokboscore(P1);
				J.GetJokboscore(P2);
				D.WhoWin(P1, P2);
			}
			
			
			int count = 0;
			System.out.println("Player 1, Continue Game? 1.Y 2.N");
			String ask = scan.nextLine();
			int check = Integer.parseInt(ask);
			if(check == 2)
				count++;
			System.out.println("Player 2, Continue Game? 1.Y 2.N");
			ask = scan.nextLine();
			check = Integer.parseInt(ask);
			if(check == 2)
				count++;
			System.out.println(count);
			// 마우스로 예, 아니오 클릭 후  아니오 클릭시 카운트 +1
			D.regame(count);
			
			
			
			}
			break;
		case 4:
			System.out.println("Save your ID");
			Login.SaveID(P1);
			Login.SaveID(P2);
			break;
		case 5:
			System.out.println("Are you Player1 or Player2?");
			String d = scan.nextLine();
			int f = Integer.parseInt(d);
			if(f==1) {
				C.Identify(P1);
				System.out.println("Enter your choice!");
				d = scan.nextLine();
				f = Integer.parseInt(d);
				if(f==1)
					C.Deposit(P1);
				else
					C.Withdraw(P1);
			}
			else {
				C.Identify(P2);
				System.out.println("Enter your choice!");
				d = scan.nextLine();
				f = Integer.parseInt(d);
				if(f==1)
					C.Deposit(P2);
				else
					C.Withdraw(P2);
			}
			
		case 6:
			System.out.println("Exit The Game.");
			OS = false;
			break;
		}
	}
	}
}