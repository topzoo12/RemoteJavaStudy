package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {

	public static void main(String[] args) {
		
		/*
		 	[ �˸��� ���ǽ��� �������� ]
		  	
		  	  1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
		  	  2. char�� ���� b�� �����̳� ���� �ƴ� �� true  
		  	  3. char�� ���� c�� ���� ('0' ~ '9')�� �� true
		  	  4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
		  	  
		  	  �� �����ڵ� ǥ �˻� 
		  	  
		  	  5. char�� ���� e�� �ѱ��� �� true
		  	  6. char�� ���� f�� �Ϻ����� �� true
		  	  
		  	  7. ����ڰ� �Է��� ���ڿ��� exit�� �� true
		  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		char a = 's';
		char b = 'e';
		char c = 'D';
		char d = 'D';
		char e = '��';
		char f = '��';
		
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
		System.out.println("5. " + (e >= '��' && e <= '�R'));
		System.out.println("6. " + ((f >= 0x3041 && f <= 0x3096) || (f >= 0x30A1 && f <= 0x30FF)));
		
		String txt = sc.nextLine();
		System.out.println("7. " + (txt.equals("exit")));
//		System.out.println((char)0x3041);
		
		
		System.out.println("--------------------------------");
/*		
		String str = "dasjfl1ie ^&amp;*�������� ����"; 
		
		for(int i=0;i<str.length();i++){    

			System.out.println(str.charAt(i));
		if(Character.getType(str.charAt(i)) == 5) 
		System.out.print("�̰��ѱ��̳� :: ");
		
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
	
		System.out.println((int)'��');
		System.out.println((int)'��');
		System.out.println((int)'��');
		
		System.out.println((int)'��');
*/	
		
		
		
		
	}
	
}
