package chap12_javabaseModules.sec03;
//toString() �޼ҵ� ������ �Ͽ� ���
public class ToStringEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("�Ｚ����", "�ȵ���̵�");
		
		//toString() �޼ҵ� ȣ�� ��� 1.toString()�� ��ü������ ȣ���ؼ� ���� ���� ���
		String strObj = myPhone.toString();	
		System.out.println(strObj);
		
		//toString() �޼ҵ� ȣ�� ��� 2.�׳� ���������� �־���. toString �ڵ������� ȣ��ǰ� ���ϰ��� �޾Ƽ� ����ϰ� ��
		System.out.println(myPhone);

	}

}
