package quiz;

public class D04_IsJavaVariable_Teacher {
	
	
	public static void main(String[] args) {
		
		String str = "JAva123";
		
		System.out.println(str.toCharArray());
		
		System.out.println(check(str.toCharArray()));
		//check(str);
	
	}
	
	public static boolean check(char[] str) {
		
		
		System.out.print("�Ѿ�� str : ");
		System.out.println(str);
		
		// Character.isJavaIdentifierStart : �ڹ� �������� ù ��° ���ڷ� �������� üũ
		boolean check = Character.isJavaIdentifierStart(str[0]);
		
		// Character.isJavaIdentifierPart : �ڹ� �������� ������ �κ����� �������� üũ 
		for (int i = 1; i < str.length; i++) {
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}
	
	
}
