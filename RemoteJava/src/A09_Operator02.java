
public class A09_Operator02 {
	
		/*
			
		  # 비교 연산자
		  
		    - 두 값을 비교하는 연산
		    - 비교 연산의 결과는 boolean 타입이다 (참 또는 거짓)
		    - 산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 계산한다.
			
		 */
	
	public static void main(String[] args) {
		
		int a = 10, b = 7;
		
		System.out.println(a > b);
		System.out.println(a < b);
		
		// 반드시 부등호가 먼저 나와야 함 (등호가 먼저 나오면 안됨)
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(a == b);		// 두 값이 서로 같으면 true
		System.out.println(a != b);		// 두 값이 서로 다르면 true
		
		/*
			
			# 논리 연산자 
			
			- boolean 타입 값으로 하는 연산
			- && : 양 옆의 값이 모두 true일 때만 true (AND)
			- || : 양 옆의 값 중 하나만 true여도 true (OR)
			- ! : ture면 false, false면 true  (NOT)
			
		 */
		
		System.out.println("======================================");
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));
		
		
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
		
		int c = 41;
		
		System.out.println("c가 짝수인가요? ");
		System.out.println(c % 2 == 0);
		
		System.out.println("c가 홀수인가요? ");
		System.out.println(c % 2 == 1);
		System.out.println(c % 2 != 0);
		System.out.println(!(c % 2 == 0));
		
		System.out.println("c가 짝수이면서 50보다 큰가요?");
		System.out.println(c % 2 == 0 && c > 50);
		
		System.out.println("c가 짝수이거나 50보다 큰가요?");
		System.out.println(c % 2 == 0 || c > 50);
		
		// 연습문제 : 변수 x, y, z가 모두 3의 배수가 아닐때 true가 되는 비교 연산을 만들어 보세요 
		
		int x = 11;
		int y = 13;
		int z = 14;
		
		System.out.println("======================================");
		
		System.out.println( x % 3 != 0 && y % 3 != 0 && z % 3 != 0 );
		System.out.println( !(x % 3 == 0 || y % 3 == 0 || z % 3 == 0) );
		
		
		
	}
}
















