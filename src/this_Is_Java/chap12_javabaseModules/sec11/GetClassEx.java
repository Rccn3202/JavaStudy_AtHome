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
		
		System.out.println("��Ű��: " + clazz.getPackageName().getName);
		System.out.println("Ŭ���� ���� �̸�: "+ clazz.getSimpleName());
		System.out.println("Ŭ���� ��ü �̸�: "+ clazz.getName());

	}

}
