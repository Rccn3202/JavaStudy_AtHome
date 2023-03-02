package chap17_Stream.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamEx {

	public static void main(String[] args) {
		//List �÷��� ����
		List<String> list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add("�ſ��");
		list.add("���ڹ�");
		list.add("���ٽ�");
		list.add("�ں���");
		
		//���� ó��
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
		

	}

}
