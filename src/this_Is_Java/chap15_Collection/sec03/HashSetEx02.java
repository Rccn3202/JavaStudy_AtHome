package chap15_Collection.sec03;
//Set�� ���� �ٸ� ��ü���� ���ü(�̸�,���� ����)��� �Ǵ��ϸ� �ϳ��� �����Ѵ�
import java.util.HashSet;
import java.util.Set;

public class HashSetEx02 {

	public static void main(String[] args) {
		//HashSet �÷��� ����
		Set<Member> set = new HashSet<Member>();	//set�������̽� Ÿ���� ���� ����, <Member>Ÿ�Ը� �����ϰڴ�
		
		//Member ��ü ����
		set.add(new Member("ȫ�浿", 30));	//�ΰ��� �����ü ����
		set.add(new Member("ȫ�浿", 30));	//���� �ٸ� ��ü���� �̸�,���̰� �����Ƿ� ���ü�� �Ǵ�. ���� ����Ǵ� ���� �ϳ�

		//����� ��ü �� ���
		System.out.println("�� ��ü �� : " + set.size());	//1 ���´�
	}

}
