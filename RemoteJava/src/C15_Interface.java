
public class C15_Interface {
	/*
	
		# 인터페이스 ( Interface )
		
		 - class는 상속을 여러개 받을 수 없다는 점을 보완한 것 
		 - 인터페이스 내부의 메서드는 자동으로 abstract public이 된다.
		 - 인터페이스 내부의 변수는 자동으로 final static이 된다.
	
	*/
	public static void main(String[] args) {
		kick(new AppleTree());
		kick(new Ball());
		kick(new Cankick() {
			
			@Override
			public void kick() {
				System.out.println("대문을 발로 찼습니다.");
			}
			
		});
		
		click(new AppleTree());
		//click(new Ball());
	}
	
	public static void kick(CanKick to_kick) {
		to_kick.kick();
	}
	
	public static void click(CanClick to_click) {
		to_click.click();
	}
}


//abstract class Cankick {
interface Cankick {
	public abstract void kick();
}

//abstract class CanClick {
interface CanClick {
	public abstract void click();
}

// 인터페이스에는 빈 껍데기만 만들어 놓는다.
class AppleTree implements Cankick, CanClick{
	@Override
	public void kick() {
		System.out.println("사과나무를 발로 찼더니 나뭇가지와 사과가 떨어졌습니다.");
	}
	
	@Override
	public void click() {
		System.out.println("사과나무를 클릭해서 사과를 수확했습니다.");
	}
}

class Ball implements Cankick {
	@Override
	public void kick() {
		System.out.println("공을 발로 찼습니다.");
	}
}



















