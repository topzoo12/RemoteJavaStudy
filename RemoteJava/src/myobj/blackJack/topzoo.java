package myobj.blackJack;

public class topzoo {
	
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
	
	public topzoo() {
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
	
	
	
	
	
	
	
	
	
	
}
