package quiz;

import java.util.Scanner;

public class C07_BlackJack {
	
	/*
	
		# �����ڷ� 
		  
		   https://www.247blackjack.com
		  
		# ī�� 
		
		  	4������ ���� : ��Ʈ, Ŭ�ι�, ���̾Ƹ��, �����̵�
		  
		  	���� : A 2 3 4 5 6 7 8 9 10 J Q K
		  	
		  	�� ���迡�� A�� 1�� �� ���� �ְ� 11�ε� �� �� ����
		  	  J, Q, K�� 10
		  	  ��Ŀ�� ������� ����
		  	
		# ������ ����� ������
		
		1. ��ǻ��(����)�� ���(�÷��̾�)�� ī�带 �̴´�.
		
		2. ó������ ��� 2�徿 �޴´�. �� �� ������ ī��� ���� �������´�.
		
		3. �÷��̾�� ��Ȳ�� ���� �� ������(hit) ���⼭ ��������(stand) �����Ѵ�.
		
		4. �÷��̾ ���߸� ������ ������ �ִ� ī�带 �����ϰ� ��Ģ�� ���� ī�带 �̴´�.
		   (������ �ݵ�� ī�� ���� 16 �����϶� ������ �̰�, 17 �̻��̸� ������ ����� �Ѵ�)
		   
		5. �÷��̾��� ī�� ���ڵ��� ���� �������� ���ų� ��Ȯ�ϰ� 21�̶�� �¸��Ѵ�.
		   �÷��̾��� ī�� ���ڵ��� ���� 21���� ũ�� �й��Ѵ�. ( A ~ K )
		   
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
		System.out.println("������ �����մϴ�.");
		System.out.println("dealer ī�� : ##, " + cardList[dealer[1]]);
		System.out.println("player ī�� : " + cardList[player[0]] + ", " + cardList[player[1]]);
		
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






















