package chap18_DataInputOutput.sec03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//int read() : 1 바이트 읽기
public class ReadEx01 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db"); //데이터 출발지를 test1.db로 하는 입력 스트림 생성
			
			while(true) {
				int data = is.read(); //1바이트씩 읽기
				if(data == -1) break;
				System.out.println(data);
			}
			
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e ) {
			e.printStackTrace();
		}

		
		//방법2 finally 사용해서 닫기
		InputStream is = null;
		try {
			is = new FileInputStream("C:/Temp/test2.db");
			
			while(true) {
				int data = is.read(); //1바이트씩 읽기
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
