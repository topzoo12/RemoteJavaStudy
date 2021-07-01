
public class A00_Hello {
	
	public static void main(String[] args) {
		
		// ''를 사용하는 문자 타입 데이터는 실제로는 숫자값을 가지고 있다 .	
		// 문자와 정수는 실제로는 거의 같은 타입이며 서로 계산도 가능하다
		
		System.out.println('A');
		System.out.println('V');
		System.out.println("dddd");
		System.out.println((int)'A');	// 'A'를 숫자로 표현하라는 뜻
		
		System.out.println(66);
		System.out.println((char)66);	// 66을 문자로 표현하라는 뜻
		
		// 'D'가 'A'보다 얼마나 뒤에 있는 문자인지 알 수 있음
		System.out.println('D'-'A');
		
		// 정수와 문자를 계산하면 기본적으로는 정수가 된다
		System.out.println('A' + 3);
		System.out.println((char)('A' + 0));
		System.out.println((char)('A' + 1));
		System.out.println((char)('A' + 2));
		System.out.println((char)('A' + 3));
		System.out.println((char)('A' + 4));
		System.out.println((char)('A' + 25));
		System.out.println((char)('A' + 26));
		
		System.out.println((int)'가');
		System.out.println((int)'한');
		
		
		// ""을 문자열 타입과 다른 타입을 더하면 계산을 하는것이 아니라 이어붙인다
		
		System.out.println("10" + 10);
		System.out.println(10 + 10);
		
		// 정수 + 실수의 결과는 실수다
		System.out.println(3.14 + 10);
		
		// 실수를 정수로 변환하면 소주점 아래를 삭제한다.
		System.out.println((int)33.999999);
		System.out.println((int)3.5 + 3.5);
		System.out.println((int)(3.5 + 3.5));
		
		
		
		
		
	}
	
}
