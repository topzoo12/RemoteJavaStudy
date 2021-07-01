
public class B09_Random {
		
		/*
			# 무작위 숫자 생성하기
			
			  1. Math.random()
			    - 0 <= x < 1의 double타입 랜덤 소수를 생성한다.
			    - 이 랜던 소수를 이용하여 원하는 범위의 숫자를 만들 수 있다.
			    
			    ※ 원하는 범위의 정수를 만드는 순서 (ex: 10 ~ 100)
			    
			      (1). 생성된 랜덤 소수에 원하는 숫자의 개수를 곱한다. (91개)
			           0 * 91 <= x < 1 * 91
			      
			      (2). 원하는 숫자 중 가장 작은 숫자를 더한다. (+10)
			           0 * 91 + 10 <= x < 1 * 91 + 10
			      
			      (3). 소수점 아래를 삭제한다 (int)
			  
			  2. Random 클래스 사용
			    - 
		
		*/
	
	public static void main(String[] args) {
		
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 91 + 10));
		}
		*/
		
		// 연습문제: 1 ~ 45의 랜덤 숫자를 7개 출력해보세요 
		
		for (int i = 0; i < 7; i++) {
			System.out.println((i+1) + "번째 : " + (int)(Math.random() * 45 + 1));
		}
		
		
	}

}



























