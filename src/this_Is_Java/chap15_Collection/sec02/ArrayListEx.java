package chap15_Collection.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		//ArrayList �÷��� ���� - List �������̽��� �̿��� ��
		List<Board> list=new ArrayList<>();
		
		//��ü �߰�
		list.add(new Board("����1","����1","�۾���1"));
		list.add(new Board("����2","����2","�۾���2"));
		list.add(new Board("����3","����3","�۾���3"));
		list.add(new Board("����4","����4","�۾���4"));
		list.add(new Board("����5","����5","�۾���5"));
		
		//����� �� ��ü �� ���
		int size=list.size();
		System.out.println("�� ��ü ��: "+size);
		System.out.println();
		
		//Ư�� �ε����� ��ü ��������
		Board board=list.get(2);
		System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter());
		System.out.println();
		
		//��� ��ü�� �ϳ��� ��������
		for(int i=0;i<list.size();i++) {
			Board b=list.get(i);
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
		}
		System.out.println();
		
		//��ü ����-�� ó���� �ִ� 3,4��°�� ������
		list.remove(2);
		list.remove(2);
		
		//���� for������ ��� ��ü�� �ϳ��� ��������
		for(Board b : list) {
			System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
		}	
	}
}