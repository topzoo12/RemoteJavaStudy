<<<<<<< HEAD
package quiz;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class D11_DiscountDay {
	
	/*
		어떤 옷가게에서 할인 행사를 짝수번째 목요일마다 진행한다고 한다.
		년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해주는 프로그램을 만들어보세요
	*/
	
	public static void main(String[] args) {
		
		int to_year = 2021;
		
		Calendar sale = Calendar.getInstance();
		
//		LocalDate check = sale.minusYears(to_year);
		
		sale.set(sale.YEAR, to_year);
		sale.set(sale.MONTH, 0);
		sale.set(sale.DATE, 1);
//		sale.set(sale.DAY_OF_WEEK, 0);
		
		int dd = 1;

//		for (int i = 0; i <= 11; i++) {
//			sale.set(sale.MONTH, i);
//			for (int y = 1; y <= 31; y++) {
//				sale.set(sale.DATE, y);
//				
//				if (sale.get(sale.DAY_OF_WEEK) == Calendar.THURSDAY && sale.get(sale.DAY_OF_WEEK_IN_MONTH) % 2 == 0 ) {
//					System.out.println(getCurrentDate(sale));
//				}
//			}
//		}
		System.out.println("==========================");
		
		int aaa = 1;
		for (int y = 1; y <= 365; y++) {
//			sale.set(sale.DATE, y);
			sale.set(to_year, 0, y);
//			System.out.println(getCurrentDate(sale));
			if (sale.get(sale.DAY_OF_WEEK) == Calendar.THURSDAY && sale.get(sale.DAY_OF_WEEK_IN_MONTH) % 2 == 0 ) {
				System.out.println(getCurrentDate(sale));
			}
			
		}
		
//		System.out.println("변경 후 현재 날짜 : " + getCurrentDate(sale));
		
		// DAY_OF_WEEK (이번주가 시작되고 지난 날짜, 일요일부터 시작) 5 = 목요일 
		System.out.println("요일 : " + sale.get(Calendar.DAY_OF_WEEK));
		
//		sale.set(sale.DAY_OF_WEEK, to_year);
		
		System.out.println(sale.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("=================");
		System.out.println(Calendar.DAY_OF_YEAR);
		
		// 몇번째 해당 요일인지 알려주는 
		System.out.println(sale.get(sale.DAY_OF_WEEK_IN_MONTH));
		
	}
		
	public static String getCurrentDate(Calendar calendar) {
		
		SimpleDateFormat current = new SimpleDateFormat(
				"yyyy년 MM월 dd일 / EEEEEE");
		
		return current.format(calendar.getTime());
	}
	
}




















=======
package quiz;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class D11_DiscountDay {
	
	/*
		어떤 옷가게에서 할인 행사를 짝수번째 목요일마다 진행한다고 한다.
		년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해주는 프로그램을 만들어보세요
	*/
	
	public static void main(String[] args) {
		
		int to_year = 2021;
		
		Calendar sale = Calendar.getInstance();
		
//		LocalDate check = sale.minusYears(to_year);
		
		sale.set(sale.YEAR, to_year);
		sale.set(sale.MONTH, 0);
		sale.set(sale.DATE, 1);
//		sale.set(sale.DAY_OF_WEEK, 0);
		
		int dd = 1;

//		for (int i = 0; i <= 11; i++) {
//			sale.set(sale.MONTH, i);
//			for (int y = 1; y <= 31; y++) {
//				sale.set(sale.DATE, y);
//				
//				if (sale.get(sale.DAY_OF_WEEK) == Calendar.THURSDAY && sale.get(sale.DAY_OF_WEEK_IN_MONTH) % 2 == 0 ) {
//					System.out.println(getCurrentDate(sale));
//				}
//			}
//		}
		System.out.println("==========================");
		
		int aaa = 1;
		for (int y = 1; y <= 365; y++) {
//			sale.set(sale.DATE, y);
			sale.set(to_year, 0, y);
//			System.out.println(getCurrentDate(sale));
			if (sale.get(sale.DAY_OF_WEEK) == Calendar.THURSDAY && sale.get(sale.DAY_OF_WEEK_IN_MONTH) % 2 == 0 ) {
				System.out.println(getCurrentDate(sale));
			}
			
		}
		
//		System.out.println("변경 후 현재 날짜 : " + getCurrentDate(sale));
		
		// DAY_OF_WEEK (이번주가 시작되고 지난 날짜, 일요일부터 시작) 5 = 목요일 
		System.out.println("요일 : " + sale.get(Calendar.DAY_OF_WEEK));
		
//		sale.set(sale.DAY_OF_WEEK, to_year);
		
		System.out.println(sale.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("=================");
		System.out.println(Calendar.DAY_OF_YEAR);
		
		// 몇번째 해당 요일인지 알려주는 
		System.out.println(sale.get(sale.DAY_OF_WEEK_IN_MONTH));
		
	}
		
	public static String getCurrentDate(Calendar calendar) {
		
		SimpleDateFormat current = new SimpleDateFormat(
				"yyyy년 MM월 dd일 / EEEEEE");
		
		return current.format(calendar.getTime());
	}
	
}




















>>>>>>> branch 'main' of https://github.com/topzoo12/RemoteJavaStudy.git
