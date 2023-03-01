package chap14_MultiThread.sec03;

import java.awt.Toolkit;

//멀티스레드 - Thread 자식 클래스를 만들어 생성(익명)
public class BeepPrintEx03 {

	public static void main(String[] args) {
		//작업1
		Thread thread = new Thread() {	//Thread가 부모이고, 이 부모를 상속한 자식클래스가 있으나 익명이다{}
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
		
		
/*		//작업2
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
*/
		
		
		PrintThread pt = new PrintThread();
		pt.start();
	}

}
