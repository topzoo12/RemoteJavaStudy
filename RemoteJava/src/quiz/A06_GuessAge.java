package quiz;
import java.util.Scanner;

public class A06_GuessAge {
	
	/*
	  ����ڷκ��� �¾ �ؿ� ������ �⵵�� �Է¹����� 
	  �� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ����� ������ 
	  
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ش� ��⵵ �ΰ���?!(4�ڸ� ���ڸ� �Է��ϼ���)");
		
		int now_year = sc.nextInt();
		
		System.out.println("����� �¾�ش� ���� �ΰ���?!(4�ڸ� ���ڸ� �Է��ϼ���)");

		int you_year = sc.nextInt();
		
		System.out.println("����� ���̴� " + ((now_year - you_year) + 1) + "�� �Դϴ�." );
		
		
	}
	
}
