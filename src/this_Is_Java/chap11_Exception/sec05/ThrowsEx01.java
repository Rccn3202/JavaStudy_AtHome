package chap11_Exception.sec05;
//던져진 예외를 처리
public class ThrowsEx01 {

	public static void main(String[] args) {
		try {
			findClass();			//findClass를 호출 후 아래로 내려가서 예외 처리 
		} catch(ClassNotFoundException e) {
			System.out.println("예외처리: "+e.getMessage());
		}
	}
	
	public static void findClass() throws ClassNotFoundException{ //ClassNotFoundException예외를 던진다
		Class.forName("java.lang.String2");
	}
}

/*
 * findClass에서 예외처리하기 싫을 때 던져서 예외처리
 * main메소드에 throws를 붙이면 오류가 다 뜨기 때문에 안됨. 예외를 다 던지더라도 마지막에 main에서는 예외처리를 하는 것이 좋다
 */
