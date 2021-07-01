package quiz;

public class D09_BruteForce_Teacher {
	
	
	static String charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
//							 abcdefghijklnmopqrstuvwxyz
		
	public static void main(String[] args) {
		bruteforce(10);
	}
	
	/*
		# 10진수의 경우
		
		 1234567
		
		 - 1234567 % 10 => 7 (일의 자리 분리)
		 - 1234567 / 10 => 123456 (일의 자리 삭제)
		 - 123456 % 10 => 6 (일의 자리 분리)
		 - 123456 % 10 => 12345 (일의 자리 삭제)
		 
	
	*/
	public static void bruteforce(int password_size) {
		char[] arr = charset.toCharArray();
		int len = charset.length();
		long all_password = (long) Math.pow(len, password_size);
		
		for (long i = 0; i < all_password; i++) {
			
			long value = i;
			
			String password = "";
			
			while (value > 0) {
				password += arr[(int)(value % len)];
//				System.out.print(arr[(int)(value % len)]);
				value /= len;		// value = value / len;
			}
			
			if (password.length() < password_size) {
				
				int gap = password_size - password.length();
				
				for (int j = 0; j < gap; j++) {
					password = "a" + password;
				}
			}
			
			System.out.println(password);
		}
		
		System.out.println("len : " + len);
	}
	

}













