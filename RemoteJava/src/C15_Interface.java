
public class C15_Interface {
	/*
	
		# �������̽� ( Interface )
		
		 - class�� ����� ������ ���� �� ���ٴ� ���� ������ �� 
		 - �������̽� ������ �޼���� �ڵ����� abstract public�� �ȴ�.
		 - �������̽� ������ ������ �ڵ����� final static�� �ȴ�.
	
	*/
	public static void main(String[] args) {
		kick(new AppleTree());
		kick(new Ball());
		kick(new Cankick() {
			
			@Override
			public void kick() {
				System.out.println("�빮�� �߷� á���ϴ�.");
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

// �������̽����� �� �����⸸ ����� ���´�.
class AppleTree implements Cankick, CanClick{
	@Override
	public void kick() {
		System.out.println("��������� �߷� á���� ���������� ����� ���������ϴ�.");
	}
	
	@Override
	public void click() {
		System.out.println("��������� Ŭ���ؼ� ����� ��Ȯ�߽��ϴ�.");
	}
}

class Ball implements Cankick {
	@Override
	public void kick() {
		System.out.println("���� �߷� á���ϴ�.");
	}
}



















