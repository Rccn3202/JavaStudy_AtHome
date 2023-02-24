package chap12_javabaseModules.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.sun.jdi.InvocationException;

public class PrintAnnotationEx {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			
			//PrintAnnotation 얻기
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			
			//메소드 호출
			try {
				method.invoke(new Service());
			} catch (IllegalAccessException|IllegalArgumentException|InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}

	}

	private static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation !=null) {
			//number 속성값 얻기
			int number = printAnnotation.number();
			for(int i=0;i<number;i++) {
				//value 속성값 얻기
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}

}
