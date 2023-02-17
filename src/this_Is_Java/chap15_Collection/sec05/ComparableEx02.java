package chap15_Collection.sec05;

import java.util.TreeSet;

public class ComparableEx02 {

	public static void main(String[] args) {
		//���ڸ� ������ TreeSet �÷��� ����
		TreeSet<Fruit> treeSet=new TreeSet<Fruit>(new FruitComparator());
		
		//��ü ����
		treeSet.add(new Fruit("����",3000));
		treeSet.add(new Fruit("����",10000));
		treeSet.add(new Fruit("����",6000));
		
		//��ü�� �ϳ��� ��������
		for(Fruit fruit : treeSet) {
			System.out.println(fruit.name+":"+fruit.price);
		}
	}

}
