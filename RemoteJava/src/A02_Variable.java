
public class A02_Variable {
	public static void main(String[] args) {
		
		/*
			# ���� ( Variable )
			
			 - �����͸� ���� �� �ִ� ����
			 - �ڹٿ����� ������ �ݵ�� ������ �ڿ� ����ؾ� �ȴ�.
			 - ���� ����ÿ��� �� ������ ������ �������� Ÿ���� �������־�� �Ѵ�.
			 - (���� ��������) ���� �̸��� ������ �ٽ� ����� �� ����.
			 - 
			 
		*/
		
		/* ������ ���� ( declare, declaration )
			- �տ� Ÿ���� ���� �ڿ� �������� ���Ѵ�.
			- ����� ���ÿ� �ʱ�ȭ �� �� �� �ִ�. ( �ʱ�ȭ : ������ ó������ ���� �ִ� �� )
			- ���� �Ŀ� �ʱ�ȭ ���� ���� ������ ����� �� ����.
		
		*/
		
		// ������ ���� �ϰ�, �ڿ� �ʱ�ȭ �ϴ� ���
		int a, b, c;
		int apple;
		int banana;
		int yet;
		
		// ���α׷��� ���� = �� ������ ������ �������� ���� ������� ���̴�. ( ���� ���� )
		
		a = 3; 
		b = 4;
		c = -35;
		apple = 7;
		banana = 10;
		
		// ����� ���ÿ� �ʱ�ȭ
		
		int x = 10, y = 1, z = 99 ;
		int mango = 30;
		int grape = 123;
		
		// ���� ������ �ϸ� ������ ����Ǿ� �ִ� ���� �������
		a = 7;
		System.out.println("a : " + a);
		
		System.out.println(a + b + c );
		System.out.println(" " + a + b + c );
		System.out.println("a + b + c = " + (a + b + c));
		
		System.out.println("����� ��� " + apple + "�� �ֽ��ϴ�.");
		System.out.println("�ٳ����� ��� " + banana + "�� �ֽ��ϴ�.");
		
		System.out.println(x - y * z);
		System.out.println(mango + apple);
		
		System.out.println();

		
	}
}
