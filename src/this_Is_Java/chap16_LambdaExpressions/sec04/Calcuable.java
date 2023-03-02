package chap16_LambdaExpressions.sec04;

@FunctionalInterface
public interface Calcuable {
	double calc(double x, double y);	//리턴타입이 void가 아니므로 반드시 리턴값을 정의해야한다
}
