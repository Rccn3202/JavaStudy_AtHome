package java_Bclass.test;

import java.util.Scanner;

public class Ex01 {
	// 100 ������ ���� ������ �Է¹޾Ƽ� 1~�Է¹��� ���������� �� ���ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=1;
		int sum=0;
		
		
		System.out.print("100 ������ ���� ���� �Է� :");
		int input=sc.nextInt();
		if(0<input && input<=100) {
		while(i<=input) {
			sum+=i;
			i++;
		}
		System.out.println("�� :"+sum);
		}
	}

}
