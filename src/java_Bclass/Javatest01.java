package java_Bclass;

/*
 * 2023.02.13.월 3)프로그래밍언어활용_평가
 * 이름을 입력받아 변수에 저장한다.
* 4과목을 저장할 수 있는 배열을 생성해서 국어,영어,수학,과학 점수를 입력받아 저장한다. 
* 배열에 저장된 과목의 점수를 이용해서 총점과 평균을 구하고 변수에 저장한다.
* 학생이름과 국어,영어,수학,과학 점수, 총점과 평균을 출력한다.
 * 
 * (전제 조건) 
1. 입력하는 과목의 점수는 0부터 100사이의 점수만 입력한다.
2. 국어,영어,수학,과학 점수는 배열을 생성해서 저장한다.
3. 평균은 double형 변수에 저장한다.
 */

import java.util.Scanner;

public class Javatest01 {
	public static void main(String[] args){


		Scanner sc=new Scanner(System.in);
		System.out.print("이름> ");
		String name=sc.nextLine();

		//배열 생성
		String sub[]= {"국어","영어","수학","과학"}; 

		int input[]=new int[4];
		int sum=0;  //총점
		double avg=0;  //평균

		//과목 점수 입력, 저장
		for (int i = 0; i < input.length; i++) {
			System.out.println(sub[i] + " 점수입력(0~100 사이만 입력)");
			System.out.print(">");
			input[i] = sc.nextInt();
			//전제 0~100
			if (input[i] <= 100 && input[i] >= 0) {
				sum += input[i];
			} else {
				System.out.println("입력오류. 종료함");
				break;
			}
		}
		//평균 계산
		avg = sum / input.length;
		
		//출력
		System.out.println("--------------");
		System.out.println("학생이름 : " + name);
		System.out.println("과목별 점수");
		for (int i = 0; i < input.length; i++) {
			System.out.println(sub[i]+" : "+input[i]);
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}




