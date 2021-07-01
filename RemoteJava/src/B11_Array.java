import java.util.Scanner;

public class B11_Array {
	
			/*
			
				# 배열 (Array )
				
				 - 같은 타입 변수를 한번에 여러개 선언하는 방법
				 - 같은 이름으로 변수를 여러개 선언한 뒤 인덱스로 구분한다.
				 - 배열의 인덱스(방 번호)는 0부터 전체 길이 -1까지 있다.
				 - 배열은 한번 크기가 정해지면 크기를 변경할 수 없다.
				 - 변수와는 다르게 배열은 생성과 동시에 모든 값이 초기화 되어 있다.
				   (정수 : 0, 실수: 0.0, boolean: false, 참조형: null)
				 - 모든 타입은 배열로 한번에 여러개 선언할 수 있다.
				 
			
			*/

	public static void main(String[] args) {
		
		Scanner[] scanners = new Scanner[10];
		
		scanners[0] = new Scanner(System.in);
		scanners[1] = new Scanner(System.in);
		scanners[2] = new Scanner(System.in);
		
		System.out.println("첫 번째 스캐너: " + scanners[0]);
		System.out.println("두 번째 스캐너: " + scanners[1]);
		System.out.println("세 번째 스캐너: " + scanners[2]);
		System.out.println("네 번째 스캐너: " + scanners[3]);
		
		
		int[] randomNumbers = new int[100];
		
		randomNumbers[5] = 17;
		
		System.out.println(randomNumbers[0]);
		System.out.println(randomNumbers[1]);
		System.out.println(randomNumbers[2]);
		System.out.println(randomNumbers[3]);
		System.out.println(randomNumbers[4]);
		System.out.println(randomNumbers[5]);
		System.out.println(randomNumbers[6]);
		System.out.println(randomNumbers[7]);
		
		// 배열.length를 통해 배열의 전체 길이를 알 수 있다.
		System.out.println("randomNumbers의 길이 : " + randomNumbers.length);
		System.out.println("randomNumbers의 마지막 인덱스 번호 : " + (randomNumbers.length-1));
		System.out.println("scanners의 길이 : " + scanners.length);
		System.out.println("scanners의 마지막 인덱스 번호 : " + (scanners.length-1));
		
		
		/*
		
			# 배열 선언 방법 
			
			 1. 타입[] 변수명 = new 타입[크기];
			 2. 타입[] 변수명 = {값1, 값2, 값3, 값4, 값5 ....};
			 3. 타입[] 변수명 = new 타입[] { 값1, 값2, 값3, 값4, 값5 .... }; 
			 
		
		*/
		
		int[] numbers = new int[10];
		char[] blacklist = {'#', '@', '&', '^', '\\', 99, 111};
		boolean[] passExam = new boolean[] {true, false, false, true};
		
		int[] units = {
				365 * 24 * 60 * 60,
				24 * 60 * 60,
				60 * 60,
				60
				};
		
		// 배열은 반복문과 함께 쓰도록 설계되어 있다.
		for (int i = 0; i < blacklist.length; i++) {
			System.out.println(blacklist[i]);
		}
		
		// String은 char[]로 변환할 수 있다.
		String message = "Hello, woooorld!!";
		
		char[] hello = "Hello, World!".toCharArray();
		
		for (int i = 0; i < hello.length; i++) {
			System.out.printf("hello[%d] : %c\n", i, hello[i]);
		}
		
		
		
		
		

	}

}















