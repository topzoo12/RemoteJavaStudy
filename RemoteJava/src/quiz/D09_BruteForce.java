package quiz;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class D09_BruteForce {
	
	/*
	
		# 비밀번호의 길이를 입력받으면 다음 문자로 만들 수 있는 모든 해당 길이의 비밀번호를 출력해보세요 
		
		 - 영어 대/소문자
		 - 숫자
		 - 특수문자 (shift누르고 숫자에 있는 것들만) !, @, #, $, %, ^, &, *
		 
		ex: 4 -> 0000 -> zzzz
		
		# 하나로 여러문자를 나타내는 것들
			
			 .  : 모든 문자
			 \d : 모든 숫자 [0-9]
			 \D : 숫자를 제외한 모든 것 [^0-9] 
			 \s : 모든 공백 (\t, \n, \r, ' ') 
			 \S : 공백을 제외한 모든 것
			 \w : 일반적인 문자들을 허용 [a-zA-z0-9]
			 \W : \w를 제외한 모든 것
		
		# 해당 패턴이 적용될 문자의 개수를 정의하는 방법
			 
			 [.]{n} : {}앞의 패턴이 n개 일치해야 한다.
			 [.]{n,m} : {}앞의 패턴이 최소 n개 최대 m개 일치해야 한다.
			 [.]{n,} : {}앞의 패턴이 최소 n개 이상 일치해야 한다
			 [.]? : ? 앞의 패턴이 0번 또는 한번 나와야 한다.
			 [.]+ : + 앞의 패턴이 최소 한번 이상 나와야 한다.
			 [.]* : * 앞의 패턴이 0번 이상 나와야 한다.
					([\\w]|[!@#$%^&*()]){}
	*/
	
	public static void main(String[] args) {
	
		String password = "asdfawef";
		
		String sp = "!@#$%^&*()";
		
		int len = password.length();
		
		char a = '0';
		char b = 'z';
		
		char[] c = sp.toCharArray();
		
		ArrayList<Integer> a1 = new ArrayList<>();
		
		System.out.println((int)a);
		System.out.println((int)b);
		System.out.println((int)'a');
		System.out.println("=====");
		
		for (int i = (int)0; i <= (int)9; i++ ) {
			a1.add(i);
		}
		for (int i = (int)'a'; i <= (int)'z'; i++ ) {
			a1.add(i);
		}
		for (int i = (int)'A'; i <= (int)'Z'; i++ ) {
			a1.add(i);
		}
		
		char ddd;
//		for (int i = 0; i < a1.size(); i++) {
//			System.out.println(a1.get(i).toString());
//		}
		
		
		
		
//		for (int i = 0; i < c.length; i++) {
//			System.out.println((int)c[i]);
//		}
		
//		for (int i = 0; i < password.length(); i++) {
//			for (int ii = 0; ) {
//				
//			}
//		}
		
		
		
//		for (int i = (int)a; i < (int)b; i++) {
//			System.out.print((char)i);
//		}
//		
//		0123456789
//		:;<=>?@
//		ABCDEFGHIJKLMNOPQRSTUVWXYZ
//		abcdefghijklmnopqrstuvwxy
//		[\]^_`
		
		
		
//		"([\\w]|[!@#$%^&*()]){1" + len + "}";
		
//		Pattern pattern = Pattern.compile("[\\w]{1," + len + "}");
		
//		while () {
//			
//		}
		
		
		
	}
}




















