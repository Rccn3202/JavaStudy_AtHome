package chap15_Collection.sec05;

import java.util.TreeSet;

public class ComparableEx01 {

	public static void main(String[] args) {
		//TreeSet �÷��� ����
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		//��ü ����
		treeSet.add(new Person("ȫ�浿",45));
		treeSet.add(new Person("���ڹ�",25));
		treeSet.add(new Person("������",31));
		
		//��ü�� �ϳ��� ��������
		for(Person person : treeSet) {
			System.out.println(person.name+":"+person.age);
		}
	}
}
