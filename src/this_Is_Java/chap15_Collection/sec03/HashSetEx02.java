package chap15_Collection.sec03;
//Set은 서로 다른 객체여도 동등객체(이름,나이 같음)라고 판단하면 하나만 저장한다
import java.util.HashSet;
import java.util.Set;

public class HashSetEx02 {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<Member> set = new HashSet<Member>();	//set인터페이스 타입의 변수 선언, <Member>타입만 저장하겠다
		
		//Member 객체 저장
		set.add(new Member("홍길동", 30));	//두개의 멤버객체 저장
		set.add(new Member("홍길동", 30));	//서로 다른 객체지만 이름,나이가 같으므로 동등객체로 판단. 실제 저장되는 것은 하나

		//저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());	//1 나온다
	}

}
