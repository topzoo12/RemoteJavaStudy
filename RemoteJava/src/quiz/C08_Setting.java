package quiz;

//import java.lang.reflect.Array;

public class C08_Setting {
	
	static int trap;
	static int hole_size;
	static int player_size;
	
	//boolean[] hole = new boolean[20];
	boolean[] hole;
	
	public void Setting(int size) {
		hole_size = size;
		//trap = (int)(Math.random() * hole.length);
		
		hole = new boolean[size];

		System.out.println(trapHole());
		/*	
		System.out.println("�������� ���� ���� ���ϱ� �� - " + trap);
		
		System.out.println("trapHole ���� �� - " + trap);
		System.out.println("������?? - " + hole[trap]);
		System.out.println(hole.length);
		*/
	}
	
	int trapHole() {
		trap = (int)(Math.random() * (hole.length - 1));
		System.out.println("������ : " + trap);
		// trap = 3;
		hole[trap] = true;
		return trap;
	}
	
	public void prick(int num) {
			
		if (num == trap) {
			System.out.println("��!! ");
			System.out.println("�ޡߡޡߡޡߡޡߡޡߴ���� �����ϴ�.�ޡߡޡߡޡߡޡߡޡ�");
			System.out.println();
		} else if (hole[num] == true) {
			System.out.println("�̹� Į�� ���� ĭ�Դϴ�.");
			return;
		} else {
			hole[num] = true;
			System.out.println("���");
		}
		
	}
	
	
	
	

}
