package chap11_Exception.sec02;

public class ExceptionHandlingEx01 {
	public static void printLength(String data) {   //static�� �� ���� : main�� static�̹Ƿ� main �ȿ��� �ٷ� ȣ���Ϸ���/�Ⱥ��̸� ��ü���� �� ���������� �̿��� ����Ѵ�
		int result=data.length();  //data�� null�� ��� NullPointException �߻�->'���α׷� ����' ���� ���� �ٷ� �����
		System.out.println("���ڼ�: "+result);
	}
	
	public static void main(String[] args) {
		System.out.println("[���α׷� ����]\n");
		printLength("this is java");   //printLength �޼ҵ忡 ���ڿ� String�� ���� ���ڸ� data�� ������
		printLength(null);  //�Ű������� null ����
		System.out.println("���α׷� ����");
		
	}

}

/*NullPointException : �� ��ü�� ������, ���࿹��
 *data.length() : ��ü(data)�� �������ִ�(.) length�� �����ض� 
 */
 
