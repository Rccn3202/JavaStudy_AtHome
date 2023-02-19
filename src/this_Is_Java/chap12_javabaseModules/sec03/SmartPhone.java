package chap12_javabaseModules.sec03;
//toString 오버라이드 하기
public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override		//toString() 메소드 재정의-안하면 @양식으로 출력된다
	public String toString() {
		return company + ", " + os;	//이 양식대로 출력되게 함
	}
	
}
