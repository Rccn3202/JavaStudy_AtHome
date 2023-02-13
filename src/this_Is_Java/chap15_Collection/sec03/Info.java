package chap15_Collection.sec03;

public class Info {
/*15.3 Set 컬렉션
 * 인덱스로 관리X - 순서없이 저장/중복저장 안됨/null은 저장하려면 하나만(일반적으로 null 저장하지 않긴 함)
 * 구슬주머니와 유사
 * index 관련 메소드 없다
 * 
 * (set 주머니)-[iterator]-리턴 구조
 * iterator(반복자)를 호출 - 반복해서 요소를 갖고오기 때문에 반복자
 *  -hasNext() : 다음 것을 가져올 것이 있느냐?
 *  -next() : 가져와 - 갖고올 것이 없으면 예외 발생하므로 가져올 것이 있는지 확인 후 사용
 *  -remove() : 가져온 것을 제거하는데 (iterator가 아니라) set에서 제거가 일어남
 *  -iterator<E> iterator() : 저장된 객체를 한 번씩 가져오는 반복자 리턴(전체 set에서 하나씩 가져오는 것, 골라서 가져오는 것 안됨)
 *  
 * Set<E> set = new HashSet<E>(); E에 지정된 타입의 객체만 저장 ->주로 씀
 * Set<E> set = new HashSet<>();
 * Set set = new HashSet(); Object타입이므로 모든 타입의 객체를 저장->잘 안씀 
 * 
 * 동등객체인지 아닌지 판단하는 법(12장 참조)
 * 1.hashcode값이 같은지 본다
 * 2.같다면 equals()메소드가 true가 나오는지 본다
 * 3.true가 나오면 동등객체, 아니면 false가 된다
 * ->Set에서 중복을 확인할 때 이 방법을 사용한다.
 *	 다른 객체라도 hashcode가 같고 equals가 true가 나온다면 동등객체로 판단하고 하나만 저장한다. 
 * 
 * Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없다. 대신 객체를 한 개씩 반복해서 가져와야하는데
 * 1.for문 이용
 * Set<E> set = new HashSet<>();
 * for(E e : set) {		
 * ...
 * }	
 * (0 0 : 배열,List,set) -배열에서 하나 가져와서 돌리고 하는 식
 * set 자리에 올 수 있는 것:Iterable(반복자 구현 가능)을 상속하거나 구현한 타입. set,list 드등
 * 2.Set<E> set = new HashSet<>();
 *   Iterator<E> iterator = set.iterator(); 
 *   //set.iterator()를 이용해 Iterator타입의 반복자를 얻게되면 이 반복자가 가지고 있는 메소드를 이용할 수 있다.
 *   While(iterator.hasNext()) {	//while문 이용해서 반복하면서 hasNext()로 반복할게 있냐고 묻고 true면 next()로 출력
 *   	E e = iterator.next();
 *   }
 */
}
