package quiz;

import myobj.Dice.Dice;

public class C07_FiveDice {
	
	/*
	  	랜덤으로 5개의 주사위를 굴린 다음에 주사위의 결과를 통해 다음을 구분하는 클래스를 만들어 보세요 
	  	
		  	1. 풀하우스 ( 같은 눈이 2개 + 3개 ) ( 11666 / 22333 / 55252 ) 
		  	2. 스몰 스트레이트 ( 1234 / 2345 / 3456 ) 
		  	3. 라지 스트레이트 ( 12345 / 23456 )
		  	4. 4 다이스 ( 같은 숫자 4개 )
		  	5. 5 다이스 ( 같은 숫자 5개 ) (Yacht)
		  	
		  	(1) 모든 주사위를 한번에 던지는 메서드
		  	
		  	(2) 원하는 주사위를 제외하고 나머지만 던지는 메서드 ( 개수 선택 가능 )
		  	
		  	(3) 주사위를 새로 던질 때마다 족보를 확인
	  
	 */
	
	public static void main(String[] args) {
		
		Dice d = new Dice();
		
		d.dice_throw();
		d.calc();
		
		
		//System.out.println(d.dice[0]);
		
		
		
		
	}
	
}















