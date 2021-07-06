package homework;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Car_park_limit {

	public static void main(String[] args) {
		
		int start_year = 2018;
		int start_month = 8;
		int start_day = 1;
		
		Calendar limit_start_day = Calendar.getInstance();
		Calendar limit_check_day = Calendar.getInstance();
//		LocalDate now = LocalDate.now();
		
		limit_start_day.set(limit_start_day.YEAR, start_year);
		limit_start_day.set(limit_start_day.MONTH, start_month);
		limit_start_day.set(limit_start_day.DATE, start_day);
		
		System.out.println("üũ�� ��¥ : " + getCurrentDate(limit_check_day));
		System.out.println("������ ��¥ : " + getCurrentDate(limit_start_day));
		
//		System.out.println(limit_check_day.getWeekYear());
//		System.out.println(limit_start_day.getWeekYear());

		int check_day = limit_check_day.DAY_OF_WEEK;
		
//		System.out.println(whatDay(check_day);
		
//		System.out.println(now.getYear());
		if (limit_start_day.getWeekYear() <= limit_check_day.getWeekYear()) {
			System.out.println("���� ������");
		} else if (limit_start_day.getWeekYear() >= limit_check_day.getWeekYear()) {
			System.out.println("���� ����");
		}
		
//		System.out.println(Calendar.MONDAY);
//		System.out.println(limit_Day.YEAR);
//		System.out.println(limit_Day.MONTH);
//		System.out.println(limit_Day.DAY_OF_MONTH);
//		System.out.println(limit_Day.DAY_OF_YEAR);
		
	}
	public static void limitCheck( int carNum) {
		
		if (check_day == 2 && (carNum == 1) || (carNum == 6)) {
			
		} else if (check_day == 3 && (carNum == 2) || (carNum == 7)) {
			
		} else if (check_day == 4 && (carNum == 3) || (carNum == 8)) {
			
		} else if (check_day == 5 && (carNum == 4) || (carNum == 9)) {
			
		} else if (check_day == 6 && (carNum == 5) || (carNum == 0)) {
			
		}
		
		
		
		
	}
	
	
	public static String whatDay(int a) {
		
		String day = "����";
		
		if (a == 1) {
			day = "��" + day;
		} else if (a == 2) {
			day = "��" + day;
		} else if (a == 3) {
			day = "ȭ" + day;
		} else if (a == 4) {
			day = "��" + day;
		} else if (a == 5) {
			day = "��" + day;
		} else if (a == 6) {
			day = "��" + day;
		} else if (a == 7) {
			day = "��" + day;
		}
		
		return day;
	}
	
	
	public static String getCurrentDate(Calendar calendar) {
		
		SimpleDateFormat current = new SimpleDateFormat("yyyy�� MM�� dd�� / EEEEEE");
		
		return current.format(calendar.getTime());
	}
	
}
