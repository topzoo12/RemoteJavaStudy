<<<<<<< HEAD
package quiz;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class D11_DiscountDay {
	
	/*
		� �ʰ��Կ��� ���� ��縦 ¦����° ����ϸ��� �����Ѵٰ� �Ѵ�.
		�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ������ִ� ���α׷��� ��������
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
		
//		System.out.println("���� �� ���� ��¥ : " + getCurrentDate(sale));
		
		// DAY_OF_WEEK (�̹��ְ� ���۵ǰ� ���� ��¥, �Ͽ��Ϻ��� ����) 5 = ����� 
		System.out.println("���� : " + sale.get(Calendar.DAY_OF_WEEK));
		
//		sale.set(sale.DAY_OF_WEEK, to_year);
		
		System.out.println(sale.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("=================");
		System.out.println(Calendar.DAY_OF_YEAR);
		
		// ���° �ش� �������� �˷��ִ� 
		System.out.println(sale.get(sale.DAY_OF_WEEK_IN_MONTH));
		
	}
		
	public static String getCurrentDate(Calendar calendar) {
		
		SimpleDateFormat current = new SimpleDateFormat(
				"yyyy�� MM�� dd�� / EEEEEE");
		
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
		� �ʰ��Կ��� ���� ��縦 ¦����° ����ϸ��� �����Ѵٰ� �Ѵ�.
		�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ������ִ� ���α׷��� ��������
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
		
//		System.out.println("���� �� ���� ��¥ : " + getCurrentDate(sale));
		
		// DAY_OF_WEEK (�̹��ְ� ���۵ǰ� ���� ��¥, �Ͽ��Ϻ��� ����) 5 = ����� 
		System.out.println("���� : " + sale.get(Calendar.DAY_OF_WEEK));
		
//		sale.set(sale.DAY_OF_WEEK, to_year);
		
		System.out.println(sale.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("=================");
		System.out.println(Calendar.DAY_OF_YEAR);
		
		// ���° �ش� �������� �˷��ִ� 
		System.out.println(sale.get(sale.DAY_OF_WEEK_IN_MONTH));
		
	}
		
	public static String getCurrentDate(Calendar calendar) {
		
		SimpleDateFormat current = new SimpleDateFormat(
				"yyyy�� MM�� dd�� / EEEEEE");
		
		return current.format(calendar.getTime());
	}
	
}




















>>>>>>> branch 'main' of https://github.com/topzoo12/RemoteJavaStudy.git
