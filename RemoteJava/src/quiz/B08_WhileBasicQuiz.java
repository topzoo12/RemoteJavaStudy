package quiz;

public class B08_WhileBasicQuiz {
	
		/*	
	
			while���� �̿��Ͽ� ������ ���Ͻÿ�.
	
			1. 1 ���� 100 ���̿� �ִ� 3�� ����� ����
			
			2. 355���� 237���� ���
			
			3. continue�� �ݵ�� ����Ͽ� 3000���� 5000������ 7�� ����� ����ϱ�
			
			4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
			 
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












