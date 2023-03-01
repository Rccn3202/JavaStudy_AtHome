package chap14_MultiThread.sec02;

public class MainThreadEx {

	public static void main(String[] args) {

		System.out.println("시작");
		
		
	//	Thread currThread = null; //NullPointer 예외 발생(Exception in thread "main" : 이름이 main인 스레드에서 예외 발생)
		
		Thread currThread = Thread.currentThread(); 
		//클래스Thread 타입으로 currThread 변수선언 = 스레드.정적메소드(currentThread) : 현재 스레드의 객체를 리턴한다
		System.out.println(currThread.getName());
		//메인 메소드를 실행하는 스레드의 이름은 main 이다
		
		
		System.out.println("종료");

	}

}
