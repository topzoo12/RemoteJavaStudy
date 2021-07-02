import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_Exception {
	
	/*
	
		# 예외 (Exception)
		
		 - 우리가 에러라고 알고 있던 빨간 글씨들을 사실 예외라고 부른다.
		 - 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러라고 부른다 ( 오타 등 )
		 - 프로그래머가 발생 가능한 예외를 미리 예상하고 대비해두는 것을 예외처리라고 부른다.
		 - 예외처리의 기본 동작은 프로그램 강제종료이지만 프로그래머가 다른 조치를 취한다면
		   프로그램을 계속해서 진행할 수 있다.
		 
		# 예외 처리 절차 
		
		 - 에외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다.
		 - try문 내부의 코드에서 예외가 발생하지 않으면 모두 정상 실행된다.
		 - try문 내부에서 예외가 발생하는 즉시 실행을 중단하고 발생한 예외를 담당하는 
		   catch문으로 넘어가게 된다.
		 - catch문에는 발생한 예외에 대한 정보를 담고있는 예외 인스턴스가 전달 된다.
		 - catch문은 중첩해서 여러개 사용할 수 있다
		 - 예외가 발생하든 안하든 무조건 실행하고 싶은 코드는 finally절에 작성한다.
		 - 
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] values = new int[5];
		
		try {
			System.out.println("반드시 10진수 정수만 입력해주세요 ^^");
			int a = sc.nextInt();
			System.out.println(10 / 0);
			System.out.println(values[5]);
		} catch (ArithmeticException e) {
			// Exception.printStackTrace() : 예외가 발생한 시점의 스택 모습을 출력하는 메서드
//			e.printStackTrace();
//			e.toString();
//			System.out.println(e);
			System.out.println("말도 안되는 계산을 하셨네요. 다음부터는 그러지 마세요.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("최대 인덱스는 길이보다 1 작습니다 ^^");
		} catch (InputMismatchException e) {
			System.out.println("반드시 10진수 정수만 입력하라고 했을텐데?");
		} finally {
			System.out.println(" /)/)");
			System.out.println("(  ..)");
			System.out.println("(  >♡)");
			System.out.println("Have a Good Time.");
		}
		System.out.println("Hello!! 프로그램 끝");
	}	
}


















