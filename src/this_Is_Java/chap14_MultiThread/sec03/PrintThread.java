package chap14_MultiThread.sec03;

//BeepPrintEx03�� �����ϱ�(�ּ��κ��� ���⿡ �ű�)

public class PrintThread extends Thread{	//Thread�� �ڽĽ����带 ����� ���̹Ƿ� �̰��� �����尡 �´�.
	@Override
	public void run() {
		//�۾�2
			for(int i=0; i<5; i++) {
				System.out.println("��");
				try { Thread.sleep(500); } catch(Exception e) {}
			}
	}
}
