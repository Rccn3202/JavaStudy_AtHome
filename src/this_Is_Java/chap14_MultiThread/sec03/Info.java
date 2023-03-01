package chap14_MultiThread.sec03;

public class Info {
/* 14.3 �۾� ������ ������ ����
 * 
 * �۾� ������ ����� ���
 * 
 * 1. Thread Ŭ������ ���� ��ü ����
 * 
 * Thread thread = new Thread(Runnable target); : thread�� ������ �����Ѵ� = �����ؼ�(������ ȣ���ؼ�) Thread��ü��	>>�ٽ�!! �����带 ������ �� ��ü �����ϰ�
 * thread.start(); : ������ ���� 																				>>�ٽ�!! start�� �����Ѵ�
 * (Runnable target) : ������ �Ű���. Runnable�� �������̽�/( )�ȿ� Runnable�� ������ ��ü�� ����. 
 * 
 * ��)
 * 
 * //��������� Ŭ���� ����(����� Ŭ����:�̸��� �ִ� Ŭ����)
 * class Task implements Runnable {
 * 		@Override
 * 		public void run() {		
 *			//�����尡 ������ �ڵ�
 *	 }
 * }
 *
 * Runnable task = new Task();	//Runnable �������̽��� ����ؼ� = ��ü�� �����Ѵ� (Runnable �Ⱦ��� ������ �׳� Task �ᵵ ��)
 * Thread thread = new Thread(task);	//���� ���� ��ü task�� Thread ������ �� ������ �Ű������� �����Ѵ�
 * 
 * thread.start(); ���� ��, ������ ����Ǵ� ���� Task Ŭ���� ���� run() �޼ҵ��̴�. 
 * 
 * �۵�����
 * 1) class Task implements Runnable �� ��ü�� ���ν����� new Thread(task)�� �ִ´�
 * 2) ���ν������� start() �޼ҵ带 �����Ѵ� ->���ν����� ����(�۾�������� ��������)
 * 3) class Task�� run() �޼ҵ带 �����Ѵ� ->�۾������� ����(���ν������ ��������)
 * 
 * 
 * 
 * 
 * //�͸�����ü����
 * Thread thread = new Thread(new Runnable() {	//�ٷ� �̸� ���� ��ü�� ������(new Runnable)
 *		@Override					//�������̽� Runnable�� �������� �޼ҵ尡 ����
 *	 	public void run() {		
 *			//�����尡 ������ �ڵ�
 *	 }
 * } );
 * 
 * Runnable�� �Ϲ������� �����尡 �۾��� ������ �����ִ� ��ü��� �Ѵ�
 * 
 * 
 * 2. Thread �ڽ� Ŭ������ ����� ����
 * 
 * ��)
 * 
 * //����� �ڽİ�ü ����
 * public class WorkerThread extends Thread {	//�θ𽺷��带 ��ӹ޾Ҵ�
 *	@Override
 *	public void run() {				//���� run()�� Runnable�̶�� �������̽��� �߻�޼ҵ带 �������Ѱ�, �̰��� Thread�� ���� �����ִ� run()�� �������Ѱ�
 *		//�����尡 ������ �ڵ�
 *	 }
 * }
 * 
 * //������ ��ü ����
 * Thread thread = new WorkerThread();	//�ڽĽ����尴ü(WorkerThread)�� ���� �θ�Ÿ��(Thread)�� �ִ´� (�θ�� ���ϰ� WorkerThread�� �������� �ص� �ȴ�
 * thread.start();
 * 
 * 
 * �۵�����
 * 1) �ڽĽ����� class WorkerThread extends Thread�� �������̵�� �����ϰ��� ���ν������� new WorkerThread()�� ��ü�� ����� 
 * 2) start() �޼ҵ� ȣ��
 * 3) WorkerThread�� run()����, ���ÿ� ���ν����嵵 ����
 * 
 * 
 * 
 * 
 * //�͸��ڽİ�ü
 * Thread thread = new Thread() {	//�̸��� ������� �ʾ����� Thread�� ��ӹ޾Ƽ� �Ʒ� �������̵�� ���� ������ ������ new ��ü�� ���� thread�� ��´�
 *  @Override
 *  public void run() {
 *		//�����尡 ������ �ڵ�
 *	 }
 * };
 * thread.start();
 * 
 * 
 * 
 * 
 * �͸��ڽİ�ü�� �л� ���� ���� �ƴϴ�.
 * �� ���⿡�� �� �� ������ �������� �ٸ� Ŭ������ �Ȱ��� �ڵ带 �̿��Ѵٸ� ��������� �̸��� ���̴� ���� ����. (���뼺�� ����)
 * 
 * 
 */
}





