import java.io.File;
import java.util.Arrays;

public class E03_File {
	
		/*
		
			# java.io.File
			
			  - ���� �ý��ۿ� ����Ǿ� �ִ� ������ ������ ���� �� �ִ� Ŭ����
			  - File �ν��Ͻ��� ����ִ� ������ �������� �ش������� �����ϰų�
			    ���ο� ���� �Ǵ� ���丮�� ������ �� �ִ�. 
		
		
		*/
	
	public static void main(String[] args) {
		
		File f1 = new File("RemoteJava/note/Git ��� ����.txt");
		File f2 = new File("RemoteJava/note/Git ��� ����");
		File f3 = new File("files");
		File f4 = new File(f3, "game.sav");		// parent, child
		File f5 = new File("image/flower");
		
		
		System.out.println("f1�� �����մϱ�? " + f1.exists());
		System.out.println("f1�� �����մϱ�? " + f2.exists());

		System.out.println("�б� ������ �ִ� �����ΰ���? " + f1.canRead());
		System.out.println("���� ������ �ִ� �����ΰ���? " + f1.canWrite());
		System.out.println("���� ������ �ִ� �����ΰ���? " + f1.canExecute());
		
		
		System.out.println("f2�� ����ִ� ��ΰ� ���� ����ΰ���? " + f1.isAbsolute());
		System.out.println("f1�� ���� ��� : " + f1.getAbsolutePath());
		System.out.println("f2�� ���� ��� : " + f2.getAbsolutePath());
		System.out.println("f2�� ���丮 �ΰ���? " + f1.isDirectory());
		System.out.println("f3�� ���丮 �ΰ���? " + f3.isDirectory());
		
		System.out.println(f1);
		System.out.println(f3.isDirectory());
		System.out.println(f4);
		System.out.println(f4.getAbsolutePath());
		
		System.out.println("=================================");
		// list() : �ش� ���丮 ������ ���� �̸����� String[]�� �迭�� �����´�
		// listFiles() : �ش� ���丮 ������ ��� ���ϵ��� File[]�� �����´�
		System.out.println("f3 ������ ���� �̸��� : " + Arrays.toString(f3.list()));
		System.out.println(f3.listFiles());
		
		if (!f5.exists()) {
			// mkdir : �ش� ��η� ���ο� ���丮(����) ����
			// f5.mkdir();
			
			// f5.mkdirs : �θ� ���丮�� �������� �ʴ� ��쿡�� ���丮�� ����
			f5.mkdirs();	
			System.out.println("���� ������.");
		} else {
			System.out.println("�̹� �����ؼ� �������� ����.");
		}
		
//		f5.delete();
//		f5.deleteOnExit();
	}
	
	
}
























