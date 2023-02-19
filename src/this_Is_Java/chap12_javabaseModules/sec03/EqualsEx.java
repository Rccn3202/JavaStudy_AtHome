package chap12_javabaseModules.sec03;
//객체 동등 비교
public class EqualsEx {

	public static void main(String[] args) {
		Member01 obj1 = new Member01("blue");
		Member01 obj2 = new Member01("blue");
		
		System.out.println(obj1==obj2); //false : 둘의 객체가 다르다
		System.out.println(obj1.equals(obj2)); //false : object이 가지고 있는 equals는 기본적으로 위의 번지비교와 결과가 동일
		//equals 메소드를 바로 쓸 수 있는 이유 : object클래스에 있기 때문에 따로 쓰지 않아도 자동으로 Member01 extends object(상속) 되어있다
		//Member01 클래스에 equals 메소드를 오버라이드 해서 재정의하니까(id가 같으면 true라고 하자) true가 나온다.
		
		Member01 obj3 = new Member01("red"); //
		
		System.out.println(obj1==obj3); //false : 둘의 객체가 다르다
		System.out.println(obj1.equals(obj3)); //(오버라이드 해도)false : 객체도 다르고 id도 다르다 

	}

}
