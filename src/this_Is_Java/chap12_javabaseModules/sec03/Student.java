package chap12_javabaseModules.sec03;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) { 
		this.no = no;	//�ܺηκ��� no�� �޾Ƽ� ���� �ʵ�(this.no)�� ����
		this.name = name;
	}

	public int getNo() { return no; }	//�ʵ尡 private �̹Ƿ� �ܺο��� no���� ���� �� �ֵ��� getter
	public String getName() { return name; }
	
	@Override	//object�� �����ִ� �޼ҵ带 ������ �ϰڴ�.
		public int hashCode() {		//�ؽ��ڵ� �޼ҵ� ������:��ü���� �ؽ��ڵ尡 �ٸ��� ���ü�� �����ڵ带 ���ٰ� �ϰڴ�
			int hashCode = no + name.hashCode();	//no�� int���̹Ƿ� �׳� no, name�� String Ÿ���̹Ƿ� '���ڿ� ���� �ؽ��ڵ�' name.hashCode()
			return hashCode;	//��ȣ�� �̸��� ������ ������ �ؽ��ڵ� ����
		}
	
	@Override
	public boolean equals(Object obj) {	
		if(obj instanceof Student) {	//obj��� ��ü�� Student Ŭ�����κ��� �����������?, ��������ٸ� Strudent Ÿ������ ���� Ÿ�Ժ�ȯ
			Student target = (Student) obj;
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
