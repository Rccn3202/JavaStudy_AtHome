package chap11_Exception.sec06;
//11.6 ����� ���� ����
public class Info {
/*
 * ����� ���� ����
 * : �ڹ� ǥ�� ���̺귯���� ���ǵ� �� ���� �߻��ϴ� ���ܴ� ���� ����Ŭ������ �����ؼ� �����ؾ� �Ѵ�. 
 * �Ϲݿ��ܷ� ������, ���࿹�ܷ� �������� ����
 * 
 * ����� ��)
 * public class XXXException extends [ Exception | RuntimeException ] {   //XXX�� ���� �̸� ���ؼ� �ֱ�/ [ | ]�̰� ���û���. �Ϲݿ��ܸ� Exception ���
 *  public XXXException() {						//�߰������� �� �ۼ��ϴ� ���� �ƴ϶� �״�� �ۼ�
 *  }
 * 
 *  public XXXException(String message) {		//�߰������� �� �ۼ��ϴ� ���� �ƴ϶� �״�� �ۼ�
 *   super(message);
 *   }
 *  }
 */

/*
 * ���� �߻� ��Ű��
 * 
 * throws�� throw�� ���� �ٸ� �ڵ�!
 * 
 * ���ܸ� �߻���Ű�� �ڵ�� throw
 * 
 * ����� ���ܸ� ���� ��, �����ڸ� �ΰ� ���� ����
 * throw new insufficientException(); ->���ܹ߻�
 * throw new insufficientException("���ܸ޼���"); ->���ܹ߻�, ���ο� �ش��ϴ� �޼��� ����
 * 
 * throw new Exception�� Exception���ܸ� �߻���Ų�� 
 * ->�޼ҵ� ���忡�� ������ ���ܸ� ó���ϴ� ��� 
 * 
 * 1.try-catch�� ó���ϱ� ->���� �Ⱦ���. �ڱⰡ ���� �߻����ѳ��� �ڱⰡ ó���ϴ� ���̱� ������
 * try {
 *  ...
 *   throw new Exception("���ܸ޽���");  
 *  ...
 *  } catch(Exception e) {
 *  	String message=e.getMessage();
 *  }
 * } 
 * 
 * 2.ȣ���� ������ ���ѱ��
 * void method() throws Exception {   //throw�� �߻��� ���ܸ� ȣ���� ������ ���ѱ��
 * ...
 * throw new Exception("���ܸ޽���");
 * ...
 * }
 * 
 */
	
}
