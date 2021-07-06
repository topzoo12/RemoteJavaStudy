import java.util.Scanner;


public class A08_Scanner {
	
	/*
	 
	  # java.util.Scanner 클래스
	    - 프로그램의 외부로부터 입력을 받을 수 있는 기능들이 구현되어 있는 클래스
	    - 어디에서 입력을 받을지 결정한 뒤에 다양한 값들을 입력받을 수 있다.
	    - 콘솔로부터 입력받고 싶을 때는 System.in을 사용한다.
	  
	 */
	
	public static void main(String[] args) {
		
		// new Scanner(System.in)
				
		Scanner sc = new Scanner(System.in);
		/*
		  - new는 새로운 스캐너를 생성할 때 사용한다.
		  - new를 할때 스캐너에 전달한 입력 통로(InputStream)을 사용해 스캐너를 생성한다.
		  - 즉, System.in으로부터 입력받는 새로운 스캐너를 하나 생성한다.
		  - 그 후 Scanner 타입 변수 sc에 생성한 스캐너를 담아 놓는다
		*/
		
		/*
		   # Scanner 클래스의 nextInt()
		   
		    - 다음으로 들어오는 정수를 하나 꺼낸다.
		    - 스캐너에 꺼낼 값이 아무것도 없을 때는 멈춰서 입력을 계속 기다린다.
		    - 정수만 입력받아야 한다.
		*/

		System.out.print("사과 몇개 필요하세요? ");
		int num = sc.nextInt();
		
		System.out.println((num*500) + "원 입니다.");
		
		
		// 실수를 입력받을 때는 nextDouble()을 사용한다.
		System.out.print("이번에는 소수를 입력해보세요 >> ");
		double d = sc.nextDouble();
		
		System.out.printf("입력한 소수는 %.5f입니다.\n", d);
		
		// 문자열이 아닌 것을 입력받은 스캐너에는 '\n'이 남아있게 된다.
		sc.nextLine(); // 스캐너에 남아있는 '\n' 비우기
		
		// 문자열을 입력받을 때는 next() 또는 nextLine()을 사용한다.
		// next()는 모든 공백을 기준으로 입력받고
		// nextLine()은 '\n'을 기준으로 입력받는다.
		System.out.println("이번에는 문자열을 입력해보세요 >> ");
		String str = sc.nextLine();
		
		System.out.println("당신 : " + str);
		
	}
}












