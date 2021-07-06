
public class B06_BreakContinue {

	public static void main(String[] args) {
		
		// # for문의 무한 반복
		/*
		for (;;) {
			System.out.println(" ");
		}
		
		for (;true;) {
			System.out.println("123");
		}
		// =========================================================
		  
		 # break
		  - 반복문 내무에서 사용하면 속해있는 반복문을 하나만 탈출한다.
		  - switch문 내부엣 사용하면 switch문을 탈출한다.
		  
		 # continue
		  - 반복문 내부에서 사용하면 다음 번 반복으로 바로 넘어간다.
		  - continue를 만난 시점에서 밑에 있는 반복문 블록은 모두 무시된다.
		  
		  
		  
		  
		*/
		
		// =========================================================
		
		
		for (int i=0; i <= 10; i++) {
			
			if (i == 3 || i == 4) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("=========================================================");
		
		for (int i=0; i <= 10; i++) {
			
			if (i == 3 || i == 4) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("=========================================================");
		
		for (int i=0; true; i++) {
			if (i == 1000) {
				break;
			}
			System.out.println(i);
		}
		
		
		

	}

}

















