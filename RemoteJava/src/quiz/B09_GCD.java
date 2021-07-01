package quiz;

import java.util.Scanner;

public class B09_GCD {
	
		/*
		 
		  두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요
		  
		  # 최대공약수
		  
		   - 두 숫자의 공약수 중 가장 큰 공약수를 
		  
		  20, 50
		  
		  의 경우 10이 최대 공약수 
		  
		 */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		int a_check = 0;
		int b_check = 0;
		int equal = 0;
		
		System.out.println("첫 번째 숫자를 입력해주세요! >");
//		a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요! >");
//		b = sc.nextInt();
		
		a = 20;
		b = 50;
			
			for (int x = 2; x <= a; x++) {
				for (int y = 2; y <= x; y++) {
					if (b%y == 0 && a%x == 0 && x == y) {
						equal = y; 
					}
				}
			}
			System.out.println(equal);
			
		// ======================================================
			
			int num1 = 20, num2 = 50;
			
			//int max = num1 > num2 ? num1 : num2;
			//int min = num1 < num2 ? num1 : num2;
			
			int max = Math.max(num1, num2);
			int min = Math.min(num1, num2);
			
			int gcd = 1;
			
			for (int i = 1; i <= min; i++) {
				if (min%i == 0 && max % i == 0) {
					gcd = i;
				}
			}
			System.out.printf("%d와 %d의 최대 공약수는 %d입니다.", num1, num2, gcd);
			
			
			
			
			/*
			 for (int x=1; x <= a; x++) {
				if (a%x==0) {
					
					//a_check = x;
					
					for (int y=1; y <= b; y++) {
						if (b%y==0 && a_check == y) {
							if (a_check == y) {
								equal = y; 
							}
						}
					}
				}
			}
			System.out.println(equal);
			 
			 
			 */
		
	}

}














