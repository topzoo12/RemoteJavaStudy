import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;



public class E02_FileInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("a.txt");
			
			/*
			
				InputStream.read() : 한 글자씩 읽어들인다. (한글이 깨진다)
				InputStream.read(byte[]) : 파일의 데이터를 byte[]의 크기만큼 읽어들인다.
				InputStream.read(byte[], start, end) : 버퍼의 일부분에만 읽기가 가능하다.
				
				세 메서드 모두 더 이상 읽을 것이 없다면 -1을 반환한다.
			
			*/
//			int ch = -1;
//			while (in.read() != -1) {
//				System.out.print((char)ch);
//			}
			
			byte[] buffer = new byte[16];
			
			buffer[0] = 'l';
			buffer[1] = 'i';
			buffer[2] = 'n';
			buffer[3] = 'e';
			buffer[5] = ':';
			
			int len = -1, count = 0; 
			while ((len = in.read(buffer, 6, 10)) != -1) {
				buffer[4] = (byte)(count++ + '0');
				
				System.out.println(new String(buffer));
				System.out.println("=========================");
//				System.out.print(Arrays.toString(buffer));
//				System.out.printf("-- %d글자\n", len);
			}
			
			
			in.close();
			
			
			
			
			
			
//			while (true) {
//				int ch = in.read();
//				
//				if (ch == -1) {
//					System.out.println("파일의 끝까지 읽었습니다.");
//					break;
//				} else {
//					System.out.print((char)ch);
//				}	
//			}
			
//			for (int i = 0; i < 10; i++) {
//				System.out.print((char)in.read());
//			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
}




















