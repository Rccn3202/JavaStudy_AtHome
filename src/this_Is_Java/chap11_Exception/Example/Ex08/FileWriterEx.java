package chap11_Exception.Example.Ex08;
/*
 * ���ܹ߻����� ��� ���� ���������� close()�޼ҵ带 �����ؼ� ���� �ݴ´�. try-catch-finally�� �ۼ��� �ڵ带 ���ҽ� �ڵ��ݱ⸦ �̿��ϵ��� ����
 * >���ҽ�
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
