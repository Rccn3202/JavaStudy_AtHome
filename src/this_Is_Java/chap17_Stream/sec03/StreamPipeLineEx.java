package chap17_Stream.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿",10),
				new Student("�ſ��",20),
				new Student("���̼�",30)
				);

		//���1
		/*
	Stream<Student> studentStream = list.stream();
	//�߰� ó��(�л� ��ü�� ������ ����)
	IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
	//���� ó��(��� ����)
	double avg = scoreStream.average().getAsDouble();


	//���� ó��(��� ����)
	double avg = scoreStream.average().getAsDouble();
		 */

		//���2
		double avg = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();

		System.out.println("��� ����: "+avg);

	}

}
