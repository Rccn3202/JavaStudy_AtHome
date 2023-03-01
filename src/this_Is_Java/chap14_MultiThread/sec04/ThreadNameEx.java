package chap14_MultiThread.sec04;

//������ �̸� �����ϱ�
//�̸� �ٲٷ��� �����尡 ���۵Ǳ� ���� �̸��� �����ؾ��Ѵ�.

public class ThreadNameEx {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //�� �ڵ带 �����ϴ� ������ ��ü ���� ���
		System.out.println(mainThread.getName() + " ����");
		
		for(int i=0; i<3; i++) {
			Thread threadA = new Thread() {		//�������� �ڽİ�ü����
				public void run() {
					System.out.println(getName() + " ����");	//getName()�� Thread�� �ν��Ͻ� �޼ҵ�. �������� �̸��� ����
				}
			};
			threadA.start();
		}
		
		Thread chatThread = new Thread() {	
			public void run() {
				System.out.println(getName() + " ����");
			}
		};
		chatThread.setName("chat-thread");
		chatThread.start(); //�۾������� �̸� ����
	}
}
