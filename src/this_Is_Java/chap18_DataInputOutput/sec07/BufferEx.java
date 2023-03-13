package chap18_DataInputOutput.sec07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferEx {

	public static void main(String[] args) {
		//����� ��Ʈ�� ����
		String originalFilePath1 = 
				BufferEx.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "";
		
		FileInputStream fis = new FileInputStream(null);
		FileOutputStream fos = new FileOutputStream(null);
		
		//����� ��Ʈ�� + ���� ��Ʈ�� ����
		String originalFilePath2 = 
				BufferEx.class.getResource("").getPath();
		String targetFilePath2 = "";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//���۸� ������� �ʰ� ����
		long nonBufferTime = copy(fis, fos);
		System.out.println("���� ���:\t"+nonBufferTime+" ns");
		
		//���۸� ����ϰ� ����
		long bufferTime = copy(bis, bos);
		System.out.println("���� ���:\t"+bufferTime+" ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	public static long copy(InputStream is, OutputStream os) throws Exception {
		//���� �ð� ����
		long start = System.nanoTime();
		//1����Ʈ�� �а� 1����Ʈ�� ���
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		//�� �ð� ����
		long end = System.nanoTime();
		//���� �ð� ����
		return (end-start);
	}

}
