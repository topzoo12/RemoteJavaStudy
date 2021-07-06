package myobj.blackJack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cards {
	
	final public static int NUM_OF_SUITS = 4;
	final public static int NUM_OF_RANKS = 13;
	final public static int CARD_SIZE = NUM_OF_SUITS * NUM_OF_RANKS;

	Card[] cards;
	
	private int cursor;
	
	public Cards() {
		cards = new Card[CARD_SIZE];
		
		for (int i = 0; i < NUM_OF_SUITS; i++) {
			for (int j = 0; j < NUM_OF_RANKS; j++) {
				cards[i * NUM_OF_RANKS + j] = new Card(i, j);
			}
		}
		shuffle(1000);
	}
	
	public void shuffle(int times) {
		for (int i = 0; i < times; i++) {
			int x = (int)(Math.random() * CARD_SIZE);
			int y = (int)(Math.random() * CARD_SIZE);
			
			Card temp = cards[x];
			cards[x] = cards[y];
			cards[y] = temp;
		}
	}
	
	public Card next() {
		// 이 부분에 알맞은 소스를 제출해보세요
		
		if (cursor >= CARD_SIZE) {
			shuffle(500);
			cursor = 0;
		}
		
		/*
		if (cursor >= cards.length) {
			cursor = 0;
			return cards[cursor++];
		} else {
			return cards[cursor++];
		}
		*/
		
		return cards[cursor++];
	}
	
	@Override
	public String toString() {
		return Arrays.toString(cards);
	}
	
	
	
	
	public static void main(String[] args) {
		
		// System.out.println(Arrays.toString(new Cards().cards));
		
		Cards cards = new Cards();
		
		// System.out.println(cards);
		/*
		for (int i = 0; i < 70; i++) {
			System.out.println((i+1) + "번째로 뽑은 카드: " + cards.next());
		}
		
		System.out.print(new Card(0, 0).toString() + " ");
		System.out.print(new Card(0, 1).toString() + " ");
		System.out.print(new Card(0, 2).toString() + " ");
		System.out.print(new Card(0, 3).toString() + " ");
		System.out.print(new Card(0, 4).toString() + " ");
		System.out.print(new Card(0, 5).toString() + " ");
		System.out.print(new Card(0, 6).toString() + " ");
		System.out.print(new Card(0, 7).toString() + " ");
		System.out.print(new Card(0, 8).toString() + " ");
		System.out.print(new Card(0, 9).toString() + " ");
		System.out.print(new Card(0, 10).toString() + " ");
		System.out.print(new Card(0, 11).toString() + " ");
		System.out.println(new Card(0, 12).toString() );
		
		System.out.println(new Card(1, 0).toString() );
		System.out.println(new Card(2, 0).toString() );
		System.out.println(new Card(3, 0).toString() );
		*/
		// println()은 사실 전달한 인스턴스의 toString()을 호출해 콘솔에 출력하는 메서드다.
		// System.out.println();
		// System.out.println(new Integer(10).toString());
		
		// JAVA의 모든 클래스는 toString() 메서드를 가지고 있다.
		// 모든 클래스의 부모인 Object 클래스가 toString()을 가지고 있다.
		Object o1 = 10;
		Object o2 = "ABCD";
		Object o3 = new Card(1, 5);
		
		
		
	}
}
// =============================================================================================

class Card{
		
	final private static char[] SUITS = {'♠', '♣', '◇', '♡'};
	final private static String[] RANKS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	final private static int[] VALUES = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	
	int suit;
	int rank;
	boolean hidden;
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	int getValue() {
		return VALUES[rank];
	}
	
	// # 클래스의 toString() 메서드를 오버라이드
	//  - 이 클래스가 문자열로 표현되어야 할 때 어떻게 보여야 하는지를 정의 해놓는다.
	@Override
	public String toString() {
		if (hidden) {
			return "??";
		} else {
			return  SUITS[suit] + RANKS[rank];
		}
	}
	
}















/*
String[] cardList = {
		"DA", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D1", "D10", "DJ", "DQ", "DK",
		"CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C1", "C10", "CJ", "CQ", "CK",
		"HA", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H1", "H10", "HJ", "HQ", "HK",
		"SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S1", "S10", "SJ", "SQ", "SK"
		};

String[] spade = {"SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S1", "S10", "SJ", "SQ", "SK"};
String[] heart = {"HA", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H1", "H10", "HJ", "HQ", "HK"};
String[] clover = {"CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C1", "C10", "CJ", "CQ", "CK"};
String[] dia = {"DA", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D1", "D10", "DJ", "DQ", "DK"};

int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};

int[] player = new int[10];
int[] dealer = new int[10];

String[] haveCard = new String[cardList.length];

public Cards() {
	int i = 0;
	
	while (i < 4) {
		int a, b, c, d;
		a = (int)(Math.random() * cardList.length);
		b = (int)(Math.random() * cardList.length);
		c = (int)(Math.random() * cardList.length);
		d = (int)(Math.random() * cardList.length);
	}
	
	player[0] = (int)(Math.random() * cardList.length);
		player[1] = (int)(Math.random() * cardList.length);
	
	
	int player_card1 = (int)(Math.random() * 4);
	int player_card2 = (int)(Math.random() * 4);
	
	int dealer_card1 = (int)(Math.random() * 4);
	int dealer_card2 = (int)(Math.random() * 4);
}

*/













