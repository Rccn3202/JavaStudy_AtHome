package chap14_MultiThread.sec03;

import java.awt.Toolkit;

//멀티스레드 - Thread 클래스로 직접 객체 생성
//소리를 내면서 동시에 "띵"을 출력 시킨다 : 싱글스레드에서는 소리 5번 후 띵 5번이지만, 멀티 스레드는 소리와 문자가 동시에 나온다
//main스레드가 start를 호출하면 작업1이 실행되고 거의 동시에 main의 다음줄인 작업2가 실행된다
 

public class BeepPrintEx02 {

	public static void main(String[] args) {
		
		//작업1
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit(); 
				for(int i=0; i<5; i++) {
					toolkit.beep();		//비프음 낸다.
					try {
						Thread.sleep(500);		//0.5초 일시정지
					} catch (InterruptedException e) {
					}		
				}
				
			}
			
		});
			
		thread.start();	//run메소드 시작
		
		
/*		//작업2
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);		//0.5초 일시정지
			} catch (InterruptedException e) {
			}		
		}
*/
		//Task 클래스를 실행한다. - Task를 여기 뿐 아니라 다른 곳에 사용한다면 이렇게 명시적으로 클래스를 만들고 불러오는 방법이 좋다
		
		Thread thread2 = new Thread(new Task());
		//아니면 아래와 같이 명시적으로 객체를 만들어도 된다(pt)
		//Task task = new Task();  new Task()가 Runnable을 구현한 객체이므로 Task대신 Runnable 써도 된다. Runnable task = 
		//Thread thread2 = new Thread(task);
		thread2.start();
	}

}
