package chap12_javabaseModules.sec03;

public class Info {
/*
 * 
 * 12.3 Object 클래스
 * :최상위 클래스
 * 
 * Object이 가진 필드와 메소드는 모든 클래스에서 사용 가능
 * 
 * 객체 동등 비교>>
 * equals (Object obj) : 객체의 번지를 비교하여 결과를 boolean 값으로 리턴
 * 객체 동등 비교(객체는 다른데 이것을 같은 것으로 볼 것이냐?)
 * 예) Member(m1) id:while name:하얀  Member(m2) id:white name:하얀 일 떄,
 * 		Member m1=new Member(...); //객체생성
 * 		Member m2=new Member(...);
 *		m1.equals(m2); //m1이 기준, m2는 비교 대상. 비교 후 t/f 리턴
 *
 *	Object obj1=new Object(); //Object 객체 생성 후 obj1에 번지 저장
 *	Object obj2=obj1;			
 * //힙에 Object 객체 생성됨(10번지), 스택에 obj1(10번지라는 주소를 저장하고 힙의 Object를 참조함)과 obj2가 생성되어 있는데
 * //obj1이 가진 주소를 obj2에 복사하겠다
 *  boolean result = (obj1==obj2) //obj1과 obj2에 있는 번지가 같냐?
 *  boolean result = obj1.equals(obj2); //obj1이 참조하는 객체(in heap)와 obj2가 참조하는 객체가 동일한 객체냐?
 *  //둘 다 값이 같다
 *  
 *  *동등비교를 하려면 오버라이드를 해야한다.(equals 재정의하여 비교대상을 정하고 그게 같으면 동등 취급하겠다 이런식)
 *  
 *  
 *  
 * 객체 해시코드>>
 * hashCode()
 * :객체를 식별하는 정수를 말한다. 번지를 이용해서 해시코드를 생성하기 때문에 기본적으로 객체마다 다른 정수값을 리턴한다.
 * 	동등 객체를 비교할 때 이용
 * 일단 해시코드가 같고, 그 다음 이콜스가 같아야 동등객체로 판단함
 * 
 * 
 * 
 * 객체 문자 정보>>
 * toString()
 * :객체를 문자정보로 표현한다. 어떤 객체를 출력시킬 때, 어떤 내용을 출력시킬 것인가
 * 원래 syso(obj.toString()); 이지만 syso(obj);라고 해도 자동으로 출력된다 ->클래스명@16진수해시코드(java.lang.Object@de6ced) 문자열을 리턴
 * 객체의 문자 정보가 중요한 경우 Object의 toString() 메소드를 재정의해서 간결하고 유익한 정보를 리턴해야 함
 * 예를 들어 Date 클래스는 현재 날짜와 시간을, String 클래스는 저장된 문자열을 리턴하도록 toString() 메소드를 재정의하고 있다.
 * 
 * 
 * 레코드 선언>> *java14부터 도입-레코드로 선언된 것은 자동으로 private final 필드, 생성자, 게터 메소드, 해시코드,이콜스,투스트링 재정의가 추가된다(class Person 대신 record Person 쓴다)
 * :DTO(Data Transfer Object/데이터를 전달하는 객체)
 * 데이터 전달 : 
 * A객체에서 B객체로 데이터를 전달하고 싶을 떄 B에서 method(Person p){...} 이런 메소드를 호출,이용해 전달하는데
 * 									  A에서는 Person p = new Person(); 이라는 객체를 만들어주고
 * 											 b.method(p) 이렇게 작성하여 p를 매개값으로 전달해준다
 * 									  실제로 메소드가 실행되는 곳은 B/객체를 제공하는 쪽은 A
 * 									  이때 p라는 객체가 전달되어 넘어간다. 이 p를 DTO 라고 한다.
 * 왜 DTO를 만드느냐?
 * method(String name, int age){...}/b.method("홍길동",30); 이런식으로 B에서 A를 호출 할 때 두개의 데이터를 넘겨줄 수 있지만
 * 이 데이터가 많으면 개별적으로 넘기는 것 보다는 데이터를 갖고있는 객체 하나를 만들어서 객체 p 하나만 전달하는 것이 코드가 간결하다
 * 
 * DTO를 만들때 필요한 멤버 : 게터(p안에 있는 데이터를 얻어냄)-세터(p안에 있는 데이터를 바꿀 수 있음)
 * 
 * 
 * 
 * 롬복 사용하기>>
 * JDK에 포함된 표준 라이브러리는 아니지만 프로젝트 할 때, 생산성을 향상시키기 위해 사용하는 라이브러리
 * 레코드와 마찬가지로 DTO클래스를 작성할 때 게터-세터,해시코드,이콜스,투스트링 메소드를 자동 생성하기 때문에 작성할 코드의 양을 줄여준다
 * 단, 필드가 final이 아니고(final이면 필드값 수정 불가능, 레코드는 필드를 final로 한다), 값 읽는 Getter는 getXxx(또는 isXxx), 갑 변경하는 Setter는 setXxx로 생성된다
 * 알아서 다운받아 설치
 * 
 * 
 * 
 * 
 * 
 */
}
