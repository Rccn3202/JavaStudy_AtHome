

package java_Bclass.Exam;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�л� �̸� �Է� : ");
		String student = sc.next();

		String kind[] = {"����", "����", "����", "����"};

		int input[] = new int[4];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < input.length; i++) {
			System.out.print(kind[i] + "���� �Է�(������ 0~100 ����) : ");
			input[i] = sc.nextInt();

			if (input[i] <= 100 && input[i] >= 0) {
				sum += input[i];
			} else {
				System.out.println("�߸� �Է�");
				System.out.println("���α׷��� ����");
				break;
			}
		}

		avg = sum / input.length;

		System.out.println("------------------------------");
		System.out.println("�л� �̸� : " + student);
		System.out.println("���� �հ� : " + sum);
		System.out.println("���� ��� : " + avg);
	}
}




