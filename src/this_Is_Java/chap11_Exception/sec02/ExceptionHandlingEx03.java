package chap11_Exception.sec02;
//일반예외
public class ExceptionHandlingEx03 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");  //Class가 가지고있는 forName정적메소드를 호출하겠다
												//java.lang.String이라는 이름을 가진 클래스가 있냐? 있다면 클래스의 바이트코드를 메모리에 저장해라
												//없다면 ClassNotFoundException 예외가 발생한다
												//*java.lang.String은 자바에 기본으로 존재한다
			System.out.println("java.lang.String 클래스가 존재");
		} catch(ClassNotFoundException e) {		//일반예외
			e.printStackTrace();
		}

		System.out.println();
		
		try {
			Class.forName("java.lang.String2");    //예외 발생
			System.out.println("java.lang.String2 클래스가 존재");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/*
		 * 바이트 코드(Java bytecode)
		 * -자바 가상 머신이 이해할 수 있는 언어로 변환된 자바 소스 코드를 의미
		 * -확장자는 .class
		 * 
		 */
	}
}
