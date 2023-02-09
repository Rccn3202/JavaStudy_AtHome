package chap11_Exception.sec05;

public class Info {
/*11.5 예외 떠넘기기
 * 
 * 예시)
 * ClassNotFoundException을 throws하는 method2()의 예외를 method1()에서 호출할 때 처리한다
 * public void method1() {
 *  	try {
 *  		method2();
 * 	 } catch(ClassNotFoundException e) {
 * 	 	System.out.println("예외 처리: "+e.getMessage());
 * 	 }
 * }
 * 
 * public void method2() throws ClassNotFoundException {
 * 	 Class.forName("java.lang.String2");
 * }
 * 
 * method2()에서 오류가 났고, method2()는 이 예외(ClassNotFoundException)를 throws한다. ->호출한 곳으로 감
 * method1()은 try블록 안에 method2()를 호출하여 catch로 넘긴 후 예외처리 한다
 * 
 */
}