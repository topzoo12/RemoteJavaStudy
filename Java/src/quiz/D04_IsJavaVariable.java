package quiz;

import java.util.Scanner;

public class D04_IsJavaVariable {

	/*
	
		사용자로부터 문자열을 입력받으면 해당 문자열이 자바의 변수로써 사용될 수 있는지 
		검사하는 메서드를 만들고 테스트 해보세요
	
	*/
	
	public static void main(String[] args) {
		
		String check_txt;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("변수명으로 사용할 문자열을 입력해주세요 > ");
		check_txt = sc.nextLine(); 
		textCheck(check_txt);
		
	}
	
	public static String textCheck(String txt){
		
		int numCheck = 0;
		int specialTxtCheck = 0;
		
		if (Character.isDigit(txt.charAt(0))) {
//			System.out.println("변수명으로 사용할 수 없습니다.");
			System.out.println("변수명은 숫자로 시작할 수 없습니다");
		}
		
		for (int i = 0; i < txt.length(); i++) {
			char ch = txt.charAt(i);
		
			if (Character.isDigit(ch)) {
				numCheck++;
			} else if (!(Character.isLowerCase(ch) || Character.isUpperCase(ch) || ch == '_' || ch == '$')) {
				specialTxtCheck++;
			}
		}
		
		if (Character.isDigit(txt.charAt(0))) {
			System.out.println("변수명은 숫자로 시작할 수 없습니다.");
		}
		
		if (numCheck == txt.length()) {
			System.out.println("변수명은 숫자만으로 이루어질 수 없습니다.");
		}
		if (specialTxtCheck > 1) {
			System.out.println("'_', '$' 이외의 특수문자는 변수명에 포함될 수 없습니다.");
		}
		
		return txt;
	}
	
	
	
	
	
}












