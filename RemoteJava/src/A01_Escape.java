
public class A01_Escape {
	/*
	
		# Escape 문자 
		
		- 특수한 기능을 가진 문자들
		- 그냥 출력하려고 하면 문제가 발생할 위험이 있는 문자들
		- 앞에 \(역슬래시)가 붙은 문자는 Escape 문자로 간주한다.
		- 앞에 붙은 \와 뒤의 문자를 하나의 문자로 인식한다.
	
	*/
	public static void main(String[] args) {
		
		System.out.println("1. 안녕하세요, 반갑습니다.");
		
		// \n : 줄 바꿈의 기능을 가진 특수 문자 ( linefeed, breakline, newline ... )
		System.out.println("2. 안녕하세요, 반\n갑\n습니다.");
		
		// \t : Tab 키의 기능을 가진 특수 문자
		System.out.println("3. 안녕하세요, 반\t갑\t습니다.");
		
		// \\ : Escape 문자의 기능을 사용하지 않고 그냥 역슬래시를 출력하고 싶을 때 사용 
		System.out.println("4. 안녕하세요, 반\\\\갑\\\\습니다.");
		
		System.out.println("C:\\program files\\java\\jdk 11.0.11");
		System.out.println("\\t : 탭 키의 기능을 한다");
		System.out.println("\\n : 줄 바꾸는 기능을 한다");

		// \" : "의 기능을 사용하지 않고 그냥 "를 출력하고 싶을때 사용
		// \' : '의 기능을 사용하지 않고 그냥 "를 출력하고 싶을때 사용
		System.out.println("그래서 나는 말했습니다. \"나는 못해요.\"");
		System.out.println("그래서 나는 말했습니다. '나는 못해요.'");
		System.out.println("그래서 나는 말했습니다. \'나는 못해요.\'");
		System.out.println((int)'\'');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
