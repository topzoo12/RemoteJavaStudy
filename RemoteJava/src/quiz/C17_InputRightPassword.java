package quiz;

public class C17_InputRightPassword {
	
	/*
	
		# �ùٸ� �н����带 ����� ���� ��Ģ
		
		 1. ��� �����̸� �ȵ�
		 
		 2. �빮�ڿ� �ҹ��� ���� Ư�����ڰ� �����־�� ��
		 
		 3. Ư�� ���ڴ� !, @, #, $, %, ^, &, *�� ��� �����մϴ�.
		 
		 4. ��й�ȣ�� ���̰� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� ��
		 
		 ���� ��Ģ�� ��� ��� ���ܸ� �߻����Ѽ� �˸��� �ȳ� ������ ����غ����� 
		 (���� ��Ģ�� �ѹ��� ���ٰ� �ؼ� ��� ���� ���� �ʿ�� ����)
	
	*/
	
	
	public static void main(String[] args) {
		
		
		//String password = "dfasdfasdfasdf";
		
		
		try {
			passwordCheck();
			System.out.println("�ùٸ� ��й�ȣ �Դϴ�.");
		} catch (NumberingException e) {
			//System.out.println("���ڸ����δ� ��й�ȣ�������� ����� �� �����ϴ�.");
		} catch (TextException e) {
			//System.out.println("�ҹ��� �빮�� Ư�����ڸ� �ϳ� �̻� �� ����ϼ���");
		} catch (TextLengthException e) {
			//System.out.println("��й�ȣ�� ���̴� ");
		} catch (SpecialTextException e) {
			
		}
		
		
		 
		
	}
	
	public static void passwordCheck() throws NumberingException, TextException, TextLengthException, SpecialTextException{
		String password = "3ddse3#3RR33";
		// password = "333333333333";
		
		int numCnt = 0;
		int upperCnt = 0;	// �빮��
		int lowCnt = 0;		// �ҹ���
		int specialCnt = 0;
		int otherSpecialCnt = 0;
		char temp;
		
		for (int i = 0; i < password.length(); i++) {
			//System.out.println("�� : " + temp);
			temp = password.charAt(i);
			
			if (temp >= '0' && temp <= '9') {
				numCnt++;
			} 
			
			if (temp >= 'a' && temp <= 'z') {
				lowCnt++;
			} else if (temp >= 'A' && temp <= 'Z') {
				upperCnt++;
			} else if (temp == '!' || temp == '@' || temp == '#' || temp == '$' || 
					   temp == '%' || temp == '^' || temp == '&' || temp == '*') {
				specialCnt++;				
			} else if (!(temp == '!' || temp == '@' || temp == '#' || temp == '$' || 
					   temp == '%' || temp == '^' || temp == '&' || temp == '*') 
					&& !(temp >= '0' && temp <= '9') 
					&& !(temp >= 'a' && temp <= 'z')
					&& !(temp >= 'A' && temp <= 'Z')
					) {
				otherSpecialCnt++;
				//System.out.println(temp);
			}
			
		}
//		System.out.println("�ҹ��� : " + lowCnt);
//		System.out.println("�빮�� : " + upperCnt);
//		System.out.println("Ư������ : " + specialCnt);
		
		
		// System.out.println(numCnt);
		
		if (numCnt == password.length()) {
			throw new NumberingException();
		} 
		if (lowCnt < 1 || upperCnt < 1 || specialCnt < 1 || numCnt < 1) {
			throw new TextException();
		}
		if (password.length() < 8 && password.length() > 24) {
			throw new TextLengthException();
		}
		if (otherSpecialCnt > 1) {
			throw new SpecialTextException();
		}

	}
}


class NumberingException extends Exception{
	public NumberingException() {
		System.out.println("���ڸ����δ� ��й�ȣ�� ����� �� �����ϴ�.");
	}
}


class TextException extends Exception {
	public TextException() {
		System.out.println("�빮�ڿ� �ҹ��� Ư�����ڰ� �ϳ� �̻� ���ԵǾ�� �մϴ�.");
		//System.out.println("Ư�����ڴ� !, @, #, $, %, ^, &, * �� �͸� ��밡���մϴ�.");
	}
}

class SpecialTextException extends Exception {
	public SpecialTextException() {
		System.out.println("Ư�����ڴ� !, @, #, $, %, ^, &, * �� �͸� ��밡���մϴ�.");
	}
}

class TextLengthException extends Exception {
	public TextLengthException() {
		System.out.println("��й�ȣ�� 8�ڸ� �̻� 24�ڸ� ���Ϸ� �Է����ּ���.");
	}
}




















