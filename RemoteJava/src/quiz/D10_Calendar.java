package quiz;

import java.util.Calendar;
import java.util.Date;

public class D10_Calendar {
	
	/*
	
		# Date, Calendar, Time
		
		 - 자바로 시간과 날짜를 쉽게 다룰 수 있는 클래스들
	
	*/
	
	public static void main(String[] args) {
		
		// 시스템의 유닉스 타임을 가져오는 메서드
		// ※ 유닉스타임 - 1970년 1월 1일 이후로 시간이 얼마나 흘렀는지를 센건 (밀리초)
		long currentTime = System.currentTimeMillis();
		
		System.out.println("1970년 1월 1일 이후로.. " + currentTime + " 밀리초 흘렀습니다.");
		System.out.println("1970년 1월 1일 이후로.. " + currentTime / 1000 + " 초 흘렀습니다.");
		System.out.println("1970년 1월 1일 이후로.. " + currentTime / 1000 / 60 + " 분 흘렀습니다.");
		System.out.println("1970년 1월 1일 이후로.. " + currentTime / 1000 / 60 / 60 + " 시간 흘렀습니다.");
		System.out.println("1970년 1월 1일 이후로.. " + currentTime / 1000 / 60 / 60 / 24 + " 일 흘렀습니다.");
		System.out.println("1970년 1월 1일 이후로.. " + currentTime / 1000 / 60 / 60 / 24 / 365 + " 년 흘렀습니다.");
		
		/*
		
			# Date
			
			 - Date 클래스의 메서드들은 최근 버전에서는 거의 업데이트가 중단되어 있다.
			 - 시간을 계산할 때는 클래스들을 사용할 것을 권장한다
			 - 하지만 여전히 시간 데이터를 담아두기만 할 때는 Date 클래스를 많이 사용한다.
		
		*/
		
		Date now = new Date();
		
		System.out.println();
		System.out.println(now);
		
		/*
		
			# java.util.Calendar
			
			 - 달력을 표현한 클래스
			 - 날짜를 쉽게 계산할 수 있는 다양한 기능들이 모여있다.
			 - 생성자를 사용할 수 없고 getInstance()라는 스태틱 메서드를 활용한다.
			 - getInstance() 메서드에 경도값을 전달하여 지역별 시간을 알 수도 있다.
		
		*/
		
		Calendar now2 = Calendar.getInstance();
		
		System.out.println();
		System.out.println(now2);
		
		// Calendar에서 원하는 필드값을 get() 메서드를 통해 꺼낼 수 있다.
		System.out.println("now2로 꺼낸 year" + now2.get(Calendar.YEAR));
		
		// ※ 필드값 중 month만 0부터 시작한다.
		System.out.println("now2로 꺼낸 month" + now2.get(Calendar.MONTH));
		System.out.println("now2로 꺼낸 date" + now2.get(Calendar.DATE));
		
		System.out.println("HOUR : " + now2.get(Calendar.HOUR));
		System.out.println("HOUR OF DAY: " + now2.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE: " + now2.get(Calendar.MINUTE));
		System.out.println("SECOND: " + now2.get(Calendar.SECOND));
		
		
		
	}
	
}













