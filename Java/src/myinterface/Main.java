package myinterface;

public class Main {
	public static void main(String[] args) {
		
		// Vehicle 인터페이스를 구현한 무언가를 만들고 테스트해보세요
//		Bus b = new Bus();
//		test(b);
		
		CarEngine car = new CarEngine();
		tt(car);	
	}
	
	
	public static void tt (Overheat overheat) {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("온도가 증가합니다 현재 온도는 : " + overheat.overheating() + " 도 입니다.");
			overheat.overheating();
			overheat.overheating();
			overheat.overheating();
		}
		
		for (int i = 0; i < 50; i++) {
			if (overheat.cooling() <= 0) {
				System.out.println("모든 열이 사라졌습니다.");
				break;
			} else {
				System.out.println("온도가 감소합니다 현재 온도는 : " + overheat.cooling() + " 도 입니다.");
			}
			//overheat.cooling();
		}
		
		System.out.println(overheat.condition());
		
	}
	
	
	
	public static void test(Vehicle vehicle) {
		
		for (int i = 0; i < 100; i++) {
			System.out.println("속도를 더 냈습니다.");
			System.out.println("현재 속도는 " + vehicle.acceleration() + " km/h 입니다.");
		}
		
		System.out.println("무서워서 속도를 감소합니다.");
		for (int i = 0; i < 30; i++) {
			System.out.println("현재 속도는 " + vehicle.deceleration() + " km/h 입니다.");
		}
		
		for (int i = 0; i < 15; i++) {
			if (!vehicle.ride()) {
				System.out.println("더 이상 탈 수 없습니다.");
			} else {
				System.out.println("한명이 더 탔습니다.");
			}
		}
	}
	
	
	
	
}



















