package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {
	
			/*
			  
			 ����ڷκ��� ���ڸ� �Է¹����� �ش� ���� ��ŭ�� ���� ������ �����Ѵ�.
			 (�������� �����ϴ� ���� - apple, banana, kiwi, orange, grape, peach)
			 
			 �� �� �� ������ �� �� �����ߴ��� ��� ����ϰ� ����Ѵ�.
	
			*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� ������ �Է����ּ��� > ");
		int aa = sc.nextInt();
		//int aa = 10;
		
		int total_fruit = 0;
		
		String[] fruit = {"apple", "banana", "kiwi", "orange", "grape", "peach"};
		int fruit_range = fruit.length;
		
		int[] fruit_cnt = new int[fruit_range];
		
		int max_cnt = (int)(Math.random() * aa + 1);
		
		for (int i = 0; i < aa; i++) {
			int any_fruit = (int)(Math.random() * fruit_range);
			System.out.println((i+1) + " ��° ������ \t: " + (fruit[any_fruit]) + " �Դϴ�.");
			fruit_cnt[any_fruit]++;
			total_fruit++;
		}
		System.out.println("");
		
		for (int i = 0; i < fruit_cnt.length; i++) {
			System.out.println(fruit[i] + "�� ������ \t: " +fruit_cnt[i] + " �� �Դϴ�.");
		}
		System.out.println("=======================================");
		System.out.println("�� ������ ������ \t: " + total_fruit + " �� �Դϴ�.");
		
		

	}

}








