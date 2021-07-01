
public class B02_CharAt2 {
		/*
		  	# "문자열".charAt(index);
		  	
		  	 - 해당 문자열에서 원하는 번째의 문자를 char 타입으로 꺼내는 함수
		  	 - 첫 뻔재 문자는 0번 인덱스에 있다.
		  	 
		  	# "문자열".charAt(index);
		  	 
		  	 - 해당 문자열이 총 몇 글자인지를 int 타입으로 알려준다.
		  
		 */
	
	public static void main(String[] args) {
		
			String text = "Hello, everyone!!";
			
			System.out.println(text.charAt(0));
			System.out.println(text.charAt(1));
			System.out.println(text.charAt(2));
			System.out.println(text.charAt(3));
			System.out.println(text.charAt(4));
			
			// 0번 인덱스부터 17개의 문자가 있기 때문에 16번 인덱스가 마지막이다.
			System.out.println(text.length());
			System.out.println(text.charAt(text.length() - 1));
			System.out.println(text.charAt(text.length() - 2));
			System.out.println(text.charAt(text.length() - 3));
			System.out.println(text.charAt(text.length() - 4));
			System.out.println(text.charAt(text.length() - 5));
			
		
	}
}
