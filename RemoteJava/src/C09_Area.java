
public class C09_Area {
		
		/*
		
			# 변수의 생명주기 
			
			 - 변수는 해당 변수를 선언한 {}를 벗어나면 죽는다. (변수의 생명주기)
			 - 정확하게 지칭하지 않으면 기본적으로 가장 가까운 위치의 변수를 사용한다.
		
		*/
	// 인스턴스 변수 (instance variable)
	//   a.k.a 멤버(member), 필드(field), 속성(attribute), 속성(property)
	
	int a = 15;
	
	void methodA() {
		// 지역 변수 (local variavle) : 메서드 내부에서 선언된 변수 
		int a = 10;
		System.out.println(a);
	}
	
	void methodB() {
		System.out.println(a);
	}
	
	class Area2 {
		
		public Area2() {
			System.out.println(a);
		}
	}
	
	class Area3 {
		public Area3() {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		
		new C09_Area().new Area2();
		
	}
	
	
}
