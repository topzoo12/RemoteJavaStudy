package quiz;

import java.util.Scanner;

public class B06_is_contain_alpha {
	
		/*
		 
		  1. ����ڰ� �Է��� ���ڿ���
		  	 ���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���
		  	 
		  2. ����ڰ� �Է��� ���ڿ��� ���ĺ����θ� �̷���� ������ true, �ƴϸ� false
		  
		  3. ����ڰ� ����� ���ڸ����� �̷���� ���ڿ��̶�� true, �ƴϸ� false
		     (����� ���ڿ� : ���ĺ� �ҹ���, ����, _, $, ù��° ���ڿ� ���� �Ұ�)
		  
		  4. ����ڰ� �Է��� ���ڿ��߿� ���Ե��� ���� ���ĺ����� ��� ����غ�����.
		  
		 */

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� ������ �Է��� �ּ��� > ");
		
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
