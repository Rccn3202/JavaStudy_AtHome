package chap12_javabaseModules.sec03;
//toString �������̵� �ϱ�
public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override		//toString() �޼ҵ� ������-���ϸ� @������� ��µȴ�
	public String toString() {
		return company + ", " + os;	//�� ��Ĵ�� ��µǰ� ��
	}
	
}
