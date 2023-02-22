package java_Bclass.Exam;

public class Ex06_ {

	private String name; //이름
	private int kor;	//국어
	private int math;	//수학
	private int eng;	//영어
	private int sci;	//과학
	private double avg;	//평균
	private int total;	//총점
	
	
	public String getName() { return name;	}
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor;	}
	public void setKor(int kor) { this.kor = kor; }
	public int getMath() { return math; }
	public void setMath(int math) {	this.math = math; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getSci() { return sci; }
	public void setSci(int sci) { this.sci = sci; }
	
	public double getAvg() { 
		avg = total/4;
		return avg; 
	}
	public void setAvg(float avg) { this.avg = avg; }
	
	public int getTotal() {	
		total=kor+math+eng+sci;
		return total;			
	}
	public void setTotal(int total) { this.total = total; }
	
}
