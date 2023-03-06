package chap16_LambdaExpressions.exercise;

public class Ex07 {
	private static int[] scores = {10, 50, 3};
	
	public statuc int maxOrMin(Operator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin(
		
		);
		System.out.println("최대값: "+ max);
		
		
		//최소값 얻기
		int min = maxOrMin(
				
		);
		System.out.println("최소값: "+ min);
	}
}
