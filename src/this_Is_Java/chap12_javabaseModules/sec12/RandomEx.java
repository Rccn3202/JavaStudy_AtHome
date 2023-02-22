package chap12_javabaseModules.sec12;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		//���ù�ȣ
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("���ù�ȣ: ");
		for(int i=0;i<6;i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();

		//��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("��÷��ȣ: ");
		for(int i=0; i<6;i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();

		//��÷����
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("��÷����: ");
		if(result) {
			System.out.println("1�� ��÷");
		} else {System.out.println("��÷ �ȵ�");
		}
	}
}
