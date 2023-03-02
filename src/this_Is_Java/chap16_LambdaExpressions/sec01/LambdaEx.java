package chap16_LambdaExpressions.sec01;

public class LambdaEx {

	public static void main(String[] args) {
		action((x, y) -> {	//아래의 action메소드를 람다식으로 호출한 것
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
	}
	
	//어떤 람다식을 대입했냐에 따라 calculate의 실행 결과는 달라진다
	public static void action(Calculable calculable) {	//인터페이스 타입 매개변수.
		//데이터
		int x = 10;
		int y = 4;
		//데이터 처리
		calculable.calculate(x, y);
		
		
	}
}
