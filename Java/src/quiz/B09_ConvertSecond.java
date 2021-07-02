package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
	
	/*

		초를 입력받으면 년/일/시/간/분/초로 변환하여 출력해보세요
		
		※ 단, 필요없는 단위는 출력하지 말 것 
		
		ex: 0년 0일 13시간 0분 5초인 경우 -> 13시간 0분 5초만 나와야 함 

	 */
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("초를 입력해주세요 > ");
		//int second = sc.nextInt();
		int second = 86405;
		
		int minute = second/60;
		int hour = second/60/60;
		int hour_minute = second/60%60;
		int day = (second/60)/60/24;
		int day_hour = (second/60)/60%24;
		int year = day/365;
		int year_day = day%365;
		
		  if (day/365 >= 1) {
			  System.out.print(year + "년 ");
		  }
		  if (day%365 >= 1 ) { 
			  System.out.print(day%365 + "일 ");
		  }
		  if (day_hour >= 1 ) { 
			  System.out.print(day_hour + "시간 ");
		  }
		  if (hour_minute >= 1 ) { 
			  System.out.print(hour_minute + "분 ");
		  }
		  if (second%60 >= 1 ) { 
			 System.out.print(second%60 + "초 ");
		  }
		  System.out.println("");
		  
		  
		// =======================================================================
		// =======================================================================

		  
		  System.out.println("초를 입력해주세요 > ");
		  int second1 = new Scanner(System.in).nextInt();
		  
		  int y = 0, d = 0, h = 0, m = 0, s = 0;
		  
		  final int SECOND_PER_YEAR = 365 * 24 * 60 * 60;
		  final int SECOND_PER_DAY = 24 * 60 * 60;
		  final int SECOND_PER_HOUR = 60 * 60;
		  final int SECOND_PER_MINUTE = 60;
		  
		  System.out.printf("'%d'초는 변환하면 : ", second);
		  
		  
		  y = second1 / SECOND_PER_YEAR;
		  second1 %= SECOND_PER_YEAR;
		  
		  d = second1 / SECOND_PER_DAY;
		  second1 %= SECOND_PER_DAY;
		  
		  h = second1 / SECOND_PER_HOUR;
		  second1 %= SECOND_PER_HOUR;
		  
		  m = second1 / SECOND_PER_MINUTE;
		  second1 %= SECOND_PER_MINUTE;
		  
		  boolean exist = false;
		  
		  if (y != 0) {
			  System.out.print(y + "년 ");
			  exist = true;
		  }
		  if (d != 0 || exist) {
			  System.out.print(d + "일 ");
			  exist = true;
		  }
		  if (h != 0 || exist) {
			  System.out.print(h + "시간 ");
			  exist = true;
		  }
		  if (m != 0 || exist) {
			  System.out.print(m + "분 ");
			  exist = true;
		  }
		  System.out.println(second1 + "초 ");

		  
		  
		  
		
			
	}

}


















