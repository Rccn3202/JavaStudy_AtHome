package chap16_LambdaExpressions.sec01;

public class LambdaEx {

	public static void main(String[] args) {
		action((x, y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
	}
	
	public static void action(Calculable calculable) {
		//单捞磐
		int x = 10;
		int y = 4;
		//单捞磐 贸府
		calculable.calculate(x, y);
	}
}
