package quiz;

public class A09_ConditionQuiz {
	/*
	  [ 알맞은 비교연산을 만들어 보세요 ]
	  
	 	1. int형 변수 a가 10보다 크고 20보다 작을 때 true
	 	2. int형 변수 b가 짝수일 때 true
	 	3. int형 변수 c가 7의 배수일 때 true
	 	4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
	 	5. int형 변수 d와 e의 차이가 32일 때 true
	 	6. int형 변수 year가 400으로 나누어 떨어지거나
	 	   또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을때 true
	 	7. 민수가 철수보다 2살 많으면 true
	 	8. 민수가 철수보다 생일이 3달 빠르면 true
	 	9. boolean형 변수 powerOn이 false일 때 true
	 	10. 문자열 참조변수 str이 "yes"일 때 true

	 */
	
	
	public static void main(String[] args) {
		
		int a = 11;
		int b = 20;
		int c = 21;
		int d = 40;
		int e = 50;
		int hour = 999;
		int year = 2342;
		int minsu_age = 26;
		int chulsu_age = 24;
		int minsu_month = 5;
		int chulsu_month = 8;
		boolean powerOn = false;
		String str = "yes";
		
				
		System.out.println("1. " + (a > 10 && a < 20));
		System.out.println("2. " + (b%2 == 0));
		System.out.println("3. " + (c%7 == 0));
		//System.out.println("4. " + (!(hour < 0 && hour >= 24) && hour >= 12));
		//System.out.println("4. " + (!(hour <= 0 || hour >= 24) && hour >= 12));
		System.out.println("4. " + ((hour >= 0 && hour < 24) && hour >= 12));
		System.out.println("4. " + (hour < 24 && hour >= 12));
		System.out.println("5. " + (Math.abs(d-e) == 30));
		System.out.println("6. " + (year%400 == 0 || (year%4 == 0 && year%100 != 0) ));
		System.out.println("7. " + (minsu_age - chulsu_age == 2));
		System.out.println("8. " + (minsu_month - chulsu_month == -3));
		System.out.println("9. " + (!powerOn));
		System.out.println("10. " + (str == "yes"));
		
		// 타입명이 대문자로 시작하는 참조형 변수들은 반드시 .equals()를 이용해 비교해야 한다.
		System.out.println("10. " + (str.equals(str)));
		
		
		String str1 = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		
		
		// 참조형 변수의 == 비교는 두 변수가 서로 같은 주소를 지니고 있는지를 비교한다.
		System.out.println("str1 == \"yes\" : " + (str1 == "yes"));
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		
		// 타입명이 대문자로 시작하는 참조형 변수들은 반드시 .equals()를 이용해 비교해야 한다.
		System.out.println(str.equals("yes"));
		System.out.println(str.equals(str3));
		
		/* 
		  - 소문자로 시작하는 타입 변수들은 stack에 차곡차곡 쌓인다.
		  - 대문자로 시작하는 타입 변수들은 stack에는 주소값만 보관하고 실체는 heap에 존재한다
		  - 대문자로 시작하는 타입 변수에는 주소값이 저장되어 있고, 
		    거기에 .을 찍고 실제 데이터를 참조할 수 있다.
		
		*/
		
	}
}













