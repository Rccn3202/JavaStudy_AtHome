package chap15_Collection.sec04;

import java.util.Hashtable;
import java.util.Map;

public class HashtableEx01 {

	public static void main(String[] args) {
		//Hashtable �÷��� ����
		Map<String,Integer> map = new Hashtable<>();
		
		//�۾� ������ ��ü ����
		Thread threadA = new Thread() {
			@Override
			public void run() {
				//��Ʈ�� 1000�� �߰�
				for (int i = 1; i<=1000;i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		//�۾� ������ ��ü ����
		Thread threadB = new Thread() {
			public void run() {
				//��Ʈ�� 1000�� �߰�
				for (int i = 1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		//�۾� ������ ����
		threadA.start();
		threadB.start();
		
		//�۾� ��������� ��� ����� ������ ���� �����带 ��ٸ��� ��
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}
		
		//����� �� ��Ʈ�� �� ���
		int size = map.size();
		System.out.println("�� ��Ʈ�� �� : "+size);
		System.out.println();
	}
}
