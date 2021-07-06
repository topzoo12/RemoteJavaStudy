import java.util.regex.Pattern;

public class D09_Regex {
	
	/*
		
		# ����ǥ���� ( Regular Expression )  
		 
		 - ���ڿ��� ������ ǥ���� �� �ִ� ǥ����
		 - Ư�� ���α׷��� �� ���ӵ��� �ʴ� ������ ��Ģ�̴�.
		 - ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�.
		 
		# Java���� ����ǥ������ �ٷ� �� ����ϴ� Ŭ���� 
		
		 - Pattern
		 - Matcher
	  
	
	*/

	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input�� regex�� ��ġ�ϴ��� ���θ� �˻�
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[lh@a]eep", "saeep"));
		System.out.println(Pattern.matches("s[l@]ee[abcdefghijk]", "sleek"));
		System.out.println(Pattern.matches("s[l@]ee[abcdefghijkABCDEFG]", "sleeK"));
		
		/*
		
			[abc]  : �ش� �ڸ��� a �Ǵ� b �Ǵ� c�� ���
			[^abc] : �ش� �ڸ��� abc�� ������ ��� ���� ���
			[a-z]  : a���� z���� ��� ��� 
			[A-Z]  : A���� Z���� ��� ���
			[\\-]  : ���ڷμ� -�� ��� (Escape)
			[a-e&&c-z] : a-e�� c-z�� ��� ������Ű�� ������
		
		*/
		
		String temp = "1234";
		
		System.out.println("1 : " + Pattern.matches("s[A-Z]eep", "sAeep"));
		System.out.println("2 : " + Pattern.matches("s[A\\-Z]eep", "sAeep"));
		System.out.println("3 : " + Pattern.matches("s[A\\-Z]eep", "sBeep"));
		System.out.println("4 : " + Pattern.matches("s[A\\-Z]eep", "sCeep"));
		System.out.println("5 : " + Pattern.matches("s[A\\-Z]eep", "s-eep"));
		System.out.println("6 : " + Pattern.matches("s[A\\-Z]eep", "sZeep"));
		System.out.println("7 : " + Pattern.matches("s[a-e&&c-z]eep", "s eep"));
		System.out.println("8 : " + Pattern.matches("s[" + temp + "]eep", "s1eep"));
		
		/*
		
			# �ϳ��� �������ڸ� ��Ÿ���� �͵�
			
			 .  : ��� ����
			 \d : ��� ���� [0-9]
			 \D : ���ڸ� ������ ��� �� [^0-9] 
			 \s : ��� ���� (\t, \n, \r, ' ') 
			 \S : ������ ������ ��� ��
			 \w : �Ϲ����� ���ڵ��� ��� [a-zA-z0-9]
			 \W : \w�� ������ ��� ��
			 
		*/
		
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));
		System.out.println(Pattern.matches("s\\seep", "s eep"));
		
		/*
		
			# �ش� ������ ����� ������ ������ �����ϴ� ���
			 
			 [.]{n} : {}���� ������ n�� ��ġ�ؾ� �Ѵ�.
			 [.]{n, m} : {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�.  
		
		*/
		
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", ".abs."));
	}
	
}























