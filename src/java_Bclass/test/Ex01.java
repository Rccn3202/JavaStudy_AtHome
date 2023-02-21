package java_Bclass.test;

import java.util.Scanner;

public class Ex01 {
	// 100 이하의 양의 정수만 입력받아서 1~입력받은 정수까지의 합 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=1;
		int sum=0;
		
		
		System.out.print("100 이하의 양의 정수 입력 :");
		int input=sc.nextInt();
		if(0<input && input<=100) {
		while(i<=input) {
			sum+=i;
			i++;
		}
		System.out.println("합 :"+sum);
		}
	}

}
