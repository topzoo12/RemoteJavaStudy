package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {
		
	/*
	  	����ڷκ��� ���� �Է¹����� �ش��ϴ� ������ ����غ����� 
	  	(switch-case���� ����� ��)
	 */
	public static void main(String[] args) {
		
		int season;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �Է����ּ��� > ");
		season = sc.nextInt();
		
		switch (season) {
		case 1:
			System.out.println("������ �ܿ��Դϴ�.");
			break;
		case 2:
			System.out.println("������ �ܿ��Դϴ�.");
			break;
		case 3:
			System.out.println("������ ���Դϴ�.");
			break;
		case 4:
			System.out.println("������ ���Դϴ�.");
			break;
		case 5:
			System.out.println("������ ���Դϴ�.");
			break;
		case 6:
			System.out.println("������ �����Դϴ�.");
			break;
		case 7:
			System.out.println("������ �����Դϴ�.");
			break;
		case 8:
			System.out.println("������ �����Դϴ�.");
			break;
		case 9:
			System.out.println("������ �����Դϴ�.");
			break;
		case 10:
			System.out.println("������ �����Դϴ�.");
			break;
		case 11:
			System.out.println("������ �ܿ��Դϴ�.");
			break;
		case 12:
			System.out.println("������ �ܿ��Դϴ�.");
			break;
		default :
			System.out.println("��Ȯ�� ���� �Է����ּ���");
		}

		//============================================================================
		
		int month;
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("�� ������ �Է����ּ��� > ");
		month = sc1.nextInt();
		
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("������ �ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("������ �ܿ��Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("������ �����Դϴ�.");
			break;
		default :
			System.out.println("��Ȯ�� ���� �Է����ּ���");
		}

	}

}
