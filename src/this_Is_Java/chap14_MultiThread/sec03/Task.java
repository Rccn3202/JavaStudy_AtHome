package chap14_MultiThread.sec03;

//BeepPrintEx02�� �����ϱ�(�ּ��κ��� ���⿡ �ű�)
//��Ƽ������ - Thread Ŭ������ ���� ��ü ����


public class Task implements Runnable {	//Runnable�� ������ ��. �����尡 �ƴ�. �۾������� �����ִ� ��ü

	@Override
	public void run() {
		//�۾�2
			for(int i=0; i<5; i++) {
				System.out.println("��");
				try {
					Thread.sleep(500);		//0.5�� �Ͻ�����
				} catch (InterruptedException e) {
				}		
			}
	}

}
