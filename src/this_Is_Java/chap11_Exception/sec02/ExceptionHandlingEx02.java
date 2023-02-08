package chap11_Exception.sec02;
//실행예외
public class ExceptionHandlingEx02 {
	public static void printLength(String data) {  
		try {
			int result=data.length();  
			System.out.println("문자수: "+result);
		} catch(NullPointerException e) {  //예외를 처리하기 위해 해당 예외클래스를 가지고 객체를 만든다. 이 예외객체의 위치 정보는 변수e에 저장된다
			System.out.println(e.getMessage());    //변수(e) 안으로 들어가서(.) 왜 이유가 발생했는지(getMessage)를 출력한다(println)
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("마무리");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("this is java");   
		printLength(null);  
		System.out.println("프로그램 종료");
	}
}
/*
 * getMessage() : 예외가 발생한 이유를 간단하게 설명
 * toString() : 예외의 종류와 사유까지 리턴해준다
 * e.printStackTrace() : 예외 종류, 이유, 예외 발생 위치 -> 많이 사용한다
 * 개발할 때, 이런 예외 이유는 안보이게 주석처리 해야하고 catch블록에 예외처리방법을 넣는다
 */
 