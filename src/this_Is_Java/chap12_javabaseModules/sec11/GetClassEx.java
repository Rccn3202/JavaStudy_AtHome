package chap12_javabaseModules.sec11;

public class GetClassEx {

	public static void main(String[] args) {
		//how1
		Class clazz = Car.class;
		
		//how2
		//Class clazz = Class.forName
		
		//how3
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println("패키지: " + clazz.getPackageName().getName);
		System.out.println("클래스 간단 이름: "+ clazz.getSimpleName());
		System.out.println("클래스 전체 이름: "+ clazz.getName());

	}

}
