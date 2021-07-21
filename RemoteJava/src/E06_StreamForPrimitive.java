import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E06_StreamForPrimitive {
	
		/*
		
			# DataOutputStream, DataInputStream
		
			  - �⺻�� Ÿ���� �ս��� ��Ʈ������ �����ϱ� ���� Ŭ���� 
			  - Java�� �⺻�� Ÿ���̱� ������ Java �̿��� ������ ���� �� ����.
			  - �����͸� �־��� ������� ������ �Ѵ�.
			  - 
		
		*/
	
	public static void main(String[] args) {
		File f = new File("files/dout.txt");
		
		try (
			FileOutputStream fout = new FileOutputStream(f);
			DataOutputStream out = new DataOutputStream(fout);				
		) {
			
			out.writeDouble(1234.1234);
			out.writeLong(1234567L);
			out.writeShort((short)1234);
			out.writeUTF("������");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("������ �� �������ϴ�.");
		// ============================================================================================
		// ============================================================================================
		try (
				FileInputStream fin = new FileInputStream(f);
				DataInputStream in = new DataInputStream(fin);				
			) {
				System.out.println(in.readDouble());
				System.out.println(in.readLong());
				System.out.println(in.readShort());
				System.out.println(in.readUTF());
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
		
	}
	

}
















