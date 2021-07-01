package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {
	
	/*
	 	
	 	사용자로부터 숫자를 입력받되 숫자를 제대로 입력받을때 까지 계속 입력받는 프로그램을 만들어 보세요.
	 	(다른 타임의 값이 입력되어도 프로그램이 강제종료 되지 않아야 합니다.)
	  
	 */
	
	public static void main(String[] args) {
		
		boolean end = true;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		
		// 스캐너에는 잘못된 입력을 하면 찌꺼기가 남아있게 된다.
		// num = sc.nextInt();
		
		while (end) {
			
			try {
				num = sc.nextInt();
				System.out.println(num);
				System.out.println("성공!");
				break;
			} catch (InputMismatchException e) {
				System.out.println("제대로 된 숫자로 다시 입력해주세요!");
				System.out.println("잘못 입력 됐던 것 : " + sc.nextLine());
			}
			
		}
		System.out.println("3==----");
	}
	

}









