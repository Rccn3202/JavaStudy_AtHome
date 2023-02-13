package chap15_Collection.sec03;
//set�÷����� Ư�� ��ü�� ã�� ���
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx03 {

	public static void main(String[] args) {
		//HashSet �÷��� ����
		Set<String> set = new HashSet<String>();
		
		//��ü �߰� - �������� �����
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");	
		
		//1. While,hasNext(),next() �̿� ��ü�� �ϳ��� �����ͼ� ó��
		Iterator<String> iterator = set.iterator();	//set.iterator() :set�÷����� ���� iterator()�޼ҵ� ȣ��/Iterator<String> iterator �ݺ��� ��ü�� ����
		while(iterator.hasNext()) {	
			//��ü�� �ϳ� ��������
			String element =iterator.next();	
			System.out.println(element);
			if(element.equals("JSP")) {
				//������ ��ü�� �÷��ǿ��� ����
				iterator.remove();	//iterator�� ���� remove�ϸ� iterator���� ���ŵǴ� ���� �ƴ϶� set���� ���ŵ�/iterator�� ��ü�� �������� ����
			}
		}
		System.out.println();
		
		//��ü ����
		set.remove("JDBC");	//������ JSP ����� ���⼭ JDBC�� �������Ƿ� ������ Java�� Spring�� ���Ҵ�
		
		//2. ���� for �̿� ��ü�� �ϳ��� �����ͼ� ó��
		for(String element : set) {
			System.out.println(element);
		}
	}
}

/*2. ���� for���� �̷��� �̿��ϸ� �ȵȴ�!!
for(String element : set) {
	if(element.equals("Spring")) {
		set.remove(element);
	}
}
->set���� �����°� JSP��� set���� �����ض� �� ���ε� �ȵ� : for�� ������ �� �̹� ���� ��� �� ������ �����Ѵ�. 
for�� �ڽ��� 2�� �� ���̶�� �����ϰ� �ִµ� �߰��� �÷��� ��Ҹ� �ϳ� �����ϸ� ��Ұ� 1���ۿ� �ȳ��Ƽ� �������� for�� �� �� �����Ƿ� ��������.
���� set.remove("Spring");�� ���� ���� �̸� �����ؾ��Ѵ�.
�ݺ��� ������ ������� 1�� while�����
add()�� ��������..
*/