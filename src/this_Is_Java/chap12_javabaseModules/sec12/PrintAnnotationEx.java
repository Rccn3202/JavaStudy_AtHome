package chap12_javabaseModules.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.sun.jdi.InvocationException;

public class PrintAnnotationEx {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			
			//PrintAnnotation ���
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			
			//���� ������ �̿��ؼ� �� ���
			printLine(printAnnotation);
			
			//�޼ҵ� ȣ��
			try {
				method.invoke(new Service());
			} catch (IllegalAccessException|IllegalArgumentException|InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//���� ������ �̿��ؼ� �� ���
			printLine(printAnnotation);
		}

	}

	private static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation !=null) {
			//number �Ӽ��� ���
			int number = printAnnotation.number();
			for(int i=0;i<number;i++) {
				//value �Ӽ��� ���
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}

}
