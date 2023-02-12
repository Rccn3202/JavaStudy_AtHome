package chap15_Collection.sec02;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Vector �÷��� ����
		List<Board> list=new Vector<>(); //Vector���� ArrayList ������ ��������

		//�۾� ������ ��ü ����
		Thread threadA=new Thread() {
			@Override
			public void run() {
				//��ü 1000�� �߰�
				for(int i=1; i<=1000;i++) {			//for�ݺ��ϸ鼭 ��ü�� �߰��ϰ� ����
					list.add(new Board("����"+i,"����"+i, "�۾���"+i));    
				}
			}
		};
		
		//�۾� ������ ��ü ����
		Thread threadB=new Thread() {
			@Override
			public void run() {
				//��ü 1000�� �߰�
				for(int i=1001; i<=2000;i++) {			//for�ݺ��ϸ鼭 ��ü�� �߰��ϰ� ����
					list.add(new Board("����"+i,"����"+i, "�۾���"+i));
			}
		}
		};
		
		//�۾� ������ ����
		threadA.start();
		threadB.start();	//�� 1000���� ���������ϱ� <Board>�ȿ��� 2000�� ����Ǿ����
		
		//�۾� ��������� ��� ����� ������ ���� �����带 ��ٸ��� ��
		try {
		threadA.join();			//���� �����尡 ������A�� ����� ������ ��ٸ�(1000�� ������ ������)
		threadB.join();			//���� �����尡 ������B�� ����� ������ ��ٸ�(1000�� ������ ������)
		} catch(Exception e) {
		}
		
		//����� �� ��ü �� ���
		int size = list.size();
		System.out.println("�� ��ü �� : "+size);
		System.out.println();
	}
}
