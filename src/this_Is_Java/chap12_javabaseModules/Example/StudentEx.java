package chap12_javabaseModules.Example;

import java.util.HashSet;


public class StudentEx {
	public static void main(String[] args) {
		//Student�� �����ϴ� HashSet ����
		HashSet<Student> hashSet = new HashSet<Student>();
		//Student ����
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));	//���� �й��̹Ƿ� �ߺ� ������ �ȵ�
		hashSet.add(new Student("2"));

		//����� Student �� ���
		System.out.println("����� Student �� : "+hashSet.size());
	}

}


