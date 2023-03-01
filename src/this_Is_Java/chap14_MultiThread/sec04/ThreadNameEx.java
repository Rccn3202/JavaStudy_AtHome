package chap14_MultiThread.sec04;

//스레드 이름 변경하기
//이름 바꾸려면 스레드가 시작되기 전에 이름을 변경해야한다.

public class ThreadNameEx {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //이 코드를 실행하는 스레드 객체 참조 얻기
		System.out.println(mainThread.getName() + " 실행");
		
		for(int i=0; i<3; i++) {
			Thread threadA = new Thread() {		//스레드의 자식객체생성
				public void run() {
					System.out.println(getName() + " 실행");	//getName()은 Thread의 인스턴스 메소드. 스레드의 이름을 리턴
				}
			};
			threadA.start();
		}
		
		Thread chatThread = new Thread() {	
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		chatThread.setName("chat-thread");
		chatThread.start(); //작업스레드 이름 변경
	}
}
