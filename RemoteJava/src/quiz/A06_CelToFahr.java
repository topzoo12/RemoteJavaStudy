package quiz;
import java.util.Scanner;

public class A06_CelToFahr {
		
		/*
		  
		  ����ڷκ��� ���� �µ��� �Է¹����� ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
		  (��ȯ ������ �˻� ���, ����� �Ҽ� ù° �ڸ�����)
		   
		   (0��C �� 9/5) + 32 = 32��F
			���� - Celsius
			ȭ�� - Fahrenheit
			
		 */
	
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("���� �µ��� � �Դϱ�?_(����)");
			
			double ce = sc.nextDouble();
			
			System.out.println("������ �µ��� " + ce + "�� �Դϴ�.");
			
			double fffa = (double)(ce * 9 / 5) + 32;
			
			System.out.println(fffa);
			System.out.printf("%.1f��C�� %.1f��F�Դϴ�.", ce, fffa);

			//double Fahrenheit = Math.round( ((Celsius*9/5) + 32));

			//System.out.println("������ �µ��� ȭ���� ��ȯ�ϸ� " + fffa + "�� �Դϴ�.");
			
			//int Fahrenheit = sc.nextInt();
			
			// ---------------------------------------------------------------------
			/*
			double cel, fahr;
			
			Scanner sc1 = new Scanner(System.in);
			cel = sc1.nextDouble();
			
			System.out.println("");
			cel = sc.nextDouble();
			fahr = (cel * 9 / 5) + 32;
			System.out.printf("%.1f��C�� %.1f��F�Դϴ�.", cel, fahr);
			
			*/
			
		}
	
}
