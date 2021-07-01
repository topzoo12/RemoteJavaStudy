package quiz;

import java.util.Scanner;

public class B02_ChekWord {
	/*
	  	사용자로부터 단어를 하나 입력받고 
	  	첫 번째 글자가 영어이면서 마지막 번째 글자가 일치하면 "OK"를 출력하고
	  	일치하지 않으면 "NOT OK"를 출력해보세요	  	
	 */
	public static void main(String[] args) {
		
		String text;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요 > ");
		text = sc.nextLine();
		
		int text_leng = text.length();
		
		
		if (text.charAt(0) != (text.charAt(text.length() - 1)))    {
			System.out.println("NOT OK");
		} else if (((text.charAt(0) >= 'a' && text.charAt(0) <= 'z') 
				|| (text.charAt(0) >= 'A' && text.charAt(0) <= 'Z')) ) {
			System.out.println("OK");
		} else {
			System.out.println("첫번째 글자가 영어가 아닙니다.");
		}
		
		// ===========================================================================
		
		
		
		
		

	}

}
