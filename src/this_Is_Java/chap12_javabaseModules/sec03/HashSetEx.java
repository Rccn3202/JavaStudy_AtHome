package chap12_javabaseModules.sec03;

import java.util.HashSet;

import personal.wordIndex.E;

//HashSet�� ���� ��ü�� �ߺ� �������� �ʴ´�.
public class HashSetEx {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "ȫ�浿");
		hashSet.add(s1);
		System.out.println("����� ��ü ��: "+hashSet.size());
		
		Student s2 = new Student(1, "ȫ�浿");
		hashSet.add(s2);
		System.out.println("����� ��ü ��: "+hashSet.size());
		
		Student s3 = new Student(2, "ȫ�浿");
		hashSet.add(s3);
		System.out.println("����� ��ü ��: "+hashSet.size());

	}

}

//���� s1, s2, s3 �̷��� ������ ����Ǿ�� ������ s1�� s2�� ���� ��ü�̹Ƿ� �ϳ��� ����ȴ�.