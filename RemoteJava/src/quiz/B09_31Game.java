package quiz;

import java.util.Scanner;

public class B09_31Game {
		
			/*
				
				# 31������ ��������
				
				1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�.
				   (1, 2, 3 �ۿ� ������ �� ����)
				   
				2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
				  
				3. ������ �������� �����Ѵ�.
				
				4. �������� 31 �̻��� ���ڸ� �θ��� �÷��̾ �й��Ѵ�.
	
			*/

	public static void main(String[] args) {
		
		int nujuck = 0;
		
		int com = 0;
		
		boolean check = true;
				
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("���ڸ� �Է����ּ��� > ");
		
		int my_num; 
		
		int start = (int)(Math.random() * 2 + 1);
		
		//if (start == 1) {
			
			//System.out.println("1~3 ������ ���ڸ� �Է����ּ��� > ");
			
			
		while (nujuck < 31) {
			my_num = 0;
			System.out.println(start);
			
			if (start == 1) { 
				com = (int)(Math.random() * 3 + 1);
				System.out.println("��ǻ�� : " + com);
				nujuck += com;
				start += 1;
			}
			
			if (nujuck > 1) {
				System.out.println("�÷��̾� �� 1~3������ ���ڸ� �Է��ϼ���> ");
			}
			
			my_num = sc.nextInt();
			
			System.out.println("������ ���� : " + nujuck);
			
			while (check) {
				if (my_num > 3 || my_num <= 0) {
					System.out.println("������ �� �ִ� ������ ������ +3���� �Դϴ�. �ٽ� �Է����ּ���> ");
					my_num = sc.nextInt();
				}else {
					nujuck += my_num;
					check = false;
				}
			}
			if (nujuck >= 31) {
				System.out.println("��ǻ�� �¸�");
				break;
			}
			
			System.out.println("������ ���� : " + nujuck);
			
			com = (int)(Math.random() * 3 + 1);
			System.out.println("��ǻ�� : " + com);
			nujuck += com;
			if (nujuck >= 31) {
				System.out.println("�÷��̾� �¸�");
				break;
			}
			System.out.println("��������� : " + nujuck);
			
			check = true;
		}
			
	//	}else {
	//		System.out.println("dd");
	//		
	//	}
		
		
		
		
		//System.out.println((i+1) + "��° : " + (int)(Math.random() * 45 + 1));
		
		
		
	}

}













