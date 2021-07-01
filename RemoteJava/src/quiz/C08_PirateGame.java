package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.pirate.Graphic;
import myobj.pirate.MrTong;
import myobj.pirate.Player;

public class C08_PirateGame {
		
		/*
		
			1. �÷��̾�� ���ϴ� ���� ���ư��鼭 Į�� ���.
			
			2. ���� �������� ���ư��� ������ �������� �����ȴ�.
			
			3. �÷��̾�� �������� �� �� �ִ�. (�ּ� 2��, �ִ�� ���� ���ڸ�ŭ)
			
			4. �� ���� ������ ���� ������ ������ �� �ִ�.
			
			5. ���� �������� ���� �÷��̾ �й��Ѵ�.
		
		*/
	
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int numOfPlayer = -1;
    while (numOfPlayer < 2) {
            System.out.print("������ �ο� ���� �Է� > ");                
            numOfPlayer = sc.nextInt();
    }
    
    Player[] players = new Player[numOfPlayer];
    
    for (int i = 0; i < numOfPlayer; ++i) {
            players[i] = new Player("�÷��̾�" + (i + 1));
    }
    System.out.println("[System] �÷��̾� ��� �Ϸ�");
    
    // ���߿� �� ũ�� ����
    int size = 30;
    
    while (true) {
        MrTong tong = new MrTong(size);
        int turn = 0;
        
        boolean this_game = true;
        while (this_game) {
            System.out.println((turn + 1) + "�� > \"" 
                            + players[turn % numOfPlayer].getName() + "\"���� ����" );
            Graphic.printTong(tong);
            
            System.out.println();
            
            boolean this_turn = true;
            while (this_turn) {
                int select = 0;
                while (select < 1 || select > size) {
                    System.out.printf("� ���� ��ȣ�� �����ϼ��� (1 ~ %d) : ", size);
                        select = sc.nextInt();
                    }
                    
                    if (tong.stab(select - 1)) {
                            
                        // ��⵵ �����ϰ� �߻絵 ��Ų ���
	                    if (tong.launched) {
	
	                        // ���� ���� �÷��̾�� 1�� �߰�
	                        // ������ �÷��̾���� 1�� �߰�
	                        // ���� �������� �Ѿ�� ��
	                        for (int i = 0; i < numOfPlayer; ++i) {
	                            if (i == turn % numOfPlayer) {
	                                players[i].lose();
	                                System.out.println(players[i].getName() + "���� �й�!");
	                                } else {
	                                    players[i].win();
	                                }
	                        }
	                                    
	                        this_game = false;
	                            
	                    } else { // ������ �߻�� �Ƚ�Ų ���
	                            
	                        // ���� ����� ��� ���� �� 
	                        this_turn = false;
	                    }
                        break;
                    } else {
                    	System.out.println("�̹� �񷶴� ���Դϴ�.");
                    }
            }
            
            turn++;
        }
        
        System.out.println("�� ������ ���۵˴ϴ�!");
        System.out.println("#################################");
        System.out.println("");
        System.out.println("#################################");
        }
}

}
	

		/*
  		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �����ּ��� ");
		//int want_size = sc.nextInt();
		int want_size = 20;
		
		C08_Setting s = new C08_Setting();
		s.Setting(want_size);
		
		System.out.println("-----------------");
		//System.out.println(Arrays.toString(s.hole));
		
		//C08_Setting[] p = new C08_Setting[want_size];
		System.out.println("d///// " + Arrays.toString(s.hole));
		System.out.println("-----------------");
		
		// System.out.println("üũ");
		
		for (int i = 0; i < want_size; i++) {
			
			System.out.println(i + "���� �õ�");
			s.prick(i);
			
			if (i == C08_Setting.trap) {
				System.out.println("���� �� !! ");
				break;
			}
			
		}
		
		/*
		//System.out.println("üũ1");
		s.playerPrick1(0);
		//System.out.println("üũ2");
		s.playerPrick1(1);
		s.playerPrick1(2);
		 */








