package chap18_DataInputOutput.sec03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//파일 복사 예제. FileInputStream에서 읽은 바이트를 바로 FileOutputStream으로 추력
public class CopyEx {

	public static void main(String[] args) {
		String originalFileName = "C:/Temp/test1.png";
		String targetFileName = "C:/Temp/test2.png";
		
		//리소스 자동닫기 이용
		try (InputStream is = new FileInputStream(originalFileName);
				OutputStream os = new FileOutputStream(targetFileName);) {
			
			//읽은 바이트를 저장할 배열 생성
			byte[] data = new byte[1024];
			while(true) {
				int num = is.read(data);	//최대 1024바이트 읽고 배열에 저장, 읽은 바이트는 리턴
				if(num == -1) break;	//파일 다읽으면 while문 종료
				os.write(data, 0, num);	//읽은 바이트 수만큼 출력(시작위치 0에서 num개만 읽음). 자투리부분이 남았을 경우 자투리만 출력할 수 있게 한다
			}
			
			os.flush();
			
			System.out.println("복사가 잘 됨");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
