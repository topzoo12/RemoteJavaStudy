import java.io.File;
import java.util.Arrays;

public class E03_File {
	
		/*
		
			# java.io.File
			
			  - 파일 시스템에 저장되어 있는 파일의 정보를 담을 수 있는 클래스
			  - File 인스턴스에 담겨있는 정보를 바탕으로 해당파일을 수정하거나
			    새로운 파일 또는 디렉토리를 생성할 수 있다. 
		
		
		*/
	
	public static void main(String[] args) {
		
		File f1 = new File("RemoteJava/note/Git 사용 설명서.txt");
		File f2 = new File("RemoteJava/note/Git 사용 설명서");
		File f3 = new File("files");
		File f4 = new File(f3, "game.sav");		// parent, child
		File f5 = new File("image/flower");
		
		
		System.out.println("f1이 존재합니까? " + f1.exists());
		System.out.println("f1이 존재합니까? " + f2.exists());

		System.out.println("읽기 권한이 있는 파일인가요? " + f1.canRead());
		System.out.println("쓰기 권한이 있는 파일인가요? " + f1.canWrite());
		System.out.println("실행 권한이 있는 파일인가요? " + f1.canExecute());
		
		
		System.out.println("f2에 담겨있는 경로가 절대 경로인가요? " + f1.isAbsolute());
		System.out.println("f1의 절대 경로 : " + f1.getAbsolutePath());
		System.out.println("f2의 절대 경로 : " + f2.getAbsolutePath());
		System.out.println("f2는 디렉토리 인가요? " + f1.isDirectory());
		System.out.println("f3는 디렉토리 인가요? " + f3.isDirectory());
		
		System.out.println(f1);
		System.out.println(f3.isDirectory());
		System.out.println(f4);
		System.out.println(f4.getAbsolutePath());
		
		System.out.println("=================================");
		// list() : 해당 디렉토리 내부의 파일 이름들을 String[]로 배열로 가져온다
		// listFiles() : 해당 디렉토리 내부의 모든 파일들을 File[]로 가져온다
		System.out.println("f3 내부의 파일 이름들 : " + Arrays.toString(f3.list()));
		System.out.println(f3.listFiles());
		
		if (!f5.exists()) {
			// mkdir : 해당 경로로 새로운 디렉토리(폴더) 생성
			// f5.mkdir();
			
			// f5.mkdirs : 부모 디렉토리가 존재하지 않는 경우에도 디렉토리를 생성
			f5.mkdirs();	
			System.out.println("새로 생성함.");
		} else {
			System.out.println("이미 존재해서 생성하지 않음.");
		}
		
//		f5.delete();
//		f5.deleteOnExit();
	}
	
	
}
























