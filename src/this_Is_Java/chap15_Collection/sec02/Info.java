package chap15_Collection.sec02;

public class Info {
/*15.2 List 컬렉션
 * 객체를 인덱스로 관리-순서 있음, 중복저장 가능
 * 
 * 주로 사용(설명서 참조)
 * boolean add(E e) : 리스트 마지막 추가
 * void clear() : 리스트 내용 다 제거
 * boolean remove(object o) : 특정객체 제거
 * get(int index) : 특정 인덱스에 있는 값 불러냄
 * 
 * 
 * ArrayList
 * 인덱스 안에 객체의 번지가 저장된다.
 * List<E> list = new ArrayList<E>(); ->대부분 씀 / 인터페이스타입 = 구현클래스타입 이므로 ArrayList를 list에 저장 가능????/E는 객체 타입
 * List<E> list = new ArrayList<>();  객체타입이 같으면 뒤에것 생략 가능
 * List list = new ArrayList(); 모든 타입의 객체 저장->잘 안씀
 * remove 쓰면 해당 인덱스가 null이 되는 것이 아니라 한칸씩 앞으로 당겨진다
 * 
 * Vector
 * List<E> list = new Vector<E>();
 * 메소드마다 싱크로나이드가 다 붙어있음(동기화된 메소드로 구성됨)->하나의 스레드가 벡터를 사용하는 동안 다른 스레드는 벡터를 쓸 수 없다
 * 멀티스레드 환경(공유객체)에서 안전하게 객체를 추가 또는 삭제할 수 있다
 * ????공유객체?
 * ????스레드가 뭐야
 * 
 * 
 * LinkedList
 * 중간 인덱스를 삭제할 경우, 뒤에 것을 모두 당기는 것은 정보가 많으면 힘들 수 있다. ->LinkedList 이용
 * 인접 객체를 체인처럼 연결해서 관리한다. 연결 정보만 끊거나 새로 연결하면 됨
 * 
 * 
 * 
 */
}
