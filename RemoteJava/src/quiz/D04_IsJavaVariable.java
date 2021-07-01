package quiz;

import java.util.Scanner;

public class D04_IsJavaVariable {

	/*
	
		����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� �ڹ��� �����ν� ���� �� �ִ��� 
		�˻��ϴ� �޼��带 ����� �׽�Ʈ �غ�����
	
	*/
	
	public static void main(String[] args) {
		
		String check_txt;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� ����� ���ڿ��� �Է����ּ��� > ");
		check_txt = sc.nextLine(); 
		textCheck(check_txt);
		
	}
	
	public static String textCheck(String txt){
		
		int numCheck = 0;
		int specialTxtCheck = 0;
		
		if (Character.isDigit(txt.charAt(0))) {
//			System.out.println("���������� ����� �� �����ϴ�.");
			System.out.println("�������� ���ڷ� ������ �� �����ϴ�");
		}
		
		for (int i = 0; i < txt.length(); i++) {
			char ch = txt.charAt(i);
		
			if (Character.isDigit(ch)) {
				numCheck++;
			} else if (!(Character.isLowerCase(ch) || Character.isUpperCase(ch) || ch == '_' || ch == '$')) {
				specialTxtCheck++;
			}
		}
		
		if (Character.isDigit(txt.charAt(0))) {
			System.out.println("�������� ���ڷ� ������ �� �����ϴ�.");
		}
		
		if (numCheck == txt.length()) {
			System.out.println("�������� ���ڸ����� �̷���� �� �����ϴ�.");
		}
		if (specialTxtCheck > 1) {
			System.out.println("'_', '$' �̿��� Ư�����ڴ� ������ ���Ե� �� �����ϴ�.");
		}
		
		return txt;
	}
	
	
	
	
	
}












