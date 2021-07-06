package quiz;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class D07_PhoneBook {
	
	
	public class Info {
		// 내용은 양심 껏
		
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
		
//		phonebook.put("학교", );
	}
// ===================================================================================================	
// ===================================================================================================
	public static void main(String[] args) {
		D07_PhoneBook a = new D07_PhoneBook();
		
//		a.new_group("학교");
		a.new_group("학원");
		a.new_group("학원1");
		a.new_group("학원2");
		a.new_group("학원3");
		a.new_group("학원4");
		a.new_phone_num("학원", "010-1234-1111");
		a.new_phone_num("학원", "010-8888-2222");
		a.new_phone_num("학원", "010-1234-3333");
		a.new_phone_num("학원", "010-1234-1234");
		a.new_phone_num("학원1", "010-4321-4321");
		a.new_phone_num("학원2", "010-8888-1234");
		a.new_phone_num("학원3", "010-7777-1234");
		a.new_phone_num("학원4", "010-1234-1234");
		
//		for (String key : a.phonebook.keySet()) {
//			System.out.println("반복문으로 꺼낸 내용 : " + a.phonebook.get(key).get("010-1234-1234").male);
//		}
		System.out.println("============================================");
//		a.search_name();
		a.whos_num("8888");
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//		a.whos_num("010-4321-4321");
		
//		System.out.println(a.phonebook.);
//		System.out.println(a.phonebook.get("학원").get("010-1234-1234").name);
//		System.out.println(a.phonebook.get("학원").get("010-1234-1234").age);
//		System.out.println(a.phonebook.get("학원").get("010-1234-1234").male);
		
	}
// ===================================================================================================	
// ===================================================================================================
	
	public void new_group(String group) {
		
		phonebook.put(group, new HashMap<String, Info>());
		
//		System.out.println(phonebook.get(group));		
//		phonebook.put("학교", new  D07_PhoneBook.Info("010-1234-1234", 22, "M")); 
		
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
//		System.out.println("이름을 입력해주세요 > ");
//		name = sc.nextLine();
//		
//		System.out.println("나이는 몇살인가요? > ");
//		age = sc.nextInt();
//		
//		System.out.println("남자이면 M 여자이면 F를 입력해주세요 > ");
//		male = sc1.nextLine();
//		male = sc.nextLine();
		
		name = "홍길동";
		age = 23;
		male = "M";
		
//		System.out.println(d);
		d.put(phone_num, new D07_PhoneBook.Info(name, age, male));
		
//		System.out.println(d.get("010-1234-1234").name);
	}
	
	public void sort() {
		
	}
	
	public void search_name() {
		
		String name = "홍길동";
		String num = "010-1234-1234";
		
		String dd;
		
//		System.out.println(phonebook.containsKey(phonebook.get("010-1234-1234")));
//		System.out.println(phonebook.containsValue(phonebook.get("010-1234-1234")));
//		System.out.println(phonebook.containsValue(phonebook.equals("010-1234-1234")));
//		System.out.println(phonebook.containsKey(phonebook.get("학원")));
		
		for (String key : phonebook.keySet()) {
			System.out.println("반복문 내용 : " + phonebook.get(key).get("010-1234-1234").name);
			System.out.println("반복문 내용 : " + phonebook.get(key));
		}
		
		System.out.println(phonebook.containsValue(phonebook.get("학원")));
		System.out.println(phonebook.get("학원").get(num));
		System.out.println("==============================================");
		
		System.out.println(phonebook.get("학원").containsValue("010-1234-1234"));
		System.out.println(phonebook.get("학원").containsValue(num));
		
		System.out.println("==============================================");
//		System.out.println(phonebook.containsValue(phonebook.get("학원")));
		System.out.println(phonebook.containsValue(phonebook.get("학원").equals("010-1234-1234")));
		System.out.println(phonebook.containsKey(phonebook.equals("학원")));
		System.out.println("==============================================");
		System.out.println(phonebook.containsValue(phonebook.get("학원").get("010-1234-1234")));
		
		
	}
	
	public void search_phone_num() {
		
	}
	
	public void whos_num(String num) {
//		String num2 = "010-4321-4321";
		System.out.println(num);
		
//		System.out.println(phonebook.get("학원1").keySet().toString().contains("432"));
//		System.out.println("1111111");
		
		for (Entry<String, HashMap<String, Info>> entry : phonebook.entrySet()) {
			
			System.out.print(entry.getKey() + "\t :");
			System.out.println(entry.getValue());
			
			for (Entry<String, Info> entry1 : d.entrySet()) {
				System.out.print(entry1.getKey() + "\t :");
				System.out.println(entry1.getValue());
				
				if (entry1.getKey().contains("010")) {
					System.out.println("드디어!?");
				}
				
			}
		}
		
		
//		System.out.println(phonebook.keySet());
//		System.out.println(phonebook.values());
//		System.out.println(phonebook.entrySet());
		
//		System.out.print("언제까지 안될거냐?  ");
//		System.out.println(phonebook.containsKey(phonebook.get("학원")));
//		System.out.println(phonebook.containsValue(phonebook.get("학원")));
//		System.out.println(phonebook.get("학원").containsKey(num));
//		System.out.println("====****************************");
//		System.out.println(phonebook.get("학원1").keySet().contains("432"));
//		System.out.println(phonebook.get("학원1").keySet().toString().contains("432"));
//		
//		System.out.println(phonebook.get("학원").toString().contains("010-1234"));
//		System.out.println(phonebook.get("학원").toString().contains("123"));
//		System.out.println(phonebook.get("학원").get(num).toString());
//		System.out.println(phonebook.get("학원").get(num).toString().equals("홍길동"));
//		System.out.println("======================");
//		System.out.println("dd   - " + phonebook.get("학원").containsValue(num));
//		System.out.println("rr   - " + phonebook.get("학원").equals(num));
//		System.out.println("aa   - " + phonebook.get("학원").get(num).name);
//		System.out.println("aa   - " + phonebook.get("학원").get(num).age);
//		System.out.println("aa   - " + phonebook.get("학원").get(num).male);
//		
//				
//		System.out.println(phonebook.get("학원1"));
//		System.out.println("aa   - " + phonebook.get("학원1").get(num2).name);
//		System.out.println("aa   - " + phonebook.get("학원1").get(num2).age);
//		System.out.println("aa   - " + phonebook.get("학원1").get(num2).male);
		
//		System.out.println(phonebook.get("학원").containsKey(num));
//		System.out.println(phonebook.get("학원").get(num));
//		
//		System.out.println(phonebook.get("학원").size());
	}
	
	
	
	/*
	
		# HashMap을 이용해 전화번호부를 구현해보세요
		
		 1. phonebook에는 "그룹/전화번호/정보" 를 저장할 수 있다.
		 2. 그룹명을 키 값으로 넣으면 해당 그룹에 해당하는 HashMap을 꺼낼 수 있다.
		 3. 꺼낸 HashMap에 전화번호를 넣으면 이름을 꺼낼 수 있다.
		 
		# 구현해야 할 메서드
		
		 1. 새로운 그룹을 추가하는 메서드
		 2. 그룹에 새로운 전화번호를 등록하는 메서드
		 3. 등록된 모든 번호를 선택한 항목(Info의 필드) 기준으로 오름/내림차순으로 보여주는 메서드
		 4. 이름의 일부를 입력하면 일치하는 모든 정보가 검색되는 메서드
		 5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
	
	 */

	
	

}

























