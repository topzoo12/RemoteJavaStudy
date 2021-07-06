package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D11_DiscountDay_teacher {
	public static void main(String[] args) {
		
		int year = 2021;
		
		printEventOfYear(year);
		
//		Calendar event = Calendar.getInstance();
		
	}
	
	public static Calendar getFirstEventDay(int year) {
		Calendar event = Calendar.getInstance();
		
		event.set(year, 0, 1);
		event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
//		while (event.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
//			event.add(Calendar.DATE, 1);
//		}
		
		if (event.get(Calendar.YEAR) != year) {
			event.add(Calendar.DATE, 7);
		}
		
		return event;
	}     
	
	
	public static void printEventOfYear(int year) {
		SimpleDateFormat eventDateFormat = new SimpleDateFormat("[y鰍 戚坤闘] M杉 d析 \tE推析");
		Calendar event = getFirstEventDay(year);
		
//		event.set(year, 0, 1);
//		event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
		System.out.println(event.getTime());
		
		
		int count = 1;
		
		while (event.get(Calendar.YEAR) == year) {
			event.add(Calendar.DATE, 7);
			
			if (event.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 0) {
				System.out.println(eventDateFormat.format(event.getTime()));
				count++;
			}
		}
		System.out.println("臣背税 戚坤闘澗 恥 '" + count + "'噺 脊艦陥.");
	}
}


// しししししししししししししししししししししし








