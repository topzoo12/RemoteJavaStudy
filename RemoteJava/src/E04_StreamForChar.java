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
		  
		  - InputStream�� OutputStream�� �����͸� byte ������ �����Ѵ�
		  - �����Ͱ� ��Ʈ���� ����ϱ� ���ؼ��� ����Ʈ ������ �����͸� �������ϱ� ������
		    1����Ʈ �̻��� �����ʹ� �ٽ� ��ġ�� ������ �ʿ��ϴ�.
	
	*/
	
	public static void main(String[] args) {
	
		try {
			File testFile = new File("files/c.txt");
			Charset charset = Charset.forName("UTF-8");
			
			FileWriter out = new FileWriter(testFile, charset);
			
			out.write("���ڿ��� ���ϰ� �����ֳ�\n");
			out.write("getBytes�� �Ⱦ���\n");
			
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
		
		
		
		
		
		// �� ���� ���ڵ� Ÿ�԰� ���� ���� ���ڵ� Ÿ���� ��ġ�ؾ� �Ѵ�. 
		try {
			File testFile = new File("files/b.txt");
			FileOutputStream out = new FileOutputStream(testFile);
			
			String message = "�ȳ��ϼ���";
			
			// getBytes() �޼���� ���ڿ��� ����Ʈ�� �ɰ����� ����� ������ �� �ִ�.
			// ���� charset : UTF-8, EUC-KR, MS949, ....
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

















