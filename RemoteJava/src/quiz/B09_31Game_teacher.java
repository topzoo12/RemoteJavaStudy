package quiz;

import java.util.Scanner;

public class B09_31Game_teacher {

	public static void main(String[] args) {
			
		int turn = (int)(Math.random() * 2);
		int num = 0;
		boolean check = true;
		
		Scanner sc = new Scanner(System.in);
		
		if (turn == 0) {
			System.out.println("��ǻ�� ����!");
		} else { 
			System.out.println("�÷��̾� ����");
		}
		
		while (num < 31) {
			
			if (turn == 0) {
				int com = (int)(Math.random() * 3 + 1);
				num += com;
				System.out.printf("��ǻ�� %d�� ������ϴ�. [���� ����:%d]\n", com, num);
			}else {
				
				int user = 0;
				while (user < 1 || user > 3) {
					System.out.println("1, 2, 3? ");
					num += sc.nextInt();
				}
				num += user;
				
				System.out.printf("[���� ����:%d]\n", num);
			}
			// ���� 0�� 1�� �ݺ��ǰ� ��
			turn = (turn + 1) % 2;
		}
		
		String winner = turn == 0 ? "��ǻ��" : "�÷��̾�";		//	���� ������
		System.out.printf("���� ����! %s�� �¸�!", winner);
		
		//System.out.printf("���� ����! %s�� �¸�!", turn == 0 ? "��ǻ��" : "�÷��̾�");
		/*
		if (turn == 0) {
			System.out.println("���� ����! ��ǻ���� �¸�!");
		}else {
			System.out.println("���� ����! �÷��̾��� �¸�!");
		}
		 */
		

		
		
	}

}
