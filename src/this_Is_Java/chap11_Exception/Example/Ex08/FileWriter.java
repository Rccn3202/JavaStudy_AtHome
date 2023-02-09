package chap11_Exception.Example.Ex08;

import java.io.IOException;

public class FileWriter implements AutoCloseable{
	public FileWriter(String filePath) throws IOException {
		System.out.println(filePath+"파일열기");
	}
	public void write(String data) throws IOException{
		System.out.println(data+" 파일저장");
	}
	@Override
	public void close() throws Exception {
		System.out.println("파일 닫음");	
	}
}
