package chap11_Exception.sec06;
//잔고부족 예외를 사용자 정의 예외클래스로 선언
public class InsufficientException extends Exception {  //일반예외로 선언
	public InsufficientException() {					//생성자1 매개변수 없는 것
	}
	public InsufficientException(String message) {		//생성자2 매개변수 String타입으로 받는 것
		super(message);									//e.getMessage는 여기의 이 message가 리턴되어 나오는 것이다
	}
}


/*
*예외이름 자체에 예외의 이유가 설명되어있다면 추가로 블록에 무언가를 작성할 필요 없다
*예외클래스를 만들어놓고, 예외가 발생하면 이 예외클래스를 가지고 예외객체를 만든다
*/
