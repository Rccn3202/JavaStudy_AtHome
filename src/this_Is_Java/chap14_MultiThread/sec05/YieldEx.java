package chap14_MultiThread.sec05;

public class YieldEx {
	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try { Thread.sleep(100); } catch (InterruptedException e) {}
		workThreadA.work = false;
		
		try { Thread.sleep(100); } catch (InterruptedException e) {}
		workThreadA.work = true;
	}

}
