package chap16_LambdaExpressions.sec05;

public class MethodReferenceEx01 {
	public static void main(String[] args) {
		Person01 person = new Person01();
		
		//���� �޼ҵ��� ���
		//���ٽ�
		person.action((x,y) -> Computer.staticMethod(x, y));
		//�޼ҵ� ����
		person.action(Computer :: staticMethod);
		
		//�ν��Ͻ� �޼ҵ��� ���
		Computer com = new Computer();
		//���ٽ�
		person.action((x,y) -> com.instanceMethod(x, y));
		//�޼ҵ� ����
		person.action(com :: instanceMethod);
	}

}
