package java_Bclass;

/*
 * 2023.02.13.�� 3)���α׷��־��Ȱ��_��
 * �̸��� �Է¹޾� ������ �����Ѵ�.
* 4������ ������ �� �ִ� �迭�� �����ؼ� ����,����,����,���� ������ �Է¹޾� �����Ѵ�. 
* �迭�� ����� ������ ������ �̿��ؼ� ������ ����� ���ϰ� ������ �����Ѵ�.
* �л��̸��� ����,����,����,���� ����, ������ ����� ����Ѵ�.
 * 
 * (���� ����) 
1. �Է��ϴ� ������ ������ 0���� 100������ ������ �Է��Ѵ�.
2. ����,����,����,���� ������ �迭�� �����ؼ� �����Ѵ�.
3. ����� double�� ������ �����Ѵ�.
 */

import java.util.Scanner;

public class Javatest01 {
	public static void main(String[] args){


		Scanner sc=new Scanner(System.in);
		System.out.print("�̸�> ");
		String name=sc.nextLine();

		//�迭 ����
		String sub[]= {"����","����","����","����"}; 

		int input[]=new int[4];
		int sum=0;  //����
		double avg=0;  //���

		//���� ���� �Է�, ����
		for (int i = 0; i < input.length; i++) {
			System.out.println(sub[i] + " �����Է�(0~100 ���̸� �Է�)");
			System.out.print(">");
			input[i] = sc.nextInt();
			//���� 0~100
			if (input[i] <= 100 && input[i] >= 0) {
				sum += input[i];
			} else {
				System.out.println("�Է¿���. ������");
				break;
			}
		}
		//��� ���
		avg = sum / input.length;
		
		//���
		System.out.println("--------------");
		System.out.println("�л��̸� : " + name);
		System.out.println("���� ����");
		for (int i = 0; i < input.length; i++) {
			System.out.println(sub[i]+" : "+input[i]);
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}
}



