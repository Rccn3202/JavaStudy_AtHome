package chap11_Exception.sec05;
//������ ���� ���ܸ� �Ѳ����� ó��->��� ���ϴ� ���� ����
public class ThrowsEx02 {

	public static void main(String[] args) throws Exception {
		findClass();
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}

/*
 * ����ڿ��� �����޼����� �����ִ� ���� ���� �ʱ� ������ main�� throws�� ���� ���� ���� �ʴ�
 */
