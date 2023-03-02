package chap16_LambdaExpressions.sec05;

public class MethodReferenceEx01 {
	public static void main(String[] args) {
		Person01 person = new Person01();
		
		//정적 메소드일 경우
		//람다식
		person.action((x,y) -> Computer.staticMethod(x, y));
		//메소드 참조
		person.action(Computer :: staticMethod);
		
		//인스턴스 메소드일 경우
		Computer com = new Computer();
		//람다식
		person.action((x,y) -> com.instanceMethod(x, y));
		//메소드 참조
		person.action(com :: instanceMethod);
	}

}
