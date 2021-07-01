package quiz;

import java.util.Scanner;

public class B05_PrintReverse {

	public static void main(String[] args) {
		
		// 사용자가 어떤 문장을 입력하면 그 문장을 거꾸로 출력해보세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 문장을 입력해 주세요 > ");
		
		String text = sc.nextLine();
		
		System.out.println(text);
		
		int text_length = text.length();
		
		/*
		int a = text_length;
		
		for (int i=0; i <= text_length; i++ ) {
			if (a-(i+1) != -1) {
				System.out.println(text.charAt(a-(i+1)));
			}
		}*/
		
		// =========================================================
		//System.out.print(a);
		for (int i=1; i <= text_length; i++ ) {
			System.out.print(text.charAt(text_length-i));
		}
		
		System.out.println("");
		for (int i = text_length-1; i > -1; --i) {
			System.out.print(text.charAt(i));
		}

	}

}
