package quiz;

import java.util.Scanner;

public class B05_Palindrome {
		
	/*
	 	사용자로부터 단어를 하나 입력받고 
	 	해당 단어가 회문이라면 "PALINDROME"을 출력
	 	회문이 아니라면 "NOT PALINDROME"을 출력
	 	
	 	※ 회문이란 - MOM, BOB, ABBA, MADAM, EVE, TXT
	 	 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 문장을 입력해 주세요 > ");
		
		String original = sc.nextLine();
		
		System.out.println(original);
		
		int original_length = original.length();
		String test_text = "";
		
		//System.out.println(text_length);
		
		for (int i=0; i<original_length; i++) {				
			test_text += original.charAt(original_length-(i+1));
		}
		
		System.out.println(original);
		System.out.println(test_text);
		
		if (original.equals(test_text)) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
			
		// ===================================================================
		System.out.println("===================================================================");
		System.out.println("===================================================================");
		int half = original_length / 2; 
		int correct = 0;
		
		for (int i=0; i<original_length/2; ++i) {
			
			char front = original.charAt(i);
			char back = original.charAt(original_length-1-i);
			
			System.out.printf("'%c와' '%c'를 비교합니다.\n", front, back);
			
			if (front == back ) {
				correct++;
			}
			
		}

		if (correct == half) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
		
		
		
		
		
		
		
		
		// ===================================================================
			/*
			  if (i < (text_length/2)) { test_text = "" + text.charAt(i); } else {
			  test_text1 = "" + text.charAt(text_length-(i+1)); }
			 */
			
			/*
			if (test_text == test_text1) {
				System.out.println("PALINDROME");
			} else {
				System.out.println("NOT PALINDROME");
			}*/
		}
		
		
		/*
		for (int i=0; i<=text_length-1; i++) {
			if (text_length-1 == text.charAt(i)) {
				System.out.println("ok");
			}
		}
		*/

}












