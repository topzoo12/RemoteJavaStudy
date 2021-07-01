package quiz;

public class B08_WhileBasicQuiz {
	
		/*	
	
			while문을 이용하여 다음을 구하시오.
	
			1. 1 부터 100 사이에 있는 3의 배수의 총합
			
			2. 355부터 237까지 출력
			
			3. continue를 반드시 사용하여 3000부터 5000사이의 7의 배수만 출력하기
			
			4. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
			 
		*/
		
	public static void main(String[] args) {
		
		int a = 1;
		int a_sum = 0;
		
		// 1.
			System.out.println("  1. =============");
			while (a <= 100) {
				if (a % 3 == 0) {
					a_sum += a;
				}
				a++;
			}
			System.out.println(a_sum);
			
		// 2.
			System.out.println("  2. =============");
			
			int b = 355;
			
			while (b >= 237) {
				System.out.println(b);
				b--;
			}
			
		
		// 3. 
			System.out.println("  3. =============");
			
			int start = 3000;
			int last = 5000;
			
			while (start <= last) {
				
				if (start%7 != 0) {
					start++;
					continue;
				}
				System.out.println(start);
				start++;
			}
		
		
		// 4. 
			System.out.println("  4. =============");
			start = 1;
			last = 200; 
			int sum = 0;
		
			while (start <= last) {
				if (!(start%2 == 0) && !(start%3 == 0)) {
					sum = sum + start;
				}
				start++;
			}
			System.out.println(sum);
		

	}

}












