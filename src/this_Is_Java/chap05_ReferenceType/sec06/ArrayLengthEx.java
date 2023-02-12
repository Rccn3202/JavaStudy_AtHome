<<<<<<< HEAD
package this_Is_Java.chap05_ReferenceType.sec06;
=======
package chap05_ReferenceType.sec06;
>>>>>>> 9dec55382eab39418e6e6a38b63341a2396558b2
//*배열길이 : 배열변수.length;
public class ArrayLengthEx {

	public static void main(String[] args) {
		//배열 변수 선언과 배열 대입
		int[] scores={10,20,30};
		//배열 항목의 총합 구하기
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println("총합 : "+sum);
		//배열 항목의 평균 구하기
		double avg=sum/scores.length;
		System.out.println("평균 : "+avg);
		
		
	}

}
