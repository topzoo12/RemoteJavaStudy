package quiz;

import java.util.Scanner;

public class B05_ForBasicQuiz {
		/*
		 
		 	사용자가 숫자를 입력 했을 때
		 	
		 	1. 10부터 입력한 숫자까지의 총합을 구해보세요
		 	
		 	2. 1000부터 입력한 숫자까지 순서대로 나오게 만들어 보세요 
		 	
		 	3. 1부터 입력한 숫자 사이의 5의 배수만 출력해보세요
		 */
	
	public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		
		//---------------------------------------------------------------------
		// 1.
		System.out.println("1. 숫자를 입력해주세요 > ");
		int my_input = sc.nextInt();
		
		int start, end;
		int sum=0;
		
		if (my_input > 10) {
			start = 10;
			end = my_input;
		} else {
			start = my_input;
			end = 10;
		}
		
		for (int i = start; i <= my_input; ++i) {
			sum += i;
		}
		System.out.printf("10부터 %d까지의 총합은 %d입니다.\n", my_input, sum);
		
		/*		
		if (my_input > start) {
			for (int i = start; i <= my_input ; i++ ) {
				result = i + result;
			} System.out.println("결과는 : " + result);
		}else if (my_input < start) {
			for (int i = start; i >= my_input ; i-- ) {
				result = i + result;
			} System.out.println("결과는 : " + result);
		}
		*/
		
		//---------------------------------------------------------------------
		// 2.
		
		System.out.println("2. 숫자를 입력해주세요 > ");
		int my_input1 = sc.nextInt();
		start = 1000;

		if (start < my_input1) {
			for (int i=start; i <= my_input1 ; i++) {
				//System.out.println(i);
				System.out.printf("1000부터 %d까지 출력 : %d\n", my_input1, i);
			}
		}else if (start > my_input1) {
			for (int i=start; i >= my_input1 ; i--) {
				//System.out.println(i);
				System.out.printf("1000부터 %d까지 출력 : %d\n", my_input1, i);
			}
		}else {
			System.out.println(start);
		}

		//---------------------------------------------------------------------
		// 3.
		
		System.out.println("3. 숫자를 입력해주세요 > ");
		int my_input2 = sc.nextInt();
		
		if (my_input2 > 1 ) {
			for (int i=1; i <=my_input2 ;i++ ) {
				if (i%5==0) {
					//System.out.println(i);
					System.out.printf("1부터 %d까지 5의 배수만 출력 : %d\n", my_input2, i);
				}
			}		
		}else if (my_input2 < 1) {
			for (int i=1; i >= my_input2 ;i-- ) {
				if (i%5==0) {
					//System.out.println(i);
					System.out.printf("1부터 %d까지 5의 배수만 출력 : %d\n", my_input2, i);
				}
			}
		}
		

	}

}
