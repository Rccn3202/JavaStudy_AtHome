package chap18_DataInputOutput.sec02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//write(byte[] b) : 바이트 배열 출력(일부)
public class WriteEx03 {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test4.db");
			
			byte[] array = {10, 20, 30, 40, 50};
			
			os.write(array, 1, 3);
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
