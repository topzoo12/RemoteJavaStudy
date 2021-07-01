package myobj;

public class Students {
	
	final static int MAX_SCORE = 100;
	
	static String[] lastNameArray = {"��", "��", "��", "��", "��", "��", "��", "��",
			"��", "����", "����", "��", "��", "��", "��", "��", "��",
			"��", "��", "��", "��", "��", "����"
			};
	
	static String[] firstNameArray = {
		"��ȯ", "�Ǽ�", "����", "����", "õ��", "�ҿ�", "��ö", "�¸�", 
		"����", "�¹�", "����", "����",	"��ȣ", "�ѳ�", "����", "�ν�", 
		"����", "��ȣ" 
		};
	
	static String generateRandomName() {
		
		return lastNameArray[(int)(Math.random() * lastNameArray.length)]
				+ firstNameArray[(int)(Math.random() * firstNameArray.length)];
	}
	
	static int generateRandomScore() {
		return (int)(Math.random() * (MAX_SCORE + 1));
	}

	String name;
	int kor;
	int eng;
	int math;
	double avg; 
	
	public Students() {
		this.name = generateRandomName();
		this.kor = generateRandomScore();
		this.eng = generateRandomScore();
		this.math = generateRandomScore();
		
		/*
		name = generateRandomName();
		kor = generateRandomScore();
		eng = generateRandomScore();
		math = generateRandomScore();
		*/
		
		// System.out.println("�̸� : " + name + " ����: " + getSum() + " ��� : " + getAverage());
		// System.out.println("���� : " + kor + " ���� : " + eng + " ���� : " + math);
		// System.out.printf( "%d\t%d\t%d\t��\n", kor, eng, math);
	}
	
	public int getSum() {
		return (kor + eng + math); 
	}
	
	public double getAverage() {
		return getSum() / 3.0;
		//return (kor + eng + math + pl + al + ds) / 6.0;
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
}
	
	
