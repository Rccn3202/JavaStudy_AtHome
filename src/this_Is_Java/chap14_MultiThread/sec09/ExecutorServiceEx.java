package chap14_MultiThread.sec09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {
	public static void main(String[] args) {
		//������Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		//�۾� ������ ó�� ��û
		//������Ǯ ����
		executorService.shutdown();

	}

}
