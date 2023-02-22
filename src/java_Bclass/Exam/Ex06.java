

package java_Bclass.Exam;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("학생 이름 입력 : ");
		String student = sc.next();

		String kind[] = {"국어", "영어", "수학", "과학"};

		int input[] = new int[4];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < input.length; i++) {
			System.out.print(kind[i] + "점수 입력(점수는 0~100 사이) : ");
			input[i] = sc.nextInt();

			if (input[i] <= 100 && input[i] >= 0) {
				sum += input[i];
			} else {
				System.out.println("잘못 입력");
				System.out.println("프로그램을 종료");
				break;
			}
		}

		avg = sum / input.length;

		System.out.println("------------------------------");
		System.out.println("학생 이름 : " + student);
		System.out.println("점수 합계 : " + sum);
		System.out.println("점수 평균 : " + avg);
	}
}




