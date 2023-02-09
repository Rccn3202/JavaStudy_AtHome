package chap11_Exception.sec05;
//던져진 여러 예외를 한꺼번에 처리->사용 안하는 것이 좋다
public class ThrowsEx02 {

	public static void main(String[] args) throws Exception {
		findClass();
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}

/*
 * 사용자에게 오류메세지를 보여주는 것은 좋지 않기 때문에 main에 throws를 쓰는 것은 좋지 않다
 */
