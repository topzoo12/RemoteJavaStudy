package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {

	public static void main(String[] args) {
		
		/*
		 	[ 알맞은 조건식을 만들어보세요 ]
		  	
		  	  1. char형 변수 a가 'q'또는 'Q'일 때 true
		  	  2. char형 변수 b가 공백이나 탭이 아닐 때 true  
		  	  3. char형 변수 c가 문자 ('0' ~ '9')일 때 true
		  	  4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
		  	  
		  	  ※ 유니코드 표 검색 
		  	  
		  	  5. char형 변수 e가 한글일 때 true
		  	  6. char형 변수 f가 일본어일 때 true
		  	  
		  	  7. 사용자가 입력한 문자열이 exit일 때 true
		  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		char a = 's';
		char b = 'e';
		char c = 'D';
		char d = 'D';
		char e = '가';
		char f = 'ぁ';
		
//		System.out.println((int)'q' + "   " +  (int)'Q');
		System.out.println("1. " + ((int)a == 113 || (int)a == 81 ));
		
//		System.out.println((int)' ' + "   " +  (int)'\t');
		System.out.println("2. " + !((int)b == 32 || (int)b == 9));

		System.out.println("3. " + ((int)c >= 48 && (int)c <= 57 ));
		System.out.println("4. " + (((int)d >= 65 && (int)d <= 90 ) || (int)d >= 97 && (int)d <= 122 ));
		System.out.println("5. " + (Character.getType(e) == 5));
		System.out.println("6. " + (Character.getType(f)));
		
		System.out.println("7. " + (Character.getType(f)));
		
		System.out.println();
//		System.out.println((char)80);
//		System.out.println((char)80);
//		System.out.println("4. " + (d == '' || d == '' ));
		
		System.out.println("--------------------------------");
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		System.out.println("2. " + (b != ' ' && a != '\t'));
		System.out.println("3. " + (c >= '0' && c <= '9'));
		System.out.println("4. " + ((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z')));
		System.out.println("5. " + (e >= '가' && e <= '힣'));
		System.out.println("6. " + ((f >= 0x3041 && f <= 0x3096) || (f >= 0x30A1 && f <= 0x30FF)));
		
		String txt = sc.nextLine();
		System.out.println("7. " + (txt.equals("exit")));
//		System.out.println((char)0x3041);
		
		
		System.out.println("--------------------------------");
/*		
		String str = "dasjfl1ie ^&amp;*으샤으샤 ㅁㄴ"; 
		
		for(int i=0;i<str.length();i++){    

			System.out.println(str.charAt(i));
		if(Character.getType(str.charAt(i)) == 5) 
		System.out.print("이건한글이넹 :: ");
		
		System.out.println(str.charAt(i));
		
		}
*/		
		
		/*		
		System.out.println((int)'0');
		System.out.println((int)'1');
		System.out.println((int)'2');
		System.out.println((int)'3');
		System.out.println((int)'9');

		System.out.println((int)'a');
		System.out.println((int)'z');
		System.out.println("-----");
		System.out.println((int)'A');
		System.out.println((int)'Z');
	
		System.out.println((int)'ㄱ');
		System.out.println((int)'ㄴ');
		System.out.println((int)'ㅎ');
		
		System.out.println((int)'가');
*/	
		
		
		
		
	}
	
}
