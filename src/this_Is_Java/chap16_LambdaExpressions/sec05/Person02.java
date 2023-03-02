package chap16_LambdaExpressions.sec05;

public class Person02 {
	public void ordering(Comparable comparable) {
		String a = "홍길동";
		String b = "김길동";
		
		int result = comparable.compare(a, b);
		
		if(result<0) {
			System.out.println(a+"은 "+b+"보다 앞에 온다");
		} else if (result == 0) {
			System.out.println(a+"은 "+b+"과 같다");
		} else {
			System.out.println(a+"은 "+b+"보다 뒤에 온다");
		}
	}
}
