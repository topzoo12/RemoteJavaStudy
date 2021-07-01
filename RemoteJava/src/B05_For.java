
public class B05_For {

			/*
			  
			  # �ݺ��� (loop)
			   
			   - for, while, do-while(X), for each
			   - �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�
			   
			  # for�� 
			   
			    for (�ʱⰩ; �ݺ�����; ������) {
			    	����� �ִ� �ݺ������� true�� ���� �ݺ��� ��ɾ���� ���� �� 
			    }
			  
			*/
	
	public static void main(String[] args) {
		
		/* 
			1. ���� �⺻���� ������ for��
			  - �ʱⰪ���� 0�� �ְ�, ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ���´�.
			  - ������ 1�� ������.
			  - ���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ���� ������ for��
		*/
		for (int i=0; i<10; i++ ) {
				System.out.println((i+1) + ". Hello, world!"); 
		}
		

		/* 
		 2. �ʱⰪ, ������, ������ ������� ������ �� �ִ�.
		   
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
		 3. �ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�.
		   
		 */
		int a = 123;
		for (;a < 234 ;) {
			a += 5;
			System.out.println("Hello! " + a);
			//a += 5;
		}
		
		/* 
		 4. �ݺ��� ���ο� �ٸ� �����鵵 �����Ӱ� ����� �� �ִ�.
		   
		 */

		for (int month = 1; month <= 12 ; ++month) {
			
			String season;
			
			switch (month) {
			case 12:
			case 1:
			case 2:
				season = "�ܿ�";
				break;
			case 3:
			case 4:
			case 5:
				season = "��";
				break;
			case 6:
			case 7:
			case 8:
				season = "����";
				break;
			case 9:
			case 10:
			case 11:
				season = "����";
				break;
			default :
				season = "����";
				break;
			}
			System.out.printf("%d���� %s�Դϴ�\n", month, season);
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
