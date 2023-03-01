package chap14_MultiThread.sec03;

//BeepPrintEx02를 수정하기(주석부분을 여기에 옮김)
//멀티스레드 - Thread 클래스로 직접 객체 생성


public class Task implements Runnable {	//Runnable을 구현한 것. 스레드가 아님. 작업내용을 갖고있는 객체

	@Override
	public void run() {
		//작업2
			for(int i=0; i<5; i++) {
				System.out.println("띵");
				try {
					Thread.sleep(500);		//0.5초 일시정지
				} catch (InterruptedException e) {
				}		
			}
	}

}
