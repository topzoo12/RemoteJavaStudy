package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {
	
	/*
	  ����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	  
	  ����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ� 
	  ����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.
	  
	 */
	
	
	public static void main(String[] args) {
		
		int baguni = 10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� � �����ϰ� �����Ű���? ");
		int apple_cnt = sc.nextInt();
		
		//System.out.println((apple_cnt%baguni));
		
		if (apple_cnt%baguni == 0 ) {
			System.out.println("�ʿ��� �ٱ����� ������ " + ((apple_cnt/baguni)) + "�� �Դϴ�.");
		} else {
			System.out.println("�ʿ��� �ٱ����� ������ " + ((apple_cnt/baguni)+1) + "�� �Դϴ�.");
		}
		
		System.out.println("------------------------------------------");
		
		// Math.ceil(a) : a�� �Ҽ� ù° �ڸ����� �ø���.
		// Math.floor(a) : a�� �Ҽ� ù° �ڸ����� ������.
		
		int apple;
		double basket_size = 10;
		double basket;
		
		apple = apple_cnt;
		basket = apple / basket_size;
		
		System.out.println("�ʿ��� �ٱ����� ������ " + (int)Math.ceil(basket) + " �� �Դϴ�.");
		
		
		
	}
}
















