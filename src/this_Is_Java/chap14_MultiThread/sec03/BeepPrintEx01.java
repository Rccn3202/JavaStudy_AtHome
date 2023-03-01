package chap14_MultiThread.sec03;

//싱글스레드

import java.awt.Toolkit;

public class BeepPrintEx01 {
	
	public static void main(String[] args) {	//main스레드
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	//Toolkit 객체 얻기
		//java패키지에 있는 Toolkit을 가지고 객체 toolkit을 얻겠다.
		//.~ : new해서 객체를 얻는 것이 아니라 정적메소드를 통해서 리턴값으로 얻겠다.
		
		//작업1
		for(int i=0; i<5; i++) {
			toolkit.beep();								//비프음 발생(이렇게만 작성하면 너무 빨라서 안들림)
			try { Thread.sleep(500); } catch(Exception e) {}	//{ Thread.sleep(500); } : 0.5초간 일시정지
		}
		
		//작업2
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
