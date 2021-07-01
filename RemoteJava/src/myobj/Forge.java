package myobj;

import java.util.Arrays;

public class Forge {
	
	final int MAX_INCREASE = 3;
	
	Weapon_info[] queue = new Weapon_info[MAX_INCREASE];
	int queue_index;
	
	Forge() {
		queue = new Weapon_info[MAX_INCREASE];
	}
	
	boolean checkQueue() {
		return queue_index == MAX_INCREASE;
	}
	
	//void plus(Weapon_info weapon){
	void plus(double a, int b){
		System.out.println();
		System.out.println((queue_index + 1) + " ��° ��ȭ");
		
		if (checkQueue()) {
			System.out.println("��ȭ ��ȸ�� ��� ����ϼ̽��ϴ�.");
			return;
		}
		int increase = (int)(Math.random() * 101) - (b*15) ;
		

		
		double c = 100 - (b*15);
		double d = b * 1.5;
		
		System.out.println("Ȯ��1 : " + increase);
		
		if (increase >= 60) {
			
		System.out.println("Ȯ��2 : " + increase);
		
			a = a + d;
			b = b + 1;
			
			queue[queue_index++] = new Weapon_info(a, b, c, d);
		} else {
			a = a;
			b = b;
			
			System.out.println("��ȭ����!!!!");
			
			queue[queue_index++] = new Weapon_info(a, b, 100 - (b*15), (b*10) * (b*5));
		}
		
		/*
		System.out.print(queue[0].attack_damage + "\t");
		System.out.print(queue[0].weapon_level + "\t");
		System.out.print(queue[0].probabilities + "\t");
		System.out.println(queue[0].attack_increase);
		*/
	}
	
	void attack() {
		
	}
	
	
}
/*
weapon.attack_damage = weapon.attack_damage + (weapon.attack_increase * weapon.weapon_level) ;
weapon.weapon_level = weapon.weapon_level + 1;
weapon.probabilities = weapon.probabilities - (0.5 * weapon.weapon_level);
weapon.attack_increase = weapon.attack_increase * weapon.weapon_level;
*/