package java_Bclass.team02F_230226;

public class Student {

		 private String name;
		    private int kor;
		    private int eng;
		    private int math;
		    private int total;
		    private double avg;
		 
		    public String getName() { return name;}
		    public Student setName(String name) { this.name = name;
			return null; }
		    public int getKor() { return kor; }
		    public void setKor(int kor) { this.kor = kor; }
		    public int getEng() { return eng;  }
		    public void setEng(int eng) { this.eng = eng;  }
		    public int getMath() { return math; }
		    public void setMath(int math) { this.math = math; }
		
		    public int getTotal() {
		        total = kor + math + eng;
		        return total;
		    }
		 
		    public void setTotal(int total) {
		        this.total = total;
		    }
		 
		    public double getAvg() {
		        avg = total / (double) 3.f;
		        return avg;
		    }
		 
		    public void setAvg(double avg) {
		        this.avg = avg;
		    }
		 
		    @Override
		    public String toString() {
		        return  this.getName() + " ±¹¾î : " + this.getKor() + " ¿µ¾î : " + this.getEng() + " ¼öÇÐ : "
		                + this.getMath() + " ÃÑÁ¡ : " + this.getTotal() + " Æò±Õ : " + String.format("%.1f",this.getAvg());
		    }
		}



