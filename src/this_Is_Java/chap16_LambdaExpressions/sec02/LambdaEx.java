package chap16_LambdaExpressions.sec02;

public class LambdaEx {

	public static void main(String[] args) {
		Person person = new Person();
		
		//���๮�� �� �� �̻��� ��� �߰�ȣ �ʿ�
		person.action(() -> {
			System.out.println("����� �մϴ�");
			System.out.println("���α׷����� �մϴ�");
		});
		
		//���๮�� �� ���� ��� �߰�ȣ ���� ����
		person.action(() -> System.out.println("����մϴ�"));

	}

}
