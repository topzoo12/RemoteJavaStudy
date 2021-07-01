import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import myobj.Student;

public class D07_HashMap {
	
	/*
	
		# Map
		 
		 - �����͸� Key�� Value �� ������ �����ϴ� ����� �ڷᱸ��
		 - key���� ���� value�� ������ �� �ִ�
		 - key�� �ߺ��� ������� �ʴ´�.
	
	*/
	
	public static void main(String[] args) {
		
		// ù ��° ���׸��� Key�� Ÿ���̰�, �� ��° ���׸��� Value�� Ÿ���̴�.
		HashMap<String, String> addr = new HashMap<>();
		
		/*
		 Map.put(Key, value)
		    - �ʿ� �����͸� �߰��Ѵ�.
		 Map.putAll(Map)
		   - �ٸ� ���� �����͸� ��� �߰��Ѵ�.
		 Map.putIfAbsent()
		   - �ش� Ű ���� ��������� �ְ�, ���� ������ �����ش�. ���� ��� null�� �����Ѵ�.
		*/
//		addr.putAll(addr);
		addr.put("�츮��", "�����Ư���� ���۱� �뷮�� 1�� ...");
		addr.put("����", "����Ư���� ������ ������� 84�� 16 11, 12��");
		addr.put("����2", "����Ư���� ���α� ����3��");
		
		System.out.println(addr.putIfAbsent("�츮��", "���� �� �ִ�."));
		System.out.println(addr.putIfAbsent("�츮��2", "���� �� �ִ�."));
		
		// �̹� �����ϴ� Ű�� ���� �߰��ϸ� value�� �����Ѵ�.
		addr.put("����", "������");
		
		System.out.println(addr.get("�츮��"));
		System.out.println(addr.get("����"));
		System.out.println(addr.get("����2"));
		System.out.println(addr.get("�츮��2"));
		System.out.println();
		
		
		// ���� ������ Ÿ�Ե� ����� �� �ִ�.
		HashMap<Integer, Student> students = new HashMap<>();
		
		students.put(1, new Student());
		students.put(2, new Student());
		
		System.out.println(students.get(1));
		System.out.println(students.get(2));
		
		// �������� Ÿ���� ����� �� �ִ�.
		HashMap<String, Object> info = new HashMap<>();
		
		info.put("�̸�", "ȫ�浿");
		info.put("����", 23);
		info.put("��ȭ��ȣ", "010-1234-1234");
		info.put("�����ϴ� ��", new String[] {"��ȭ", "�", "�ܹ���"});
		info.put("ģ�� ���", new ArrayList<>());
		
		// �������� : ģ�� ��Ͽ� �����͸� 3���� �߰��غ�����
		
		ArrayList<String> friends = (ArrayList<String>) info.get("ģ�� ���");
		
		friends.add("���󿡸�");
		friends.add("��ġ");
		friends.add("����");
		
		((ArrayList<String>) info.get("ģ�� ���")).add("�޷�");
		((ArrayList<String>) info.get("ģ�� ���")).add("�޷�2");
		
		((ArrayList<Object>) info.get("ģ�� ���")).add("ö��");
		((ArrayList<Object>) info.get("ģ�� ���")).add("����");
		((ArrayList<Object>) info.get("ģ�� ���")).add("¯��");
		
		((ArrayList<Object>) info.get("ģ�� ���")).add("¯�� ����");
		
//		info.put("ģ�� ���", );
		
		System.out.println(info.get("ģ�� ���"));
		
		/*
		
			# �ݺ������� MapŸ�� Ȱ���ϱ�
			
			 - Map.keySet() : Key��� �̷���� Set�� ��ȯ�Ѵ�.
			 - Map.values() : ����� �̷���� Collection�� ��ȯ�Ѵ�.
			 - Map.entrySet() : Entry<key, value>�� �̷���� Set �� ��ȯ�Ѵ�.
		
		*/
		
//		HashMap<Integer, Student> ss = new HashMap<>();
		
		System.out.println(info.keySet());		// Hash �̱� ������ ������ ����
		
		for (String key : info.keySet()) {
			System.out.println("�ݺ������� ���� ���� : " + info.get(key));
		}
		System.out.println("=========================================================");
		
		System.out.println(info.values());
		
		List key_list = new ArrayList<>(info.keySet());
		System.out.println(key_list);
		
//		key_list.add("ddd");
//		System.out.println(key_list);
		
		List value_list = new ArrayList<>(info.values());
		System.out.println(value_list);
		System.out.println();
		
		for (Object value : info.values()) {
			System.out.println("�ݺ������� ���� ���� : " + value);
		}
		System.out.println("===============================================");
		
		for (Entry<String, Object> entry : info.entrySet()) {
			System.out.print(entry.getKey() + "\t :");
			System.out.println(entry.getValue());
//			System.out.println(entry);
		}
		
		
		
		
	}
	
}
































