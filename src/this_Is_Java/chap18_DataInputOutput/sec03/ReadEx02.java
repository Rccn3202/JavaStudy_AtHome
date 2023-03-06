package chap18_DataInputOutput.sec03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//int read(byte[] b) : 바이트 배열로 읽기
//데이터는 배열에 저장하는데 리턴은 읽은 바이트 수

public class ReadEx02 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test3.db");
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data); //최대 100바이트를 읽고 읽은 바이트는 data에 저장, 읽은 수는 리턴
				if(num == -1) break; //파일 끝에 도달했을 경우
				
				//읽은 바이트 출력
				for(int i = 0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			//만약 103이라면 while문은 세번 돈다. 1.100출력 2.3출력 3.-1출력
			
			//배열의 모든 바이트를 출력
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
