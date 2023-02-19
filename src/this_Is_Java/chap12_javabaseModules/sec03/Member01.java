package chap12_javabaseModules.sec03;

public class Member01 {
	public String id;
	
	
	
	public Member01(String id) {
		this.id = id;
	}



	//���� id(�� ����)�� ���� ���� id�� ������ ���ϰ��� �Ѵ�
	@Override	//equals �޼ҵ带 �������Ѵ�
	public boolean equals(Object obj) {	//������, ��� �ڹ� ��ü�� Object Ŭ������ ����� �����Ƿ� �� ���� �����ϴ�
		if(obj instanceof Member01) { //�׷��� ���� Member01 ��ü�� �����ֱ� ������ obj�� ������ ��ü�� Member01�� ���� ������������� �˾ƺ���
			Member01 m = (Member01) obj; //obj�� Member01�� Ÿ�Ժ�ȯ ���ش�
			if(id.equals(m.id)) {	//���� ���� id(�� ����)�� m�� ������ �ִ� id�� ����?
				return true;
			}
		}// �ȿ� �ִ� if�� ���� if�� ��� true�� �� true ����, �������� false
		return false;	//���� Member01 ���� �ٸ� ��ü�� ������ �񱳰� �ȵǹǷ� else�� false�� �����Ѵ�
	}
	
}
