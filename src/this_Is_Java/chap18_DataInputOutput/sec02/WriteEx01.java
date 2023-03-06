package chap18_DataInputOutput.sec02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//write(int b) : 1 byte를 출력
public class WriteEx01 {
	public static void main(String[] args) {

		try {
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		//OutputStream은 직접 이용할 수 없으므로 자식객체를 생성해서 사용한다
		//FileOutputStream : 파일로 데이터가 출력되는 스트림(=파일에 데이터를 저장한다)
		//() 안에 생성자 매개값으로 파일 경로를 입력한다
			
		//데이터		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		//출력(1 바이트씩) = 10,20,30을 바이트로 출력한다
		//write는 int타입. byte타입의 값이 int타입으로 들어간다->자동타입변환
		//총 4바이트가 만들어진다. -> 10은 00000000/00000000/00000000/00001010
		//-128~127을 벗어난 수는 바이트로 표시할 수 없다.
		//200을 바이트로 표현하려면 최소 2바이트가 필요한데 os.write는 1바이트만 출력 가능
		os.write(a);	//바이트는 8비트. 10은 00001010
		os.write(b);
		os.write(c);
		
		os.flush();	//내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
		os.close(); //출력 스트림을 닫아 사용한 메모리를 해제. 
		//close에 자동 flush 기능이 있다. flush를 안하고 close만 해도 알아서 write를 다 내보내고 close 한다
		//사실 close()를 넣는 것 보다는 try-catch로 자동 리소스 닫기를 하거나 catch문 밖에 finally를 이용해 닫는 것이 좋다
		} catch (IOException e) {	
			//FileNotFoundException은 IOException의 하위이므로 쓸 필요 없다
			//(FileNotFoundException | IOException e) 불가능
			//(Exception e) 가능
			e.printStackTrace();
		}
		
		/*
		 11장 자동리소스 닫기
		 try{OutputStream os = new FileOutputStream{...}} {
		 } catch{...} {   }
		 -> close()가 없어도 try가 끝나면 자동으로 닫힌다
		 자동리소스 닫기가 가능한 이유가 FileOutputStream이 Autocloseable 기능을 갖고있기 때문
		*/
		
		//이것도 가능(finally 이용)
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:/Temp/test2.db");
			
			byte a = 10;
			
			os.write(a);
			
			os.flush();
			System.out.println("저장 성공");
			
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
