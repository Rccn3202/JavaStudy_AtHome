package chap18_DataInputOutput.sec07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferEx {

	public static void main(String[] args) {
		//입출력 스트림 생성
		String originalFilePath1 = 
				BufferEx.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "";
		
		FileInputStream fis = new FileInputStream(null);
		FileOutputStream fos = new FileOutputStream(null);
		
		//입출력 스트림 + 버퍼 스트림 생성
		String originalFilePath2 = 
				BufferEx.class.getResource("").getPath();
		String targetFilePath2 = "";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//버퍼를 사용하지 않고 복사
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼 사용:\t"+nonBufferTime+" ns");
		
		//버퍼를 사용하고 복사
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용:\t"+bufferTime+" ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	public static long copy(InputStream is, OutputStream os) throws Exception {
		//시작 시간 저장
		long start = System.nanoTime();
		//1바이트를 읽고 1바이트를 출력
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		//끝 시간 저장
		long end = System.nanoTime();
		//복사 시간 리턴
		return (end-start);
	}

}
