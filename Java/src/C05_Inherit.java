
public class C05_Inherit {
	/*

		# 클래스 상속
		
		 - 예전에 미리 만들어 뒀던 클래스를 그대로 물려받아서 사용하는 것 
		 - 물려받은 후에는 해당 클래스를 마음대로 고쳐서 사용할 수 있다. (오버라이드)
		 - 원본의 보존하면서 새롭게 수정해볼 수 있는 것이 장점이다.
		 - 상속받는 클래스를 자식 클래스 또는 서브 클래스라고 부른다.
		 - 상속해주는 클래스를 부모 클래스 또는 슈퍼 클래스라고 부른다.
		 
		# 상속의 규칙
		 
		 - extends라는 키워드를 사용한다
		 - 생성자에서 반드시 가장 먼저 부모 클래스의 생성자를 호출해야 한다.
		 - 부모 클래스와 자식 클래스에 똑같은 이름을 가진 자원이 있는 경우에는
		   super와 this로 명확하게 구분할 수 있다.
		 - super()는 부모의 생성자를 뜻한다 
		   this()는 자신의 생성자를 뜻한다.
	
	*/
	
	public static void main(String[] args) {
		Person gildong = new Person("고길동", 42);
		
		gildong.sayHi();
		
		Programmer chulsoo = new Programmer("김철수", 28);
		
		// Programmer에 sayHi()를 만든적이 없지만 부모이 메서드를 물려받아 사용하고 있다.
		chulsoo.sayHi();
		
		// 물려받은 후 자식 클래스에만 새로 추가한 메서드
		// 부모 클래스의 원형을 훼손하지 않고 추가적인 개발을 진행할 수 있다.
		chulsoo.program("오목");
		
	}
	

}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sayHi() {
		System.out.println("안녕? 내이름은 '" + name + "'이야. 나이는 '" + age + "'살 이야.");
	}
	
}

// Person 클래스를 상속받은 Programmer 클래스
class Programmer extends Person{
	
	Programmer(String name, int age) {
		super(name, age);
	}
	
	void program(String to_program) {
		System.out.println("프로그래머 '" + name + "'씨는 '" + to_program + "'을 만들기 시작했습니다." );
	}
	
	// Override(짓밟다) : 자식 클래스는 부모의 클래스의 메서드를 마음대로 수정해서 사용할 수 있다.
	void sayHi() {
		System.out.println(name + "씨는 인사를 했습니다. print(\"Hello, World!\")");
	}
	
}
	// ====================================================================================================
	// ====================================================================================================

class Tree {
	public Tree(int abc) {
		
	}
}

class OrangeTree extends Tree{
	OrangeTree() {
		// 부모클래스에 기본 생성자가 있는 경우는 super()를 생략할 수 있다.
		super(123);
	}
}


















