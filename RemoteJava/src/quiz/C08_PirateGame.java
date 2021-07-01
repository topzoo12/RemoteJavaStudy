package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.pirate.Graphic;
import myobj.pirate.MrTong;
import myobj.pirate.Player;

public class C08_PirateGame {
		
		/*
		
			1. 플레이어는 원하는 곳에 돌아가면서 칼을 찌른다.
			
			2. 해적 아저씨가 날아가는 구멍이 랜덤으로 설정된다.
			
			3. 플레이어는 여러명이 될 수 있다. (최소 2인, 최대는 구멍 숫자만큼)
			
			4. 새 게임 생성시 구멍 개수를 설정할 수 있다.
			
			5. 해적 아저씨를 날린 플레이어가 패배한다.
		
		*/
	
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int numOfPlayer = -1;
    while (numOfPlayer < 2) {
            System.out.print("참여할 인원 수를 입력 > ");                
            numOfPlayer = sc.nextInt();
    }
    
    Player[] players = new Player[numOfPlayer];
    
    for (int i = 0; i < numOfPlayer; ++i) {
            players[i] = new Player("플레이어" + (i + 1));
    }
    System.out.println("[System] 플레이어 등록 완료");
    
    // 나중에 통 크기 결정
    int size = 30;
    
    while (true) {
        MrTong tong = new MrTong(size);
        int turn = 0;
        
        boolean this_game = true;
        while (this_game) {
            System.out.println((turn + 1) + "턴 > \"" 
                            + players[turn % numOfPlayer].getName() + "\"님의 차례" );
            Graphic.printTong(tong);
            
            System.out.println();
            
            boolean this_turn = true;
            while (this_turn) {
                int select = 0;
                while (select < 1 || select > size) {
                    System.out.printf("찌를 곳의 번호를 선택하세요 (1 ~ %d) : ", size);
                        select = sc.nextInt();
                    }
                    
                    if (tong.stab(select - 1)) {
                            
                        // 찌르기도 성공하고 발사도 시킨 경우
	                    if (tong.launched) {
	
	                        // 지금 턴의 플레이어는 1패 추가
	                        // 나머지 플레이어들은 1승 추가
	                        // 다음 게임으로 넘어가야 함
	                        for (int i = 0; i < numOfPlayer; ++i) {
	                            if (i == turn % numOfPlayer) {
	                                players[i].lose();
	                                System.out.println(players[i].getName() + "님의 패배!");
	                                } else {
	                                    players[i].win();
	                                }
	                        }
	                                    
	                        this_game = false;
	                            
	                    } else { // 찔렀지만 발사는 안시킨 경우
	                            
	                        // 다음 사람이 찌르러 가야 함 
	                        this_turn = false;
	                    }
                        break;
                    } else {
                    	System.out.println("이미 찔렀던 곳입니다.");
                    }
            }
            
            turn++;
        }
        
        System.out.println("새 게임이 시작됩니다!");
        System.out.println("#################################");
        System.out.println("");
        System.out.println("#################################");
        }
}

}
	

		/*
  		Scanner sc = new Scanner(System.in);
		System.out.println("구멍의 수를 정해주세요 ");
		//int want_size = sc.nextInt();
		int want_size = 20;
		
		C08_Setting s = new C08_Setting();
		s.Setting(want_size);
		
		System.out.println("-----------------");
		//System.out.println(Arrays.toString(s.hole));
		
		//C08_Setting[] p = new C08_Setting[want_size];
		System.out.println("d///// " + Arrays.toString(s.hole));
		System.out.println("-----------------");
		
		// System.out.println("체크");
		
		for (int i = 0; i < want_size; i++) {
			
			System.out.println(i + "번재 시도");
			s.prick(i);
			
			if (i == C08_Setting.trap) {
				System.out.println("게임 끝 !! ");
				break;
			}
			
		}
		
		/*
		//System.out.println("체크1");
		s.playerPrick1(0);
		//System.out.println("체크2");
		s.playerPrick1(1);
		s.playerPrick1(2);
		 */








