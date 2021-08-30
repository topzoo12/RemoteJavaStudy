package test;

import java.util.Scanner;

public class strike {
	
	static int life = 8;
	static int homerun_int;
	static String homerun = "";
	static String my_num;
	
	static boolean pass = true;
	static boolean check = true;
	
	public strike() {
		
		int homerun_num_count = 0;
		boolean homerun_num_check = true;
		
		while (homerun_num_check) {
			
			homerun_int = (int)(Math.random() * 9);
			
			if (homerun_int == 0 && !(homerun.contains(""+homerun_int))) { 
				homerun += "0";
			} else if (!(homerun.contains(""+homerun_int))){
				homerun = homerun + homerun_int;
			}
			
			if (homerun.length() == 4) {
				homerun_num_check = false;
			}

		}
		
	}
	
	public static void play() {
		Scanner sc = new Scanner(System.in);
		
		while(check) {
			if (life == 0) {
				System.out.println("남은 기회가 없습니다. 게임 종료");
				break;
			}
			System.out.println();
			System.out.println("4자리의 숫자를 입력해주세요 남은기회 : " + life);
			my_num = sc.nextLine();
			String[] word = my_num.split("");
			
			int my_num_err_check = 4;
			boolean string_num_check = false; 
			
			if (word.length > 4) {
				System.out.println("입력하신 숫자는 4자리를 초과합니다. 4자리를 입력해주세요");
			} else if (word.length < 4) {
				System.out.println("입력하신 숫자는 4자리 미만습니다. 4자리를 입력해주세요");
			} else if (word.length == 4) {
				
				for (int i = 0; i < word.length; i++) {
					
					char ch = my_num.charAt(i);
					
					if (!(ch >= '0' && ch <= '9')) {
						string_num_check = true;
						System.out.println("입력하신 값에 숫자가 아닌 값이 포함되어 있습니다. 다시 입력해주세요");
					}
				}
				
				if (string_num_check == false) {
					result_check();
				} 
			}
			
		}

		
	}
	public static void result_check() {
		
		String[] goal = homerun.split("");
		String[] my = my_num.split("");
		
		int strike_num = 0;
		int ball_num = 0;
		
		for (int i = 0; i < goal.length; i++) {
			if (goal[i].equals(my[i])) {
				strike_num++;
			} else {
				ball_num++;
			}
		}
		
		System.out.print("my_num : " + my_num );
		if (strike_num > 0) {
			System.out.print(" " + strike_num + "-Strike ");
			if (strike_num == 4) {
				System.out.println("입니다. 게임종료");
				check = false;
			}
		} 
		
		if (ball_num > 0) {
			System.out.print(" " + ball_num + "-ball_num ");
			life--;
		}
		
	}
	
	public static void main(String[] args) {
		strike p = new strike();
			play();
	}
}
