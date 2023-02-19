package chap12_javabaseModules.sec03;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) { 
		this.no = no;	//외부로부터 no를 받아서 각각 필드(this.no)에 저장
		this.name = name;
	}

	public int getNo() { return no; }	//필드가 private 이므로 외부에서 no값을 읽을 수 있도록 getter
	public String getName() { return name; }
	
	@Override	//object가 갖고있는 메소드를 재정의 하겠다.
		public int hashCode() {		//해시코드 메소드 재정의:객체마다 해시코드가 다른데 동등객체면 해지코드를 같다고 하겠다
			int hashCode = no + name.hashCode();	//no는 int값이므로 그냥 no, name은 String 타입이므로 '문자에 대한 해시코드' name.hashCode()
			return hashCode;	//번호와 이름이 같으면 동일한 해시코드 생성
		}
	
	@Override
	public boolean equals(Object obj) {	
		if(obj instanceof Student) {	//obj라는 객체가 Student 클래스로부터 만들어졌느냐?, 만들어졌다면 Strudent 타입으로 강제 타입변환
			Student target = (Student) obj;
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
