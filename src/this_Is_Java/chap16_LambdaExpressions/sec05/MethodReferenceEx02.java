package chap16_LambdaExpressions.sec05;

public class MethodReferenceEx02 {
	public static void main(String[] args) {
		Person02 person = new Person02();
		
		person.ordering((a,b)->{
			return a.compareToIgnoreCase(b);
		});
		
		person.ordering((a,b) -> a.compareToIgnoreCase(b));
		
		person.ordering(String :: compareToIgnoreCase); //(a,b)->a.compareToIgnoreCase(b)
		//String은 인스턴스 메소드이다(앞에 static 안붙음)
		//ordering에 들어가는 인스턴스 타입은 Comparable이다
		//이 Comparable의 추상메소드는 매개변수가 a,b 두 개이다.
		//=> a가 가지고있는 compareToIgnoreCase를 호출하고 매개값으로 b를 제공한다
		//만약에 정적메소드 였으면 a,b 둘 다 매개값
	}
}
