package quiz;

import java.util.Scanner;

public class B07_Prime {
	/*
	  
	  ����ڷκ��� ����(���)�� �Է¹�����
	  1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
	  (������ �Է��ϸ� �ٽ� ����� �Է��ϰ� �ϱ�)
	  
	  �� �Ҽ�: ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ����
	  
	  	2, 3, 5, 7, 11, 13
	  
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("���ڸ� �ϳ� �Է����ּ��� > ");
		
		//int my_num = sc.nextInt(); 
		
		
		/*
		for (;;) {
			if (my_num <= 0) {
				System.out.println("0 ���� ū ����� �Է����ּ��� > ");
				my_num = sc.nextInt();
			}else if (my_num > 0) {
				break;
			}
		}
		for (;my_num <=0;) {
			System.out.println("0 ���� ū ����� �Է����ּ��� > ");
			my_num = sc.nextInt();
		}
		*/
		int my_num = 50;
		
		for (int chkNum=2; chkNum<=my_num; chkNum++) {
			
			int count = 0;
			
			for (int divNum=2; divNum <= chkNum; divNum++) {
				if ( chkNum % divNum == 0 ) {
					count++;
				}
			}
			
			if (count == 2) {
				System.out.println(chkNum);				
			}
			
			
		}

	}

}













