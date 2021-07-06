package myobj.parking;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Random;

public class Car {
	static Random ran = new Random();
	static char[] types = {'H', 'Y', 'S', 'N', 'T', 'L', 'B'};
	
//	int numbers;
	String number;
	char type;
	LocalDate park_date;
	
	public Car() {
//		this.numbers = ran.nextInt(9000) + 1000;
		this.number = String.format("%04d", ran.nextInt(10000));
		this.type = types[ran.nextInt(types.length)];
		
		while (true) {
			try {
				this.park_date = LocalDate.of(
						genRandomYear(),
						genRandomMonth(),
						genRandomDate()
					);
				break;
			} catch (DateTimeException e) {
				// 예외부분 테스트
			}
			
		}
	}
	
	private int genRandomYear() {
		return ran.nextInt(5) + 2017;
	}
	
	private int genRandomMonth() {
		return ran.nextInt(12) + 1;
	}
	
	private int genRandomDate() {
		return ran.nextInt(31) + 1;
	}
	
	@Override
	public String toString() {
		return String.format("[%s / %c / %s]", number, type, park_date);
	}
	
	
	
	
	public static void main(String[] args) {
//		System.out.println(LocalDate.of(2002, 2, 31));
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " : " + new Car());
		}
	}
	
}

















