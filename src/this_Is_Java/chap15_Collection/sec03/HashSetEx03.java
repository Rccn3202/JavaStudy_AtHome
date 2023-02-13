package chap15_Collection.sec03;
//set컬렉션이 특정 객체를 찾는 방법
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx03 {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<String> set = new HashSet<String>();
		
		//객체 추가 - 무작위로 저장됨
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");	
		
		//1. While,hasNext(),next() 이용 객체를 하나씩 가져와서 처리
		Iterator<String> iterator = set.iterator();	//set.iterator() :set컬렉션을 통해 iterator()메소드 호출/Iterator<String> iterator 반복자 객체를 얻어낸다
		while(iterator.hasNext()) {	
			//객체를 하나 가져오기
			String element =iterator.next();	
			System.out.println(element);
			if(element.equals("JSP")) {
				//가져온 객체를 컬렉션에서 제거
				iterator.remove();	//iterator를 통해 remove하면 iterator에서 제거되는 것이 아니라 set에서 제거됨/iterator는 객체를 갖고있지 않음
			}
		}
		System.out.println();
		
		//객체 제거
		set.remove("JDBC");	//위에서 JSP 지우고 여기서 JDBC를 지웠으므로 지금은 Java와 Spring만 남았다
		
		//2. 향상된 for 이용 객체를 하나씩 가져와서 처리
		for(String element : set) {
			System.out.println(element);
		}
	}
}

/*2. 향상된 for문을 이렇게 이용하며 안된다!!
for(String element : set) {
	if(element.equals("Spring")) {
		set.remove(element);
	}
}
->set에서 가져온게 JSP라면 set에서 제거해라 는 뜻인데 안됨 : for는 시작할 때 이미 내가 몇번 돌 것인지 결정한다. 
for는 자신이 2번 돌 것이라고 생각하고 있는데 중간에 컬렉션 요소를 하나 삭제하면 요소가 1개밖에 안남아서 마지막에 for를 돌 수 없으므로 에러난다.
따라서 set.remove("Spring");을 위로 빼서 미리 제거해야한다.
반복문 돌려서 지우려면 1번 while써야함
add()도 마찬가지..
*/