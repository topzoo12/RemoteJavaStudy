
public class B05_For {

			/*
			  
			  # 반복문 (loop)
			   
			   - for, while, do-while(X), for each
			   - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
			   
			  # for문 
			   
			    for (초기갑; 반복조건; 증가폭) {
			    	가운데에 있는 반복조건이 true인 동안 반복될 명령어들을 적는 곳 
			    }
			  
			*/
	
	public static void main(String[] args) {
		
		/* 
			1. 가장 기본적인 형태의 for문
			  - 초기값에는 0을 주고, 조건에는 반복하고 싶은 횟수를 적는다.
			  - 증가는 1씩 ㅎ나다.
			  - 원하는 횟수만큼 반복하기 가장 좋은 형태의 for문
		*/
		for (int i=0; i<10; i++ ) {
				System.out.println((i+1) + ". Hello, world!"); 
		}
		

		/* 
		 2. 초기값, 증가값, 조건은 마음대로 변경할 수 있다.
		   
		 */		
		for (int i=100; i>0; --i ) {
			System.out.println((i) + ". Hello, world!"); 
		}
		
		
		for (int i=0; i<100; i+= 45 ) {
			if (i < 9 ) {
				System.out.println((i+1) + ".   Hello, world!");
			} else if (i == 99){
				System.out.println((i+1) + ". Hello, world!");
			} else {
				System.out.println((i+1) + ".  Hello, world!");
			}
		}
		/* 
		 3. 초기값과 증가값의 위치는 마음대로 변경할 수 있다.
		   
		 */
		int a = 123;
		for (;a < 234 ;) {
			a += 5;
			System.out.println("Hello! " + a);
			//a += 5;
		}
		
		/* 
		 4. 반복문 내부에 다른 문법들도 자유롭게 사용할 수 있다.
		   
		 */

		for (int month = 1; month <= 12 ; ++month) {
			
			String season;
			
			switch (month) {
			case 12:
			case 1:
			case 2:
				season = "겨울";
				break;
			case 3:
			case 4:
			case 5:
				season = "봄";
				break;
			case 6:
			case 7:
			case 8:
				season = "여름";
				break;
			case 9:
			case 10:
			case 11:
				season = "가을";
				break;
			default :
				season = "없음";
				break;
			}
			System.out.printf("%d월은 %s입니다\n", month, season);
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
