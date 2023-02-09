package chap11_Exception.sec02;

public class ExceptionHandlingEx01 {
	public static void printLength(String data) {   //static을 쓴 이유 : main이 static이므로 main 안에서 바로 호출하려고/안붙이면 객체생성 후 참조변수를 이용해 써야한다
		int result=data.length();  //data가 null일 경우 NullPointException 발생->'프로그램 종료' 문자 없이 바로 종료됨
		System.out.println("문자수: "+result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("this is java");   //printLength 메소드에 문자열 String에 맞춰 문자를 data에 저장함
		printLength(null);  //매개값으로 null 대입
		System.out.println("프로그램 종료");
		
	}

}

/*NullPointException : 아 객체가 없구나, 실행예외
 *data.length() : 객체(data)가 가지고있는(.) length를 실행해라 
 */
 
