package chap14_MultiThread.sec06;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
			System.out.println(thread.getName() + ": methodA �۾� ����");
			notify(); //�����ϱ�
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		public synchronized void methodB() {
			Thread thread = Thread.currentThread();
				System.out.println(thread.getName() + ": methodA �۾� ����");
				notify(); 
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
		}

