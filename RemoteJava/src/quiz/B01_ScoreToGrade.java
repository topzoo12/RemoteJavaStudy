package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	
	/*
		
		������ �Է¹����� ������ �ش��ϴ� �˸��� ����� ������ִ� ���α׷��� ��������
		
		90�� �̻� : A
		80�� �̻� : B
		70�� �̻� : C
		60�� �̻� : D
		�� �� : F
		
		�� ��ȿ�� ������ 0 ~ 100�� �Դϴ�.
	
	*/
	
	public static void main(String[] args) {
		
		int grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		
		grade = sc.nextInt();
		/*
		if (grade >= 0 && grade <= 100 ) {
			if (grade >= 90 ) {
				System.out.println("A��� �Դϴ�");
			} else if (grade >= 80 ) {
				System.out.println("B��� �Դϴ�");
			} else if (grade >= 70 ) {
				System.out.println("C��� �Դϴ�");
			} else if (grade >= 60 ) {
				System.out.println("D��� �Դϴ�");
			} else {
				System.out.println("F��� �Դϴ�");
			}
		} else {
			System.out.println("������ ������ �ƴմϴ�.");
			System.out.println("0 ~ 100 ������ ������ �Է����ּ���.");
		}
		*/
		
		// �� �Է��� �޾��� ���� �߸��� ���� ���� �Ÿ��� ���� ����.
		
		if (grade < 0 || grade > 100 ) {
			System.out.println("������ ������ �ƴմϴ�.");
			System.out.println("0 ~ 100 ������ ������ �Է����ּ���.");
		} else if (grade < 60 ) {
			System.out.println("F��� �Դϴ�");
		} else if (grade < 70 ) {
			System.out.println("D��� �Դϴ�");
		} else if (grade < 80 ) {
			System.out.println("C��� �Դϴ�");
		} else if (grade < 90 ) {
			System.out.println("B��� �Դϴ�");
		} else {
			System.out.println("A��� �Դϴ�");
		}
		
	}
	
}












