package java_Bclass.test;

public class Ex02_ {

	private int kor;	//����
	private int math;	//����
	private int eng;	//����
	private int sci;	//����
	private float avg;	//���
	private int total;	//����
	
	public int getKor() { return kor;	}
	public void setKor(int kor) { this.kor = kor; }
	public int getMath() { return math; }
	public void setMath(int math) {	this.math = math; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getSci() { return sci; }
	public void setSci(int sci) { this.sci = sci; }
	
	public float getAvg() { 
		avg = total/4.f;
		return avg; 
	}
	public void setAvg(float avg) { this.avg = avg; }
	
	public int getTotal() {	
		total=kor+math+eng+sci;
		return total;			
	}
	public void setTotal(int total) { this.total = total; }

}
