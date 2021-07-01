package quiz;

import java.util.Scanner;

public class D09_BruteForce_beck {

	public static String pw = "abcdeefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
	public static int cnt = pw.length();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len; // 입력받는 비밀번호 길이.

		System.out.print("how long? ");
		len = sc.nextInt();
		// System.out.println("length: " + len);

		int[] count = new int[len]; // 길이별 몇 번째 글자를 출력할지 저장해두는 배열.
		boolean[] check = new boolean[len]; // 3자리 이상일 때 이전 자리수가 전전자리수가 바뀔때까지 계속 0으로 나누어 떨어지니까.. 체크해주는 용.

		while (count[0] != cnt) {
			for (int i = 0; i < len; i++) {
				System.out.print(pw.charAt(count[i] % cnt));
			}
			System.out.print("\n");

			count[len - 1]++;
			for (int j = len - 2; j >= 0; j--) {
				if (count[j + 1] != 0 && count[j + 1] % cnt == 0 && check[j] == false) {
					count[j]++;
					check[j] = true;
				} else if (count[j + 1] != 0 && count[j + 1] % cnt != 0 && check[j] == true) {
					check[j] = false;
				}
			}
		}
	}
}