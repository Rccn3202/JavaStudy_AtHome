package chap16_LambdaExpressions.exercise;

public class Button {
	//���� ��� �������̽�(�Լ��� �������̽�)
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}

}
