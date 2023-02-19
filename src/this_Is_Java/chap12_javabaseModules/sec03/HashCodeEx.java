package chap12_javabaseModules.sec03;
//객체 해시코드 비교
public class HashCodeEx {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		if(s1.hashCode() == s2.hashCode()) {	//해시코드 값이 같은지 비교-재정의 했기 때문에 실행됨
			if(s1.equals(s2)) {
				System.out.println("동등 객체");
			} else {
				System.out.println("데이터가 다르므로 동등 객체 아님");
			}
		} else {
			System.out.println("해시코드가 다르므로 동등 객체 아님");
		}

	}

}
