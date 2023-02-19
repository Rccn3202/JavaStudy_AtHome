package chap12_javabaseModules.sec03;

import java.util.HashSet;

import personal.wordIndex.E;

//HashSet은 동등 객체를 중복 저장하지 않는다.
public class HashSetEx {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);
		System.out.println("저장된 객체 수: "+hashSet.size());
		
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체 수: "+hashSet.size());
		
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체 수: "+hashSet.size());

	}

}

//원래 s1, s2, s3 이렇게 세개가 저장되어야 하지만 s1과 s2는 동등 객체이므로 하나만 저장된다.