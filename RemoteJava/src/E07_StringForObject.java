import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class E07_StringForObject {
	
	/*
	
		# ObjectOutputStream, ObjectInputStream
		
		  - ������ ������(Ŭ����)���� ���ϰ� ��Ʈ���� ����� �� �ְ� ���ִ� Ŭ����
		  - 'ObjectOutputStream'�� �ν��Ͻ��� byte�� ��ȯ�ϴ� Ŭ������
		    'ObjectInputStream'�� �о���� byte�� �ν��Ͻ� ���·� �ٽ� ��ġ�� Ŭ������
	
	
	
	*/
	
	public static void main(String[] args) {
// ============================================================================================
		class Apple implements Serializable {
	
			private static final long serialVersionUID = 1300990891488908908L;
			
			int size;
			int grade;
			
			public Apple(int size, int grade) {
				this.size = size;
				this.grade = grade;
			}
		}
// ============================================================================================
		File f = new File("files/oout.txt");
		
		try (
			FileOutputStream fout = new FileOutputStream(f);
			ObjectOutputStream out = new ObjectOutputStream(fout);
		){
			
			out.writeObject(new Apple(10, 11));
			out.writeObject(new Apple(1, 2));
			out.writeObject(new Apple(5, 6));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("������Ʈ ���Ⱑ �������ϴ�.");
		
		try (
				FileInputStream fin = new FileInputStream(f);
				ObjectInputStream in = new ObjectInputStream(fin);
			){
				
				Apple a1 = (Apple)in.readObject();
				Apple a2 = (Apple)in.readObject();
				Apple a3 = (Apple)in.readObject();
				
				System.out.println(a1.size);
				System.out.println(a2.size);
				System.out.println(a3.size);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
		
	}
}






















