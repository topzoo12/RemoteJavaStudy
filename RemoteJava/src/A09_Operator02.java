
public class A09_Operator02 {
	
		/*
			
		  # �� ������
		  
		    - �� ���� ���ϴ� ����
		    - �� ������ ����� boolean Ÿ���̴� (�� �Ǵ� ����)
		    - ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�.
			
		 */
	
	public static void main(String[] args) {
		
		int a = 10, b = 7;
		
		System.out.println(a > b);
		System.out.println(a < b);
		
		// �ݵ�� �ε�ȣ�� ���� ���;� �� (��ȣ�� ���� ������ �ȵ�)
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(a == b);		// �� ���� ���� ������ true
		System.out.println(a != b);		// �� ���� ���� �ٸ��� true
		
		/*
			
			# �� ������ 
			
			- boolean Ÿ�� ������ �ϴ� ����
			- && : �� ���� ���� ��� true�� ���� true (AND)
			- || : �� ���� �� �� �ϳ��� true���� true (OR)
			- ! : ture�� false, false�� true  (NOT)
			
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
		
		System.out.println("c�� ¦���ΰ���? ");
		System.out.println(c % 2 == 0);
		
		System.out.println("c�� Ȧ���ΰ���? ");
		System.out.println(c % 2 == 1);
		System.out.println(c % 2 != 0);
		System.out.println(!(c % 2 == 0));
		
		System.out.println("c�� ¦���̸鼭 50���� ū����?");
		System.out.println(c % 2 == 0 && c > 50);
		
		System.out.println("c�� ¦���̰ų� 50���� ū����?");
		System.out.println(c % 2 == 0 || c > 50);
		
		// �������� : ���� x, y, z�� ��� 3�� ����� �ƴҶ� true�� �Ǵ� �� ������ ����� ������ 
		
		int x = 11;
		int y = 13;
		int z = 14;
		
		System.out.println("======================================");
		
		System.out.println( x % 3 != 0 && y % 3 != 0 && z % 3 != 0 );
		System.out.println( !(x % 3 == 0 || y % 3 == 0 || z % 3 == 0) );
		
		
		
	}
}
















