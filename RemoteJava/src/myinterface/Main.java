package myinterface;

public class Main {
	public static void main(String[] args) {
		
		// Vehicle �������̽��� ������ ���𰡸� ����� �׽�Ʈ�غ�����
//		Bus b = new Bus();
//		test(b);
		
		CarEngine car = new CarEngine();
		tt(car);	
	}
	
	
	public static void tt (Overheat overheat) {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("�µ��� �����մϴ� ���� �µ��� : " + overheat.overheating() + " �� �Դϴ�.");
			overheat.overheating();
			overheat.overheating();
			overheat.overheating();
		}
		
		for (int i = 0; i < 50; i++) {
			if (overheat.cooling() <= 0) {
				System.out.println("��� ���� ��������ϴ�.");
				break;
			} else {
				System.out.println("�µ��� �����մϴ� ���� �µ��� : " + overheat.cooling() + " �� �Դϴ�.");
			}
			//overheat.cooling();
		}
		
		System.out.println(overheat.condition());
		
	}
	
	
	
	public static void test(Vehicle vehicle) {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("�ӵ��� �� �½��ϴ�.");
			System.out.println("���� �ӵ��� " + vehicle.acceleration() + " km/h �Դϴ�.");
		}
		
		System.out.println("�������� �ӵ��� �����մϴ�.");
		for (int i = 0; i < 30; i++) {
			System.out.println("���� �ӵ��� " + vehicle.deceleration() + " km/h �Դϴ�.");
		}
		
		for (int i = 0; i < 15; i++) {
			if (!vehicle.ride()) {
				System.out.println("�� �̻� Ż �� �����ϴ�.");
			} else {
				System.out.println("�Ѹ��� �� �����ϴ�.");
			}
		}
	}
	
	
	
	
}



















