package chap16_LambdaExpressions.sec03;

public class LambdaEx {
	public static void main(String[] args) {
		Person person = new Person();
		
		//�Ű������� �� ���� ���
		person.action1((name, job) -> {
			System.out.println(name+"�� ");
			System.out.println(job+"�� �մϴ�");
		});
		person.action1((name,job) -> System.out.println(name+"�� "+job+"�� ���� �ʽ��ϴ�"));
		
		//�Ű������� �� ���� ���
		person.action2(word -> {
			System.out.println("\"" + word + "\"");
			System.out.println("��� ���մϴ�");
		});
		person.action2(word -> System.out.println("\"" + word + "\"��� ��Ĩ�ϴ�"));
		

	}

}
