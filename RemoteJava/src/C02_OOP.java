
public class C02_OOP {
	
	/*

		# ��ü���� ���α׷��� (OOP : Object Oriented Programming)
		
		  - ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
		  - ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� 
		    ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���. 
		  - ��ü (Object) : ���� �����ϴ� ��� �� ( �繰, ����, .. ��� )
		  
		    ex: ���
		      - ����� ���� : ũ��, �絵, ����, Į�θ�, �������, ��� ...  
		      - ����� �޼���
			      (1) �Դ´� (ũ�Ⱑ �پ��鼭 Į�θ���ŭ ���� ����� Į�θ� ����).
			      (2) ���� ���Ѵ�.
			      (3) ��������� �پ���.
			      (4) ������ (ũ�⸸ŭ�� �������� ������.
			      (5) ����� �����Ѵ� (��������� ������ �����Ѵ�)
			      
		  �� Ŭ������ ���� �ִ� �Լ����� �޼����� �θ��� (JAVA���� �޼���ۿ� ����)
		
		# Ŭ����
		
		  - ��ü�� ���α׷��� ���� ǥ���� ��
		  - Ŭ������ �ش� ��ü�� ���赵�̴�. (������ ���������� ��ü�� ����)
		  - ���赵��� ���� ���� ��ü�� '�ν��Ͻ�'��� �θ���. 
		  - Ŭ������ ������ ���� Ÿ���̴�.
	
	*/
	
	// main�� �ݵ��� public class ���ο� �����ؾ� �Ѵ�.
	// (���� �̸��� �Ȱ��� �̸��� Ŭ������ �����ؾ� ã�� �� �ִ�.)
	public static void main(String[] args) {

		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		a1.size = 15;
		a1.color = "������";
		
		a2.size = 13;
		a2.color = "�����";
		
		a3.size = 25;
		a3.calorie = 100;
				
		System.out.println(a1.color);
		System.out.println(a2.color);
		
		System.out.println("�Ա� �� '���'�� ũ��: " + a3.size);
		System.out.println("�Ա� �� '���'�� ũ��: " + a3.calorie);
		
		a3.eat();
		
		System.out.println("���� �� '���'�� ũ��: " + a3.size);
		System.out.println("���� �� '���'�� ũ��: " + a3.calorie);
		
		
		
		System.out.println("=========================================");
		
		BankAccount bank = new BankAccount();
		
		bank.balance = 100000000;
		bank.bankCompany = "�츮";
		 
	
		
		System.out.println("�����ܰ�\t\t: " + bank.balance);
		
		bank.monthIncome();
		
		System.out.println("���� ��\t\t: " + bank.balance);
		
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		bank.monthlyRentPay();
		
		System.out.println("���� ��\t\t: " + bank.balance);
		
		
		
		
		HealthyCare diet = new HealthyCare();
		
		diet.weight = 78;
		diet.height = 173;
		diet.bodyFatPercentage = diet.weight / ((diet.height*10) * (diet.height*10));
		
		System.out.println((double)78/(173*100) );
		System.out.println(diet.weight);
		System.out.println("�� : " + diet.bodyFatPercentage);
		diet.run(2);
		
		System.out.println("�� : " + diet.bodyFatPercentage);
		System.out.println(diet.weight);
		
		
		Window window1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();
		
		w3.status();
		
		w2.open();
		w2.status();
		
		
		window1.open();
		window1.close();
		window1.lock();
		
		window1.status();
		
		String status = window1.getStatus();
		System.out.println("������ ���� ���ڿ��� ��� : " + status);
		
		
	}
}


class Apple {
	
	/*
	  
	 # �ν��Ͻ� ���� 
	 
	  - Ŭ���� ���ο� ������ ����
	  - �ν��Ͻ� ���� ������ ������ ������ �ִ�.
	  - aka. �ʵ�, �Ӽ�, ��� ����, ���, ���� ... 
	  
	 */
	int size;
	double sweet;
	String color;
	int calorie;
	
	/*
	
		# �ν��Ͻ� �޼���
		 
		  - �ν��Ͻ� ������ ���� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	
	*/
	void eat () {
		size--;
		calorie -= 10;
	}
	
	
}

/*
 	�������� : ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� �ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����.
 	
 	�� �ν��Ͻ� ������ 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����

*/

class BankAccount {
	
	int balance;			// �ܰ�
	int income = 2000000;	// ����
	int expense;			// ����
	String bankCompany;		// ����
	
	void monthIncome() {
		balance += income;
	}
	
	void monthlyRentPay() {
		balance -= 500000;
	}
	
	void payTransfer() {
		bankCompany = "����";
	}
	
}


class HealthyCare {
	
	double weight;
	double bodyFatPercentage;
	double height;
	
	void run(int hour) {
		weight -= 0.4 * hour;
		bodyFatPercentage = weight / ((height*10) * (height*10)) ;
	}
	/*
	void eat() {
		weight += 
	}
	*/
	
	
	
}

class Window {

boolean open;
boolean lock;
double width;
double height;

	void open() {
		open = true;
	}
	void close() {
		open = false;
	}
	void lock() {
		lock = true;
	}
	
	void unlock() {
		lock = true;
	}
	
	void status() {
		System.out.printf("�� â���� %s. [%s]\n",
				open ? "�����ֽ��ϴ�." : "�����ֽ��ϴ�.",
				lock ? "����ֽ��ϴ�." : "������� �����Դϴ�."
				);
		
	}
	
	String getStatus() {
		// String.format() : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�.
		return String.format("�� â���� %s. [%s]\n",
				open ? "�����ֽ��ϴ�." : "�����ֽ��ϴ�.",
				lock ? "����ֽ��ϴ�." : "������� �����Դϴ�."
				);
	}
	
	
}
















