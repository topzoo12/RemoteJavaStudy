import myobj.ClassOfDiffPackage;

public class C08_AccessModifier extends ClassOfDiffPackage {
	
	public C08_AccessModifier() {
		super(); 
		System.out.println(super._protected_int);
	}
	
	
	/*
	
		# 접근 제어자 (Access Modifier)
		
		 - 다른 클래스에서 해당 클래스의 자원을 사용하려고 할 때 허용 범위를 설정한다. 
	
		# 접근 제어자를 통해 설정할 수 있는 허용 범위
		
		 - private : 같은 클래스 내부에서만 접근할 수 있는 자원
		 - default : 같은 패키지 내부에서만 접근할 수 있는 자원
		 - protected : 다른 패키지에서 상속받은 클래스에서만 접근할 수 있는 자원
		 - public : 다른 패키지에서도 자유롭게 접근할 수 있는 자원
		 
		# 접근 제어자의 장점
		
		 - public으로 설정하지 않은 모든 클래스 내의 자원들은 다른 패키지에서 노출되지 않는다.
		 - 해당 클래스를 만든 개발자가 아닌 다른 개발자가 해당 클래스를 사용할때 자원을
		   잘못된 방법으로 사용하는 것을 방지할 수 있다. 
	
	*/
	
	public static void main(String[] args) {
		C08_ClassOfSamePackage instance = new C08_ClassOfSamePackage();
		
		myobj.ClassOfDiffPackage diff = new myobj.ClassOfDiffPackage();
		
		new C08_AccessModifier();
		
	}
	
	
}
