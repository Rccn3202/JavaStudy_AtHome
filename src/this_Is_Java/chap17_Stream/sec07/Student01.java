package chap17_Stream.sec07;

public class Student01 {
	private String name;
	private int score;
	
	public Student01(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	
	@Override
	public int compareTo(Student01 o) {
		return Integer.compare(score, o.score);
	}
	
	
	
	
}
