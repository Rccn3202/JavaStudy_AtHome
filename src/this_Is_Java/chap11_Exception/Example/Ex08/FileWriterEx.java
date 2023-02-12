package chap11_Exception.Example.Ex08;
/*
 * 예외발생여부 상관 없이 마지막에는 close()메소드를 실행해서 파일 닫는다. try-catch-finally로 작성된 코드를 리소스 자동닫기를 이용하도록 수정
 * >리소스
 */
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("file.txt");
			fw.write("java");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {fw.close();} 
			catch(IOException e) { }
		}
	}

}
