package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
	
	/*

		�ʸ� �Է¹����� ��/��/��/��/��/�ʷ� ��ȯ�Ͽ� ����غ�����
		
		�� ��, �ʿ���� ������ ������� �� �� 
		
		ex: 0�� 0�� 13�ð� 0�� 5���� ��� -> 13�ð� 0�� 5�ʸ� ���;� �� 

	 */
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ʸ� �Է����ּ��� > ");
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
			  System.out.print(year + "�� ");
		  }
		  if (day%365 >= 1 ) { 
			  System.out.print(day%365 + "�� ");
		  }
		  if (day_hour >= 1 ) { 
			  System.out.print(day_hour + "�ð� ");
		  }
		  if (hour_minute >= 1 ) { 
			  System.out.print(hour_minute + "�� ");
		  }
		  if (second%60 >= 1 ) { 
			 System.out.print(second%60 + "�� ");
		  }
		  System.out.println("");
		  
		  
		// =======================================================================
		// =======================================================================

		  
		  System.out.println("�ʸ� �Է����ּ��� > ");
		  int second1 = new Scanner(System.in).nextInt();
		  
		  int y = 0, d = 0, h = 0, m = 0, s = 0;
		  
		  final int SECOND_PER_YEAR = 365 * 24 * 60 * 60;
		  final int SECOND_PER_DAY = 24 * 60 * 60;
		  final int SECOND_PER_HOUR = 60 * 60;
		  final int SECOND_PER_MINUTE = 60;
		  
		  System.out.printf("'%d'�ʴ� ��ȯ�ϸ� : ", second);
		  
		  
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
			  System.out.print(y + "�� ");
			  exist = true;
		  }
		  if (d != 0 || exist) {
			  System.out.print(d + "�� ");
			  exist = true;
		  }
		  if (h != 0 || exist) {
			  System.out.print(h + "�ð� ");
			  exist = true;
		  }
		  if (m != 0 || exist) {
			  System.out.print(m + "�� ");
			  exist = true;
		  }
		  System.out.println(second1 + "�� ");

		  
		  
		  
		
			
	}

}


















