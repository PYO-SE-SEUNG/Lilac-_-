package sutda;

import java.util.*;

public class Dealer {
	
	int GameType; //2�弸��, 3�� ���� ����
	boolean state; // ������ ��� ������ ������ ����
	int totalbet;  //�� ���þ�(�÷��̾� ����)
	int previousbet; //�ٷ� �� ����
	int normalbet;  //�⺻���� 
	
	
	public void GameStart() {
		this.state = true;
	}
	
	public void regame(int count) {
		if(count != 0) {
			this.state = false;
			System.out.println("Thank you for playing Game.");
		}
	}

	public ArrayList<Card> MakeDeck() {
		
		ArrayList<Card> Deck = new ArrayList<Card>();
		
		for(int i=0;i<20;i++) {
			Card c = new Card();
			if(i<10) {
				c.month = i+1;
				Deck.add(c);
			}
			else {
				c.month = i-9;
				Deck.add(c);
			}
		}
		
		Deck.get(11).Light = true;
		Deck.get(13).Light = true;
		Deck.get(18).Light = true;
	
		return Deck;
	}
	
	public void shuffle(ArrayList<Card> Deck) {
		Collections.shuffle(Deck);
	}
	
	public Card[] distrib(ArrayList<Card> Deck) {
		Card temp[] = new Card[3];
		for(int i=0; i<2; i++) {
			temp[i] = Deck.get(0);
			Deck.remove(0);
		}
		return temp;
	}
	
	public Card additionaldist(ArrayList<Card> Deck) {
		Card temp = new Card();
		temp = Deck.get(0);
		Deck.remove(0);
		
		return temp;
	}
	
	public void FirstBetting(Player P1, Player P2) { //������ �����ִ� �Լ�, �� �ڻ��� ��������� ������
		if(P1.money + P1.balance > P2.money +P2.balance) {
			P1.First = true;
			P2.First = false;
			System.out.println("First Bet is Player1");
		}
		else {
			P1.First = false;
			P2.First = true;
			System.out.println("First Bet is Player2");
		}	
	}
	
	public void WhoWin(Player P1, Player P2) { //���� �̰���� �Ǵ� + ������ ���
		
		
		if(P1.Jokboscore==26 && !(15<P2.Jokboscore && P2.Jokboscore<26))  // ������ī�尡 �����ϼ����� üũ
			P1.Jokboscore = 0;
		if(P2.Jokboscore==26 && !(15<P1.Jokboscore && P1.Jokboscore<26))
			P2.Jokboscore = 0;
		
		if(P1.Jokboscore>P2.Jokboscore) {
			System.out.println("Player 1 wins!");
			System.out.println("Totalbet is "+this.totalbet);
			P1.money += this.totalbet;
		}
		else {
			System.out.println("Player 2 wins!");
			System.out.println("Totalbet is "+this.totalbet);
			P2.money += this.totalbet;
		}
	}
	
}
