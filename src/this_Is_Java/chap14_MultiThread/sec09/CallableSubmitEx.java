package chap14_MultiThread.sec09;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitEx {
	public static void main(String[] args) {
		//ExecutorService ����
		ExecutorServiceEx executorService = Executors.newFixedThreadPool(5);
		
		//��� �۾� ���� �� ó�� ��û
		for(int i=1; i<=100; i++) {
			final int idx = i;
			Future<Integer> future = executorService.submit(new Callable<Integer>() {
				
			
			})
		}

	}

}
