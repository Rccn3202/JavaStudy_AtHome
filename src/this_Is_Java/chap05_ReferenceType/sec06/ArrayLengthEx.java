<<<<<<< HEAD
package this_Is_Java.chap05_ReferenceType.sec06;
=======
package chap05_ReferenceType.sec06;
>>>>>>> 9dec55382eab39418e6e6a38b63341a2396558b2
//*�迭���� : �迭����.length;
public class ArrayLengthEx {

	public static void main(String[] args) {
		//�迭 ���� ����� �迭 ����
		int[] scores={10,20,30};
		//�迭 �׸��� ���� ���ϱ�
		int sum=0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println("���� : "+sum);
		//�迭 �׸��� ��� ���ϱ�
		double avg=sum/scores.length;
		System.out.println("��� : "+avg);
		
		
	}

}
