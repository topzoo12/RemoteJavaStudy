package quiz;

public class C07_ProgramingClass extends C07_Person{
	
	/*
	int score = (int)(Math.random() * 101 + 1);
	int people_Number = (int)(Math.random() * 30001 + 20000);
	String name;
	String first_name = "김이박소최조";
	
	//name += first_name.charAt((int)(Math.random() * first_name.length() - 1 ));
	
	public static void main(String[] args) {
		
		String first_name = "김이박소최조전신장유";
		
		int a = (int)(Math.random() * first_name.length() - 1 );
		System.out.println(first_name.charAt((int)(Math.random() * first_name.length() - 1 )));

	}
	
	//name = first_name.charAt(2);
	name = (int)(Math.random() * first_name.length()-1 );
	*/
	//name = first_name.charAt((int)(Math.random() * first_name.length-1 ));
	//super(name, score, people_Number, class_name, subject);
	

	public C07_ProgramingClass() {
		
		//super("개똥이", 60, people_Number, "Programing", "영어");
		super("개똥이", 60, 46345, "Programing", "영어");
	}
	
	void math() {
		System.out.println(name);
		System.out.println("수학");
	}
	void programingLang() {
		System.out.println("프로그래밍 언어");
	}
	void dd() {
		System.out.println("알고리즘");
	}

	
}
