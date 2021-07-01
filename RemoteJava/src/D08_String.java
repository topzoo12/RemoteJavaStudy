import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class D08_String {
	
	/*
	
	
	
	
	*/
	
	
	public static void main(String[] args) {
		
		String str = "abcdefg";
		String str2 = "hello";
		str2 = "apple/b";
		
		String fruits = "apple/banana/orange/pindeapple/kiwi";
		
//		System.out.println(fruits.length());
//		System.out.println(fruits.lastIndexOf(str2));
		
		
		// String.splite(delimiter) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�.
		String[] splitted = fruits.split("/");
		
//		for (int i = 0; i < splitted.length; i++) {
//			System.out.println(i + " : " + splitted[i]);
//		}
		
		// String.join(delimiter, �̾���̰� ������...) : ���� ���ڿ��� ���ϴ� �����ڸ� �߰��Ͽ� �̾���δ�.
		String after = String.join(", ", splitted);
				
//		System.out.println(after);
//		System.out.println(String.join("-", "����", "���", "����", "�췰", "����"));
//		
//		printRabbitWithMessage("Ŀ��", "����", "�ֽ�", "���", "�Ǹ�");
//		printRabbitWithMessage("����", "����", after);
//		
//		printRabbitWithMessage2(1,23,5,4);
//		System.out.println("==========================================================");
//		System.out.println("==========================================================");
		/*
		// subString(start) : ���ڿ��� start���� ���������� �ڸ� �ν��Ͻ��� ��ȯ 
		// subString(start, end) : ���ڿ��� start���� end�̸����� �ڸ� �ν��Ͻ��� ��ȯ 
		
		String sn = "991231-1234567";
		
		String year = sn.substring(0, 2);
		String month = sn.substring(2, 4);
		String date = sn.substring(4, 6);
		
//		String year = "991231-1234567".substring(0, 2);
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		
		// contains(seq) : ���ڿ��� �ش� ���ڿ��� ���ԵǾ� �ִ��� �˻��Ѵ�.
		String ph = "010-1234-1234";
		System.out.println("ph�� 1234�� ���ԵǾ� �ֳ���? " + ph.contains("1234"));
		System.out.println("ph�� 4321�� ���ԵǾ� �ֳ���? " + ph.contains("4321"));
		System.out.println("ph�� 34-12�� ���ԵǾ� �ֳ���? " + ph.contains("34-12"));
		
		// startWith(seq) : ���ڿ��� �ش� ���ڿ��� �����ϴ��� �˻��Ѵ�.
		System.out.println("ph�� 010���� �����ϳ���? " + ph.startsWith("010"));
		
		// endsWith(seq) : ���ڿ��� �ش� ���ڿ��� �������� �˻��Ѵ�.
		System.out.println("ph�� 4�� ��������? " + ph.endsWith("4"));
		
		// replace(old, new) : ���ڿ��� �ٸ� ���ڿ��� ��ü�� �ν��Ͻ��� ��ȯ�Ѵ�.
		String result = ph.replace("1234", "abcd");
		System.out.println("���� : " + ph + ", ��� : " + result);
		
		// getBytes() : ���ڿ��� byte[]�� ��ȯ�Ѵ�.
		System.out.println(Arrays.toString("Hello".getBytes()));
		System.out.println(Arrays.toString("�Ⱦȳ���ϼ��� �ݰ����ϴ�".getBytes()));
		
		// � ��Ģ�� ����� byte[]�� ��ȯ���� ������ �� �ִ�.
		try {
			System.out.println("�ȳ��ϼ���".getBytes("UTF-8"));
			System.out.println("�ȳ��ϼ���".getBytes("UTF-16"));
			System.out.println("�ȳ��ϼ���".getBytes("EUC-KR"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		*/
		System.out.println("=======================================================");
		/*
		// byte[]�� �������� �����͵��� �ٽ� ���ڿ��� ��ĥ �� �ִ�.
		byte[] message = "�ȳ��ϼ��� �ݰ����ϴ�.".getBytes();
		System.out.println(message);
		System.out.println(new String(message));
		
//		�� : 50504 (10) / c548 (16) / 11000101[-66] 01001000[-56] (2)
//		System.out.println(Integer.toString('��', 2));
		
		
		// trim() : ���ڿ� �ٱ����� ������ �������ش�.
		String user_input = "\t  java \n";
		String answer = "java";
		
		System.out.println(user_input.replace(" ", "").equals(answer));
		System.out.println(user_input.replace(" ", ""));
		System.out.println(user_input.trim().equals(answer));
		
		// toUpperCase() : ���ڿ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�.
		// toLowerCase() : ���ڿ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�.
		String text = "Hello, Java!!";
		System.out.println(text.toUpperCase());
		System.out.println(text.toUpperCase().toLowerCase());
		System.out.println(text.toLowerCase());
		*/
		
		// indexOf(seq) : ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�. 
		// indexOf(seq, start) : ���� ��ġ���� ���ϴ� ���ڿ��� �ε����� ��ȯ�Ѵ�.
		String languages = "Java, Python, C, C++, C#, Kotlin, JavaScript";
		
		languages += languages;
		languages += languages;
		languages += languages;
		
		System.out.println(languages.indexOf("Java"));
		System.out.println(languages.indexOf("Java", 1));
		
		
		// ���� : languages���� ��� "Java"��� ���ڿ��� �ε����� ã�� ��
		//       ������ �÷��ǿ� �����Ͽ� ����غ�����
// =====================================================================================		
		ArrayList<Integer> indexes = new ArrayList<>();
		
		String search = "Java";
		
//		int start = 0;
//		int found = -1;
//		while ((found = languages.indexOf(search, start)) != -1 ) {
//			indexes.add(found);
//			start = found + 1;
//		}
// =====================================================================================
//		int start = 0;
		
		int found = -1;
		while ((found = languages.indexOf(search, found + 1)) != -1 ) {
			indexes.add(found);
		}
		
//		for (int start = 0; start < languages.length();) {
//			int index = languages.indexOf(search, start);
//			
//			if (index == -1) {
//				break;
//			}
//			
//			System.out.println("�̹��� ã�� : " + index);
//			indexes.add(index);
//			start = index + 1;
//		}
// =====================================================================================		

//		HashSet<Integer> numbers = new HashSet<>();
//		
//		int index_num = 0;
//		
//		for (int i = 0; i < languages.length(); i++) {
//			
//			System.out.println(i);
//			if (languages.indexOf("Java", index_num) >= index_num) {
//				numbers.add(languages.indexOf("Java", index_num));
//				i = index_num++;
//			}
//		}
		System.out.println("ã���� : " + indexes);
// =====================================================================================		
		
//		System.out.println(numbers);
		
//		for (int i = 0; i < javas1.length; i++) {
//			
//			System.out.println(javas1[i]);
//			if (javas[i].equals("Java")) { 
//				System.out.println(i + " : " + javas[i]);
//			}
//		}
		
		
		
		
		
		
		
	}
	
	
	// Type... : ��������, �������� ���� ������ ���ڸ� �ش� Ÿ�� �迭�� �Ѱܹ��� �� �ִ�.
	//  �� �������ڴ� �׻� �޼����� �������� �����ؾ� �Ѵ�.
	static void printRabbitWithMessage(String... msgs) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��)");
		System.out.println(Arrays.toString(msgs));
	}
	
	static void printRabbitWithMessage2(int... msgs) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >��)");
		System.out.println(Arrays.toString(msgs));
	}

}




















