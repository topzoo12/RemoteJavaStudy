package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class D07_CheckValidPhoneNumber {
	
	/*
	
		사용자로부터 입력받은 문자열이 핸드폰 번호인지 구분하는 프로그램을 만들어보세요 
	
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
			System.out.println("숫자와 '-' 이 외의 다른 문자는 입력할 수 없습니다.");
		}
		
		if (num.length() != 13) {
			result = false;
			System.out.println("'-'를 제외한 핸드폰 번호는 11자리 입니다");
		}
		
		if (ch_num[3] != '-' || ch_num[8] != '-' ) {
			result = false;
			System.out.println("핸드폰 번호의 4번째와 9번째 자리에는 '-'를 입력해주세요");
		}
		
		if (!(first_num.equals("010") || first_num.equals("011") || 
				first_num.equals("016") || first_num.equals("017") || first_num.equals("018"))) {
			result = false;
			System.out.println("앞 번호 3자리는 010, 011, 016, 017, 018 만 들어갈 수 있습니다.");
		}
		
//		if (!(ch_num[2] == '0' || ch_num[2] == '1' || ch_num[2] == '6' || 
//				ch_num[2] == '7' || ch_num[2] == '8')) {
//			result = false;
//			System.out.println("앞 번호 3자리는 010, 011, 016, 017, 018 만 들어갈 수 있습니다.");
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
			System.out.println("핸드폰 번호 인증 실패!");
		} else {
			System.out.println("핸드폰 번호 인증 성공!");
		}
		
		
	}
}




















