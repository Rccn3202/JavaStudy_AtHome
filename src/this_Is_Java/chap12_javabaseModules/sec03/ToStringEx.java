package chap12_javabaseModules.sec03;
//toString() 메소드 재정의 하여 출력
public class ToStringEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		//toString() 메소드 호출 방법 1.toString()을 전체적으로 호출해서 받은 것을 출력
		String strObj = myPhone.toString();	
		System.out.println(strObj);
		
		//toString() 메소드 호출 방법 2.그냥 참조변수를 넣어줌. toString 자동적으로 호출되고 리턴값을 받아서 출력하게 됨
		System.out.println(myPhone);

	}

}
