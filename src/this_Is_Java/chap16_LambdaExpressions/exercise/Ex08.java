package chap16_LambdaExpressions.exercise;

public class Ex08 {
	private static Student[] sudents = {
			new Student("ȫ�浿",90,96),
			new Student("�ſ��",95,93)
		};

	//avg() �޼ҵ� �ۼ�
	
	
	
	public static void main(String[] args) {
	double englishAvg = avg( s->s.getEnglishScore());
	System.out.println("���� ��� ����: "+englishAvg);
	
	double mathAvg = avg(s->s.getMathScore());
	System.out.println("���� ��� ����: "+mathAvg);
	}
}

//�޼ҵ� �ۼ��� �� �⺻ ���� : ����Ÿ�� �޼ҵ��(�Ű�����) {  }