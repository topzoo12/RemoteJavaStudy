package quiz;

import myobj.checkpass.IllegalCharacter;
import myobj.checkpass.IllegalLength;
import myobj.checkpass.NotSatisfiedPassword;
import myobj.checkpass.NumericPassword;

public class C17_InputRightPassword_Teacher {
        /*
                 # 올바른 패스워드를 만들기 위한 규칙
                 
                  1. 모두 숫자이면 안됨
                         
                  2. 대문자와 소문자 숫자 특수문자가 섞여있어야 함
                 
                  3. 특수 문자는 !, @, #, $, %, ^, &, *만 사용 가능
                         
                  4. 비밀번호의 길이가 8자리 이상 24자리 이하여야 함
                 
                 위의 규칙을 어긴 경우 예외를 발생시켜서 알맞은 안내 문구를 출력해보세요.
                 (여러 규칙을 한번에 어겼다고 해서 모든 것이 나올 필요는 없음)         
        */
        public static void main(String[] args) {
                try {
                        check_password("abc@de12345");
                        System.out.println("비밀번호가 정상입니다.");
                } catch (IllegalLength e) {                        
                        System.out.println("길이가 잘못됐습니다.");
                } catch (NumericPassword e) {
                        System.out.println("모두 숫자인 비밀번호입니다. 사용하시겠습니까? [y/N]");
                } catch (NotSatisfiedPassword e) {
                        System.out.println("비밀번호에는 숫자, 특수문자, 대문자, 소문자가 모두 포함되어야 합니다.");
                } catch (IllegalCharacter e) {                        
                        System.out.println("허용되지 않은 문자가 있습니다.");
                }
        }
        
        public static void check_password(String password) 
                        throws IllegalLength, NumericPassword, NotSatisfiedPassword, IllegalCharacter {
                
                int len = password.length();
                
                if (len < 8 || len > 24) {
                        throw new IllegalLength();
                }
                
                if (check_numeric(password.toCharArray())) {
                        throw new NumericPassword();
                }                
                
                if (!check_character_types(password.toCharArray())) {
                        throw new NotSatisfiedPassword();
                }
        }
        
        private static boolean check_special(char ch) {
                String permit = "!@#$%^&*";
                
                for (int i = 0; i < permit.length(); ++i) {
                        if (ch == permit.charAt(i)) {
                                return true;
                        }
                }
                return false;
        }
        
        private static boolean check_character_types(char[] pass) throws IllegalCharacter {
                
                int len = pass.length;                
                
                boolean num = false;
                boolean low = false;
                boolean upper = false;
                boolean special = false;
                
                for (int i = 0; i < len; ++i) {
                        char ch = pass[i];
                        
                        if (ch >= '0' && ch <= '9') {
                                num = true;
                        } else if (ch >= 'a' && ch <= 'z') {
                                low = true;
                        } else if (ch >= 'A' && ch <= 'Z') {
                                upper = true;
                        } else if (check_special(ch)) {
                                special = true;
                        } else {
                                throw new IllegalCharacter();
                        }
                }
                
                return num && low && upper && special;
        }
        
        private static boolean check_numeric(char[] pass) {                
                for (int i = 0, len =  pass.length; i < len; ++i) {                        
                        char ch = pass[i];
                        if (ch < '0' || ch > '9') {
                                return false;
                        }                        
                }
                return true;                
        }
}








/*
package quiz;

import myobj.checkpass.IllegalCharacter;
import myobj.checkpass.IllegalLength;
import myobj.checkpass.NotSatisfiedPassword;
import myobj.checkpass.NumericPassword;

public class C17_InputRightPassword_Teacher {
	
	public static void main(String[] args) {
		
		
		try {
			check_password("abcde12345");
			System.out.println("비밀번호가 정상입니다.");
		} catch (IllegalLength e) {
			System.out.println("길이가 잘못됐습니다.");
		} catch (NumericPassword e) {
			System.out.println("모두 숫자인 비밀번호입니다. 사용하시겠습니까? [Y/N]");
		} catch (NotSatisfiedPassword e) {
			System.out.println("비밀번호에는 숫자, 특수문자, 대문자, 소문자가 모두 포함되어야 합니다.");
		} catch (IllegalCharacter e) {
			System.out.println("허용되지 않은 문자가 있습니다.");
		}
		
		
	}
	
	
	public static void check_password(String password) throws IllegalLength, NumericPassword, NotSatisfiedPassword, IllegalCharacter {
		
		int len = password.length();
		
		if (len < 8 || len > 24) {
			throw new IllegalLength();
		}
		
		if (check_numeric(password.toCharArray())) {
			throw new NumericPassword();
		}
		
		if (!check_character_types(password.toCharArray())) {
			throw new NotSatisfiedPassword();
		}
		
	}
	
	private static boolean check_special(char ch) {
		String permit = "!@#$%^&*";
		
		for (int i = 0; i < permit.length(); i++) {
			if (ch == permit.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	
	private static boolean check_character_types(char[] pass) {
		
		int len = pass.length;
		
		boolean num = false;
		boolean low = false;
		boolean upper = false;
		boolean special = false;
		
		for (int i = 0; i < len; i++) {
			char ch = pass[i];
			
			if (ch >= '0' && ch <= '9')  {
				num = true;
			} else if (ch >= 'a' && ch <= 'z') {
				low = true;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper = true;
			} else if (check_special(ch)) {
				special = true;
			} else {
				throw new IllegalCharacter();
			}
		}
		
		return num && low && upper && special;

	}
	
	
	
	private static boolean check_numeric(char[] pass) {
		
		for (int i = 0, len = pass.length; i < len; i++) {
			char ch = pass[i];
			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	
	
}
*/
















