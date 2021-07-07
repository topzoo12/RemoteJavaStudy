import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class E04_StreamForChar {
	
	/*
	
		# Reader / Writer
		  
		  - InputStream과 OutputStream은 데이터를 byte 단위로 전송한다
		  - 데이터가 스트림을 통과하기 위해서는 바이트 단위로 데이터를 나눠야하기 때문에
		    1바이트 이상의 데이터는 다시 합치는 과정이 필요하다.
	
	*/
	
	public static void main(String[] args) {
	
		try {
			File testFile = new File("files/c.txt");
			Charset charset = Charset.forName("UTF-8");
			
			FileWriter out = new FileWriter(testFile, charset);
			
			out.write("문자열을 편하게 쓸수있네\n");
			out.write("getBytes도 안쓰고\n");
			
			for (String charset_name : Charset.availableCharsets().keySet()) {
				out.write(charset_name + "\n");
			}
			
			out.close();
			
			FileReader in = new FileReader(testFile, charset);
			
			char[] buffer = new char[2048];
			
			int len = -1;
			
			while ((len = in.read(buffer)) != -1) {
				System.out.println(new String(buffer, 0, len));
			};
			
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		// 쓸 때의 인코딩 타입과 읽을 때의 인코딩 타입이 일치해야 한다. 
		try {
			File testFile = new File("files/b.txt");
			FileOutputStream out = new FileOutputStream(testFile);
			
			String message = "안녕하세요";
			
			// getBytes() 메서드는 문자열을 바이트로 쪼갤때의 방식을 선택할 수 있다.
			// 유명 charset : UTF-8, EUC-KR, MS949, ....
			out.write(message.getBytes("UTF-8"));
			
			out.close();
			
			FileInputStream in = new FileInputStream(testFile);
			
			byte[] buffer = new byte[1024]; 
			
			int len = in.read(buffer);
			
			System.out.println(new String(buffer, 0, len, "UTF-8"));
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	

}

















