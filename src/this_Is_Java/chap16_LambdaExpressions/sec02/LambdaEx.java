package chap16_LambdaExpressions.sec02;

public class LambdaEx {

	public static void main(String[] args) {
		Person person = new Person();	//Person ��ü����
		
		//���๮�� �� �� �̻��� ��� �߰�ȣ �ʿ�
		person.action(() -> {	//�Ű����� ���ٽ����� ȣ��. PersonŬ�������� Workable Ŭ������ �ִ� work �޼ҵ带 ȣ���Ѵ�
			System.out.println("����� �մϴ�");
			System.out.println("���α׷����� �մϴ�");
		});
		
		//���๮�� �� ���� ��� �߰�ȣ ���� ����
		person.action(() -> System.out.println("����մϴ�"));

	}

}
