package quiz;

import java.util.Scanner;

public class B02_ChekWord {
	/*
	  	����ڷκ��� �ܾ �ϳ� �Է¹ް� 
	  	ù ��° ���ڰ� �����̸鼭 ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ����ϰ�
	  	��ġ���� ������ "NOT OK"�� ����غ�����	  	
	 */
	public static void main(String[] args) {
		
		String text;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ��� > ");
		text = sc.nextLine();
		
		int text_leng = text.length();
		
		
		if (text.charAt(0) != (text.charAt(text.length() - 1)))    {
			System.out.println("NOT OK");
		} else if (((text.charAt(0) >= 'a' && text.charAt(0) <= 'z') 
				|| (text.charAt(0) >= 'A' && text.charAt(0) <= 'Z')) ) {
			System.out.println("OK");
		} else {
			System.out.println("ù��° ���ڰ� ��� �ƴմϴ�.");
		}
		
		// ===========================================================================
		
		
		
		
		

	}

}
