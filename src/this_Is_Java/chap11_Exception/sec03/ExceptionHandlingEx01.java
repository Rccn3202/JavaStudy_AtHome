package chap11_Exception.sec03;
//예외를 종류에 따라 각각 처리, 상위-하위클래스 catch작성 주의
public class ExceptionHandlingEx01 {

	public static void main(String[] args) {
		String[] array= {"100", "1oo"};
		
		for(int i=0;i<=array.length;i++) {
			try {
				int value=Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: "+e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: "+e.getMessage());
			}
		}
	}
}

/*
 * Integer.parseInt("100") : ( )안에 있는 문자열을 숫자로 변환시킨다 
 * 
 * array의 길이는 2이므로 i=0,1,2
 * 1회 i=0 정상실행 : 100
 * 2회 i=1 예외 : 숫자로 변환 불가
 * 3회 i=2 예외 : 인덱스 초과 
 * 
 * 배열에 사용자가 입력한 내용이 들어가거나 하는 등 무슨 값이 들어갈지 모르는 경우가 있기 때문에 미리 예외처리를 해줘야한다. ->발생할 예외 미리 생각하기
 * 
 * 주의
 * 하위클래스 catch블록 먼저 작성하고 상위클래스 catch블록은 나중에 작성해야한다.
 * 예외가 발생하면 위에서부터 차례대로 검사하는데 맨 위에 가장 상위클래스인 Exception을 쓸 경우 모두 Exception처리로 나온다.
 */

