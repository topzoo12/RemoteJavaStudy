package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {
		
	/*
	  	사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요 
	  	(switch-case문을 사용할 것)
	 */
	public static void main(String[] args) {
		
		int season;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 월인지 입력해주세요 > ");
		season = sc.nextInt();
		
		switch (season) {
		case 1:
			System.out.println("계절은 겨울입니다.");
			break;
		case 2:
			System.out.println("계절은 겨울입니다.");
			break;
		case 3:
			System.out.println("계절은 봄입니다.");
			break;
		case 4:
			System.out.println("계절은 봄입니다.");
			break;
		case 5:
			System.out.println("계절은 봄입니다.");
			break;
		case 6:
			System.out.println("계절은 여름입니다.");
			break;
		case 7:
			System.out.println("계절은 여름입니다.");
			break;
		case 8:
			System.out.println("계절은 여름입니다.");
			break;
		case 9:
			System.out.println("계절은 가을입니다.");
			break;
		case 10:
			System.out.println("계절은 가을입니다.");
			break;
		case 11:
			System.out.println("계절은 겨울입니다.");
			break;
		case 12:
			System.out.println("계절은 겨울입니다.");
			break;
		default :
			System.out.println("정확한 월을 입력해주세요");
		}

		//============================================================================
		
		int month;
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("몇 월인지 입력해주세요 > ");
		month = sc1.nextInt();
		
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("계절은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("계절은 겨울입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("계절은 가울입니다.");
			break;
		default :
			System.out.println("정확한 월을 입력해주세요");
		}

	}

}
