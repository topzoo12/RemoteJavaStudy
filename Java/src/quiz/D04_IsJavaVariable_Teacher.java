package quiz;

public class D04_IsJavaVariable_Teacher {
	
	
	public static void main(String[] args) {
		
		String str = "JAva123";
		
		System.out.println(str.toCharArray());
		
		System.out.println(check(str.toCharArray()));
		//check(str);
	
	}
	
	public static boolean check(char[] str) {
		
		
		System.out.print("넘어온 str : ");
		System.out.println(str);
		
		// Character.isJavaIdentifierStart : 자바 변수명의 첫 번째 글자로 적합한지 체크
		boolean check = Character.isJavaIdentifierStart(str[0]);
		
		// Character.isJavaIdentifierPart : 자바 변수명의 나머지 부분으로 적합한지 체크 
		for (int i = 1; i < str.length; i++) {
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}
	
	
}
