package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class D07_CheckValidPhoneNumber {
	
	/*
	
		����ڷκ��� �Է¹��� ���ڿ��� �ڵ��� ��ȣ���� �����ϴ� ���α׷��� �������� 
	
	*/
	
	public static boolean phoneNumCheck(String num) {
		
		
		boolean result = true;
		char[] ch_num = num.toCharArray();
		
		String first_num = "";
		String integer_check = "";
		
		first_num = "" + ch_num[0] + ch_num[1] + ch_num[2];
		
//		int mid_size = ("" + ch_num[4] + ch_num[5] + ch_num[6] + ch_num[7]).length();
//		int last_size = ("" + ch_num[9] + ch_num[10] + ch_num[11] + ch_num[12]).length();
//		{"010", "011", "016", "017", "018"};
		
		integer_check = num.replace("-", "");

		char cc;
		int cnt = 0;
		
		boolean numeric = true;
		for (int i = 0; i < integer_check.length(); i++) {
			cc = integer_check.charAt(i);
			
			if (!(cc >= '0' && cc <= '9')) {
				numeric = false;
				break;
//				System.out.println(cc);		
			}
		}
		
		if (!numeric) {
			result = false;
			System.out.println("���ڿ� '-' �� ���� �ٸ� ���ڴ� �Է��� �� �����ϴ�.");
		}
		
		if (num.length() != 13) {
			result = false;
			System.out.println("'-'�� ������ �ڵ��� ��ȣ�� 11�ڸ� �Դϴ�");
		}
		
		if (ch_num[3] != '-' || ch_num[8] != '-' ) {
			result = false;
			System.out.println("�ڵ��� ��ȣ�� 4��°�� 9��° �ڸ����� '-'�� �Է����ּ���");
		}
		
		if (!(first_num.equals("010") || first_num.equals("011") || 
				first_num.equals("016") || first_num.equals("017") || first_num.equals("018"))) {
			result = false;
			System.out.println("�� ��ȣ 3�ڸ��� 010, 011, 016, 017, 018 �� �� �� �ֽ��ϴ�.");
		}
		
//		if (!(ch_num[2] == '0' || ch_num[2] == '1' || ch_num[2] == '6' || 
//				ch_num[2] == '7' || ch_num[2] == '8')) {
//			result = false;
//			System.out.println("�� ��ȣ 3�ڸ��� 010, 011, 016, 017, 018 �� �� �� �ֽ��ϴ�.");
//		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String num;
		
		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
		
		num = "041-5555-4343";
		
		phoneNumCheck(num); 
		
		if (!phoneNumCheck(num)) {
			System.out.println("�ڵ��� ��ȣ ���� ����!");
		} else {
			System.out.println("�ڵ��� ��ȣ ���� ����!");
		}
		
		
	}
}




















