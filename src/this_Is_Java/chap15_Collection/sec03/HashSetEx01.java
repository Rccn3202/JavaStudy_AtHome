package chap15_Collection.sec03;
//Set�� �ߺ� ��ü�� �������� �ʴ´�
import java.util.HashSet;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		//HashSet �÷��� ����
		Set<String> set = new HashSet<String>();  //���ڿ��� ����, HashSet�̶�� ������ü�� �̿��ϰڴ�
												  //Set<String>�������̽��� new HashSet<String>() �� ������ü�� ����ϰڴ�.
		//��ü ����
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");   //�ߺ� ��ü�̹Ƿ� �������� ���� (���ڿ��� ������ hashcode�� ���� equals�� true)
		set.add("Spring");
		
		//����� ��ü �� ���
		int size = set.size();  //4
		System.out.println("�� ��ü �� : "+size);
	}

}
