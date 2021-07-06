package quiz;

public class C17_InputRightPassword {
	
	/*
	
		# 올바른 패스워드를 만들기 위한 규칙
		
		 1. 모두 숫자이면 안됨
		 
		 2. 대문자와 소문자 숫자 특수문자가 섞여있어야 함
		 
		 3. 특수 문자는 !, @, #, $, %, ^, &, *만 사용 가능합니다.
		 
		 4. 비밀번호의 길이가 8자리 이상 24자리 이하여야 함
		 
		 위의 규칙을 어긴 경우 예외를 발생시켜서 알맞은 안내 문구를 출력해보세요 
		 (여러 규칙을 한번에 어겼다고 해서 모든 것이 나올 필요는 없음)
	
	*/
	
	
	public static void main(String[] args) {
		
		
		//String password = "dfasdfasdfasdf";
		
		
		try {
			passwordCheck();
			System.out.println("올바른 비밀번호 입니다.");
		} catch (NumberingException e) {
			//System.out.println("숫자만으로는 비밀번호ㅇㅇㅇ를 사용할 수 없습니다.");
		} catch (TextException e) {
			//System.out.println("소문자 대문자 특수문자를 하나 이상 꼭 사용하세요");
		} catch (TextLengthException e) {
			//System.out.println("비밀번호의 길이는 ");
		} catch (SpecialTextException e) {
			
		}
		
		
		 
		
	}
	
	public static void passwordCheck() throws NumberingException, TextException, TextLengthException, SpecialTextException{
		String password = "3ddse3#3RR33";
		// password = "333333333333";
		
		int numCnt = 0;
		int upperCnt = 0;	// 대문자
		int lowCnt = 0;		// 소문자
		int specialCnt = 0;
		int otherSpecialCnt = 0;
		char temp;
		
		for (int i = 0; i < password.length(); i++) {
			//System.out.println("밖 : " + temp);
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
//		System.out.println("소문자 : " + lowCnt);
//		System.out.println("대문자 : " + upperCnt);
//		System.out.println("특수문자 : " + specialCnt);
		
		
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
		System.out.println("숫자만으로는 비밀번호를 사용할 수 없습니다.");
	}
}


class TextException extends Exception {
	public TextException() {
		System.out.println("대문자와 소문자 특수문자가 하나 이상 포함되어야 합니다.");
		//System.out.println("특수문자는 !, @, #, $, %, ^, &, * 이 것만 사용가능합니다.");
	}
}

class SpecialTextException extends Exception {
	public SpecialTextException() {
		System.out.println("특수문자는 !, @, #, $, %, ^, &, * 이 것만 사용가능합니다.");
	}
}

class TextLengthException extends Exception {
	public TextLengthException() {
		System.out.println("비밀번호는 8자리 이상 24자리 이하로 입력해주세요.");
	}
}




















