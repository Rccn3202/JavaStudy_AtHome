package chap16_LambdaExpressions.sec03;

public class Person {
	public void action1(Workable workable) {
		workable.work("홍길동", "프로그래밍");	//work메소드 실행
	}
	
	public void action2(Speakable speakable) {
		speakable.speak("안녕하세요");		//speak메소드 실행
	}
}
