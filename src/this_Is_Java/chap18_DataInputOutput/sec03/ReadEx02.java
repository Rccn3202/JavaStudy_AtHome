package chap18_DataInputOutput.sec03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//int read(byte[] b) : ����Ʈ �迭�� �б�
//�����ʹ� �迭�� �����ϴµ� ������ ���� ����Ʈ ��

public class ReadEx02 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test3.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data); //�ִ� 100����Ʈ�� �а� ���� ����Ʈ�� data�� ����, ���� ���� ����
				if(num == -1) break; //���� ���� �������� ���
				
				//���� ����Ʈ ���
				for(int i = 0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			//���� 103�̶�� while���� ���� ����. 1.100��� 2.3��� 3.-1���
			
			//�迭�� ��� ����Ʈ�� ���
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
