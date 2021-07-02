package quiz;

import java.util.Scanner;

public class B09_Count369 {
		
		/*
		 	
		 	사용자로부터 정수를 하나 입력받은 후
		 	해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야하는지 세어보세요
		 	
		 	( ※ 33, 36, 39 .... 등의 숫자는 여러번 칩니다.)
		 	
		*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 숫자를 입력해주세요! >");
		int last_num = sc.nextInt();
		
		String check_num = "" + last_num;
		String beauty = "";
		
		int check_cnt = 0;
				
		for (int i = 1; i <= last_num ; i++) {
			
			check_num = "" + i;
			
			beauty = "";
			
			for (int y = 0; y < check_num.length() ; y++) {
				if (check_num.charAt(y) == '3' || check_num.charAt(y) == '6' || check_num.charAt(y) == '9') {
					/*
					if (y > 1) {
						System.out.println("\t" + beauty);
					}
					beauty = beauty + "'" + check_num.charAt(y) + "'";
					*/
					check_cnt++;
					System.out.println(check_cnt + "번째 박수 - " +i);
					//System.out.println("\t" + beauty);
					
				}
			}
		}
		System.out.println("===============");
		System.out.println("총 박수 횟수 : " + check_cnt);
		
		// =================================================================================
		
		/*
		  	
		  	문제해결력 - 문제를 푸는 길을 찾는 것
		  	구현력 - 생각해낸 길을 코드로 구현하는 것
		  	프로그래밍 언어 이해력 - 사용하는 언어에 대한 깊은 이해도 
		  	
		  	국어 - 한글을 이해할 수 있어야 함
		  	
		 */
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("박수 체크해볼 숫자 > ");
		int num = sc1.nextInt();
		
		// 350 % 10
		// 353 / 10 % 10
		// 353 / 100 % 10
		
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			
			int checkNum = i;
			
			System.out.printf("[%d]\t: ", checkNum);
			
			while (checkNum != 0) {
				
				int digit = checkNum % 10;
				
				if (digit % 10 != 0 && digit % 3 == 0) {
					System.out.print("짝");
					count++;
				}
				
				checkNum /= 10;
			}
			System.out.println();
		}
		System.out.printf("박수는 총 %d회 쳤습니다.\n", count);
		
		
		

	}

}
// 3 6 9 13 16 19 23 26 29 












