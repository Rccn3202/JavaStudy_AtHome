package chap05_ReferenceType.sec08;
//*��ü�� �����ϴ� �迭
//String[] str=new String[3];  :  ���� String 3ĭ¥�� �迭�� ����, ���ÿ� str�� �����ϰ� ��String�� �ּҸ� ���� 
public class ArrayReferenceObjectEx {

	public static void main(String[] args) {
		String[] str=new String[3];
		str[0]="Java";
		str[1]="Java";
		str[2]=new String("Java");
		
		System.out.println(str[0]==str[1]);  //�� �ּ� 10������ �����ϱ� t
		System.out.println(str[0]==str[2]);  //�� �ּ� �ٸ��Ƿ�(10����,30����) f
		System.out.println(str[0].equals(str[2]));  //10������ ����� 30������ ������ �����Ƿ� t

	}

}
