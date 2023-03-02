package chap16_LambdaExpressions.sec02;

public class Person {
	public void action(Workable workable) {	//(Workable workable) 이 자리에 람다식이 들어온다
		workable.work();	//work메소드 호출
	}
}
