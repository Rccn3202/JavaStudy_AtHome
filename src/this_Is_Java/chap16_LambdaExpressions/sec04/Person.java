package chap16_LambdaExpressions.sec04;

public class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("°á°ú: "+result);
	}
}
