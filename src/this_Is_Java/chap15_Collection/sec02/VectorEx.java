package chap15_Collection.sec02;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// Vector �÷��� ����
		List<Board> list=new Vector<>();

		//�۾� ������ ��ü ����
		Thread threadA=new Thread() {
			@Override
			public void run() {
			//��ü 1000�� �߰�
				for(int i=1; i<=1000;i++) {
					list.add(new Board("����"+i,"����"+i, "�۾���"+i));
				}
			}
		};
		
		//�۾� ������ ��ü ����
		Thread threadB=new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}
		}
		
		
		
	}

}
