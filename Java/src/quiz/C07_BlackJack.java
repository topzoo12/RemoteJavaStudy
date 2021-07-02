package quiz;

import java.util.Scanner;

public class C07_BlackJack {
	
	/*
	
		# 참고자료 
		  
		   https://www.247blackjack.com
		  
		# 카드 
		
		  	4가지의 문양 : 하트, 클로버, 다이아몬드, 스페이드
		  
		  	숫자 : A 2 3 4 5 6 7 8 9 10 J Q K
		  	
		  	※ 블랙잭에서 A는 1로 쓸 수도 있고 11로도 쓸 수 있음
		  	  J, Q, K는 10
		  	  조커는 사용하지 않음
		  	
		# 블랙잭을 만들어 보세요
		
		1. 컴퓨터(딜러)와 사람(플레이어)이 카드를 뽑는다.
		
		2. 처음에는 모두 2장씩 받는다. 이 때 딜러의 카드는 한장 가려놓는다.
		
		3. 플레이어는 상황을 보고 더 뽑을지(hit) 여기서 멈출지를(stand) 결정한다.
		
		4. 플레이어가 멈추면 딜러가 가려져 있던 카드를 오픈하고 규칙에 따라 카드를 뽑는다.
		   (딜러는 반드시 카드 합이 16 이하일때 무조건 뽑고, 17 이상이면 무조건 멈춰야 한다)
		   
		5. 플레이어의 카드 숫자들의 합이 딜러보다 높거나 정확하게 21이라면 승리한다.
		   플레이어의 카드 숫자들의 합이 21보다 크면 패배한다. ( A ~ K )
		   
	*/
	
	public static void main(String[] args) {
		
		String[] cardList = {
				"DA", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D1", "D10", "DJ", "DQ", "DK",
				"CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C1", "C10", "CJ", "CQ", "CK",
				"HA", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H1", "H10", "HJ", "HQ", "HK",
				"SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S1", "S10", "SJ", "SQ", "SK"
				};
		
		int cnt = 0;
		int turn_check = 2;
		
		int[] first_card = new int[4];
		
		int[] player = new int[10];
		int[] dealer = new int[10];
		
		for (int i = 0; i < first_card.length; i++) {
			first_card[i] = (int)(Math.random() * cardList.length);	
		}
		
		for (int i = 0; i < first_card.length; i++) {
			for (int j = 0; j < i; j++) {
				/*
				System.out.print("i : " + first_card[i] + "\t");
				System.out.println("j : " + first_card[j]);
				*/
				if (first_card[i] == first_card[j]) {
					first_card[j] = (int)(Math.random() * cardList.length);
				}
			}
		}
		
		player[0] = first_card[0];
		player[1] = first_card[1];
		dealer[0] = first_card[2];
		dealer[1] = first_card[3];
		
//		System.out.println(player[0]);
//		System.out.println(player[1]);
//		System.out.println(dealer[0]);
//		System.out.println(dealer[1]);
		
//		int player_turn;
//		int dealer_turn;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 시작합니다.");
		System.out.println("dealer 카드 : ##, " + cardList[dealer[1]]);
		System.out.println("player 카드 : " + cardList[player[0]] + ", " + cardList[player[1]]);
		
		for (int i = turn_check; i < 20; i++) {
//			System.out.println(i);
//			hit();
		}
		
	}
	
	
	public static void hit() {
		//player[2] = (int)(Math.random() * cardList.length);
		
		
	}
	
	public static void stand() {
		
	}
	
	public void nowNum() { 
		System.out.println();
	}
	
}






















