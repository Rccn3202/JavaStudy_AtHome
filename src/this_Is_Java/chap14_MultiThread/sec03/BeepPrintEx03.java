package chap14_MultiThread.sec03;

import java.awt.Toolkit;

//��Ƽ������ - Thread �ڽ� Ŭ������ ����� ����(�͸�)
public class BeepPrintEx03 {

	public static void main(String[] args) {
		//�۾�1
		Thread thread = new Thread() {	//Thread�� �θ��̰�, �� �θ� ����� �ڽ�Ŭ������ ������ �͸��̴�{}
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {
					toolkit.beep();							
					try { Thread.sleep(500); } catch(Exception e) {}	
				}
			}
		};
		
		thread.start();
		
		
/*		//�۾�2
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
*/
		
		
		PrintThread pt = new PrintThread();
		pt.start();
	}

}
