package quiz;

import java.util.Calendar;
import java.util.Date;

public class D10_Calendar {
	
	/*
	
		# Date, Calendar, Time
		
		 - �ڹٷ� �ð��� ��¥�� ���� �ٷ� �� �ִ� Ŭ������
	
	*/
	
	public static void main(String[] args) {
		
		// �ý����� ���н� Ÿ���� �������� �޼���
		// �� ���н�Ÿ�� - 1970�� 1�� 1�� ���ķ� �ð��� �󸶳� �귶������ ���� (�и���)
		long currentTime = System.currentTimeMillis();
		
		System.out.println("1970�� 1�� 1�� ���ķ�.. " + currentTime + " �и��� �귶���ϴ�.");
		System.out.println("1970�� 1�� 1�� ���ķ�.. " + currentTime / 1000 + " �� �귶���ϴ�.");
		System.out.println("1970�� 1�� 1�� ���ķ�.. " + currentTime / 1000 / 60 + " �� �귶���ϴ�.");
		System.out.println("1970�� 1�� 1�� ���ķ�.. " + currentTime / 1000 / 60 / 60 + " �ð� �귶���ϴ�.");
		System.out.println("1970�� 1�� 1�� ���ķ�.. " + currentTime / 1000 / 60 / 60 / 24 + " �� �귶���ϴ�.");
		System.out.println("1970�� 1�� 1�� ���ķ�.. " + currentTime / 1000 / 60 / 60 / 24 / 365 + " �� �귶���ϴ�.");
		
		/*
		
			# Date
			
			 - Date Ŭ������ �޼������ �ֱ� ���������� ���� ������Ʈ�� �ߴܵǾ� �ִ�.
			 - �ð��� ����� ���� Ŭ�������� ����� ���� �����Ѵ�
			 - ������ ������ �ð� �����͸� ��Ƶα⸸ �� ���� Date Ŭ������ ���� ����Ѵ�.
		
		*/
		
		Date now = new Date();
		
		System.out.println();
		System.out.println(now);
		
		/*
		
			# java.util.Calendar
			
			 - �޷��� ǥ���� Ŭ����
			 - ��¥�� ���� ����� �� �ִ� �پ��� ��ɵ��� ���ִ�.
			 - �����ڸ� ����� �� ���� getInstance()��� ����ƽ �޼��带 Ȱ���Ѵ�.
			 - getInstance() �޼��忡 �浵���� �����Ͽ� ������ �ð��� �� ���� �ִ�.
		
		*/
		
		Calendar now2 = Calendar.getInstance();
		
		System.out.println();
		System.out.println(now2);
		
		// Calendar���� ���ϴ� �ʵ尪�� get() �޼��带 ���� ���� �� �ִ�.
		System.out.println("now2�� ���� year" + now2.get(Calendar.YEAR));
		
		// �� �ʵ尪 �� month�� 0���� �����Ѵ�.
		System.out.println("now2�� ���� month" + now2.get(Calendar.MONTH));
		System.out.println("now2�� ���� date" + now2.get(Calendar.DATE));
		
		System.out.println("HOUR : " + now2.get(Calendar.HOUR));
		System.out.println("HOUR OF DAY: " + now2.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE: " + now2.get(Calendar.MINUTE));
		System.out.println("SECOND: " + now2.get(Calendar.SECOND));
		
		
		
	}
	
}













