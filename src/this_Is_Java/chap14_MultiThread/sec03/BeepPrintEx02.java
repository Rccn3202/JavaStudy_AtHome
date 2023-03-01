package chap14_MultiThread.sec03;

import java.awt.Toolkit;

//��Ƽ������ - Thread Ŭ������ ���� ��ü ����
//�Ҹ��� ���鼭 ���ÿ� "��"�� ��� ��Ų�� : �̱۽����忡���� �Ҹ� 5�� �� �� 5��������, ��Ƽ ������� �Ҹ��� ���ڰ� ���ÿ� ���´�
//main�����尡 start�� ȣ���ϸ� �۾�1�� ����ǰ� ���� ���ÿ� main�� �������� �۾�2�� ����ȴ�
 

public class BeepPrintEx02 {

	public static void main(String[] args) {
		
		//�۾�1
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit(); 
				for(int i=0; i<5; i++) {
					toolkit.beep();		//������ ����.
					try {
						Thread.sleep(500);		//0.5�� �Ͻ�����
					} catch (InterruptedException e) {
					}		
				}
				
			}
			
		});
			
		thread.start();	//run�޼ҵ� ����
		
		
/*		//�۾�2
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);		//0.5�� �Ͻ�����
			} catch (InterruptedException e) {
			}		
		}
*/
		//Task Ŭ������ �����Ѵ�. - Task�� ���� �� �ƴ϶� �ٸ� ���� ����Ѵٸ� �̷��� ��������� Ŭ������ ����� �ҷ����� ����� ����
		
		Thread thread2 = new Thread(new Task());
		//�ƴϸ� �Ʒ��� ���� ��������� ��ü�� ���� �ȴ�(pt)
		//Task task = new Task();  new Task()�� Runnable�� ������ ��ü�̹Ƿ� Task��� Runnable �ᵵ �ȴ�. Runnable task = 
		//Thread thread2 = new Thread(task);
		thread2.start();
	}

}
