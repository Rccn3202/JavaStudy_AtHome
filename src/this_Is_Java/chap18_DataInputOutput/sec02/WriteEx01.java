package chap18_DataInputOutput.sec02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//write(int b) : 1 byte�� ���
public class WriteEx01 {
	public static void main(String[] args) {

		try {
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		//OutputStream�� ���� �̿��� �� �����Ƿ� �ڽİ�ü�� �����ؼ� ����Ѵ�
		//FileOutputStream : ���Ϸ� �����Ͱ� ��µǴ� ��Ʈ��(=���Ͽ� �����͸� �����Ѵ�)
		//() �ȿ� ������ �Ű������� ���� ��θ� �Է��Ѵ�
			
		//������		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		//���(1 ����Ʈ��) = 10,20,30�� ����Ʈ�� ����Ѵ�
		//write�� intŸ��. byteŸ���� ���� intŸ������ ����->�ڵ�Ÿ�Ժ�ȯ
		//�� 4����Ʈ�� ���������. -> 10�� 00000000/00000000/00000000/00001010
		//-128~127�� ��� ���� ����Ʈ�� ǥ���� �� ����.
		//200�� ����Ʈ�� ǥ���Ϸ��� �ּ� 2����Ʈ�� �ʿ��ѵ� os.write�� 1����Ʈ�� ��� ����
		os.write(a);	//����Ʈ�� 8��Ʈ. 10�� 00001010
		os.write(b);
		os.write(c);
		
		os.flush();	//���� ���ۿ� �ܷ��ϴ� ����Ʈ�� ����ϰ� ���۸� ���
		os.close(); //��� ��Ʈ���� �ݾ� ����� �޸𸮸� ����. 
		//close�� �ڵ� flush ����� �ִ�. flush�� ���ϰ� close�� �ص� �˾Ƽ� write�� �� �������� close �Ѵ�
		//��� close()�� �ִ� �� ���ٴ� try-catch�� �ڵ� ���ҽ� �ݱ⸦ �ϰų� catch�� �ۿ� finally�� �̿��� �ݴ� ���� ����
		} catch (IOException e) {	
			//FileNotFoundException�� IOException�� �����̹Ƿ� �� �ʿ� ����
			//(FileNotFoundException | IOException e) �Ұ���
			//(Exception e) ����
			e.printStackTrace();
		}
		
		/*
		 11�� �ڵ����ҽ� �ݱ�
		 try{OutputStream os = new FileOutputStream{...}} {
		 } catch{...} {   }
		 -> close()�� ��� try�� ������ �ڵ����� ������
		 �ڵ����ҽ� �ݱⰡ ������ ������ FileOutputStream�� Autocloseable ����� �����ֱ� ����
		*/
		
		//�̰͵� ����(finally �̿�)
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:/Temp/test2.db");
			
			byte a = 10;
			
			os.write(a);
			
			os.flush();
			System.out.println("���� ����");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
			}
		}
		
		
	}

}
