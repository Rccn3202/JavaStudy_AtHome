package chap11_Exception.sec06;
//�ܰ���� ���ܸ� ����� ���� ����Ŭ������ ����
public class InsufficientException extends Exception {  //�Ϲݿ��ܷ� ����
	public InsufficientException() {					//������1 �Ű����� ���� ��
	}
	public InsufficientException(String message) {		//������2 �Ű����� StringŸ������ �޴� ��
		super(message);									//e.getMessage�� ������ �� message�� ���ϵǾ� ������ ���̴�
	}
}


/*
*�����̸� ��ü�� ������ ������ ����Ǿ��ִٸ� �߰��� ��Ͽ� ���𰡸� �ۼ��� �ʿ� ����
*����Ŭ������ ��������, ���ܰ� �߻��ϸ� �� ����Ŭ������ ������ ���ܰ�ü�� �����
*/
