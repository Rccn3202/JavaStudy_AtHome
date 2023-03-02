package chap16_LambdaExpressions.sec05;

public class MethodReferenceEx02 {
	public static void main(String[] args) {
		Person02 person = new Person02();
		
		person.ordering((a,b)->{
			return a.compareToIgnoreCase(b);
		});
		
		person.ordering((a,b) -> a.compareToIgnoreCase(b));
		
		person.ordering(String :: compareToIgnoreCase); //(a,b)->a.compareToIgnoreCase(b)
		//String�� �ν��Ͻ� �޼ҵ��̴�(�տ� static �Ⱥ���)
		//ordering�� ���� �ν��Ͻ� Ÿ���� Comparable�̴�
		//�� Comparable�� �߻�޼ҵ�� �Ű������� a,b �� ���̴�.
		//=> a�� �������ִ� compareToIgnoreCase�� ȣ���ϰ� �Ű������� b�� �����Ѵ�
		//���࿡ �����޼ҵ� ������ a,b �� �� �Ű���
	}
}
