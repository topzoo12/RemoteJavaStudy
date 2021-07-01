package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {
		
	/*
	  	
	  	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	  	 
	   	  1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	   	  
	  	  2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	  	  
	  	  3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	  	  
	  	  4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	  	  
	  	  5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	  	  
	  	  6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	  	     factorial:(n)*(n-1)*(n-2) ... 3*2*1
	  
	 */

	public static void main(String[] args) {
		// 1.
		//System.out.println(isAlphabet("etsfda"));
		System.out.println("1�� : " + isAlphabet1('3'));
		
		// 2. 
		System.out.println("2�� : " + isMultiple(33));
		
		// 3.
		System.out.println("3�� : " + evenNumber(33));
		
		// 4.
		System.out.println("4�� : " + Arrays.toString(aliquot(30)));
		
		// 5.
		System.out.println("5�� : " + integerCheck(7));
		
		// 6.
		System.out.println("6�� : " + factorial(5));
		System.out.println("6_1�� : " + recursive_factorial(5));

	}
	
	// 1. ====================================================================
	public static boolean isAlphabet(String text) {
		
		boolean result = true;
		
		for (int i=0; i < text.length(); i++) {
			
			char check_text = text.charAt(i);
			
			if ((check_text >= 'a' && check_text <= 'z') 
					|| (check_text >= 'A' && check_text <= 'Z')) {
				result = false;
			}
		}
		return result;
	}
	
	public static boolean isAlphabet1(char ch) {
		/*
		if ((ch >= 'a' && ch <= 'z')|| (ch >= 'A' && ch <= 'Z')) {
			return ; 
		}*/
		return ch >= 'a' && ch <= 'z'|| ch >= 'A' && ch <= 'Z';
		
	}
	// 1. ====================================================================
	
	// 2. ====================================================================
	public static boolean isMultiple(int num) {
		/*
		boolean result = true;

		if (num % 3 != 0) {
			result = false;
		}
		return result;
		*/
		return num % 3 == 0;
		
	}
	// 2. ====================================================================
	// 3. ====================================================================
	public static String evenNumber(int checkNum) {
		/*
		String result;

		if (checkNum % 2 == 0) {
			result = "¦���Դϴ�";
		}else {
			result = "Ȧ���Դϴ�";	
		}
		
		return result;
		*/
		return checkNum % 2 == 0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
	}
	// 3. ====================================================================
	// 4. ====================================================================
	public static int[] aliquot(int num) {
		// 50�� ��� booleanŸ�� ���� 50���� ����
		boolean[] divided = new boolean[num];
				
		int result_size = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divided[i -1] = true;	// �迭�� ������ ������ ���ڵ��� ǥ�� �س���
				result_size++;
			}
		}
		
		int[] result = new int[result_size];
		int index = 0;
		
		for (int i = 0; i < num; i++) {
			
			if (divided[i]) {
				result[index++] = i + 1;
				//result[i] = num;
			}
			
		}
		return result;
	}
	// 4. ====================================================================	
	// 5. ====================================================================
	public static boolean integerCheck(int checkNum) {
		
		boolean result = false;
		
		int count = 0;
		/*
		for (int i = 2; i <= checkNum; i++) {
			if ( checkNum % i == 0 ) {
				count++;
			}
		}
		
		if (count == 1) {
			result = true;
		}
		*/
		if (checkNum == 2) {
			return false;
		} else if (checkNum == 2) {
			return true;
		} else if (checkNum % 2 == 0) {
			return false;
		}
			
		
		for (int i = 3; i <= Math.sqrt(checkNum); i += 2) {
			if (checkNum % i == 0) {
				return false;
			}
		}
		
		return true;
		//return result; 
	}
	// 5. ====================================================================	
	// 6. ====================================================================
	public static int factorial(int checkNum) {
		
		int factorial = 1;
		
		for (int i = checkNum; i > 0; i--) {
			//System.out.print(checkNum + " * " + i + " = ");
			//System.out.println(factorial);
			factorial *= i;
		}
		
		return factorial;
	}
	
	// � �Լ��� �ڱ� �ڽ��� �ҷ��� ����ϴ� ���� ����Լ���� �θ���. (���� ������, �Ѹ�)
	public static int recursive_factorial(int checkNum) {
		if (checkNum == 1) {
			return 1;
		}
		//System.out.print(checkNum + "\t");
		//System.out.println(checkNum * recursive_factorial(checkNum - 1));
		return checkNum * recursive_factorial(checkNum - 1);
	}
	// 6. ====================================================================
}
