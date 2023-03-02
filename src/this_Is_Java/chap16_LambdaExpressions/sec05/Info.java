package chap16_LambdaExpressions.sec05;

public class Info {
/* 16.5 메소드 참조
 * 
 * (left, right) -> Math.max(left, right);	를
 * Math :: max;								이렇게 작성할 수 있다
 * 
 * 
 * 1. 정적 메소드와 인스턴스 메소드 참조
 * 정적메소드) 클래스 :: 메소드
 * 인스턴스메소드) 객체/객체의 참조변수 :: 메소드
 * 
 * 2. 매개변수의 메소드 참조
 * //a가 참조하는 객체에 instanceMethod를 호출할 때, 매개값을 b로 준다.
 * (a, b) -> {a.instanceMethod(b);}	를
 * 클래스 :: instanceMethod			이렇게 작성할 수 있다.
 * 
 * 정적메소드와 형식은 같지만 컴파일러는
 * 정적메소드면 두 개의 매개변수를 전부 다 매개값으로 사용한다고 생각하고
 * 인스턴스메소드면 a를 통해서 메소드를 호출하고 b는 메소드의 매개값이라고 생각한다.
 * 
 * 
 * 
 * 
 */
}
