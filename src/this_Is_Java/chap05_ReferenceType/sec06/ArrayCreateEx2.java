<<<<<<< HEAD
package this_Is_Java.chap05_ReferenceType.sec06;
=======
package chap05_ReferenceType.sec06;
>>>>>>> 9dec55382eab39418e6e6a38b63341a2396558b2

public class ArrayCreateEx2 {
	//*�迭 ������ ������ ������ �� ����� ���ԵǴ� ������ �ٸ��ٸ� new Ÿ��[]�� �տ� �ٿ��ش�. 
	public static void main(String[] args) {
		
			String[] names=null;
			names=new String[] {"��","��","��"};   //���߿� �� �� ������ �� ����.
			
			//�迭 ���� ���� scores
			int[] scores;
			
			//�迭 ������ �迭�� ���� 10 20 30
			scores=new int [] {10,20,30};
			
			//�迭 �׸��� ���� ���ϱ�, ���
			int sum1=0;
			for(int i=0;i<3;i++) {
				sum1+=scores[i];
			}
			System.out.println("���� : "+sum1);
			
			//�迭�� �Ű������� �ְ� printItem()�޼ҵ� ȣ��
			printItem(new int[] {90,80,70});
			}//end main

			// printItem() �޼ҵ� ����
			private static void printItem(int[] scores) {
				//�Ű������� �����ϴ� �迭�� �׸��� ���
				for(int i=0;i<3;i++) {
					System.out.println("score["+i+"]: "+scores);
		}



		//

	}
}//end class

