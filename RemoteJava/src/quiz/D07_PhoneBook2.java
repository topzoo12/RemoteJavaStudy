package quiz;

import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

/*
        # HashMap을 이용해 전화번호부를 구현해보세요
        
         1. phonebook에는 그룹/전화번호/정보를 저장할 수 있다
         2. 그룹명을 키값으로 넣으면 해당 그룹에 해당하는 HashMap을 꺼낼 수 있다
         3. 꺼낸 HashMap에 전화번호를 넣으면 그 사람의 정보를 꺼낼 수 있다  

        # 구현해야 할 메서드
        
         1. 새로운 그룹을 추가하는 메서드
         2. 그룹에 새로운 전화번호를 등록하는 메서드
         3. 이름을 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드 
         4. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
         5. 등록된 모든 번호를 선택한 항목 기준으로 오름/내림차순으로 보여주는 메서드
            (아무것도 전달하지 않을 시 기본 순서로 출력)
*/
public class D07_PhoneBook2 {

    private static Class[] comparators = { AgeComparator.class, PhoneComparator.class };
    
    private class AgeComparator implements Comparator<Info> {
        int ordering;
        
        public AgeComparator(Integer ordering) {
            this.ordering = ordering;
        }
        
        @Override
        public int compare(Info o1, Info o2) {                        
            return Integer.compare(o1.age, o2.age) * ordering;
        }                
    }
        
    private class PhoneComparator implements Comparator<Info> {
        int ordering;
        
        public PhoneComparator(Integer ordering) {
            this.ordering = ordering;
        }                
        
        @Override
        public int compare(Info o1, Info o2) {                        
            return ordering * o1.phoneNumber.compareTo(o2.phoneNumber);
        }
            
    }
        
    public static class Info implements Comparable<Info> {                
        String name;
        String phoneNumber;
        String address;
        String socialNumber;
        int age;                
        
        public Info() {}
        
        public Info(String name, int age, String phoneNumber) {
            this.name = name;
            this.age = age;
            this.phoneNumber = phoneNumber;
        }
        
        @Override
        public String toString() {                
            return String.format("%s/%d/%s", name, age, phoneNumber);
        }

        @Override
        public int compareTo(Info o) {                        
            return name.compareTo(o.name) == 0 ? 
                phoneNumber.compareTo(o.phoneNumber) : name.compareTo(o.name);
        }
    }
        
    HashMap<String, HashMap<String, Info>> phonebook;

    public D07_PhoneBook2() {
        phonebook = new HashMap<>();
    }        
// ===========================================================================================
//										그룹 추가
// ===========================================================================================        
    public boolean addGroup(String groupName) {
        if (phonebook.containsKey(groupName)) {
            System.out.println("이미 같은 이름의 그룹이 존재합니다.");
            return false;
        } else {
            phonebook.put(groupName, new HashMap<>());
            System.out.printf("새 그룹 \"%s\"가 추가되었습니다.\n", groupName);
            return true;
        }
    }
// ===========================================================================================
//										내용 추가    
// ===========================================================================================        
    public void addInfo(String groupName, Info info) {
        HashMap<String, Info> group = phonebook.putIfAbsent(groupName, new HashMap<>());                
        if (group == null) {
                group = phonebook.get(groupName);
        }                
        group.put(info.phoneNumber, info);
    }
// ===========================================================================================
//										이름 검색    
// ===========================================================================================        
    public void searchByName(String name) {        
        System.out.println("-- 이름검색 : \"" + name + "\"의 결과입니다. --");
        for (String groupName : phonebook.keySet()) {                        
            HashMap<String, Info> group = phonebook.get(groupName);
            
            for (Entry<String, Info> entry : group.entrySet()) {
                if (entry.getValue().name.contains(name)) {
                    System.out.println("[" + groupName + "]" + entry.getValue() + "/" + entry.getKey());
                }
            }
        }                
    }
// ===========================================================================================
//										번호 검색    
// ===========================================================================================        
    public void searchByPhoneNumber(String numberFrag) {        
        System.out.println("-- 번호검색 : \"" + numberFrag + "\"의 결과입니다. --");
        for (String groupName : phonebook.keySet()) {                        
            HashMap<String, Info> group = phonebook.get(groupName);
            
            for (Entry<String, Info> entry : group.entrySet()) {
                if (entry.getValue().phoneNumber.replace("-", "").contains(numberFrag)) {
                    System.out.println("[" + groupName + "]" + entry.getValue() + "/" + entry.getKey());
                }
            }
        }                
    }
// ===========================================================================================
//										기본 정렬  	
// ===========================================================================================        
    public void show() {                
        TreeSet<Info> info_set = new TreeSet<>();
        
        for (HashMap<String, Info> group : phonebook.values()) {
            info_set.addAll(group.values());
        }
        
        System.out.println(info_set);
    }
// ===========================================================================================
//										특정 기준으로 정렬  	
// ===========================================================================================		       
    public void show(int column, boolean asc) {
        // String searchColumn = Info.class.getDeclaredFields()[column].getName();
        int ordering = asc ? 1 : -1;
        
        Comparator<Info> comparator = null;
        try {
            comparator = (Comparator<Info>) comparators[column]
                            .getDeclaredConstructors()[0]
                            .newInstance(this, ordering);                        
            System.out.println(comparator);
        } catch (Exception e) {
            e.printStackTrace();
        }        
        
        TreeSet<Info> info_set = new TreeSet<>(comparator);
        
        for (HashMap<String, Info> group : phonebook.values()) {                        
            info_set.addAll(group.values());                        
        }
        
        System.out.println(info_set);
    }
// ===========================================================================================
//										메인  	
// ===========================================================================================        
    public static void main(String[] args) {
        D07_PhoneBook2 phone = new D07_PhoneBook2();
        
        phone.addGroup("친구");
        phone.addGroup("친구");
        
        phone.addInfo("친구", new Info("희진", 15, "010-2222-2223"));
        phone.addInfo("친구", new Info("민수", 13, "010-2222-2234"));
        phone.addInfo("친구", new Info("민수", 17, "010-0001-1234"));
        
        phone.addInfo("학교", new Info("영희", 18, "010-1234-1234"));
        phone.addInfo("학교", new Info("민희", 21, "010-1111-1111"));
        phone.addInfo("학교", new Info("희민", 25, "010-1111-1112"));
        phone.addInfo("학교", new Info("희수", 44, "010-1233-1122"));
        
        phone.searchByName("민");
        phone.searchByPhoneNumber("1111");
        phone.searchByPhoneNumber("123");
        phone.searchByPhoneNumber("23");
        phone.searchByPhoneNumber("010111");
        
        phone.show(0, true);
        phone.show(0, false);
    }
}











