package chap05_ReferenceType.chap05Ex;

public class Ex07 {

	public static void main(String[] args) {
		// 최대값 출력하는 코드(for문)
		int[] array = {1,5,3,8,2};
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(max<=array[i]) {
				max=array[i];
			}
			
		}
		System.out.println("최대값 : "+max);
	}

}
