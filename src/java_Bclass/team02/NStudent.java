package java_Bclass.team02;

public class NStudent {
	private String studentName; //이름
	private int kor; //국어 점수
	private int eng;	//영어 점수
	private int math;	//수학 점수
	private String school;	//학교
	
	
	public NStudent() {
		super();
		this.studentName = studentName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.school = school;
	}
	


	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	
}