package myobj;

public class Weapon {
	/* 
		������ �Ӽ�
		 - ���ݷ�
		 - ���� ��ȭ ���
		 - ������ ��ȭ Ȯ�� (��޸��� ��ȭ Ȯ���� �ٸ�)
		 - ������ ���ݷ� ������
		 - 
		 
		������ �޼���
		 - ��ȭ����
		   ������ ��ȭ Ȯ���� ���� ��ȭ�� �����ϰų� �����Ѵ�. (����)
		   �����ϸ� ��ȭ ����� 1 �����Ѵ�.
		   �����ϸ� ��ȭ ����� �״�� �����ȴ� (���Ѵٸ� ����߷��� ����)
		
		 - �����ϱ� 
		   ���ݷ��� Ȯ���� �� �ִ�.
	
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
				System.out.println("\t      ���ݷ�   ���ⷹ��  ��ȭ������ ���ݷ�������");
			}
			System.out.print(i + "���� ��ȭ���� : ");
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
	double attack_damage;			// ���� ������
	int weapon_level;				// ���� ����
	double probabilities;			// ��ȭȮ��
	double attack_increase;			// ������������
	
	Weapon_info(double attack_damage, int weapon_level, double probabilities, double attack_increase) {
		this.attack_damage = attack_damage;
		this.weapon_level = weapon_level;
		this.probabilities = probabilities;
		this.attack_increase = attack_increase;
		
	}
	
}
//===================================================================================================
//===================================================================================================
