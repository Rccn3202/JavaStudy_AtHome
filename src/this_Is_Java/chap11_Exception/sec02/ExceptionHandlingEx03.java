package chap11_Exception.sec02;
//�Ϲݿ���
public class ExceptionHandlingEx03 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");  //Class�� �������ִ� forName�����޼ҵ带 ȣ���ϰڴ�
												//java.lang.String�̶�� �̸��� ���� Ŭ������ �ֳ�? �ִٸ� Ŭ������ ����Ʈ�ڵ带 �޸𸮿� �����ض�
												//���ٸ� ClassNotFoundException ���ܰ� �߻��Ѵ�
												//*java.lang.String�� �ڹٿ� �⺻���� �����Ѵ�
			System.out.println("java.lang.String Ŭ������ ����");
		} catch(ClassNotFoundException e) {		//�Ϲݿ���
			e.printStackTrace();
		}

		System.out.println();
		
		try {
			Class.forName("java.lang.String2");    //���� �߻�
			System.out.println("java.lang.String2 Ŭ������ ����");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/*
		 * ����Ʈ �ڵ�(Java bytecode)
		 * -�ڹ� ���� �ӽ��� ������ �� �ִ� ���� ��ȯ�� �ڹ� �ҽ� �ڵ带 �ǹ�
		 * -Ȯ���ڴ� .class
		 * 
		 */
	}
}
