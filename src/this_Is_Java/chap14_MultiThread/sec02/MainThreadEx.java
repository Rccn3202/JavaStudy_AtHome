package chap14_MultiThread.sec02;

public class MainThreadEx {

	public static void main(String[] args) {

		System.out.println("����");
		
		
	//	Thread currThread = null; //NullPointer ���� �߻�(Exception in thread "main" : �̸��� main�� �����忡�� ���� �߻�)
		
		Thread currThread = Thread.currentThread(); 
		//Ŭ����Thread Ÿ������ currThread �������� = ������.�����޼ҵ�(currentThread) : ���� �������� ��ü�� �����Ѵ�
		System.out.println(currThread.getName());
		//���� �޼ҵ带 �����ϴ� �������� �̸��� main �̴�
		
		
		System.out.println("����");

	}

}
