
public class C07_Abstract {
	
	/*
		# �߻� Ŭ���� (abstract class)
		
		 - ���¸� ����� ���� �ϼ��� �ڼ� Ŭ�������� �̷�� Ŭ����
		 - ���ο� �߻� �޼��带 �����ϰ� �ִ� Ŭ���� 
		   
		# �߻� �޼��� (abstract method)
		
		 - ������ ���� �޼���
		 - abstract�� ������ ���� ������ �� ����, ��ӹ��� Ŭ�������� �����ؾ� �Ѵ�.
		
	*/
	public static void main(String[] args) {
		/*
		Pokemon p = new Pikachu();
		
		p.skill1();
		p.skill2();
		*/
		testPokemon(new Pikachu());
		testPokemon(new Longstone());
	}
	
	// Pokemon Ŭ������ ��ӹ��� ��� �ν��Ͻ��� �Ű������� ���� �� �ִ� �޼���
	public static void testPokemon(Pokemon p) {
		p.skill1();
		p.skill2();
	}
	
/*	// �̷��� ����� ���ϸ� �Ѹ��� �߰��Ҷ����� �޼��尡 �ϳ��� �߰��ȴ�. 
	public static void testPokemon(Pikachu p) {
		p.skill1();
		p.skill2();
	}
	
	public static void testPokemon(Longstone stone) {
		stone.skill1();
		stone.skill2();
	}
*/
}

abstract class Pokemon {
	
	abstract void skill1();
	abstract void skill2();
	
}

class Pikachu extends Pokemon{
	
	@Override
	void skill1() {
		System.out.println("�����ġ��");
	}
	
	@Override
	void skill2() {
		System.out.println("�鸸��Ʈ");
	}
	
}

class Longstone extends Pokemon {

	@Override
	void skill1() {
		System.out.println("�ս����� �����ġ��");
	}

	@Override
	void skill2() {
		System.out.println("��ġ��");
	}
	
}












