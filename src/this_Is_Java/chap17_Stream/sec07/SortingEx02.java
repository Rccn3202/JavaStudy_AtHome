package chap17_Stream.sec07;

import java.util.ArrayList;
import java.util.List;

public class SortingEx02 {

	public static void main(String[] args) {
		//List �÷��� ����
				List<Student02> studentList = new ArrayList<>();
				studentList.add(new Student02("ȫ�浿", 30));
				studentList.add(new Student02("�ſ��", 10));
				studentList.add(new Student02("���̼�", 20));
				
				//������ �������� ������������ ������ �� ��Ʈ�� ���
				studentList.stream();

	}

}
