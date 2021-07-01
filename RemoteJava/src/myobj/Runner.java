package myobj;

public class Runner implements Comparable<Runner> {
	
	public String name;
	public int height;
	public int weight;
	public double run_result;
	
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
	
	static int generateheight() {
		return (int)(Math.random() * 20 + 160);
	}
	
	static int generateweight() {
		return (int)(Math.random() * 37 + 50);
	}
	
	static double generaterun_result() {
		return Math.random() * 4 + 10;
	}
	
	public Runner() {
		name = generateRandomName();
		height = generateheight();
		weight = generateweight();
		run_result = generaterun_result();
	};
	
	@Override
	public String toString() {
		return String.format("[%s] �л��� �����Դ� [%skg] Ű�� [%scm] ����� %.2f �Դϴ�.\n", name, weight, height, run_result);
	}
	
	@Override
	public int compareTo(Runner o) {
		
		return Double.compare(this.weight, o.weight) != 0 ?
			   Double.compare(this.weight, o.weight) : Double.compare(run_result, o.run_result);
	}
	

}
