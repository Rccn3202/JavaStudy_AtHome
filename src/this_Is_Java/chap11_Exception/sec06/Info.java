package chap11_Exception.sec06;
//11.6 사용자 정의 예외
public class Info {
/*
 * 사용자 정의 예외
 * : 자바 표준 라이브러리에 정의된 것 외의 발생하는 예외는 직접 예외클래스를 정의해서 샤용해야 한다. 
 * 일반예외로 만들지, 실행예외로 만들지는 선택
 * 
 * 만드는 법)
 * public class XXXException extends [ Exception | RuntimeException ] {   //XXX에 예외 이름 정해서 넣기/ [ | ]이건 선택사항. 일반예외면 Exception 상속
 *  public XXXException() {						//추가적으로 더 작성하는 것이 아니라 그대로 작성
 *  }
 * 
 *  public XXXException(String message) {		//추가적으로 더 작성하는 것이 아니라 그대로 작성
 *   super(message);
 *   }
 *  }
 */

/*
 * 예외 발생 시키기
 * 
 * throws와 throw는 전혀 다른 코드!
 * 
 * 예외를 발생시키는 코드는 throw
 * 
 * 사용자 예외를 만들 때, 생성자를 두개 만든 이유
 * throw new insufficientException(); ->예외발생
 * throw new insufficientException("예외메세지"); ->예외발생, 원인에 해당하는 메세지 제공
 * 
 * throw new Exception는 Exception예외를 발생시킨다 
 * ->메소드 입장에서 내부의 예외를 처리하는 방법 
 * 
 * 1.try-catch로 처리하기 ->거의 안쓴다. 자기가 예외 발생시켜놓고 자기가 처리하는 것이기 때문에
 * try {
 *  ...
 *   throw new Exception("예외메시지");  
 *  ...
 *  } catch(Exception e) {
 *  	String message=e.getMessage();
 *  }
 * } 
 * 
 * 2.호출한 쪽으로 떠넘기기
 * void method() throws Exception {   //throw로 발생된 예외를 호출한 곳으로 떠넘긴다
 * ...
 * throw new Exception("예외메시지");
 * ...
 * }
 * 
 */
	
}
