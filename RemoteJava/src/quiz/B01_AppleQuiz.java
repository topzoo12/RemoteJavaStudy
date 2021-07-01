package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {
	
	/*
	  사과를 10개씩 담을 수 있는 바구니가 있다.
	  
	  사용자가 구매하고 싶은 사과의 개수를 입력하면 
	  사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요.
	  
	 */
	
	
	public static void main(String[] args) {
		
		int baguni = 10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사과를 몇개 구매하고 싶으신가요? ");
		int apple_cnt = sc.nextInt();
		
		//System.out.println((apple_cnt%baguni));
		
		if (apple_cnt%baguni == 0 ) {
			System.out.println("필요한 바구니의 개수는 " + ((apple_cnt/baguni)) + "개 입니다.");
		} else {
			System.out.println("필요한 바구니의 개수는 " + ((apple_cnt/baguni)+1) + "개 입니다.");
		}
		
		System.out.println("------------------------------------------");
		
		// Math.ceil(a) : a를 소수 첫째 자리에서 올린다.
		// Math.floor(a) : a를 소수 첫째 자리에서 내린다.
		
		int apple;
		double basket_size = 10;
		double basket;
		
		apple = apple_cnt;
		basket = apple / basket_size;
		
		System.out.println("필요한 바구니의 개수는 " + (int)Math.ceil(basket) + " 개 입니다.");
		
		
		
	}
}
















