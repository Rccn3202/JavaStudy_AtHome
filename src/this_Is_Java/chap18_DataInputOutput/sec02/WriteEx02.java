package chap18_DataInputOutput.sec02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//write(byte[] b) : ����Ʈ �迭 ���(����)
public class WriteEx02 {

	public static void main(String[] args) {

		try {
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array = {10, 20, 30};
		
		os.write(array);
		
		os.flush();
		os.close();
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

}
