
public class B03_Switch {
	
	/*
	  # switch-case��
	  
	   - ()���� ���� ����� ���� ������ �ڵ带 �����Ѵ�
	   - ()�ȿ� boolean Ÿ���� �� �� ���� 
	   - if������ �Ϻ��ϰ� ��ü �����ϴ�
	   - default�� if���� else ������ �Ѵ�
	   - break�� �� ���� break�� ���� ������ �������鼭 ��� case�� �����Ѵ�
	 
	 */
	public static void main(String[] args) {
		
		int a = 10;
		
		switch (a % 2) {
		case 0:
			System.out.println("case 0 ����� ����Ǿ����ϴ�.");
			System.out.println("a�� ¦���Դϴ�.");
			break;
		case 1:
			System.out.println("case 1 ����� ����Ǿ����ϴ�.");
			System.out.println("a�� Ȧ���Դϴ�.");
			break;
		default :
			System.out.println("default ����� ����Ǿ����ϴ�.");
			System.out.println("���� �ش��ϴ� case�� �����ϴ�.");
			break;
		}
		
		char cmd = 'P';
		
		switch (cmd) {
		case 'w':
			System.out.println("move forword");
			//break;
		case 's':
			System.out.println("move backword");
			//break;
		case 'a':
			System.out.println("move left");
			//break;
		case 'd':
			System.out.println("move Right");
			//break;
		case 'P':
			System.out.println("pause");
			break;
		case 'q':
			System.out.println("quit");
			break;
		default :
			System.out.println("�ش��ϴ� Ŀ�ǵ尡 �����ϴ�.");
		}
		
		
		
	}
}
