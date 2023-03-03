package chap16_LambdaExpressions.exercise;

public class Ex08 {
	private static Student[] sudents = {
			new Student("홍길동",90,96),
			new Student("신용권",95,93)
		};

	//avg() 메소드 작성
	
	
	
	public static void main(String[] args) {
	double englishAvg = avg( s->s.getEnglishScore());
	System.out.println("영어 평균 점수: "+englishAvg);
	
	double mathAvg = avg(s->s.getMathScore());
	System.out.println("수학 평균 점수: "+mathAvg);
	}
}

//메소드 작성할 때 기본 형식 : 리턴타입 메소드명(매개변수) {  }