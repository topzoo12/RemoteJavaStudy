package quiz;

import java.util.Scanner;

public class B09_Count369 {
		
		/*
		 	
		 	����ڷκ��� ������ �ϳ� �Է¹��� ��
		 	�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ��ϴ��� �������
		 	
		 	( �� 33, 36, 39 .... ���� ���ڴ� ������ Ĩ�ϴ�.)
		 	
		*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ϴ� ���ڸ� �Է����ּ���! >");
		int last_num = sc.nextInt();
		
		String check_num = "" + last_num;
		String beauty = "";
		
		int check_cnt = 0;
				
		for (int i = 1; i <= last_num ; i++) {
			
			check_num = "" + i;
			
			beauty = "";
			
			for (int y = 0; y < check_num.length() ; y++) {
				if (check_num.charAt(y) == '3' || check_num.charAt(y) == '6' || check_num.charAt(y) == '9') {
					/*
					if (y > 1) {
						System.out.println("\t" + beauty);
					}
					beauty = beauty + "'" + check_num.charAt(y) + "'";
					*/
					check_cnt++;
					System.out.println(check_cnt + "��° �ڼ� - " +i);
					//System.out.println("\t" + beauty);
					
				}
			}
		}
		System.out.println("===============");
		System.out.println("�� �ڼ� Ƚ�� : " + check_cnt);
		
		// =================================================================================
		
		/*
		  	
		  	�����ذ�� - ������ Ǫ�� ���� ã�� ��
		  	������ - �����س� ���� �ڵ�� �����ϴ� ��
		  	���α׷��� ��� ���ط� - ����ϴ� �� ���� ���� ���ص� 
		  	
		  	���� - �ѱ��� ������ �� �־�� ��
		  	
		 */
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("�ڼ� üũ�غ� ���� > ");
		int num = sc1.nextInt();
		
		// 350 % 10
		// 353 / 10 % 10
		// 353 / 100 % 10
		
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			
			int checkNum = i;
			
			System.out.printf("[%d]\t: ", checkNum);
			
			while (checkNum != 0) {
				
				int digit = checkNum % 10;
				
				if (digit % 10 != 0 && digit % 3 == 0) {
					System.out.print("¦");
					count++;
				}
				
				checkNum /= 10;
			}
			System.out.println();
		}
		System.out.printf("�ڼ��� �� %dȸ �ƽ��ϴ�.\n", count);
		
		
		

	}

}
// 3 6 9 13 16 19 23 26 29 












