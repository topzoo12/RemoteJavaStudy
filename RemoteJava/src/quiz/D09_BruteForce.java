package quiz;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class D09_BruteForce {
	
	/*
	
		# ��й�ȣ�� ���̸� �Է¹����� ���� ���ڷ� ���� �� �ִ� ��� �ش� ������ ��й�ȣ�� ����غ����� 
		
		 - ���� ��/�ҹ���
		 - ����
		 - Ư������ (shift������ ���ڿ� �ִ� �͵鸸) !, @, #, $, %, ^, &, *
		 
		ex: 4 -> 0000 -> zzzz
		
		# �ϳ��� �������ڸ� ��Ÿ���� �͵�
			
			 .  : ��� ����
			 \d : ��� ���� [0-9]
			 \D : ���ڸ� ������ ��� �� [^0-9] 
			 \s : ��� ���� (\t, \n, \r, ' ') 
			 \S : ������ ������ ��� ��
			 \w : �Ϲ����� ���ڵ��� ��� [a-zA-z0-9]
			 \W : \w�� ������ ��� ��
		
		# �ش� ������ ����� ������ ������ �����ϴ� ���
			 
			 [.]{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�.
			 [.]{n,m} : {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�.
			 [.]{n,} : {}���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�
			 [.]? : ? ���� ������ 0�� �Ǵ� �ѹ� ���;� �Ѵ�.
			 [.]+ : + ���� ������ �ּ� �ѹ� �̻� ���;� �Ѵ�.
			 [.]* : * ���� ������ 0�� �̻� ���;� �Ѵ�.
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




















