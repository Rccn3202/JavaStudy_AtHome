package chap17_Stream.sec08;

import java.util.Arrays;

public class LoopingEx {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		//�߸� �ۼ��� ���
		Arrays.stream(intArr)
		.filter(a->a%2==0)
		.peek(n->System.out.println(n)); //���� ó���� �����Ƿ� �������� ����
		
		//�߰� ó�� �޼ҵ� peek()�� �̿��ؼ� �ݺ� ó��
		int total = Arrays.stream(intArr)
				.filter(a->a%2==0)
				.peek(n->System.out.println(n)) //������
				.sum(); //����ó��
		System.out.println("����: "+total+"\n");
		
		//���� ó�� �޼ҵ� forEach()�� �̿��ؼ� �ݺ� ó��
		Arrays.stream(intArr)
		.filter(a->a%2==0)
		.forEach(n->System.out.println(n)); //���� ó���̹Ƿ� ������

	}

}
