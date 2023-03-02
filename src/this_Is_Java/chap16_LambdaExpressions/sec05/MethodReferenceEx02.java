package chap16_LambdaExpressions.sec05;

public class MethodReferenceEx02 {
	public static void main(String[] args) {
		Person02 person = new Person02();
		person.ordering(String :: compareToIgnoreCase);
	}
}
