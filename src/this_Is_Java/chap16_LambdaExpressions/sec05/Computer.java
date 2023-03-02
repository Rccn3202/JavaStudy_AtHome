package chap16_LambdaExpressions.sec05;

public class Computer {
	public static double staticMethod(double x, double y) {	//정적메소드
		return x+y;
	}
	//사용하려면 computer.staticMethod로 호출
	
	public double instanceMethod(double x, double y) {	//인스턴스메소드
		return x+y;
	}
	//사용하려면 computer객체 만든 후 호출
}
