
public class B06_BreakContinue {

	public static void main(String[] args) {
		
		// # for���� ���� �ݺ�
		/*
		for (;;) {
			System.out.println(" ");
		}
		
		for (;true;) {
			System.out.println("123");
		}
		// =========================================================
		  
		 # break
		  - �ݺ��� �������� ����ϸ� �����ִ� �ݺ����� �ϳ��� Ż���Ѵ�.
		  - switch�� ���ο� ����ϸ� switch���� Ż���Ѵ�.
		  
		 # continue
		  - �ݺ��� ���ο��� ����ϸ� ���� �� �ݺ����� �ٷ� �Ѿ��.
		  - continue�� ���� �������� �ؿ� �ִ� �ݺ��� ����� ��� ���õȴ�.
		  
		  
		  
		  
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

















