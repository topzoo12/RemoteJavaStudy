import java.util.Scanner;

public class C01_Function {
	
		/*
		
			# �Լ� (Function)
			
			  - ����� �̸� �����صΰ� ���߿� ������ ���� ��
			 
			  - ������ ���������� ������� �ʰ� 
			    �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ� ����ȴ�.
			 
			  - ���߿� ���� �� ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν�
			    �۾��� �ݺ��� ���� �� �ִ�.
			   
			  - �ڹٿ��� �Լ�(�޼���)�� �ݵ�� Ŭ���� ���ο� �����ؾ� �Ѵ�.
			 
			# �Լ��� ����
			
			  - �Լ��� ������ �� �Լ��� �տ� �ش� �Լ��� ��ȯ�ϴ� ���� Ÿ���� ���´�.
			  
			  - �Լ��� ȣ���ϸ� ȣ���� ���̷� �Լ��� ���� ����� ��ȯ(return)�ȴ�.
			  
			  - ����Ÿ�� void�� �ش� �Լ��� ��ȯ�ϴ� ���� ���ٴ� ���� �ǹ��ϴ� ��ȯ Ÿ���̴�.
			  
			# �Լ��� �Ű����� (arguments)
			 
			  - �Լ��� ȣ���� �� ()�ȿ� �����ϴ� ���� ���ڶ�� �Ѵ�.
			  
			  - �Լ��� ������ �� ()�ȿ� ���ڸ� ���� �������� �����ϴµ�, �̸� �Ű�������� �Ѵ�.
			  
		*/

	public static void main(String[] args) {
		
		printRabbit();
		
		for (int i = 0; i < 10; i++) {
			printRabbit();
		}
		
		int need = applebasket(31, 10);
		//System.out.println(applebasket(31, 10));
		System.out.println("�ʿ��� �ٱ����� ������ " + need + "�� �Դϴ�.");

	}
	
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..) ");
		System.out.println("(  >��");
	}
	
	
	// ex: ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �˷��ִ� �Լ�
	public static int applebasket(int apple, int size) {
		
		int bascket = apple % size == 0 ? apple / size : apple / size + 1;    
		
		return bascket;
	}
	
	
}


















