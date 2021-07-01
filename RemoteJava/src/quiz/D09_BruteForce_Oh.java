package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D09_BruteForce_Oh {
	//비밀번호의 길이를 입력받으면 다음 문자로 만들 수 있는 모든  해당 길이의 비밀번호를 출력해보세요.
	// 영어대소문자 숫자 특수문자 !@#$%^&*()
	
	private static ArrayList<Character> availableList = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호 길이를 입력하세요.>");
		int input = sc.nextInt();
		
		for(int i = '0'; i <= '9'; i++) {
			availableList.add((char)i);
		}
		for(int i = 'a'; i <= 'z'; i++) {
			availableList.add((char)i);
		}
		for(int i = 'A'; i <= 'Z'; i++) {
			availableList.add((char)i);
		}
		Collections.addAll(availableList, '!','@','#','$','%','^','&','*','(',')');
		
		char[] prevChars = new char[input-1];
		printAllAvailablePassword(prevChars, input);
	}

	private static void printAllAvailablePassword(char[] prevChars, int len) {
		for(int i =0, size = availableList.size(); i < size; i++) {
			if(len == 1) {
				for(int j = prevChars.length-1; j > -1; j--) {
					System.out.print(prevChars[j]);
				}
				System.out.println(availableList.get(i));
			} else {
				prevChars[len-2] = availableList.get(i);
				printAllAvailablePassword(prevChars, len-1);
			}
		}
	}
}