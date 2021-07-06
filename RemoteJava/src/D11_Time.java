<<<<<<< HEAD
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class D11_Time {

	/*
	
		# java.time ��Ű��
		
		 - Calendar Ŭ�������� set()�� �ϸ� ���� �ν��Ͻ��� ���ع����ٴ� ������ ������ Ŭ����
		 - java.time ��Ű���� Ŭ�������� �ð��� ������ ���ο� �ν��Ͻ��� ��ȯ�ϴ� ����� 
		   ���� ���� �ν��Ͻ��� �״�� �����Ѵ�.
		 - LocalDate, LocalTime, LocalDateTime... ���� �ִ�.
	
	*/
	
	public static void main(String[] args) {
		
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
		// of() : ���ϴ� �ð��� �ν��Ͻ��� �����ϴ� �޼���
		System.out.println(LocalTime.of(17, 7, 30, 123456789));
		System.out.println(LocalTime.of(17, 7, 30, 12345678));
		
		System.out.println(LocalDate.of(2021, 3, 5));
		System.out.println(LocalDate.of(2021, Month.SEPTEMBER, 5));
		
		// Month Ŭ����
		System.out.println(Month.SEPTEMBER.name());
		System.out.println(Month.SEPTEMBER.getValue());
		
		// ����� �ð� �����ϱ�
		LocalDate now = LocalDate.now();
		
		LocalDate after3years = now.plusYears(3);
		LocalDate before1000years = now.minusYears(1000);
		
		System.out.println(now);
		System.out.println(after3years);
		System.out.println(before1000years.getDayOfWeek());
		
		System.out.println("=================================");
		
		// �ð��� ���ڿ��� �����ϱ� 
		DateTimeFormatter my_date_format = DateTimeFormatter.ofPattern("y�� M�� d�� E����");
		
		String message = my_date_format.format(before1000years);
		
		System.out.println(message);
		
		// �ð� ��ü���� ũ�� ���ϱ� 
		LocalDate ��̳� = LocalDate.of(2021, 5, 5);
		LocalDate ũ�������� = LocalDate.of(2021, 12, 25);
		
		
		System.out.println(��̳�.isAfter(ũ��������));
		System.out.println(��̳�.isBefore(ũ��������));
		
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
	
		# java.time ��Ű��
		
		 - Calendar Ŭ�������� set()�� �ϸ� ���� �ν��Ͻ��� ���ع����ٴ� ������ ������ Ŭ����
		 - java.time ��Ű���� Ŭ�������� �ð��� ������ ���ο� �ν��Ͻ��� ��ȯ�ϴ� ����� 
		   ���� ���� �ν��Ͻ��� �״�� �����Ѵ�.
		 - LocalDate, LocalTime, LocalDateTime... ���� �ִ�.
	
	*/
	
	public static void main(String[] args) {
		
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
		// of() : ���ϴ� �ð��� �ν��Ͻ��� �����ϴ� �޼���
		System.out.println(LocalTime.of(17, 7, 30, 123456789));
		System.out.println(LocalTime.of(17, 7, 30, 12345678));
		
		System.out.println(LocalDate.of(2021, 3, 5));
		System.out.println(LocalDate.of(2021, Month.SEPTEMBER, 5));
		
		// Month Ŭ����
		System.out.println(Month.SEPTEMBER.name());
		System.out.println(Month.SEPTEMBER.getValue());
		
		// ����� �ð� �����ϱ�
		LocalDate now = LocalDate.now();
		
		LocalDate after3years = now.plusYears(3);
		LocalDate before1000years = now.minusYears(1000);
		
		System.out.println(now);
		System.out.println(after3years);
		System.out.println(before1000years.getDayOfWeek());
		
		System.out.println("=================================");
		
		// �ð��� ���ڿ��� �����ϱ� 
		DateTimeFormatter my_date_format = DateTimeFormatter.ofPattern("y�� M�� d�� E����");
		
		String message = my_date_format.format(before1000years);
		
		System.out.println(message);
		
		// �ð� ��ü���� ũ�� ���ϱ� 
		LocalDate ��̳� = LocalDate.of(2021, 5, 5);
		LocalDate ũ�������� = LocalDate.of(2021, 12, 25);
		
		
		System.out.println(��̳�.isAfter(ũ��������));
		System.out.println(��̳�.isBefore(ũ��������));
		
	}
	
	
}
















>>>>>>> branch 'main' of https://github.com/topzoo12/RemoteJavaStudy.git
