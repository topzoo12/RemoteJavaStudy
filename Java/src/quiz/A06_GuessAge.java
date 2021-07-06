package quiz;
import java.util.Scanner;

public class A06_GuessAge {
	
	/*
	  사용자로부터 태어난 해와 올해의 년도를 입력받으면 
	  그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어 보세요 
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("올해는 몇년도 인가요?!(4자리 숫자만 입력하세요)");
		
		int now_year = sc.nextInt();
		
		System.out.println("당신이 태어난해는 언제 인가요?!(4자리 숫자만 입력하세요)");

		int you_year = sc.nextInt();
		
		System.out.println("당신의 나이는 " + ((now_year - you_year) + 1) + "살 입니다." );
		
		
	}
	
}
