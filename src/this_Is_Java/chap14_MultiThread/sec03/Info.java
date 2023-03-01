package chap14_MultiThread.sec03;

public class Info {
/* 14.3 작업 스레드 생성과 실행
 * 
 * 작업 스레드 만드는 방법
 * 
 * 1. Thread 클래스로 직접 객체 생성
 * 
 * Thread thread = new Thread(Runnable target); : thread에 번지를 저장한다 = 생성해서(생성자 호출해서) Thread객체를	>>핵심!! 스레드를 생성할 때 객체 생성하고
 * thread.start(); : 스레드 실행 																				>>핵심!! start로 실행한다
 * (Runnable target) : 생성자 매개값. Runnable은 인터페이스/( )안에 Runnable을 구현한 객체가 들어간다. 
 * 
 * 예)
 * 
 * //명시적으로 클래스 선언(명시적 클래스:이름이 있는 클래스)
 * class Task implements Runnable {
 * 		@Override
 * 		public void run() {		
 *			//스레드가 실행할 코드
 *	 }
 * }
 *
 * Runnable task = new Task();	//Runnable 인터페이스를 사용해서 = 객체를 생성한다 (Runnable 안쓰고 싶으면 그냥 Task 써도 됨)
 * Thread thread = new Thread(task);	//위에 만든 객체 task를 Thread 생성할 때 생성자 매개값으로 제공한다
 * 
 * thread.start(); 했을 때, 실제로 실행되는 것은 Task 클래스 안의 run() 메소드이다. 
 * 
 * 작동순서
 * 1) class Task implements Runnable 의 객체를 메인스레드 new Thread(task)에 넣는다
 * 2) 메인스레드의 start() 메소드를 실행한다 ->메인스레드 실행(작업스레드와 동시진행)
 * 3) class Task의 run() 메소드를 실행한다 ->작업스레드 실행(메인스레드와 동시진행)
 * 
 * 
 * 
 * 
 * //익명구현객체선언
 * Thread thread = new Thread(new Runnable() {	//바로 이름 없는 객체를 생성함(new Runnable)
 *		@Override					//인터페이스 Runnable을 제정의한 메소드가 들어간다
 *	 	public void run() {		
 *			//스레드가 실행할 코드
 *	 }
 * } );
 * 
 * Runnable을 일반적으로 스레드가 작업할 내용을 갖고있는 객체라고 한다
 * 
 * 
 * 2. Thread 자식 클래스를 만들어 생성
 * 
 * 예)
 * 
 * //명시적 자식객체 선언
 * public class WorkerThread extends Thread {	//부모스레드를 상속받았다
 *	@Override
 *	public void run() {				//위의 run()은 Runnable이라는 인터페이스의 추상메소드를 재정의한것, 이것은 Thread가 직접 갖고있는 run()을 재정의한것
 *		//스레드가 실행할 코드
 *	 }
 * }
 * 
 * //스레드 객체 생성
 * Thread thread = new WorkerThread();	//자식스레드객체(WorkerThread)를 만들어서 부모타입(Thread)에 넣는다 (부모로 안하고 WorkerThread로 변수선언 해도 된다
 * thread.start();
 * 
 * 
 * 작동순서
 * 1) 자식스레드 class WorkerThread extends Thread를 오버라이드로 정의하고나서 메인스레드의 new WorkerThread()로 객체를 만든다 
 * 2) start() 메소드 호출
 * 3) WorkerThread가 run()실행, 동시에 메인스레드도 실행
 * 
 * 
 * 
 * 
 * //익명자식객체
 * Thread thread = new Thread() {	//이름은 명시하지 않았지만 Thread를 상속받아서 아래 오버라이드와 같이 선언한 다음에 new 객체를 만들어서 thread에 담는다
 *  @Override
 *  public void run() {
 *		//스레드가 실행할 코드
 *	 }
 * };
 * thread.start();
 * 
 * 
 * 
 * 
 * 익명자식객체가 학상 좋은 것은 아니다.
 * 딱 여기에만 쓸 것 같으면 괜찮은데 다른 클래스도 똑같은 코드를 이용한다면 명시적으로 이름을 붙이는 것이 좋다. (재사용성이 좋다)
 * 
 * 
 */
}





