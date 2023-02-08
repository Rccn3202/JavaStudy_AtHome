package chap11_Exception.sec03;
//Exception e를 사용한 예외처리
public class ExceptionHandlingEx02 {

	public static void main(String[] args) {
		String[] array= {"100", "1oo"};

		for(int i=0;i<=array.length;i++) {
			try {
				int value=Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+value);
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: "+e.getMessage());
			} catch(Exception e) {
				System.out.println("오류: "+e.getMessage());
			}
		}
	}
}

/*
 * 예외가 5가지정도 발생할 수 있는데 숫자변환 예외만 다른 방식으로 표시하고 나머지는 한꺼번에 예외처리하고 싶다면
 * 숫자변환 예외를 먼저쓰고 나머지는 Exception으로 처리한다
 * 
 */
