package chap18_DataInputOutput.sec03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//int read() : 1 ����Ʈ �б�
public class ReadEx01 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db"); //������ ������� test1.db�� �ϴ� �Է� ��Ʈ�� ����
			
			while(true) {
				int data = is.read(); //1����Ʈ�� �б�
				if(data == -1) break;
				System.out.println(data);
			}
			
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e ) {
			e.printStackTrace();
		}

		
		//���2 finally ����ؼ� �ݱ�
		InputStream is = null;
		try {
			is = new FileInputStream("C:/Temp/test2.db");
			
			while(true) {
				int data = is.read(); //1����Ʈ�� �б�
				if(data == -1) break;
				System.out.println(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
			}
		}
	}

}
