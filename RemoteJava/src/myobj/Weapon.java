package myobj;

public class Weapon {
	/* 
		무기의 속성
		 - 공격력
		 - 현재 강화 등급
		 - 레벨별 강화 확률 (등급마다 강화 확률이 다름)
		 - 레벨별 공격력 증가폭
		 - 
		 
		무기의 메서드
		 - 강화가기
		   레벨별 강화 확률에 따라 강화가 성공하거나 실패한다. (랜덤)
		   성공하면 강화 등급이 1 증가한다.
		   실패하면 강화 등급이 그대로 유지된다 (원한다면 떨어뜨려도 좋음)
		
		 - 공격하기 
		   공격력을 확인할 수 있다.
	
	*/
	
	public static void main(String[] args) {
		
		Forge ff = new Forge();
		
		int aa = 10; 
		int bb = 2;
		
		
		ff.plus(10, 1);
		ff.plus(20, 2);
		ff.plus(30, 3);
		ff.plus(40, 4);
		
			
		for (int i = 0; i < ff.queue.length; i++) {
			if (i == 0) {
				System.out.println("\t      공격력   무기레벨  강화성공률 공격력증가폭");
			}
			System.out.print(i + "방의 강화정보 : ");
			System.out.print(ff.queue[i].attack_damage + "\t");
			System.out.print(ff.queue[i].weapon_level + "\t");
			System.out.print(ff.queue[i].probabilities + "\t");
			System.out.println(ff.queue[i].attack_increase);
		}
		
	}
	
		
}
// ===================================================================================================
// ===================================================================================================

class Weapon_info {
	double attack_damage;			// 무기 데미지
	int weapon_level;				// 무기 레벨
	double probabilities;			// 강화확률
	double attack_increase;			// 데미지증가폭
	
	Weapon_info(double attack_damage, int weapon_level, double probabilities, double attack_increase) {
		this.attack_damage = attack_damage;
		this.weapon_level = weapon_level;
		this.probabilities = probabilities;
		this.attack_increase = attack_increase;
		
	}
	
}
//===================================================================================================
//===================================================================================================
