package chap12_javabaseModules.sec12;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		//¼±ÅÃ¹øÈ£
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("¼±ÅÃ¹øÈ£: ");
		for(int i=0;i<6;i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();

		//´çÃ·¹øÈ£
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("´çÃ·¹øÈ£: ");
		for(int i=0; i<6;i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();

		//´çÃ·¿©ºÎ
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("´çÃ·¿©ºÎ: ");
		if(result) {
			System.out.println("1µî ´çÃ·");
		} else {System.out.println("´çÃ· ¾ÈµÊ");
		}
	}
}
