package quiz;

import java.util.Scanner;

public class B05_ForBasicQuiz {
		/*
		 
		 	����ڰ� ���ڸ� �Է� ���� ��
		 	
		 	1. 10���� �Է��� ���ڱ����� ������ ���غ�����
		 	
		 	2. 1000���� �Է��� ���ڱ��� ������� ������ ����� ������ 
		 	
		 	3. 1���� �Է��� ���� ������ 5�� ����� ����غ�����
		 */
	
	public static void main(String[] args) {
			
		
		Scanner sc = new Scanner(System.in);
		
		//---------------------------------------------------------------------
		// 1.
		System.out.println("1. ���ڸ� �Է����ּ��� > ");
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
		System.out.printf("10���� %d������ ������ %d�Դϴ�.\n", my_input, sum);
		
		/*		
		if (my_input > start) {
			for (int i = start; i <= my_input ; i++ ) {
				result = i + result;
			} System.out.println("����� : " + result);
		}else if (my_input < start) {
			for (int i = start; i >= my_input ; i-- ) {
				result = i + result;
			} System.out.println("����� : " + result);
		}
		*/
		
		//---------------------------------------------------------------------
		// 2.
		
		System.out.println("2. ���ڸ� �Է����ּ��� > ");
		int my_input1 = sc.nextInt();
		start = 1000;

		if (start < my_input1) {
			for (int i=start; i <= my_input1 ; i++) {
				//System.out.println(i);
				System.out.printf("1000���� %d���� ��� : %d\n", my_input1, i);
			}
		}else if (start > my_input1) {
			for (int i=start; i >= my_input1 ; i--) {
				//System.out.println(i);
				System.out.printf("1000���� %d���� ��� : %d\n", my_input1, i);
			}
		}else {
			System.out.println(start);
		}

		//---------------------------------------------------------------------
		// 3.
		
		System.out.println("3. ���ڸ� �Է����ּ��� > ");
		int my_input2 = sc.nextInt();
		
		if (my_input2 > 1 ) {
			for (int i=1; i <=my_input2 ;i++ ) {
				if (i%5==0) {
					//System.out.println(i);
					System.out.printf("1���� %d���� 5�� ����� ��� : %d\n", my_input2, i);
				}
			}		
		}else if (my_input2 < 1) {
			for (int i=1; i >= my_input2 ;i-- ) {
				if (i%5==0) {
					//System.out.println(i);
					System.out.printf("1���� %d���� 5�� ����� ��� : %d\n", my_input2, i);
				}
			}
		}
		

	}

}
