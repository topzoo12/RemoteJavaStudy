package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	
	/*
		
		점수를 입력받으면 점수에 해당하는 알맞은 등급을 출력해주는 프로그램을 만들어보세요
		
		90점 이상 : A
		80점 이상 : B
		70점 이상 : C
		60점 이상 : D
		그 외 : F
		
		※ 유효한 점수는 0 ~ 100점 입니다.
	
	*/
	
	public static void main(String[] args) {
		
		int grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		
		grade = sc.nextInt();
		/*
		if (grade >= 0 && grade <= 100 ) {
			if (grade >= 90 ) {
				System.out.println("A등급 입니다");
			} else if (grade >= 80 ) {
				System.out.println("B등급 입니다");
			} else if (grade >= 70 ) {
				System.out.println("C등급 입니다");
			} else if (grade >= 60 ) {
				System.out.println("D등급 입니다");
			} else {
				System.out.println("F등급 입니다");
			}
		} else {
			System.out.println("유요한 점수가 아닙니다.");
			System.out.println("0 ~ 100 사이의 점수를 입력해주세요.");
		}
		*/
		
		// ※ 입력을 받았을 때는 잘못된 값을 먼저 거르는 것이 좋다.
		
		if (grade < 0 || grade > 100 ) {
			System.out.println("유요한 점수가 아닙니다.");
			System.out.println("0 ~ 100 사이의 점수를 입력해주세요.");
		} else if (grade < 60 ) {
			System.out.println("F등급 입니다");
		} else if (grade < 70 ) {
			System.out.println("D등급 입니다");
		} else if (grade < 80 ) {
			System.out.println("C등급 입니다");
		} else if (grade < 90 ) {
			System.out.println("B등급 입니다");
		} else {
			System.out.println("A등급 입니다");
		}
		
	}
	
}












