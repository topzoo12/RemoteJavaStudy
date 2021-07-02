import java.util.regex.Pattern;

public class D09_Regex {
	
	/*
		
		# 정규표현식 ( Regular Expression )  
		 
		 - 문자열의 패턴을 표현할 수 있는 표현식
		 - 특정 프로그래밍 언어에 종속되지 않는 공통의 규칙이다.
		 - 정의한 문자열 패턴과 일치하는 문자열을 걸러낼 수 있다.
		 
		# Java에서 정규표현식을 다룰 때 사용하는 클래스 
		
		 - Pattern
		 - Matcher
	  
	
	*/

	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input이 regex에 일치하는지 여부를 검사
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의하는 표현식
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[lh@a]eep", "saeep"));
		System.out.println(Pattern.matches("s[l@]ee[abcdefghijk]", "sleek"));
		System.out.println(Pattern.matches("s[l@]ee[abcdefghijkABCDEFG]", "sleeK"));
		
		/*
		
			[abc]  : 해당 자리에 a 또는 b 또는 c만 허용
			[^abc] : 해당 자리에 abc를 제외한 모든 것을 허용
			[a-z]  : a부터 z까지 모두 허용 
			[A-Z]  : A부터 Z까지 모두 허용
			[\\-]  : 문자로서 -를 허용 (Escape)
			[a-e&&c-z] : a-e와 c-z를 모두 만족시키는 교집합
		
		*/
		
		String temp = "1234";
		
		System.out.println("1 : " + Pattern.matches("s[A-Z]eep", "sAeep"));
		System.out.println("2 : " + Pattern.matches("s[A\\-Z]eep", "sAeep"));
		System.out.println("3 : " + Pattern.matches("s[A\\-Z]eep", "sBeep"));
		System.out.println("4 : " + Pattern.matches("s[A\\-Z]eep", "sCeep"));
		System.out.println("5 : " + Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println("6 : " + Pattern.matches("s[A\\-Z]eep", "sZeep"));
		System.out.println("7 : " + Pattern.matches("s[a-e&&c-z]eep", "s eep"));
		System.out.println("8 : " + Pattern.matches("s[" + temp + "]eep", "s1eep"));
		
		/*
		
			# 하나로 여러문자를 나타내는 것들
			
			 .  : 모든 문자
			 \d : 모든 숫자 [0-9]
			 \D : 숫자를 제외한 모든 것 [^0-9] 
			 \s : 모든 공백 (\t, \n, \r, ' ') 
			 \S : 공백을 제외한 모든 것
			 \w : 일반적인 문자들을 허용 [a-zA-z0-9]
			 \W : \w를 제외한 모든 것
			 
		*/
		
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		
		/*
		
			# 해당 패턴이 적용될 문자의 개수를 정의하는 방법
			 
			 [.]{n} : {}앞의 패턴이 n개 일치해야 한다.
			 [.]{n, m} : {}앞의 패턴이 최소 n개 최대 m개 일치해야 한다.  
		
		*/
		
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", ".abs."));
	}
	
}























