package chap16_LambdaExpressions.sec05;

public class Computer {
	public static double staticMethod(double x, double y) {	//�����޼ҵ�
		return x+y;
	}
	//����Ϸ��� computer.staticMethod�� ȣ��
	
	public double instanceMethod(double x, double y) {	//�ν��Ͻ��޼ҵ�
		return x+y;
	}
	//����Ϸ��� computer��ü ���� �� ȣ��
}
