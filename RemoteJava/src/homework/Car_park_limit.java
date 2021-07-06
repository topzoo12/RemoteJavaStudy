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
		
		System.out.println("체크할 날짜 : " + getCurrentDate(limit_check_day));
		System.out.println("시작할 날짜 : " + getCurrentDate(limit_start_day));
		
//		System.out.println(limit_check_day.getWeekYear());
//		System.out.println(limit_start_day.getWeekYear());

		int check_day = limit_check_day.DAY_OF_WEEK;
		
//		System.out.println(whatDay(check_day);
		
//		System.out.println(now.getYear());
		if (limit_start_day.getWeekYear() <= limit_check_day.getWeekYear()) {
			System.out.println("주차 제한중");
		} else if (limit_start_day.getWeekYear() >= limit_check_day.getWeekYear()) {
			System.out.println("시행 이전");
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
		
		String day = "요일";
		
		if (a == 1) {
			day = "일" + day;
		} else if (a == 2) {
			day = "월" + day;
		} else if (a == 3) {
			day = "화" + day;
		} else if (a == 4) {
			day = "수" + day;
		} else if (a == 5) {
			day = "목" + day;
		} else if (a == 6) {
			day = "금" + day;
		} else if (a == 7) {
			day = "토" + day;
		}
		
		return day;
	}
	
	
	public static String getCurrentDate(Calendar calendar) {
		
		SimpleDateFormat current = new SimpleDateFormat("yyyy년 MM월 dd일 / EEEEEE");
		
		return current.format(calendar.getTime());
	}
	
}
