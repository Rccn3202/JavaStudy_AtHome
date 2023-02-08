package chap11_Exception.sec02;
//���࿹��
public class ExceptionHandlingEx02 {
	public static void printLength(String data) {  
		try {
			int result=data.length();  
			System.out.println("���ڼ�: "+result);
		} catch(NullPointerException e) {  //���ܸ� ó���ϱ� ���� �ش� ����Ŭ������ ������ ��ü�� �����. �� ���ܰ�ü�� ��ġ ������ ����e�� ����ȴ�
			System.out.println(e.getMessage());    //����(e) ������ ����(.) �� ������ �߻��ߴ���(getMessage)�� ����Ѵ�(println)
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("������");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[���α׷� ����]\n");
		printLength("this is java");   
		printLength(null);  
		System.out.println("���α׷� ����");
	}
}
/*
 * getMessage() : ���ܰ� �߻��� ������ �����ϰ� ����
 * toString() : ������ ������ �������� �������ش�
 * e.printStackTrace() : ���� ����, ����, ���� �߻� ��ġ -> ���� ����Ѵ�
 * ������ ��, �̷� ���� ������ �Ⱥ��̰� �ּ�ó�� �ؾ��ϰ� catch��Ͽ� ����ó������� �ִ´�
 */
 