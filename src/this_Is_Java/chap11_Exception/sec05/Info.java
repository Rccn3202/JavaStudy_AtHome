package chap11_Exception.sec05;

public class Info {
/*11.5 ���� ���ѱ��
 * 
 * ����)
 * ClassNotFoundException�� throws�ϴ� method2()�� ���ܸ� method1()���� ȣ���� �� ó���Ѵ�
 * public void method1() {
 *  	try {
 *  		method2();
 * 	 } catch(ClassNotFoundException e) {
 * 	 	System.out.println("���� ó��: "+e.getMessage());
 * 	 }
 * }
 * 
 * public void method2() throws ClassNotFoundException {
 * 	 Class.forName("java.lang.String2");
 * }
 * 
 * method2()���� ������ ����, method2()�� �� ����(ClassNotFoundException)�� throws�Ѵ�. ->ȣ���� ������ ��
 * method1()�� try��� �ȿ� method2()�� ȣ���Ͽ� catch�� �ѱ� �� ����ó�� �Ѵ�
 * 
 */
}