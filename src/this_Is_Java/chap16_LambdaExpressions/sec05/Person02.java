package chap16_LambdaExpressions.sec05;

public class Person02 {
	public void ordering(Comparable comparable) {
		String a = "ȫ�浿";
		String b = "��浿";
		
		int result = comparable.compare(a, b);
		
		if(result<0) {
			System.out.println(a+"�� "+b+"���� �տ� �´�");
		} else if (result == 0) {
			System.out.println(a+"�� "+b+"�� ����");
		} else {
			System.out.println(a+"�� "+b+"���� �ڿ� �´�");
		}
	}
}
