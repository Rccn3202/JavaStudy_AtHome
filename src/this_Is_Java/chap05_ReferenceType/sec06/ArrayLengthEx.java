package chap05_ReferenceType.sec06;
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
