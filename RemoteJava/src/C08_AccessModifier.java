import myobj.ClassOfDiffPackage;

public class C08_AccessModifier extends ClassOfDiffPackage {
	
	public C08_AccessModifier() {
		super(); 
		System.out.println(super._protected_int);
	}
	
	
	/*
	
		# ���� ������ (Access Modifier)
		
		 - �ٸ� Ŭ�������� �ش� Ŭ������ �ڿ��� ����Ϸ��� �� �� ��� ������ �����Ѵ�. 
	
		# ���� �����ڸ� ���� ������ �� �ִ� ��� ����
		
		 - private : ���� Ŭ���� ���ο����� ������ �� �ִ� �ڿ�
		 - default : ���� ��Ű�� ���ο����� ������ �� �ִ� �ڿ�
		 - protected : �ٸ� ��Ű������ ��ӹ��� Ŭ���������� ������ �� �ִ� �ڿ�
		 - public : �ٸ� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ�
		 
		# ���� �������� ����
		
		 - public���� �������� ���� ��� Ŭ���� ���� �ڿ����� �ٸ� ��Ű������ ������� �ʴ´�.
		 - �ش� Ŭ������ ���� �����ڰ� �ƴ� �ٸ� �����ڰ� �ش� Ŭ������ ����Ҷ� �ڿ���
		   �߸��� ������� ����ϴ� ���� ������ �� �ִ�. 
	
	*/
	
	public static void main(String[] args) {
		C08_ClassOfSamePackage instance = new C08_ClassOfSamePackage();
		
		myobj.ClassOfDiffPackage diff = new myobj.ClassOfDiffPackage();
		
		new C08_AccessModifier();
		
	}
	
	
}
