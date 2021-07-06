package quiz;

import java.util.ArrayList;

public class D09_dd {
	
	/*
	  
  		[abc]  : 해당 자리에 a 또는 b 또는 c만 허용
		[^abc] : 해당 자리에 abc를 제외한 모든 것을 허용
		[a-z]  : a부터 z까지 모두 허용 
		[A-Z]  : A부터 Z까지 모두 허용
		[\\-]  : 문자로서 -를 허용 (Escape)
		[a-e&&c-z] : a-e와 c-z를 모두 만족시키는 교집합
	
		# 하나로 여러문자를 나타내는 것들
		
		 .  : 모든 문자
		 \d : 모든 숫자 [0-9]
		 \D : 숫자를 제외한 모든 것 [^0-9] 
		 \s : 모든 공백 (\t, \n, \r, ' ') 
		 \S : 공백을 제외한 모든 것
		 \w : 일반적인 문자들을 허용 [a-zA-z0-9]
		 \W : \w를 제외한 모든 것
		 
		 
		 a-zA-z0-9
		 
*/

	
		public static void main(String[] args) {
			
			ArrayList<String> ha = new ArrayList<>();
			
			String password = "asd";
			
			String a = "";
			
			for (int i = (char)'a'; i <= (char)'z'; i++) {
				a = "" + (char)i;
				ha.add(a);
			}
			
			for (int i = (char)'A'; i <= (char)'Z'; i++) {
				a = "" + (char)i;
				ha.add(a);
			}
			
			for (int i = (char)'0'; i <= (char)'9'; i++) {
				a = "" + (char)i;
				ha.add(a);
			}
			ha.add("!");
			ha.add("@");
			ha.add("#");
			ha.add("$");
			ha.add("%");
			ha.add("^");
			ha.add("&");
			ha.add("*");
			ha.add("(");
			ha.add(")");
			
//			System.out.println(ha.get(ha.size()-1));
			
//			System.out.println(ha.size());
			
			for (int i = 0; i < ha.size(); i++) {
				System.out.print(ha.get(i));
			}
			System.out.println();
			System.out.println("======");
			
			int len = password.length();
			int cnt = 0;
			int cnt1 = 0;
			int cnt_result = 0;
			
//			System.out.println(Integer.toString('안', 2));
			System.out.println(len);
//			System.out.println(Arrays.toString("Hello".getBytes()));
//			System.out.println((Integer.parseInt(password)));
//			System.out.println(password);
//			System.out.println(password.charAt(0));
			System.out.println(ha.size());
			
//			System.out.println(password.charAt(len-1));
			
//			System.out.println(password.indexOf(len-1));
//			System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000".length());
			for (int i = 0; i < len; i++) {
				while (cnt < ha.size()) {
					while (cnt1 < len) {
//						System.out.print(ha.get(i));
						cnt1++;
						cnt_result++;
					}
					cnt1 = 0;
//					System.out.println("");
					cnt++;
				}
				cnt = 0;
//				System.out.println();
			}
			System.out.println(cnt_result);
			
//			for (int i = 0; i < password.length(); i++) {
//				for (int ii = 0; ii < ha.size(); ii++) {
//					while (cnt < len) {
//						System.out.println(a);
////						System.out.print(ii);
//						cnt++;
//					}
//					cnt = 0;
//					System.out.println();
//					
//				}
//			}
			
			
		}
}














