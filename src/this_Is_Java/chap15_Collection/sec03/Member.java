package chap15_Collection.sec03;

public class Member {
	//필드 선언
	public String name;
	public int age;
	
	//생성자를 통해서 name과 age를 받아서 필드에 저장함
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode() + age;	//문자열 해시코드에 age를 더하고 있음/name과 age의 값이 같으면 동일한 hashcode가 리턴된다
										//멤버객체가 달라도 name과 age가 같으면 똑같은 hashcode가 나온다
	}
	
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
	 if(obj instanceof Member) {		//obj에 Member 객체가 들어왔는지 확인, 들어왔으면 target으로 강제타입변환
		 Member target = (Member)obj;	//책에서는 if(obj instanceof Member target)으로 사용(자바 12부터)
		 return target.name.equals(name) && (target.age==age); 	//target의 name과 필드의 name이 같은지 확인&age 같은지 확인->둘 다 true가 나와야 true를 리턴한다.
	 } else {
		 return false;
	 }
   }	
}
