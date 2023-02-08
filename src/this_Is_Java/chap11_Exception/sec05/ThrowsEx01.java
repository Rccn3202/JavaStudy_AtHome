package chap11_Exception.sec05;
//������ ���ܸ� ó��
public class ThrowsEx01 {

	public static void main(String[] args) {
		try {
			findClass();			//findClass�� ȣ�� �� �Ʒ��� �������� ���� ó�� 
		} catch(ClassNotFoundException e) {
			System.out.println("����ó��: "+e.getMessage());
		}
	}
	
	public static void findClass() throws ClassNotFoundException{ //ClassNotFoundException���ܸ� ������
		Class.forName("java.lang.String2");
	}
}

/*
 * findClass���� ����ó���ϱ� ���� �� ������ ����ó��
 * main�޼ҵ忡 throws�� ���̸� ������ �� �߱� ������ �ȵ�. ���ܸ� �� �������� �������� main������ ����ó���� �ϴ� ���� ����
 */
