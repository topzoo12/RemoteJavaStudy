<<<<<<< HEAD
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class D11_Time {

	/*
	
		# java.time 패키지
		
		 - Calendar 클래스에서 set()을 하면 원래 인스턴스가 변해버린다는 단점을 보완한 클래스
		 - java.time 패키지의 클래스들은 시간을 변경한 새로운 인스턴스를 반환하는 방식을 
		   통해 원본 인스턴스를 그대로 보존한다.
		 - LocalDate, LocalTime, LocalDateTime... 등이 있다.
	
	*/
	
	public static void main(String[] args) {
		
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
		// of() : 원하는 시간의 인스턴스를 생성하는 메서드
		System.out.println(LocalTime.of(17, 7, 30, 123456789));
		System.out.println(LocalTime.of(17, 7, 30, 12345678));
		
		System.out.println(LocalDate.of(2021, 3, 5));
		System.out.println(LocalDate.of(2021, Month.SEPTEMBER, 5));
		
		// Month 클래스
		System.out.println(Month.SEPTEMBER.name());
		System.out.println(Month.SEPTEMBER.getValue());
		
		// 변경된 시간 생성하기
		LocalDate now = LocalDate.now();
		
		LocalDate after3years = now.plusYears(3);
		LocalDate before1000years = now.minusYears(1000);
		
		System.out.println(now);
		System.out.println(after3years);
		System.out.println(before1000years.getDayOfWeek());
		
		System.out.println("=================================");
		
		// 시간을 문자열로 변경하기 
		DateTimeFormatter my_date_format = DateTimeFormatter.ofPattern("y년 M월 d일 E요일");
		
		String message = my_date_format.format(before1000years);
		
		System.out.println(message);
		
		// 시간 객체끼리 크기 비교하기 
		LocalDate 어린이날 = LocalDate.of(2021, 5, 5);
		LocalDate 크리스마스 = LocalDate.of(2021, 12, 25);
		
		
		System.out.println(어린이날.isAfter(크리스마스));
		System.out.println(어린이날.isBefore(크리스마스));
		
	}
	
	
}
















=======
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class D11_Time {

	/*
	
		# java.time 패키지
		
		 - Calendar 클래스에서 set()을 하면 원래 인스턴스가 변해버린다는 단점을 보완한 클래스
		 - java.time 패키지의 클래스들은 시간을 변경한 새로운 인스턴스를 반환하는 방식을 
		   통해 원본 인스턴스를 그대로 보존한다.
		 - LocalDate, LocalTime, LocalDateTime... 등이 있다.
	
	*/
	
	public static void main(String[] args) {
		
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
		// of() : 원하는 시간의 인스턴스를 생성하는 메서드
		System.out.println(LocalTime.of(17, 7, 30, 123456789));
		System.out.println(LocalTime.of(17, 7, 30, 12345678));
		
		System.out.println(LocalDate.of(2021, 3, 5));
		System.out.println(LocalDate.of(2021, Month.SEPTEMBER, 5));
		
		// Month 클래스
		System.out.println(Month.SEPTEMBER.name());
		System.out.println(Month.SEPTEMBER.getValue());
		
		// 변경된 시간 생성하기
		LocalDate now = LocalDate.now();
		
		LocalDate after3years = now.plusYears(3);
		LocalDate before1000years = now.minusYears(1000);
		
		System.out.println(now);
		System.out.println(after3years);
		System.out.println(before1000years.getDayOfWeek());
		
		System.out.println("=================================");
		
		// 시간을 문자열로 변경하기 
		DateTimeFormatter my_date_format = DateTimeFormatter.ofPattern("y년 M월 d일 E요일");
		
		String message = my_date_format.format(before1000years);
		
		System.out.println(message);
		
		// 시간 객체끼리 크기 비교하기 
		LocalDate 어린이날 = LocalDate.of(2021, 5, 5);
		LocalDate 크리스마스 = LocalDate.of(2021, 12, 25);
		
		
		System.out.println(어린이날.isAfter(크리스마스));
		System.out.println(어린이날.isBefore(크리스마스));
		
	}
	
	
}
















>>>>>>> branch 'main' of https://github.com/topzoo12/RemoteJavaStudy.git
