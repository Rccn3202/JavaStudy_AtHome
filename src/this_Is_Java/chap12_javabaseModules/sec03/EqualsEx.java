package chap12_javabaseModules.sec03;
//��ü ���� ��
public class EqualsEx {

	public static void main(String[] args) {
		Member01 obj1 = new Member01("blue");
		Member01 obj2 = new Member01("blue");
		
		System.out.println(obj1==obj2); //false : ���� ��ü�� �ٸ���
		System.out.println(obj1.equals(obj2)); //false : object�� ������ �ִ� equals�� �⺻������ ���� �����񱳿� ����� ����
		//equals �޼ҵ带 �ٷ� �� �� �ִ� ���� : objectŬ������ �ֱ� ������ ���� ���� �ʾƵ� �ڵ����� Member01 extends object(���) �Ǿ��ִ�
		//Member01 Ŭ������ equals �޼ҵ带 �������̵� �ؼ� �������ϴϱ�(id�� ������ true��� ����) true�� ���´�.
		
		Member01 obj3 = new Member01("red"); //
		
		System.out.println(obj1==obj3); //false : ���� ��ü�� �ٸ���
		System.out.println(obj1.equals(obj3)); //(�������̵� �ص�)false : ��ü�� �ٸ��� id�� �ٸ��� 

	}

}
