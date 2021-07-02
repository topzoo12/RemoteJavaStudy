package quiz;

public class D07_CheckValidSocialNumber {
	
	/*
		
		사용자가 주민등록번호를 입력하면 
		그 주민등록번호가 유요한지 검사하는 프로그램을 만들어보세요
		
		맨앞 2자리 숫자 
		월 자리에 01 ~ 12 이내의 숫자
		일 자리에 01 ~ 31 이내의 숫자
		(1, 3, 5, 7, 8, 10, 12월이면 31 / 4, 6, 9, 11월 이면 30 / 2월은 윤년일때 29 아니면 28)
		7번째 자리 '-'
		뒷자리 전부 숫자 

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
			System.out.println("주민등록번호는 - 포함 14자리 입니다.");
		} else if (!checkNumeric(socialNum)) {
			valid = false;
			System.out.println("- 와 숫자가 아닌 다른 문자열은 입력할 수 없습니다.");
		} else if (Integer.parseInt(month_check) < 0 || Integer.parseInt(month_check) > 12) {
			valid = false;
			System.out.println("01 ~ 12 사이의 알맞은 달을 입력하세요");
		} else if ( ((Integer.parseInt(month_check) == 1) ||  
					(Integer.parseInt(month_check) == 3) ||
					(Integer.parseInt(month_check) == 5) ||
					(Integer.parseInt(month_check) == 7) ||
					(Integer.parseInt(month_check) == 8) ||
					(Integer.parseInt(month_check) == 10) ||
					(Integer.parseInt(month_check) == 12) ) && 
						Integer.parseInt(days_check) < 0 || Integer.parseInt(days_check) > 31) {
			valid = false;
			System.out.println("01 ~ 31 사이의 알맞은 일을 입력하세요");
		} else if ( ((Integer.parseInt(month_check) == 4) ||  
				(Integer.parseInt(month_check) == 6) ||
				(Integer.parseInt(month_check) == 9) ||
				(Integer.parseInt(month_check) == 11) ) && 
					Integer.parseInt(days_check) < 0 || Integer.parseInt(days_check) > 30) {
			valid = false;
			System.out.println("01 ~ 30 사이의 알맞은 일을 입력하세요");
		} else if (((yunChcek == false) && (Integer.parseInt(month_check) == 2)) &&
				Integer.parseInt(days_check) < 0 || Integer.parseInt(days_check) > 29) {
			valid = false;
			System.out.println("윤년에는 29일 까지의 알맞은 일을 입력하세요");
		} else if (((yunChcek == true) && (Integer.parseInt(month_check) == 2)) &&
				Integer.parseInt(days_check) < 0 || Integer.parseInt(days_check) > 28) {
			valid = false;
			System.out.println("윤년에는 29일 까지의 알맞은 일을 입력하세요");
		}
//		System.out.println(front);
//		System.out.println(second);
			
		return valid;
	}
	
	public static void main(String[] args) {
		
		String socialNum = "961212-1314346";
		
		checkValidSocialNumber((socialNum).toCharArray());
		
		
		if (checkValidSocialNumber((socialNum).toCharArray())) {
			System.out.println("올바른 주민등록번호 입니다.");
		} else {
			System.out.println("올바르지 않은 주민등록번호 입니다.");
		}
		
	}
}
