package chap06_Class.sec08;

public class CalculatorEx {

	public static void main(String[] args) {
		//Calculator ��ü ����
		Calculator myCalc = new Calculator();
		
		//���ϰ��� ���� powerOn()�޼ҵ� ȣ��
		myCalc.powerOn();
		
		//plus �޼ҵ� ȣ�� �� 5�� 6�� �Ű������� �����ϰ�,
		//���� ����� ���� �޾� result1 ������ ����
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: "+result1);
		
		}
}
