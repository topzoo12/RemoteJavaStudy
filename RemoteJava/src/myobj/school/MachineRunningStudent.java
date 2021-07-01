package myobj.school;

public class MachineRunningStudent extends Student {
	// ����, ����, ����, �����, ���α׷��� ��� ����
	
	int kor;
	int eng;
	int math;
	int stats;
	int pl;
	
	public MachineRunningStudent() {
		super();	// ��������
		kor = generateRandomScore();
		eng = generateRandomScore();
		math = generateRandomScore();
		stats = generateRandomScore();
		pl = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + stats + pl); 
	}
	
	
	double getAverage() {
		return getSum() / 5.0;
		//return (kor + eng + math + stats + pl) / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		// ���� Ŭ������ name ������ ���� �����Ƿ� �θ� Ŭ������ name�� ���(super.name)
		System.out.println("��������������������������������������������������������������������������������������������������");
		System.out.println("�� �̸� : " + name + " �� ����: " + getSum() + "  ��� : " + getAverage() + "\t\t\t��");
		System.out.println("�� ����\t����\t����\t�����\tPL" + "  \t\t��");
		System.out.printf( "�� %d\t%d\t%d\t%d\t%d\t\t��\n", kor, eng, math, stats, pl);
		System.out.println("��������������������������������������������������������������������������������������������������");
	}

}
