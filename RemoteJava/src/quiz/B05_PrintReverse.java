package quiz;

import java.util.Scanner;

public class B05_PrintReverse {

	public static void main(String[] args) {
		
		// ����ڰ� � ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� ������ �Է��� �ּ��� > ");
		
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
