package chap15_Collection.sec03;
//Set은 중복 객체는 저장하지 않는다
import java.util.HashSet;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();  //문자열만 저장, HashSet이라는 구현객체를 이용하겠다
												  //Set<String>인터페이스로 new HashSet<String>() 이 구현객체를 사용하겠다.
		//객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");   //중복 객체이므로 저장하지 않음 (문자열이 같으면 hashcode가 같고 equals가 true)
		set.add("Spring");
		
		//저장된 객체 수 출력
		int size = set.size();  //4
		System.out.println("총 객체 수 : "+size);
	}

}
