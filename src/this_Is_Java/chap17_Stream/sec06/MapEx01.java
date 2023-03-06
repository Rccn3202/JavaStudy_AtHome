package chap17_Stream.sec06;

import java.util.ArrayList;
import java.util.List;

public class MapEx01 {

	public static void main(String[] args) {
		//List �÷��� ����
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("ȫ�浿", 85));
		studentList.add(new Student("ȫ�浿", 92));
		studentList.add(new Student("ȫ�浿", 87));
		
		//Student�� score ��Ʈ������ ��ȯ
		studentList.stream()
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
		

	}

}
