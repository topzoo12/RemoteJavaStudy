import java.util.regex.Matcher;
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
			 [.]{n,m} : {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�.
			 [.]{n,} : {}���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�
			 [.]? : ? ���� ������ 0�� �Ǵ� �ѹ� ���;� �Ѵ�.
			 [.]+ : + ���� ������ �ּ� �ѹ� �̻� ���;� �Ѵ�.
			 [.]* : * ���� ������ 0�� �̻� ���;� �Ѵ�.
		
		*/ 
		
//		System.out.println(Pattern.matches("[.a-zA-Z]{5}", ".abs."));
//		
//		System.out.println(Pattern.matches("[.]{2,5}", "."));
//		System.out.println(Pattern.matches("[.]{2,5}", ".."));
//		System.out.println(Pattern.matches("[.]{2,5}", "..."));
//		System.out.println(Pattern.matches("[.]{2,5}", "...."));
//		System.out.println(Pattern.matches("[.]{2,5}", "....."));
//		System.out.println(Pattern.matches("[.]{2,5}", "......"));
//		
//		System.out.println(Pattern.matches("s?heep", "sheep"));
//		System.out.println(Pattern.matches("s?heep", "ssssheep"));
//		System.out.println(Pattern.matches("s?heep", "heep"));
//		System.out.println(Pattern.matches("s?heep", "kheep"));
//		System.out.println(Pattern.matches("s+heep", "sssssheep"));
//		System.out.println(Pattern.matches("s+heep", "heep"));
//		
//		System.out.println(Pattern.matches("http://", "http://"));
//		System.out.println(Pattern.matches("(010{1})", "http://"));
//		System.out.println(Pattern.matches("010", "http://"));
//		System.out.println(Pattern.matches("[-+]h", "+h"));
		
		
		
		
		// �������� : �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
//		System.out.println("======================================");
//		System.out.println(Pattern.matches("01[016789](-\\d{4}){2}", "010-2234-5678"));
//		
//		System.out.println(Pattern.matches("01[016789]-?[2-9]\\d{3}-?\\d{4}", "010-2234-5678"));
//		
//		System.out.println(Pattern.matches("01[016789]-[\\d]{4}-[\\d]{4}", "010-2234-5678"));
//		
//		System.out.println(Pattern.matches("01[016789]-?[\\d]{4}-?[\\d]{4}", "010-2234-5678"));
//		
//		System.out.println(Pattern.matches("01[016789]-[0-9]{4}-[0-9]{4}", "010-2234-5678"));
//		
//		System.out.println(Pattern.matches("01[016789]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]", "010-2234-5678"));
//		
		// �������� : �ش� ���ڿ��� �ֹε�Ϲ�ȣ���� �˻��� �� �ִ� ����ǥ������ �������� 
		System.out.println("===================================================================");
		System.out.println(Pattern.matches("\\d{2}[01]1[0-3]3-?[1-4]\\d{6}", "870123-1234567"));
		
		System.out.println(Pattern.matches("\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])-?[1-4]\\d{6}", "870123-1234567"));
		System.out.println("===================================================================");
		// �������� : �ش� ���ڿ��� �� �������� �˻��� �� �ִ� ����ǥ������ �������� 
		System.out.println(Pattern.matches("[\\w]+@", "ddfa@"));
		System.out.println(Pattern.matches("[\\w]+@[\\w]+", "ddfa@dfda"));
		System.out.println(Pattern.matches("[\\w]+@[\\w]+.", "ddfa@dfda."));
		System.out.println(Pattern.matches("[\\w]+@[\\w]+[.][\\w]+", "ddfa@dfda.com"));
		System.out.println(Pattern.matches("[\\w]{2,}@[\\w]{2,}[.][\\w]+", "ddfa@dfda.com"));
//		System.out.println(Pattern.matches("[\\w]{2,}", "ddfa"));
		
		System.out.println(Pattern.matches("[\\w]+@[\\w]+([.][\\w]+)?([.][\\w]+)?", "ddfa@dfda.co.kr"));
		
		
		
		// # Matcher ����ؼ� �� ���ڿ� �˻��ϱ�
		
		
		String fruit = "apple/banana/orange/pineapple/greenaplpe/redapple/mango";
		
//		Pattern pattern1 = Pattern.compile("a.{2}le");
		Pattern pattern1 = Pattern.compile("na");
		
		// pattern1�� fruit�� �˻��� ����� ��ȯ�Ѵ�. 
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : ã�� �͵� �߿� ���� ���� �����ϸ� true
		while (matcher.find()) {
			System.out.println("ã�� �� : " + matcher.group());
			System.out.println("��ġ : '" + matcher.start() + "' ���� '" +  matcher.end() + "' ����");
			System.out.println(fruit.substring(matcher.start(), matcher.end()));
		}
		
		// 
		
		
		
	}
	
}























