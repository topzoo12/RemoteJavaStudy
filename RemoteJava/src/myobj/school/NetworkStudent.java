package myobj.school;

public class NetworkStudent extends Student {

	// ����, ����, ������, ��Ʈ��ũ, CCNA ����
	
	int kor;
	int eng;
	int linux;
	int nt;
	int ccna;
	
	public NetworkStudent() {
		super();	// ��������
		kor = generateRandomScore();
		eng = generateRandomScore();
		linux = generateRandomScore();
		nt = generateRandomScore();
		ccna = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + linux + nt + ccna); 
	}
	
	
	double getAverage() {
		return getSum() / 5.0;
		//return (kor + eng + linux + nt + ccna) / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		// ���� Ŭ������ name ������ ���� �����Ƿ� �θ� Ŭ������ name�� ���(super.name)
		System.out.println("��������������������������������������������������������������������������������������������������");
		System.out.println("�� �̸� : " + name + " �� ����: " + getSum() + "  ��� : " + getAverage() + "\t\t\t��");
		System.out.println("�� ����\t����\tLinux\tNetwork\tCCNA" + "  \t\t��");
		System.out.printf( "�� %d\t%d\t%d\t%d\t%d\t\t��\n", kor, eng, linux, nt, ccna);
		System.out.println("��������������������������������������������������������������������������������������������������");
	}


}
