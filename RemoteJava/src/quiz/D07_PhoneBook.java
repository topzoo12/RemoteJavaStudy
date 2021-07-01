package quiz;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class D07_PhoneBook {
	
	
	public class Info {
		// ������ ��� ��
		
		String name;
		int age;
		String male;
		
		
		public Info(String name, int age, String male) {
			this.name = name;
			this.age = age;
			this.male = male;
		}
	}
	
	HashMap<String, HashMap<String, Info>> phonebook;
	
	HashMap<String, Info> d;
	
	{System.out.println("1!!");}
	static {System.out.println("static block!!");}
//	{System.out.println("1!!");}
	
	public D07_PhoneBook() {
		phonebook = new HashMap<>();
		System.out.println("2!!");
		
//		phonebook.put("�б�", );
	}
// ===================================================================================================	
// ===================================================================================================
	public static void main(String[] args) {
		D07_PhoneBook a = new D07_PhoneBook();
		
//		a.new_group("�б�");
		a.new_group("�п�");
		a.new_group("�п�1");
		a.new_group("�п�2");
		a.new_group("�п�3");
		a.new_group("�п�4");
		a.new_phone_num("�п�", "010-1234-1111");
		a.new_phone_num("�п�", "010-8888-2222");
		a.new_phone_num("�п�", "010-1234-3333");
		a.new_phone_num("�п�", "010-1234-1234");
		a.new_phone_num("�п�1", "010-4321-4321");
		a.new_phone_num("�п�2", "010-8888-1234");
		a.new_phone_num("�п�3", "010-7777-1234");
		a.new_phone_num("�п�4", "010-1234-1234");
		
//		for (String key : a.phonebook.keySet()) {
//			System.out.println("�ݺ������� ���� ���� : " + a.phonebook.get(key).get("010-1234-1234").male);
//		}
		System.out.println("============================================");
//		a.search_name();
		a.whos_num("8888");
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//		a.whos_num("010-4321-4321");
		
//		System.out.println(a.phonebook.);
//		System.out.println(a.phonebook.get("�п�").get("010-1234-1234").name);
//		System.out.println(a.phonebook.get("�п�").get("010-1234-1234").age);
//		System.out.println(a.phonebook.get("�п�").get("010-1234-1234").male);
		
	}
// ===================================================================================================	
// ===================================================================================================
	
	public void new_group(String group) {
		
		phonebook.put(group, new HashMap<String, Info>());
		
//		System.out.println(phonebook.get(group));		
//		phonebook.put("�б�", new  D07_PhoneBook.Info("010-1234-1234", 22, "M")); 
		
	}
	
	public void new_phone_num(String group, String phone_num) {
		
//		HashMap<String, Info> d = (HashMap<String, Info>) phonebook.get(group);
		d = (HashMap<String, Info>) phonebook.get(group);
		
		String name;
		int age;
		String male;
		
//		Scanner sc = new Scanner(System.in);
//		Scanner sc1 = new Scanner(System.in);
//		
//		System.out.println("�̸��� �Է����ּ��� > ");
//		name = sc.nextLine();
//		
//		System.out.println("���̴� ����ΰ���? > ");
//		age = sc.nextInt();
//		
//		System.out.println("�����̸� M �����̸� F�� �Է����ּ��� > ");
//		male = sc1.nextLine();
//		male = sc.nextLine();
		
		name = "ȫ�浿";
		age = 23;
		male = "M";
		
//		System.out.println(d);
		d.put(phone_num, new D07_PhoneBook.Info(name, age, male));
		
//		System.out.println(d.get("010-1234-1234").name);
	}
	
	public void sort() {
		
	}
	
	public void search_name() {
		
		String name = "ȫ�浿";
		String num = "010-1234-1234";
		
		String dd;
		
//		System.out.println(phonebook.containsKey(phonebook.get("010-1234-1234")));
//		System.out.println(phonebook.containsValue(phonebook.get("010-1234-1234")));
//		System.out.println(phonebook.containsValue(phonebook.equals("010-1234-1234")));
//		System.out.println(phonebook.containsKey(phonebook.get("�п�")));
		
		for (String key : phonebook.keySet()) {
			System.out.println("�ݺ��� ���� : " + phonebook.get(key).get("010-1234-1234").name);
			System.out.println("�ݺ��� ���� : " + phonebook.get(key));
		}
		
		System.out.println(phonebook.containsValue(phonebook.get("�п�")));
		System.out.println(phonebook.get("�п�").get(num));
		System.out.println("==============================================");
		
		System.out.println(phonebook.get("�п�").containsValue("010-1234-1234"));
		System.out.println(phonebook.get("�п�").containsValue(num));
		
		System.out.println("==============================================");
//		System.out.println(phonebook.containsValue(phonebook.get("�п�")));
		System.out.println(phonebook.containsValue(phonebook.get("�п�").equals("010-1234-1234")));
		System.out.println(phonebook.containsKey(phonebook.equals("�п�")));
		System.out.println("==============================================");
		System.out.println(phonebook.containsValue(phonebook.get("�п�").get("010-1234-1234")));
		
		
	}
	
	public void search_phone_num() {
		
	}
	
	public void whos_num(String num) {
//		String num2 = "010-4321-4321";
		System.out.println(num);
		
//		System.out.println(phonebook.get("�п�1").keySet().toString().contains("432"));
//		System.out.println("1111111");
		
		for (Entry<String, HashMap<String, Info>> entry : phonebook.entrySet()) {
			
			System.out.print(entry.getKey() + "\t :");
			System.out.println(entry.getValue());
			
			for (Entry<String, Info> entry1 : d.entrySet()) {
				System.out.print(entry1.getKey() + "\t :");
				System.out.println(entry1.getValue());
				
				if (entry1.getKey().contains("010")) {
					System.out.println("����!?");
				}
				
			}
		}
		
		
//		System.out.println(phonebook.keySet());
//		System.out.println(phonebook.values());
//		System.out.println(phonebook.entrySet());
		
//		System.out.print("�������� �ȵɰų�?  ");
//		System.out.println(phonebook.containsKey(phonebook.get("�п�")));
//		System.out.println(phonebook.containsValue(phonebook.get("�п�")));
//		System.out.println(phonebook.get("�п�").containsKey(num));
//		System.out.println("====****************************");
//		System.out.println(phonebook.get("�п�1").keySet().contains("432"));
//		System.out.println(phonebook.get("�п�1").keySet().toString().contains("432"));
//		
//		System.out.println(phonebook.get("�п�").toString().contains("010-1234"));
//		System.out.println(phonebook.get("�п�").toString().contains("123"));
//		System.out.println(phonebook.get("�п�").get(num).toString());
//		System.out.println(phonebook.get("�п�").get(num).toString().equals("ȫ�浿"));
//		System.out.println("======================");
//		System.out.println("dd   - " + phonebook.get("�п�").containsValue(num));
//		System.out.println("rr   - " + phonebook.get("�п�").equals(num));
//		System.out.println("aa   - " + phonebook.get("�п�").get(num).name);
//		System.out.println("aa   - " + phonebook.get("�п�").get(num).age);
//		System.out.println("aa   - " + phonebook.get("�п�").get(num).male);
//		
//				
//		System.out.println(phonebook.get("�п�1"));
//		System.out.println("aa   - " + phonebook.get("�п�1").get(num2).name);
//		System.out.println("aa   - " + phonebook.get("�п�1").get(num2).age);
//		System.out.println("aa   - " + phonebook.get("�п�1").get(num2).male);
		
//		System.out.println(phonebook.get("�п�").containsKey(num));
//		System.out.println(phonebook.get("�п�").get(num));
//		
//		System.out.println(phonebook.get("�п�").size());
	}
	
	
	
	/*
	
		# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
		
		 1. phonebook���� "�׷�/��ȭ��ȣ/����" �� ������ �� �ִ�.
		 2. �׷���� Ű ������ ������ �ش� �׷쿡 �ش��ϴ� HashMap�� ���� �� �ִ�.
		 3. ���� HashMap�� ��ȭ��ȣ�� ������ �̸��� ���� �� �ִ�.
		 
		# �����ؾ� �� �޼���
		
		 1. ���ο� �׷��� �߰��ϴ� �޼���
		 2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
		 3. ��ϵ� ��� ��ȣ�� ������ �׸�(Info�� �ʵ�) �������� ����/������������ �����ִ� �޼���
		 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ �˻��Ǵ� �޼���
		 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
	
	 */

	
	

}

























