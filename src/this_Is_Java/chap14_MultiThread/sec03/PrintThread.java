package chap14_MultiThread.sec03;

//BeepPrintEx03를 수정하기(주석부분을 여기에 옮김)

public class PrintThread extends Thread{	//Thread의 자식스레드를 만드는 것이므로 이것은 스레드가 맞다.
	@Override
	public void run() {
		//작업2
			for(int i=0; i<5; i++) {
				System.out.println("띵");
				try { Thread.sleep(500); } catch(Exception e) {}
			}
	}
}
