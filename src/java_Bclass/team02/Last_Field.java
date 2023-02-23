package java_Bclass.team02;

public class Last_Field {
	
	//id, password
	private String id = null;
	private String password = null;
	private String inputId;
	private String inputPw;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getInputId() {
		return inputId;
	}
	public void setInputId(String inputId) {
		this.inputId = inputId;
	}
	public String getInputPw() {
		return inputPw;
	}
	public void setInputPw(String inputPw) {
		this.inputPw = inputPw;
	}
	
	
	//kor eng math total avg
	private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private float avg;
    private String num;
 
    public String getName() { return name;}
    public void setName(String name) { this.name = name; }
    public int getKor() { return kor; }
    public void setKor(int kor) { this.kor = kor; }
    public int getEng() { return eng;  }
    public void setEng(int eng) { this.eng = eng;  }
    public int getMath() { return math; }
    public void setMath(int math) { this.math = math; }
    public String getNum() { return num;}
    public void setNum(String num) { this.num = num; }

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
                + this.getMath() + " 총점 : " + this.getTotal() + " 평균 : " + this.getAvg() + " 학번 : " + this.getNum()+"\n";
    }
    
    public static String charToString(char ch) {
        return String.valueOf(ch);
    }
	
	
}
