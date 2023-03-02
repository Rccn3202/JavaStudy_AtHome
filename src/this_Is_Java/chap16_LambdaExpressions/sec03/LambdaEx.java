package chap16_LambdaExpressions.sec03;

public class LambdaEx {
	public static void main(String[] args) {
		Person person = new Person();	//Person을 호출해서 Person이 갖고있는 메소드를 이용한다(action1,2)
		
		//매개변수가 두 개일 경우
		person.action1((name, job) -> {	//(n,j)여도 됨
			System.out.println(name+"이 ");
			System.out.println(job+"을 합니다");
		});
		person.action1((name,job) -> System.out.println(name+"이 "+job+"을 하지 않습니다"));
		
		//매개변수가 한 개일 경우-()생략 가능
		//((word) -> ...   => (word -> ...
		person.action2(word -> {
			System.out.println("\"" + word + "\"");	//문자열에 "\""를 포함한다
			System.out.println("라고 말합니다");
		});
		person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니단"));
		

	}

}
