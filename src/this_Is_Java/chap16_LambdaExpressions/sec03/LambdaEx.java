package chap16_LambdaExpressions.sec03;

public class LambdaEx {
	public static void main(String[] args) {
		Person person = new Person();	//Person�� ȣ���ؼ� Person�� �����ִ� �޼ҵ带 �̿��Ѵ�(action1,2)
		
		//�Ű������� �� ���� ���
		person.action1((name, job) -> {	//(n,j)���� ��
			System.out.println(name+"�� ");
			System.out.println(job+"�� �մϴ�");
		});
		person.action1((name,job) -> System.out.println(name+"�� "+job+"�� ���� �ʽ��ϴ�"));
		
		//�Ű������� �� ���� ���-()���� ����
		//((word) -> ...   => (word -> ...
		person.action2(word -> {
			System.out.println("\"" + word + "\"");	//���ڿ��� "\""�� �����Ѵ�
			System.out.println("��� ���մϴ�");
		});
		person.action2(word -> System.out.println("\"" + word + "\"��� ��Ĩ�ϴ�"));
		

	}

}
