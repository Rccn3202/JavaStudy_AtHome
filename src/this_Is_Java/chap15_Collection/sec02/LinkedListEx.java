package chap15_Collection.sec02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		//ArrayList �÷��� ��ü ����
		List<String> list1 = new ArrayList<String>();
		
		//LinkedList �÷��� ��ü ����
		List<String> list2 = new LinkedList<String>();

		//���� �ð��� �� �ð��� ������ ���� ����
		long startTime;
		long endTime;
		
		//ArrayList�� �÷��ǿ� �����ϴ� �ð� ����
		startTime = System.nanoTime();		//System.nanoTime(); �ð������� �� ����
		for(int i=0;i<10000;i++) {
			list1.add(0, String.valueOf(i));	//�ε��� 0�� ���Եȴ�-Array�� ��� �ڷ� �и� ���̰� Linked�� ����� ��
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList �ɸ� �ð� : ", (endTime-startTime));
		
		//LinkedList �÷��ǿ� �����ϴ� �ð� ����
		startTime = System.nanoTime();		//System.nanoTime(); �ð������� �� ����
		for(int i=0;i<10000;i++) {
			list2.add(0, String.valueOf(i));	//�ε��� 0�� ���Եȴ�-Array�� ��� �ڷ� �и� ���̰� Linked�� ����� ��
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList �ɸ� �ð� : ", (endTime-startTime));
	}
	
		

}
