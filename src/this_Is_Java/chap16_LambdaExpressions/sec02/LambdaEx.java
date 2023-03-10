package chap16_LambdaExpressions.sec02;

public class LambdaEx {

	public static void main(String[] args) {
		Person person = new Person();	//Person 객체생성
		
		//실행문이 두 개 이상인 경우 중괄호 필요
		person.action(() -> {	//매개값을 람다식으로 호출. Person클래스에서 Workable 클래스에 있는 work 메소드를 호출한다
			System.out.println("출근을 합니다");
			System.out.println("프로그래밍을 합니다");
		});
		
		//실행문이 한 개일 경우 중괄호 생략 가능
		person.action(() -> System.out.println("퇴근합니다"));

	}

}
