package chap11_Exception.sec03;
//두 개 이상의 예외를 하나의 방식으로 처리하고 싶을 때
public class ExceptionHandlingEx03 {

	public static void main(String[] args) {
		String[] array= {"100", "1oo", null, "200"};

		for(int i=0;i<=array.length;i++) {
			try {
				int value=Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: "+e.getMessage());
			} catch(NullPointerException | NumberFormatException e) {
				System.out.println("데이터에 문제 있음: "+e.getMessage());
			}
		}
	}
}
