package java_Bclass.team02;

public class Student {
	 private String name;
	    private int kor;
	    private int eng;
	    private int math;
	    private int total;
	    private float avg;
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public int getKor() {
	        return kor;
	    }
	 
	    public void setKor(int kor) {
	        this.kor = kor;
	    }
	 
	    public int getEng() {
	        return eng;
	    }
	 
	    public void setEng(int eng) {
	        this.eng = eng;
	    }
	 
	    public int getMath() {
	        return math;
	    }
	 
	    public void setMath(int math) {
	        this.math = math;
	    }
	 
	    public int getTotal() {
	        total = kor + math + eng;
	        return total;
	    }
	 
	    public void setTotal(int total) {
	        this.total = total;
	    }
	 
	    public float getAvg() {
	        avg = total / 3.f;
	        return avg;
	    }
	 
	    public void setAvg(float avg) {
	        this.avg = avg;
	    }
	 
	    @Override
	    public String toString() {
	        return "이름 : " + this.getName() + " 국어 : " + this.getKor() + " 영어 : " + this.getEng() + " 수학 : "
	                + this.getMath() + " 총점 : " + this.getTotal() + " 평균 : " + this.getAvg() + "\n";
	    }
}
