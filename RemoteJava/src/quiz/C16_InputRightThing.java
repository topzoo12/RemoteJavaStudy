package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {
	
	/*
	 	
	 	����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹����� ���� ��� �Է¹޴� ���α׷��� ����� ������.
	 	(�ٸ� Ÿ���� ���� �ԷµǾ ���α׷��� �������� ���� �ʾƾ� �մϴ�.)
	  
	 */
	
	public static void main(String[] args) {
		
		boolean end = true;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		
		// ��ĳ�ʿ��� �߸��� �Է��� �ϸ� ��Ⱑ �����ְ� �ȴ�.
		// num = sc.nextInt();
		
		while (end) {
			
			try {
				num = sc.nextInt();
				System.out.println(num);
				System.out.println("����!");
				break;
			} catch (InputMismatchException e) {
				System.out.println("����� �� ���ڷ� �ٽ� �Է����ּ���!");
				System.out.println("�߸� �Է� �ƴ� �� : " + sc.nextLine());
			}
			
		}
		System.out.println("3==----");
	}
	

}









