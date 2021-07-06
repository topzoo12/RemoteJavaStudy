package quiz;

import java.util.Scanner;

public class B09_31Game {
		
			/*
				
				# 31게임을 만들어보세요
				
				1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택해야 한다.
				   (1, 2, 3 밖에 선택할 수 없음)
				   
				2. 컴퓨터는 랜덤으로 숫자를 선택한다
				  
				3. 선공은 랜덤으로 결정한다.
				
				4. 마지막에 31 이상의 숫자를 부르는 플레이어가 패배한다.
	
			*/

	public static void main(String[] args) {
		
		int nujuck = 0;
		
		int com = 0;
		
		boolean check = true;
				
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("숫자를 입력해주세요 > ");
		
		int my_num; 
		
		int start = (int)(Math.random() * 2 + 1);
		
		//if (start == 1) {
			
			//System.out.println("1~3 까지의 숫자를 입력해주세요 > ");
			
			
		while (nujuck < 31) {
			my_num = 0;
			System.out.println(start);
			
			if (start == 1) { 
				com = (int)(Math.random() * 3 + 1);
				System.out.println("컴퓨터 : " + com);
				nujuck += com;
				start += 1;
			}
			
			if (nujuck > 1) {
				System.out.println("플레이어 턴 1~3까지의 숫자를 입력하세요> ");
			}
			
			my_num = sc.nextInt();
			
			System.out.println("마지막 숫자 : " + nujuck);
			
			while (check) {
				if (my_num > 3 || my_num <= 0) {
					System.out.println("선택할 수 있는 숫자의 범위는 +3까지 입니다. 다시 입력해주세요> ");
					my_num = sc.nextInt();
				}else {
					nujuck += my_num;
					check = false;
				}
			}
			if (nujuck >= 31) {
				System.out.println("컴퓨터 승리");
				break;
			}
			
			System.out.println("현재의 숫자 : " + nujuck);
			
			com = (int)(Math.random() * 3 + 1);
			System.out.println("컴퓨터 : " + com);
			nujuck += com;
			if (nujuck >= 31) {
				System.out.println("플레이어 승리");
				break;
			}
			System.out.println("여기까지는 : " + nujuck);
			
			check = true;
		}
			
	//	}else {
	//		System.out.println("dd");
	//		
	//	}
		
		
		
		
		//System.out.println((i+1) + "번째 : " + (int)(Math.random() * 45 + 1));
		
		
		
	}

}













