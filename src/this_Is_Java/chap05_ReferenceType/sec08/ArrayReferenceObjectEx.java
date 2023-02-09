package chap05_ReferenceType.sec08;
//*객체를 참조하는 배열
//String[] str=new String[3];  :  힙에 String 3칸짜리 배열을 생성, 스택에 str을 생성하고 힙String의 주소를 저장 
public class ArrayReferenceObjectEx {

	public static void main(String[] args) {
		String[] str=new String[3];
		str[0]="Java";
		str[1]="Java";
		str[2]=new String("Java");
		
		System.out.println(str[0]==str[1]);  //힙 주소 10번지는 같으니까 t
		System.out.println(str[0]==str[2]);  //힙 주소 다르므로(10번지,30번지) f
		System.out.println(str[0].equals(str[2]));  //10번지의 내용과 30번지의 내용이 같으므로 t

	}

}
