package chap06_Class.sec07;

public class KoreanEx01 {

	public static void main(String[] args) {
		//Korean01 ��ü ����
		Korean01 k1 = new Korean01("���ڹ�","011225-1234567");
		//Korean01 ��ü ������ �б�
		System.out.println("k1.nation : "+k1.nation);
		System.out.println("k1.name : "+k1.name);
		System.out.println("k1.ssn : "+k1.ssn);
		System.out.println();
		
		//�� �ٸ� Korean01 ��ü ����
		Korean01 k2 = new Korean01("���ڹ�","930525-0654321");
		//�� �ٸ� Korean01 ��ü ������ �б�
		System.out.println("k2.nation : "+k2.nation);
		System.out.println("k2.name : "+k2.name);
		System.out.println("k2.ssn : "+k2.ssn);
	}

}
