package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D09_BruteForce_Oh {
	//��й�ȣ�� ���̸� �Է¹����� ���� ���ڷ� ���� �� �ִ� ���  �ش� ������ ��й�ȣ�� ����غ�����.
	// �����ҹ��� ���� Ư������ !@#$%^&*()
	
	private static ArrayList<Character> availableList = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��й�ȣ ���̸� �Է��ϼ���.>");
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