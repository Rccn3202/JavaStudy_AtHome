package chap05_ReferenceType.chap05Ex;

public class Ex07 {

	public static void main(String[] args) {
		// �ִ밪 ����ϴ� �ڵ�(for��)
		int[] array = {1,5,3,8,2};
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(max<=array[i]) {
				max=array[i];
			}
			
		}
		System.out.println("�ִ밪 : "+max);
	}

}
