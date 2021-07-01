package quiz;

public class A09_ConditionQuiz {
	/*
	  [ �˸��� �񱳿����� ����� ������ ]
	  
	 	1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
	 	2. int�� ���� b�� ¦���� �� true
	 	3. int�� ���� c�� 7�� ����� �� true
	 	4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�, 12�̻��� �� true
	 	5. int�� ���� d�� e�� ���̰� 32�� �� true
	 	6. int�� ���� year�� 400���� ������ �������ų�
	 	   �Ǵ� 4�� ������ �������� 100���� ������ �������� ������ true
	 	7. �μ��� ö������ 2�� ������ true
	 	8. �μ��� ö������ ������ 3�� ������ true
	 	9. boolean�� ���� powerOn�� false�� �� true
	 	10. ���ڿ� �������� str�� "yes"�� �� true

	 */
	
	
	public static void main(String[] args) {
		
		int a = 11;
		int b = 20;
		int c = 21;
		int d = 40;
		int e = 50;
		int hour = 999;
		int year = 2342;
		int minsu_age = 26;
		int chulsu_age = 24;
		int minsu_month = 5;
		int chulsu_month = 8;
		boolean powerOn = false;
		String str = "yes";
		
				
		System.out.println("1. " + (a > 10 && a < 20));
		System.out.println("2. " + (b%2 == 0));
		System.out.println("3. " + (c%7 == 0));
		//System.out.println("4. " + (!(hour < 0 && hour >= 24) && hour >= 12));
		//System.out.println("4. " + (!(hour <= 0 || hour >= 24) && hour >= 12));
		System.out.println("4. " + ((hour >= 0 && hour < 24) && hour >= 12));
		System.out.println("4. " + (hour < 24 && hour >= 12));
		System.out.println("5. " + (Math.abs(d-e) == 30));
		System.out.println("6. " + (year%400 == 0 || (year%4 == 0 && year%100 != 0) ));
		System.out.println("7. " + (minsu_age - chulsu_age == 2));
		System.out.println("8. " + (minsu_month - chulsu_month == -3));
		System.out.println("9. " + (!powerOn));
		System.out.println("10. " + (str == "yes"));
		
		// Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� .equals()�� �̿��� ���ؾ� �Ѵ�.
		System.out.println("10. " + (str.equals(str)));
		
		
		String str1 = "yes";
		String str2 = "yes";
		String str3 = new String("yes");
		
		
		// ������ ������ == �񱳴� �� ������ ���� ���� �ּҸ� ���ϰ� �ִ����� ���Ѵ�.
		System.out.println("str1 == \"yes\" : " + (str1 == "yes"));
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		
		// Ÿ�Ը��� �빮�ڷ� �����ϴ� ������ �������� �ݵ�� .equals()�� �̿��� ���ؾ� �Ѵ�.
		System.out.println(str.equals("yes"));
		System.out.println(str.equals(str3));
		
		/* 
		  - �ҹ��ڷ� �����ϴ� Ÿ�� �������� stack�� �������� ���δ�.
		  - �빮�ڷ� �����ϴ� Ÿ�� �������� stack���� �ּҰ��� �����ϰ� ��ü�� heap�� �����Ѵ�
		  - �빮�ڷ� �����ϴ� Ÿ�� �������� �ּҰ��� ����Ǿ� �ְ�, 
		    �ű⿡ .�� ��� ���� �����͸� ������ �� �ִ�.
		
		*/
		
	}
}













