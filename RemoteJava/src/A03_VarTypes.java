
public class A03_VarTypes {
	public static void main(String[] args) {
	
/* -------------------------------------------------------------------------------------
			# ���� Ÿ��
			 - byte	 	( 1byte )			-128 ~ +127
			 	
			 	1byte => 8 bit
			 	
			 	0000 0000(0) ~ 1111 1111(255)  ( ��ȣ�� ���� ��� 0 ~ 255���� ǥ�� ���� )
			 	
			 	��ȣ�� ����ϴ� ��쿡�� ù ��° bit�� ��ȣ ��Ʈ�� ����Ѵ�.
			 	
			 	byte Ÿ���� ��� ���� 0000 0000(0) ~ 0111 1111(127)
			 	byte Ÿ���� ���� ���� 1000 0000(-128) ~ 1111 1111(-1)
			 	
			 - short	( 2byte )			- 32768 ~ +32767
			 - char 	( 2byte unsigned)	- 0 ~ 655355 ( �� ���� �ڵ� ����� )
			 - int 		( 4byte )			- 2,147,483,647 ~ +2,147,483,646
			 								- 2^31 ~ +2^31-1
			 - long 	( 8byte )			- 2^63 ~ +2^63-1
			
------------------------------------------------------------------------------------- */

		byte a = -128;
		short b = 10;
		char c = 10;
		int d = 10;
		long e = 10;
		
		byte _byte = 127;
		short _short = 32767;
		char _char = 65535;
		int _int = 2100000000;
		
		// ����Ÿ�� ���ͷ��� �⺻������ int Ÿ���̴�.
		// int Ÿ���� ������ ����� ���� ����ϰ� �ʹٸ� �ڿ� l �Ǵ� L�� �پ�� �Ѵ�.
		long _long = 200000000000L;
		
		System.out.println(a);
		
	/*

		# �Ǽ� Ÿ�� 
		
		- float		(4byte)
		- double	(8byte)
		
		�Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�.
		�ε��Ҽ��� ����� ����Ѵ�.

	 */
		// �Ҽ� ���ͷ��� �⺻������ double Ÿ���̹Ƿ� double Ÿ�� �������� �ƹ� �������� ����
		double _double = 123.1234;
		
		// �Ҽ� �ڿ� f�� �����ָ� float Ÿ�� ���ͷ��̶�� ǥ�ð� �ȴ�
		float _float = 123.123F;
		
		/*
			
			# ��/���� Ÿ��
			 - boolean
			 
			 �� �� �ִ� ���� true/false �ۿ� ����
			 
		 */
		
		boolean male = true;
		boolean female = true;
		boolean powerOn = false;
		boolean goonfil = true; 
		boolean computerScience = true;
		
		/*
		 # ������ Ÿ��
		 
		 ������ Ÿ���� �빮�ڷ� �����Ѵ�.
		 �ҹ��ڷ� �����ϴ� Ÿ���� ��� �⺻�� Ÿ���̶�� �θ���. 
		 
		 - String : ���ڿ�
		 - �� �� ��� Ŭ������.. 
		 
		 */
		
		String welcome_message = "Hello, word!";
		System.out.println(welcome_message);
		
		// char Ÿ���� ���� �ڵ带 �����ϴ� ���� Ÿ���̴�.
		char ch = 120; 
		char ch2 = 'x';
		int num1 = 'x';
		
		System.out.println("ch�� ����� �� : " + ch);
		System.out.println("'x'�� ������ char Ÿ�� ������ ��� : " + ch2);
		System.out.println("'x'�� ������ char Ÿ�� ������ ��� : " + num1);
		
		
	}
}



















