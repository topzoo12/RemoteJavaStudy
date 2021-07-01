package quiz;

import myobj.checkpass.IllegalCharacter;
import myobj.checkpass.IllegalLength;
import myobj.checkpass.NotSatisfiedPassword;
import myobj.checkpass.NumericPassword;

public class C17_InputRightPassword_Teacher {
        /*
                 # �ùٸ� �н����带 ����� ���� ��Ģ
                 
                  1. ��� �����̸� �ȵ�
                         
                  2. �빮�ڿ� �ҹ��� ���� Ư�����ڰ� �����־�� ��
                 
                  3. Ư�� ���ڴ� !, @, #, $, %, ^, &, *�� ��� ����
                         
                  4. ��й�ȣ�� ���̰� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� ��
                 
                 ���� ��Ģ�� ��� ��� ���ܸ� �߻����Ѽ� �˸��� �ȳ� ������ ����غ�����.
                 (���� ��Ģ�� �ѹ��� ���ٰ� �ؼ� ��� ���� ���� �ʿ�� ����)         
        */
        public static void main(String[] args) {
                try {
                        check_password("abc@de12345");
                        System.out.println("��й�ȣ�� �����Դϴ�.");
                } catch (IllegalLength e) {                        
                        System.out.println("���̰� �߸��ƽ��ϴ�.");
                } catch (NumericPassword e) {
                        System.out.println("��� ������ ��й�ȣ�Դϴ�. ����Ͻðڽ��ϱ�? [y/N]");
                } catch (NotSatisfiedPassword e) {
                        System.out.println("��й�ȣ���� ����, Ư������, �빮��, �ҹ��ڰ� ��� ���ԵǾ�� �մϴ�.");
                } catch (IllegalCharacter e) {                        
                        System.out.println("������ ���� ���ڰ� �ֽ��ϴ�.");
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
			System.out.println("��й�ȣ�� �����Դϴ�.");
		} catch (IllegalLength e) {
			System.out.println("���̰� �߸��ƽ��ϴ�.");
		} catch (NumericPassword e) {
			System.out.println("��� ������ ��й�ȣ�Դϴ�. ����Ͻðڽ��ϱ�? [Y/N]");
		} catch (NotSatisfiedPassword e) {
			System.out.println("��й�ȣ���� ����, Ư������, �빮��, �ҹ��ڰ� ��� ���ԵǾ�� �մϴ�.");
		} catch (IllegalCharacter e) {
			System.out.println("������ ���� ���ڰ� �ֽ��ϴ�.");
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
















