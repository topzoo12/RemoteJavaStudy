package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz {
		
	/*
	  	
	  	# 다음의 함수를 정의하고 올바르게 동장하는지 테스트 해보세요
	  	 
	   	  1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	   	  
	  	  2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	  	  
	  	  3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	  	  
	  	  4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	  	  
	  	  5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	  	  
	  	  6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	  	     factorial:(n)*(n-1)*(n-2) ... 3*2*1
	  
	 */

	public static void main(String[] args) {
		// 1.
		//System.out.println(isAlphabet("etsfda"));
		System.out.println("1번 : " + isAlphabet1('3'));
		
		// 2. 
		System.out.println("2번 : " + isMultiple(33));
		
		// 3.
		System.out.println("3번 : " + evenNumber(33));
		
		// 4.
		System.out.println("4번 : " + Arrays.toString(aliquot(30)));
		
		// 5.
		System.out.println("5번 : " + integerCheck(7));
		
		// 6.
		System.out.println("6번 : " + factorial(5));
		System.out.println("6_1번 : " + recursive_factorial(5));

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
			result = "짝수입니다";
		}else {
			result = "홀수입니다";	
		}
		
		return result;
		*/
		return checkNum % 2 == 0 ? "짝수입니다." : "홀수입니다.";
	}
	// 3. ====================================================================
	// 4. ====================================================================
	public static int[] aliquot(int num) {
		// 50인 경우 boolean타입 변수 50개를 생성
		boolean[] divided = new boolean[num];
				
		int result_size = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divided[i -1] = true;	// 배열에 나누어 떨어진 숫자들을 표시 해놓음
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
	
	// 어떤 함수가 자기 자신을 불러서 사용하는 것을 재귀함수라고 부른다. (성능 안좋은, 겉멋)
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
