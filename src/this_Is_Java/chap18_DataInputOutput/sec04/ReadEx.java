package chap18_DataInputOutput.sec04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadEx {

	public static void main(String[] args) {
		try {
		Reader reader = null;
		
		//1문자씩 읽기
		reader = new FileReader();
		while(true)	{
			int data = reader.read();
			if(data == -1) break;
			System.out.print((char)data);
		}
		reader.close();
		System.out.println();
		
		//문자 배열로 읽기
		reader = new FileReader(null);
		char[] data = new char[100];
		while(true) {
			int num = reader.read(data);
			if(num == -1) break;
			for(int i=0; i<num;i++) {
				System.out.print(data[i]);
			}
		}
		reader.close();
		
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}
	}

}
