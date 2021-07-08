package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {

		
		/*
		  	사용자로부터 문장을 하나 입력받고 
		  	해당 문장에 어떤 알파벳이 몇번 등장했는지 세어서 모두 출력해보세요
		  	(대소문자도 구분할 것)
		  
		 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("텍스트를 입력해주세요 > ");
		//String text = sc.nextLine();
		
		String text = "AaabbBccCCddddDD";
		char[] ch_text = text.toCharArray();
		char[] ch_text1 = new char[ch_text.length];

				
		int cnt = 0;
		/*
		for (int i = 0; i < ch_text.length; i++) {

			cnt = 0;
			
			for (int y = 0; y < ch_text.length; y++) {
				
				if ((ch_text[i] == ch_text[y]) ) {
					ch_text1[i] = ch_text[y];
					cnt++;
				} 
				System.out.println("두번째 array : " + ch_text1[y]);
			}
			System.out.println(ch_text[i] + " : " + cnt);
		}
		
		// ================================================================
		
		//final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		int[] symbol_count = new int[SYMBOLS.length()];
		
		// Common sense is not so common.
		for (int i = 0, len = text.length(); i < len; i++) {
			
			char ch = text.charAt(i);
			System.out.println("이번에 검사할 문자는 '" + ch + "'입니다.");
			
			for (int j = 0, len2 = SYMBOLS.length(); j < len2; j++) {
				if (ch == SYMBOLS.charAt(j)) {
					symbol_count[j]++;
					System.out.println("'" + ch + "'는 SYMBOLS의 " + j + "번째에 있으므로 symbol_count의 " + j + "번째 값을 증가시킵니다.");
					break;
				}
			}
			
			
			//System.out.println(ch_text[i] + " : " + cnt);
		}*/
		
		// ======================================================================
		
		int[] lowercount = new int[26];
		int[] uppercount = new int[26];
		
		for (int i = 0, len = text.length(); i < len; i++) {
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				lowercount[ch - 'a']++;
			}else if (ch >= 'A' && ch <= 'Z') {
				uppercount[ch - 'A']++;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.printf("대문자 %c는 %d번 등장했습니다.\n", 'A' + i, uppercount[i]);
			System.out.printf("대문자 %c는 %d번 등장했습니다.\n", 'a' + i, lowercount[i]);
		}
		

	}

}








