package chap16_LambdaExpressions.sec06;

public class ConstructorReferenceEx {
	public static void main(String[] args) {
		Person person = new Person();
		
		Member m1 = person.getMember1(Member :: new);	//(Member :: new); 생성자 참조
		System.out.println(m1);
		System.out.println();
		
		Member m2 = person.getMember2(Member :: new);
		System.out.println(m2);
	}
}
