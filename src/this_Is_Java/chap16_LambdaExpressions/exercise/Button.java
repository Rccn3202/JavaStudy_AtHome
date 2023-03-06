package chap16_LambdaExpressions.exercise;

public class Button {
	//정적 멤버 인터페이스(함수형 인터페이스)
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}

}
