package quiz;

import java.util.ArrayList;

public class D09_dd {
	
	/*
	  
  		[abc]  : �ش� �ڸ��� a �Ǵ� b �Ǵ� c�� ���
		[^abc] : �ش� �ڸ��� abc�� ������ ��� ���� ���
		[a-z]  : a���� z���� ��� ��� 
		[A-Z]  : A���� Z���� ��� ���
		[\\-]  : ���ڷμ� -�� ��� (Escape)
		[a-e&&c-z] : a-e�� c-z�� ��� ������Ű�� ������
	
		# �ϳ��� �������ڸ� ��Ÿ���� �͵�
		
		 .  : ��� ����
		 \d : ��� ���� [0-9]
		 \D : ���ڸ� ������ ��� �� [^0-9] 
		 \s : ��� ���� (\t, \n, \r, ' ') 
		 \S : ������ ������ ��� ��
		 \w : �Ϲ����� ���ڵ��� ��� [a-zA-z0-9]
		 \W : \w�� ������ ��� ��
		 
		 
		 a-zA-z0-9
		 
*/

	
		public static void main(String[] args) {
			
			ArrayList<String> ha = new ArrayList<>();
			
			String password = "asd";
			
			String a = "";
			
			for (int i = (char)'a'; i <= (char)'z'; i++) {
				a = "" + (char)i;
				ha.add(a);
			}
			
			for (int i = (char)'A'; i <= (char)'Z'; i++) {
				a = "" + (char)i;
				ha.add(a);
			}
			
			for (int i = (char)'0'; i <= (char)'9'; i++) {
				a = "" + (char)i;
				ha.add(a);
			}
			ha.add("!");
			ha.add("@");
			ha.add("#");
			ha.add("$");
			ha.add("%");
			ha.add("^");
			ha.add("&");
			ha.add("*");
			ha.add("(");
			ha.add(")");
			
//			System.out.println(ha.get(ha.size()-1));
			
//			System.out.println(ha.size());
			
			for (int i = 0; i < ha.size(); i++) {
				System.out.print(ha.get(i));
			}
			System.out.println();
			System.out.println("======");
			
			int len = password.length();
			int cnt = 0;
			int cnt1 = 0;
			int cnt_result = 0;
			
//			System.out.println(Integer.toString('��', 2));
			System.out.println(len);
//			System.out.println(Arrays.toString("Hello".getBytes()));
//			System.out.println((Integer.parseInt(password)));
//			System.out.println(password);
//			System.out.println(password.charAt(0));
			System.out.println(ha.size());
			
//			System.out.println(password.charAt(len-1));
			
//			System.out.println(password.indexOf(len-1));
//			System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000".length());
			for (int i = 0; i < len; i++) {
				while (cnt < ha.size()) {
					while (cnt1 < len) {
//						System.out.print(ha.get(i));
						cnt1++;
						cnt_result++;
					}
					cnt1 = 0;
//					System.out.println("");
					cnt++;
				}
				cnt = 0;
//				System.out.println();
			}
			System.out.println(cnt_result);
			
//			for (int i = 0; i < password.length(); i++) {
//				for (int ii = 0; ii < ha.size(); ii++) {
//					while (cnt < len) {
//						System.out.println(a);
////						System.out.print(ii);
//						cnt++;
//					}
//					cnt = 0;
//					System.out.println();
//					
//				}
//			}
			
			
		}
}














