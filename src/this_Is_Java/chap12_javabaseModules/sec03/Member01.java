package chap12_javabaseModules.sec03;

public class Member01 {
	public String id;
	
	
	
	public Member01(String id) {
		this.id = id;
	}



	//현재 id(맨 윗줄)와 여기 들어가는 id가 같은지 비교하고자 한다
	@Override	//equals 메소드를 재정의한다
	public boolean equals(Object obj) {	//다형성, 모든 자바 객체는 Object 클래스의 상속을 받으므로 다 대입 가능하다
		if(obj instanceof Member01) { //그러나 나는 Member01 객체만 관심있기 때문에 obj에 들어오는 객체가 Member01로 부터 만들어졌는지만 알아본다
			Member01 m = (Member01) obj; //obj를 Member01로 타입변환 해준다
			if(id.equals(m.id)) {	//내가 가진 id(맨 윗줄)와 m이 가지고 있는 id가 같냐?
				return true;
			}
		}// 안에 있는 if와 밖의 if가 모두 true일 때 true 리턴, 나머지는 false
		return false;	//만약 Member01 말고 다른 객체가 들어오면 비교가 안되므로 else는 false로 리턴한다
	}
	
}
