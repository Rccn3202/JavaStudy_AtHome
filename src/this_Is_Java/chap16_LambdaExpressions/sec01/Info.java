package chap16_LambdaExpressions.sec01;

public class Info {
/* 16.1 람다식이란?
 * 
 * 함수:객체와는 상관없이 실행 가능한 코드들을 묶어놓은 것
 * 메소드: 반드시 객체 안에 존재. 객체의 기능을 정의함(항상 class, object 등에 감싸져있다)
 * 
 * 자바 스크립트는 함수, 메소드 둘 다 있다
 * 자바는 함수형 프로그램X
 * 
 * 함수형 프로그램:함수를 전달 객체로 본다. 데이터 처리부의 데이터는 동일한데 외부에서 함수를 전달해서 데이터를 처리하는 형식의 프로그램
 * 람다식은 이러한 함수형 프로그램의 함수 양식을 가진다
 * 
 * 람다식 : (매개변수, ...) -> {처리 내용} //이것도 클래스로 인식한다.
 * 
 * 자바는 람다식을 익명 구현 객체로 변환한다.
 * 
 * 예)
 * new Calculable() {
 *	@Override
 *	public void calculate(int x, int y) {처리내용}
 * };						
 * 이것을 (x,y) -> { 처리내용 }; 이렇게 축약할 수 있다.
 * 
 * public void action(Calculable calculable) {	//Calculabel은 인터페이스타입
 *	int x = 10;	//데이터 부분
 *	int y = 4;	//데이터 부분
 *	calculable.calcurate(x,y);	//데이터를 제공하고 추상메소드를 호출	
 * } //구현객체가 어떤지 직접 보아야 데이터가 어떻게 이용되는지 알 수 있음(실행클래스 필요)
 * 
 * 이런 메소드를 입력할 때, 원래는 위의 Calculable 인터페이스를 생성하고 (Calculable calculable)이렇게 불러서 써야하지만
 * 대신 (x,y) -> { 처리내용 }; 람다식을 쓸 수 있다
 * action((x,y) -> {
 *	int result = x + y;
 *	System.out.println(result);
 * } );
 * 
 * 람다식은 익명구현객체이다
 * 
 * 중요!! 인터페이스의 익명구현객체를 람다식으로 표현하려면 인터페이스가 단 하나의 추상 메소드만 가져야한다(함수형 인터페이스 functional interface)
 *
 * 인터페이스 위에 @FunctionalInterface 붙이면 @override와 비슷한 효과를 가진다(컴파일러가 이 인터페이스에 추상메소드가 하나밖에 없는지 검사한다. 메소드 여러개면 오류냄. 안전용)
 * 
 * 
 */
}








