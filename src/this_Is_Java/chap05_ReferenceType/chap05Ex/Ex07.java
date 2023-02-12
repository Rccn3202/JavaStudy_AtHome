<<<<<<< HEAD
package this_Is_Java.chap05_ReferenceType.chap05Ex;
=======
package chap05_ReferenceType.chap05Ex;
>>>>>>> 9dec55382eab39418e6e6a38b63341a2396558b2

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
