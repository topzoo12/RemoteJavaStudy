package quiz;

public class D07_CheckValidSocialNumber {
	
	/*
		
		����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ� 
		�� �ֹε�Ϲ�ȣ�� �������� �˻��ϴ� ���α׷��� ��������
		
		�Ǿ� 2�ڸ� ���� 
		�� �ڸ��� 01 ~ 12 �̳��� ����
		�� �ڸ��� 01 ~ 31 �̳��� ����
		(1, 3, 5, 7, 8, 10, 12���̸� 31 / 4, 6, 9, 11�� �̸� 30 / 2���� �����϶� 29 �ƴϸ� 28)
		7��° �ڸ� '-'
		���ڸ� ���� ���� 

	*/
	private static boolean checkNumeric(char[] socialNum) {
		
		for (int i = 0; i < socialNum.length; i++) {
			
			if ((i != 6) && Character.isDigit(socialNum[i])) {
				continue;
			} else if (socialNum[6] == '-') {
				continue;
			} else {
				return false;
			}	
		}
		
		return true;
	}
	
	
	
	public static boolean checkValidSocialNumber(char[] socialNum) {

		
		boolean valid = true;
		
		String front = "";
		String second = "";
		
		String month_check = "";
		String days_check = "";
		
		String yun = "" + socialNum[0] + socialNum[1];
		boolean yunChcek = false;
		
		int a;
		
		a = Integer.parseInt(yun);
		
		if (socialNum[7] == 1 || socialNum[7] == 2) {
			a = 1900 + a;
		} else if (socialNum[7] == 3 || socialNum[7] == 4) {
			a = 2000 + a;
		}
		
		if(a%4 == 0){
            if(a%400 != 0 && a%100 == 0) {
            	yunChcek = true;
            }
            else {
            	yunChcek = false;
            }	
        }
        else{
        	yunChcek = true;
        }
		
		
//		System.out.println(socialNum.length);
		for (int i = 0; i < socialNum.length; i++) {
			if (i < 6) {
				front += socialNum[i];
			} else if (i > 6) {
				second += socialNum[i];
			}
		}
		month_check = "" + socialNum[2] + socialNum[3];
		days_check = "" + socialNum[4] + socialNum[5];
		
		if (socialNum.length != 14) {
			valid = false;
			System.out.println("�ֹε�Ϲ�ȣ�� - ���� 14�ڸ� �Դϴ�.");
		} else if (!checkNumeric(socialNum)) {
			valid = false;
			System.out.println("- �� ���ڰ� �ƴ� �ٸ� ���ڿ��� �Է��� �� �����ϴ�.");
		} else if (Integer.parseInt(month_check) < 0 || Integer.parseInt(month_check) > 12) {
			valid = false;
			System.out.println("01 ~ 12 ������ �˸��� ���� �Է��ϼ���");
		} else if ( ((Integer.parseInt(month_check) == 1) ||  
					(Integer.parseInt(month_check) == 3) ||
					(Integer.parseInt(month_check) == 5) ||
					(Integer.parseInt(month_check) == 7) ||
					(Integer.parseInt(month_check) == 8) ||
					(Integer.parseInt(month_check) == 10) ||
					(Integer.parseInt(month_check) == 12) ) && 
						Integer.parseInt(days_check) < 0 || Integer.parseInt(days_check) > 31) {
			valid = false;
			System.out.println("01 ~ 31 ������ �˸��� ���� �Է��ϼ���");
		} else if ( ((Integer.parseInt(month_check) == 4) ||  
				(Integer.parseInt(month_check) == 6) ||
				(Integer.parseInt(month_check) == 9) ||
				(Integer.parseInt(month_check) == 11) ) && 
					Integer.parseInt(days_check) < 0 || Integer.parseInt(days_check) > 30) {
			valid = false;
			System.out.println("01 ~ 30 ������ �˸��� ���� �Է��ϼ���");
		} else if (((yunChcek == false) && (Integer.parseInt(month_check) == 2)) &&
				Integer.parseInt(days_check) < 0 || Integer.parseInt(days_check) > 29) {
			valid = false;
			System.out.println("���⿡�� 29�� ������ �˸��� ���� �Է��ϼ���");
		} else if (((yunChcek == true) && (Integer.parseInt(month_check) == 2)) &&
				Integer.parseInt(days_check) < 0 || Integer.parseInt(days_check) > 28) {
			valid = false;
			System.out.println("���⿡�� 29�� ������ �˸��� ���� �Է��ϼ���");
		}
//		System.out.println(front);
//		System.out.println(second);
			
		return valid;
	}
	
	public static void main(String[] args) {
		
		String socialNum = "961212-1314346";
		
		checkValidSocialNumber((socialNum).toCharArray());
		
		
		if (checkValidSocialNumber((socialNum).toCharArray())) {
			System.out.println("�ùٸ� �ֹε�Ϲ�ȣ �Դϴ�.");
		} else {
			System.out.println("�ùٸ��� ���� �ֹε�Ϲ�ȣ �Դϴ�.");
		}
		
	}
}
