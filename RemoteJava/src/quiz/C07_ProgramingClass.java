package quiz;

public class C07_ProgramingClass extends C07_Person{
	
	/*
	int score = (int)(Math.random() * 101 + 1);
	int people_Number = (int)(Math.random() * 30001 + 20000);
	String name;
	String first_name = "���̹ڼ�����";
	
	//name += first_name.charAt((int)(Math.random() * first_name.length() - 1 ));
	
	public static void main(String[] args) {
		
		String first_name = "���̹ڼ�������������";
		
		int a = (int)(Math.random() * first_name.length() - 1 );
		System.out.println(first_name.charAt((int)(Math.random() * first_name.length() - 1 )));

	}
	
	//name = first_name.charAt(2);
	name = (int)(Math.random() * first_name.length()-1 );
	*/
	//name = first_name.charAt((int)(Math.random() * first_name.length-1 ));
	//super(name, score, people_Number, class_name, subject);
	

	public C07_ProgramingClass() {
		
		//super("������", 60, people_Number, "Programing", "����");
		super("������", 60, 46345, "Programing", "����");
	}
	
	void math() {
		System.out.println(name);
		System.out.println("����");
	}
	void programingLang() {
		System.out.println("���α׷��� ���");
	}
	void dd() {
		System.out.println("�˰���");
	}

	
}
