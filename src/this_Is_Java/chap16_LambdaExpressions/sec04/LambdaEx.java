package chap16_LambdaExpressions.sec04;

public class LambdaEx {
	public static void main(String[] args) {
		Person person = new Person();
		
		//���๮�� �� �� �̻��� ���
		person.action((x, y)-> {
			double result = x + y;
			return result;
		});
		
		//���Ϲ��� �ϳ��� ���� ���(�����)
		//person.action((x, y) -> {
		//return (x + y);
		//});							�̰��� �Ʒ��� ���� ���� �� �ִ�.
		person.action((x,y) -> (x+y));
		
		//���Ϲ��� �ϳ��� ���� ���(�޼ҵ� ȣ��)
		//person.action((x,y) -> {
		//return sum(x,y);
		//});							�̰��� �Ʒ��� ���� ���� �� �ִ�.
		person.action((x,y) -> sum(x,y));
	}
	
	public static double sum(double x, double y) {
		return (x+y);
	}

}
