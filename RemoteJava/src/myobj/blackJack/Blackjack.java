package myobj.blackJack;

import java.util.Scanner;

public class Blackjack {
	
	Scanner sc;
	Cards cards;
	Player player;
	Dealer dealer;
	
	public Blackjack() {
		cards = new Cards();
		player = new Player();
		dealer = new Dealer();
		sc = new Scanner(System.in);
	}
	
	public void new_game() {
		
		dealer.add(cards.next());
		dealer.add(cards.next());
		
		player.add(cards.next());
		player.add(cards.next());
		
		
		info();
		//System.out.println(dealer + "�� value : " + dealer.calc());
		
		int pv = -1;
		
		while (choice()) {
			player.add(cards.next());
			
			pv = player.calc();
			if (pv >= 21) {
				break;
			}	
		}
		// info();
		
		if (pv >= 21) {
			// ������ ������ ī�带 ���� ����
			open();
		} else {
			System.out.println("�÷��̾� ����Ʈ !!!");
		}
		
		last_info();
		whowin();
		// System.out.println("���� ��!");
		
	}
	
	private void whowin() {
		int dv = dealer.calc();
		int pv = player.calc();
		
		if (dv == pv) {
			System.out.println("���º�!!");
		} else if (dv > 21  && pv <= 21) {
			System.out.println("�÷��̾� �¸�!");
		} else if (pv > 21 && dv <= 21) {
			System.out.println("������ �¸�!");
		} else if (pv > dv) {
			System.out.println("�÷��̾��� �¸�!");
		} else {
			System.out.println("������ �¸�!");
		}
		
	}
	
	private void open() {
		
		int dv = 0;
		
		while (dealer.calc() < 17) {
			dealer.add(cards.next());
		}
		dealer.tables[0].hidden = false;
	}
	
	
	private void info() {
		System.out.println("������ ī�� : " + dealer);
		System.out.println("�÷��̾� : " + player + ", value : " + player.calc());
	}
	
	private void last_info() {
		System.out.println("������ ī�� : " + dealer + ", value : " + dealer.calc());
		System.out.println("�÷��̾� : " + player + ", value : " + player.calc());
	}
	
	private int input(String notice) { 
		System.out.println(notice);
		return sc.nextInt();
	}
	
	//input("1 hit\t2. stand>");
	
	private boolean choice() {
		
		while (true) {
			int choice = input("1 hit\t2. stand>");
			info();
			if (choice == 1) {
				return true;
			} else {
				return false;	
			}
		}
		//return false; 
		
	}
	
	
	
	public static void main(String[] args) {
		Blackjack blackjack = new Blackjack();
		
		//new Blackjack().new_game();
		
		while (true) {
			blackjack.new_game();
		}
	}
	
	
}
