
public class C02_OOP {
	
	/*

		# 객체지향 프로그래밍 (OOP : Object Oriented Programming)
		
		  - 세상에 존재하는 모든 것들을 변수와 함수로 표현하려는 프로그래밍 방법론
		  - 변수와 함수를 무분별하게 사용하기 보다는 
		    현실에 존재하는 객체 단위로 묶어서 표현하여 가독성을 올린다. 
		  - 객체 (Object) : 세상에 존재하는 모든 것 ( 사물, 개념, .. 등등 )
		  
		    ex: 사과
		      - 사과의 변수 : 크기, 당도, 색깔, 칼로리, 유통기한, 모양 ...  
		      - 사과의 메서드
			      (1) 먹는다 (크기가 줄어들면서 칼로리만큼 먹은 사람의 칼로리 증가).
			      (2) 색이 변한다.
			      (3) 유통기한이 줄어든다.
			      (4) 던진다 (크기만큼의 데미지를 입힌다.
			      (5) 냉장고에 보관한다 (유통기한이 느리게 감소한다)
			      
		  ※ 클래스에 딸려 있는 함수들을 메서드라고 부른다 (JAVA에는 메서드밖에 없다)
		
		# 클래스
		
		  - 객체를 프로그래밍 언어로 표현한 것
		  - 클래스는 해당 객체의 설계도이다. (정의한 시점에서는 실체가 없다)
		  - 설계도대로 찍어내는 실제 객체를 '인스턴스'라고 부른다. 
		  - 클래스는 참조형 변수 타입이다.
	
	*/
	
	// main은 반도스 public class 내부에 존재해야 한다.
	// (파일 이름과 똑같은 이름의 클래스에 존재해야 찾을 수 있다.)
	public static void main(String[] args) {

		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		a1.size = 15;
		a1.color = "빨간색";
		
		a2.size = 13;
		a2.color = "보라색";
		
		a3.size = 25;
		a3.calorie = 100;
				
		System.out.println(a1.color);
		System.out.println(a2.color);
		
		System.out.println("먹기 전 '사과'의 크기: " + a3.size);
		System.out.println("먹기 전 '사과'의 크기: " + a3.calorie);
		
		a3.eat();
		
		System.out.println("먹은 후 '사과'의 크기: " + a3.size);
		System.out.println("먹은 후 '사과'의 크기: " + a3.calorie);
		
		
		
		System.out.println("=========================================");
		
		BankAccount bank = new BankAccount();
		
		bank.balance = 100000000;
		bank.bankCompany = "우리";
		 
	
		
		System.out.println("현재잔고\t\t: " + bank.balance);
		
		bank.monthIncome();
		
		System.out.println("월급 후\t\t: " + bank.balance);
		
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		
		System.out.println("월세 후\t\t: " + bank.balance);
		
		
		
		
		HealthyCare diet = new HealthyCare();
		
		diet.weight = 78;
		diet.height = 173;
		diet.bodyFatPercentage = diet.weight / ((diet.height*10) * (diet.height*10));
		
		System.out.println((double)78/(173*100) );
		System.out.println(diet.weight);
		System.out.println("전 : " + diet.bodyFatPercentage);
		diet.run(2);
		
		System.out.println("후 : " + diet.bodyFatPercentage);
		System.out.println(diet.weight);
		
		
		Window window1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();
		
		w3.status();
		
		w2.open();
		w2.status();
		
		
		window1.open();
		window1.close();
		window1.lock();
		
		window1.status();
		
		String status = window1.getStatus();
		System.out.println("가져온 상태 문자열로 출력 : " + status);
		
		
	}
}


class Apple {
	
	/*
	  
	 # 인스턴스 변수 
	 
	  - 클래스 내부에 선언한 변수
	  - 인스턴스 마다 각자의 영역을 가지고 있다.
	  - aka. 필드, 속성, 멤버 변수, 멤버, 상태 ... 
	  
	 */
	int size;
	double sweet;
	String color;
	int calorie;
	
	/*
	
		# 인스턴스 메서드
		 
		  - 인스턴스 변수를 통해 해당 인스턴스의 상태를 변화시키는 메서드
	
	*/
	void eat () {
		size--;
		calorie -= 10;
	}
	
	
}

/*
 	연습문제 : 현실의 객체를 참고하여 클래스를 하나 생성한 후 인스턴스를 생성하고 값을 채운다음 출력해보세요.
 	
 	※ 인스턴스 변수는 3개 이상, 인스턴스 메서드 2개 이상, 과일 금지

*/

class BankAccount {
	
	int balance;			// 잔고
	int income = 2000000;	// 수입
	int expense;			// 지출
	String bankCompany;		// 은행
	
	void monthIncome() {
		balance += income;
	}
	
	void monthlyRentPay() {
		balance -= 500000;
	}
	
	void payTransfer() {
		bankCompany = "국민";
	}
	
}


class HealthyCare {
	
	double weight;
	double bodyFatPercentage;
	double height;
	
	void run(int hour) {
		weight -= 0.4 * hour;
		bodyFatPercentage = weight / ((height*10) * (height*10)) ;
	}
	/*
	void eat() {
		weight += 
	}
	*/
	
	
	
}

class Window {

boolean open;
boolean lock;
double width;
double height;

	void open() {
		open = true;
	}
	void close() {
		open = false;
	}
	void lock() {
		lock = true;
	}
	
	void unlock() {
		lock = true;
	}
	
	void status() {
		System.out.printf("이 창문은 %s. [%s]\n",
				open ? "열려있습니다." : "닫혀있습니다.",
				lock ? "잠겨있습니다." : "잠금해제 상태입니다."
				);
		
	}
	
	String getStatus() {
		// String.format() : 서식을 이용해 원하는 문자열을 생성한다.
		return String.format("이 창문은 %s. [%s]\n",
				open ? "열려있습니다." : "닫혀있습니다.",
				lock ? "잠겨있습니다." : "잠금해제 상태입니다."
				);
	}
	
	
}
















