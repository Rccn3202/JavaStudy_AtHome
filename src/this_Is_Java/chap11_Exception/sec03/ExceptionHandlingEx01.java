package chap11_Exception.sec03;
//���ܸ� ������ ���� ���� ó��, ����-����Ŭ���� catch�ۼ� ����
public class ExceptionHandlingEx01 {

	public static void main(String[] args) {
		String[] array= {"100", "1oo"};
		
		for(int i=0;i<=array.length;i++) {
			try {
				int value=Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭 �ε����� �ʰ���: "+e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����: "+e.getMessage());
			}
		}
	}
}

/*
 * Integer.parseInt("100") : ( )�ȿ� �ִ� ���ڿ��� ���ڷ� ��ȯ��Ų�� 
 * 
 * array�� ���̴� 2�̹Ƿ� i=0,1,2
 * 1ȸ i=0 ������� : 100
 * 2ȸ i=1 ���� : ���ڷ� ��ȯ �Ұ�
 * 3ȸ i=2 ���� : �ε��� �ʰ� 
 * 
 * �迭�� ����ڰ� �Է��� ������ ���ų� �ϴ� �� ���� ���� ���� �𸣴� ��찡 �ֱ� ������ �̸� ����ó���� ������Ѵ�. ->�߻��� ���� �̸� �����ϱ�
 * 
 * ����
 * ����Ŭ���� catch��� ���� �ۼ��ϰ� ����Ŭ���� catch����� ���߿� �ۼ��ؾ��Ѵ�.
 * ���ܰ� �߻��ϸ� ���������� ���ʴ�� �˻��ϴµ� �� ���� ���� ����Ŭ������ Exception�� �� ��� ��� Exceptionó���� ���´�.
 */

