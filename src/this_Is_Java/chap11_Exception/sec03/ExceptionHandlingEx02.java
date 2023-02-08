package chap11_Exception.sec03;
//Exception e�� ����� ����ó��
public class ExceptionHandlingEx02 {

	public static void main(String[] args) {
		String[] array= {"100", "1oo"};

		for(int i=0;i<=array.length;i++) {
			try {
				int value=Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+value);
			} catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����: "+e.getMessage());
			} catch(Exception e) {
				System.out.println("����: "+e.getMessage());
			}
		}
	}
}

/*
 * ���ܰ� 5�������� �߻��� �� �ִµ� ���ں�ȯ ���ܸ� �ٸ� ������� ǥ���ϰ� �������� �Ѳ����� ����ó���ϰ� �ʹٸ�
 * ���ں�ȯ ���ܸ� �������� �������� Exception���� ó���Ѵ�
 * 
 */
