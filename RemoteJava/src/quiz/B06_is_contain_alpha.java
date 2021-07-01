package quiz;

import java.util.Scanner;

public class B06_is_contain_alpha {
	
		/*
		 
		  1. 사용자가 입력한 문자열에
		  	 알파벳이 포함되어 있으면 true를 출력, 없으면 false를 출력
		  	 
		  2. 사용자가 입력한 문자열이 알파벳으로만 이루어져 있으면 true, 아니면 false
		  
		  3. 사용자가 허락한 문자만으로 이루어진 문자열이라면 true, 아니면 false
		     (허락한 문자열 : 알파벳 소문자, 숫자, _, $, 첫번째 문자에 숫자 불가)
		  
		  4. 사용자가 입력한 문자열중에 포함되지 않은 알파벳들을 모두 출력해보세요.
		  
		 */

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 문장을 입력해 주세요 > ");
		
		String original = sc.nextLine();
		
		//String not_use = "";
		
		//String use_check = original.toUpperCase();
		
		boolean check = false;
		boolean text_type = true;
		
		boolean check3 = true;
		
		//String abc = "abcdefghijklnmopqrstuvwxyz";
		//String abc1 = "ABCDEFGHIJKLNMOPQRSTUVWXYZ";
		
		for (int i=0; i <original.length(); i++) {
			
			if ((original.charAt(i) >= 'a' && original.charAt(i) <= 'z') 
					|| (original.charAt(i) >= 'A' && original.charAt(i) <= 'Z')) {
				check = true;
				//break;
			} else {
				text_type = false;
			}
			
			
			/*else if (!(original.charAt(i) >= 'a' && original.charAt(i) <= 'z') 
					|| !(original.charAt(i) >= 'A' && original.charAt(i) <= 'Z')) {
				text_type = false;
			}
			if ((original.charAt(i) >= 'a' && original.charAt(i) <= 'z')
						|| (original.charAt(i) >= 'A' && original.charAt(i) <= 'Z')) {
				not_use += original.charAt(i);
			}*/
			
			char cc = original.charAt(i);
			char cc_first = original.charAt(0);
			
			 
			
			if ((cc_first >= '0' && cc_first <= '9')) {
				check3 = false;
				break;
			}else if ( (cc >= 'a' && cc <= 'z') ||  (cc == '_') || (cc == '$') || (cc >= '0' && cc <= '9') ) {
				
			}else {
				check3 = false;
			}
			
		}
		
		
		/*
		if (original.equals(not_use)) {
			text_type = true;
		}*/
				
		System.out.println("1. - " + check);
		System.out.println("2. - " + text_type);
		System.out.println("3. - " + check3);
		// ======================================================================
		
		

	}

}
