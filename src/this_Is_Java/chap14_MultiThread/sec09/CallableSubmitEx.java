package chap14_MultiThread.sec09;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitEx {
	public static void main(String[] args) {
		//ExecutorService 积己
		ExecutorServiceEx executorService = Executors.newFixedThreadPool(5);
		
		//拌魂 累诀 积己 棺 贸府 夸没
		for(int i=1; i<=100; i++) {
			final int idx = i;
			Future<Integer> future = executorService.submit(new Callable<Integer>() {
				
			
			})
		}

	}

}
