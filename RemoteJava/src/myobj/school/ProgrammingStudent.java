package myobj.school;

public class ProgrammingStudent extends Student {
	
	// ����, ���α׷��� ���, �˰���, �ڷᱸ�� ����
	
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {
		super();	// ��������
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + pl + al + ds); 
	}
	
	double getAverage() {
		return getSum() / 6.0;
		//return (kor + eng + math + pl + al + ds) / 6.0;
	}
	
	@Override
	public void printGradeCard() {
		// ���� Ŭ������ name ������ ���� �����Ƿ� �θ� Ŭ������ name�� ���(super.name)
		System.out.println("��������������������������������������������������������������������������������������������������");
		System.out.println("�� �̸� : " + name + " �� ����: " + getSum() + "��� : " + getAverage() + "\t\t\t��");
		System.out.println("�� ����\t����\t����\tPL\tAL\tDS" + "  \t��");
		System.out.printf( "�� %d\t%d\t%d\t%d\t%d\t%d\t��\n", kor, eng, math, pl, al, ds);
		System.out.println("��������������������������������������������������������������������������������������������������");
	}
}
