package chap16_LambdaExpressions.sec01;

@FunctionalInterface
public interface Calculable {
	//추상메소드(딱 하나 있어야 한다)
	void calculate(int x, int y);
}
