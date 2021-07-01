package quiz;

import java.util.Scanner;

public class B09_31Game_teacher {

	public static void main(String[] args) {
			
		int turn = (int)(Math.random() * 2);
		int num = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		
		if (turn == 0) {
			System.out.println("컴퓨터 선공!");
		} else { 
			System.out.println("플레이어 선공");
		}
		
		while (num < 31) {
			
			if (turn == 0) {
				int com = (int)(Math.random() * 3 + 1);
				num += com;
				System.out.printf("컴퓨터 %d를 골랐습니다. [현재 숫자:%d]\n", com, num);
			}else {
				
				int user = 0;
				while (user < 1 || user > 3) {
					System.out.println("1, 2, 3? ");
					num += sc.nextInt();
				}
				num += user;
				
				System.out.printf("[현재 숫자:%d]\n", num);
			}
			// 턴은 0과 1만 반복되게 함
			turn = (turn + 1) % 2;
		}
		
		String winner = turn == 0 ? "컴퓨터" : "플레이어";		//	삼항 연산자
		System.out.printf("게임 종료! %s의 승리!", winner);
		
		//System.out.printf("게임 종료! %s의 승리!", turn == 0 ? "컴퓨터" : "플레이어");
		/*
		if (turn == 0) {
			System.out.println("게임 종료! 컴퓨터의 승리!");
		}else {
			System.out.println("게임 종료! 플레이어의 승리!");
		}
		 */
		

		
		
	}

}
