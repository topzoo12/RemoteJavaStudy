
public class C13_LocalInnerClass {
	
	/*
		# 지역 내부 클래스 
		
		 - 클래스는 사실 메서드 내부에서도 정의할 수 있다.
		 - 메서드가 끝나면 해당 클래스도 수명이 다한다.
	
	*/
	public static void main(String[] args) {
		
		// 메서드 내부에도 클래스를 사용할 수 있음
		class Apple {
			
			int price;
			int color;
			
			public Apple(int price, int color) {
				
				this.price = price;
				this.color = color;
			}
			
			@Override
			public String toString() {
				return "price : " + price + "원\ncolor값 : " + color;
			}	
		}
		Apple a = new Apple(1000, 1);
		System.out.println(a);
		
		// 다음과 같은 상황에 o.check()를 실행할 수 없는 이유를 200자 이내로 서술하시오
		//Object o = banana();
		
		Fruitt fruit = execBanana();
		System.out.println("바나나는 개당 " + fruit.check() + "원 입니다.");
		 
		//o.check();
		
		
		//banana();
	}
	
	public static Fruitt execBanana() {
		class Banana extends Fruitt{
			int bana_count;
			int price;
			
			public Banana (int bana_count, int price) {
				this.bana_count = bana_count;
				this.price = price;
			}
			
			double check() {
				return price / (double)bana_count;
			}
		}
		
		return new Banana(1, 3000);
		//System.out.println(new Banana(11, 3000).check() + "원");
	}
}

abstract class Fruitt {
	abstract double check();
	
}



















