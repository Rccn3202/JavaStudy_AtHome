package chap11_Exception.Example.Ex08;

import java.io.IOException;

public class FileWriter implements AutoCloseable{
	public FileWriter(String filePath) throws IOException {
		System.out.println(filePath+"���Ͽ���");
	}
	public void write(String data) throws IOException{
		System.out.println(data+" ��������");
	}
	@Override
	public void close() throws Exception {
		System.out.println("���� ����");	
	}
}
