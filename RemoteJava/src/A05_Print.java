
public class A05_Print {
	public static void main(String[] args) {
		/*
		 	# �ֿܼ� ����ϴ� �Լ��� 
		 	
		 	  1. print()
		 	  	- ���� �ڵ����� �ٲ����� �ʴ� ���� �⺻ ��� �Լ�
		 	  	
		 	  2. println()
		 	  	- ���� �ڵ����� �ٲ��ָ� ����ϴ� �Լ�
		 	  	- ()�� ������ ������ �� �ڿ� '\n'�� �߰��Ͽ� ����Ѵ�.
		 	  	- ()�� �ƹ��͵� �������� ������ '\n'�� ����Ѵ�.
		 	  
		 */
		
		int apple = 15; 
		
		System.out.print("Hello!\n");
		System.out.print("Hello!\n");
		System.out.print("Hello!\n");

		System.out.print("��� : ");
		System.out.print(apple + "��");
		
		System.out.println();
		
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		
		/*
		 
		  3. printf()
		  	- ������ �̿��� ���ϴ� ���¸� ���� ����� ����ϴ� �Լ�
		  	- ����� ���¸� �̸� �����, ���� ���� �ڸ��� ���� ������� ä���� ����Ѵ�.
		  	- ���ڿ��� +�� �̾���̴� ��ĺ��� ���� ��쿡 ����Ѵ�
		  	- ���� �ڵ����� �ٲ����� �ʴ´�.
		  	
		  	�� ���� ������ ����
		  	  %d : �ش� �ڸ��� ������ ���������� 10������ ������ش�. (decimal)
		  	  %x, %X : �ش� �ڸ��� ������ �������� 16������ ������ش�. (hexa decimal)
		  	  %o : �ش� �ڸ��� ������ �������� 8������ ������ش� (octal)
		  	  %s : ���ڿ�
		  	  %c : ����
		  	  %f : �Ǽ�
		  	  
		  	�� 10����
		  	  0 1 2 3 4 5 6 7 8 9 10 11 12 13
		  	   
		  	�� 8����
		  	  0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20
		  	  
		  	�� 8����
		  	  0 1 2 3 4 5 6 7 8 9 A B C D E F 10 ... 1F 20 .. 2F 30 ..   
		  
		 */
		
		int year = 2021, month = 5, day = 10,
				hour = 15, minute = 50, second = 13;
		
		System.out.print(year + "��" + month + "��" + day + "��");
		System.out.println(hour + " : " + minute + " : " + second);
		
		System.out.printf("%d�� %d�� %d�� \t %d:%d:%d\n", year, month, day, hour, minute, second);
		
		
		System.out.printf("%d�� 10������ ����ϸ� %d�Դϴ�\n", year, year);
		System.out.printf("%d�� 8������ ����ϸ� %o�Դϴ�\n", year, year);
		System.out.printf("%d�� 16������ ����ϸ� %x�Դϴ�\n", year, year);
		System.out.printf("%d�� 16������ ����ϸ� %X�Դϴ�\n", year, year);
		
		/*

		 # ���� ���� �ɼǵ�
		 
		    1. %����d, %����s ...
		      - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ����Ѵ�.
		    
		    2. %-����d, ...
		      - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ���� �����Ͽ� ����Ѵ�.
		      
		    3. %0����d
		      - �ڸ����� ���ڸ�ŭ Ȯ���ϰ� ���ڸ��� 0�� ä�� ����Ѵ�.
		      
		    4. %+d
		      - ��� �տ��� ��ȣ�� �ٿ��� ����Ѵ�.
		      
		    5. %.����f
		      - �Ҽ��� �ڸ����� �����Ѵ�. 
		 
		 */
		
		System.out.printf("%20d\n", 2000);
		System.out.printf("%-10s: %7d\n", "Price", 15000);
		System.out.printf("%-10s: %7d\n", "Income", 300);
		System.out.printf("%-10s: %7d\n", "Calorie", 1200);
		System.out.printf("%-10s: %7d\n", "Tax", 150000);
		
		System.out.printf("%02d\n", 1);
		System.out.printf("%02d\n", 2);
		System.out.printf("%02d\n", 11);
		System.out.printf("%02d\n", 15);
		
		System.out.println("--------------------------------");
		
		System.out.printf("%+d\n", -50);
		System.out.printf("%+d\n", 50);
		
		// ��� �ɼǵ��� ��� ������ �����ϴ�
		System.out.printf("%020.5f\n", 123.1234567);
		System.out.printf("%.4f\n", 123.1234567);
		System.out.printf("%.3f\n", 123.1234567);
		System.out.printf("%.2f\n", 123.1234567);
		System.out.printf("%.1f\n", 123.1234567);
		System.out.printf("%.0f\n", 123.9234567);
		System.out.printf("%.300f\n", 123.1234567);
		
		
	}
}



















