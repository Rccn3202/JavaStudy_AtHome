package chap16_LambdaExpressions.sec01;

public class LambdaEx {

	public static void main(String[] args) {
		action((x, y) -> {	//�Ʒ��� action�޼ҵ带 ���ٽ����� ȣ���� ��
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
	}
	
	//� ���ٽ��� �����߳Ŀ� ���� calculate�� ���� ����� �޶�����
	public static void action(Calculable calculable) {	//�������̽� Ÿ�� �Ű�����.
		//������
		int x = 10;
		int y = 4;
		//������ ó��
		calculable.calculate(x, y);
		
		
	}
}
