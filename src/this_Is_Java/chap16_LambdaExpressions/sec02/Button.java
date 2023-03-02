package chap16_LambdaExpressions.sec02;

public class Button {
	//정적 멤버 인터페이스. 함수형임
	@FunctionalInterface
	public static interface ClickListener {
		//추상 메소드
		void onClick();
	}
	
	//필드
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
//버튼을 클릭했을때 어떤 일이 일어나는지는 이것만 가지고는 모름
//외부에서 버튼 누르면 어떻게 되는지는 ClickListener 구현객체를 만들어서 clickListener에 넣어주어야한다