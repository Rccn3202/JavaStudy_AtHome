package chap15_Collection.sec03;

public class Member {
	//�ʵ� ����
	public String name;
	public int age;
	
	//�����ڸ� ���ؼ� name�� age�� �޾Ƽ� �ʵ忡 ������
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//hashCode ������
	@Override
	public int hashCode() {
		return name.hashCode() + age;	//���ڿ� �ؽ��ڵ忡 age�� ���ϰ� ����/name�� age�� ���� ������ ������ hashcode�� ���ϵȴ�
										//�����ü�� �޶� name�� age�� ������ �Ȱ��� hashcode�� ���´�
	}
	
	//equals ������
	@Override
	public boolean equals(Object obj) {
	 if(obj instanceof Member) {		//obj�� Member ��ü�� ���Դ��� Ȯ��, �������� target���� ����Ÿ�Ժ�ȯ
		 Member target = (Member)obj;	//å������ if(obj instanceof Member target)���� ���(�ڹ� 12����)
		 return target.name.equals(name) && (target.age==age); 	//target�� name�� �ʵ��� name�� ������ Ȯ��&age ������ Ȯ��->�� �� true�� ���;� true�� �����Ѵ�.
	 } else {
		 return false;
	 }
   }	
}
