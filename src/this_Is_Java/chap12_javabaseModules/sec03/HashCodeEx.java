package chap12_javabaseModules.sec03;
//��ü �ؽ��ڵ� ��
public class HashCodeEx {

	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		
		if(s1.hashCode() == s2.hashCode()) {	//�ؽ��ڵ� ���� ������ ��-������ �߱� ������ �����
			if(s1.equals(s2)) {
				System.out.println("���� ��ü");
			} else {
				System.out.println("�����Ͱ� �ٸ��Ƿ� ���� ��ü �ƴ�");
			}
		} else {
			System.out.println("�ؽ��ڵ尡 �ٸ��Ƿ� ���� ��ü �ƴ�");
		}

	}

}
