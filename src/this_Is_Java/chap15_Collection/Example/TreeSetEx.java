package chap15_Collection.Example;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student2("blue",96));
		treeSet.add(new Student2("hong",86));
		treeSet.add(new Student2("white",92));
		
		Student2 student = treeSet.last();
		System.out.println("최고 점수: "+student.score);
		System.out.println("최고 점수를 받은 아이디: "+student.id);
	}

}
