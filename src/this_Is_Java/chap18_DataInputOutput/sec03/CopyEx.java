package chap18_DataInputOutput.sec03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//���� ���� ����. FileInputStream���� ���� ����Ʈ�� �ٷ� FileOutputStream���� �߷�
public class CopyEx {

	public static void main(String[] args) {
		String originalFileName = "C:/Temp/test1.png";
		String targetFileName = "C:/Temp/test2.png";
		
		//���ҽ� �ڵ��ݱ� �̿�
		try (InputStream is = new FileInputStream(originalFileName);
				OutputStream os = new FileOutputStream(targetFileName);) {
			
			//���� ����Ʈ�� ������ �迭 ����
			byte[] data = new byte[1024];
			while(true) {
				int num = is.read(data);	//�ִ� 1024����Ʈ �а� �迭�� ����, ���� ����Ʈ�� ����
				if(num == -1) break;	//���� �������� while�� ����
				os.write(data, 0, num);	//���� ����Ʈ ����ŭ ���(������ġ 0���� num���� ����). �������κ��� ������ ��� �������� ����� �� �ְ� �Ѵ�
			}
			
			os.flush();
			
			System.out.println("���簡 �� ��");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
