package quiz;

import java.util.Scanner;

public class B07_Prime {
	/*
	  
	  사용자로부터 숫자(양수)를 입력받으면
	  1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
	  (음수를 입력하면 다시 제대로 입력하게 하기)
	  
	  ※ 소수: 나누어 떨어지는 수가 1과 자기 자신밖에 없는 숫자
	  
	  	2, 3, 5, 7, 11, 13
	  
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("숫자를 하나 입력해주세요 > ");
		
		//int my_num = sc.nextInt(); 
		
		
		/*
		for (;;) {
			if (my_num <= 0) {
				System.out.println("0 보다 큰 양수를 입력해주세요 > ");
				my_num = sc.nextInt();
			}else if (my_num > 0) {
				break;
			}
		}
		for (;my_num <=0;) {
			System.out.println("0 보다 큰 양수를 입력해주세요 > ");
			my_num = sc.nextInt();
		}
		*/
		int my_num = 50;
		
		for (int chkNum=2; chkNum<=my_num; chkNum++) {
			
			int count = 0;
			
			for (int divNum=2; divNum <= chkNum; divNum++) {
				if ( chkNum % divNum == 0 ) {
					count++;
				}
			}
			
			if (count == 2) {
				System.out.println(chkNum);				
			}
			
			
		}

	}

}













