
public class Test {

	public static void main(String[] args) {
		Scannaer sc=new Scanner(System.in);
		School sch=new School();
		
		sch.school2=sc.next();
		sch.grade2=sc.nextInt();
		
		System.out.println(grade+"grade in"+school+"School");
		System.out.println(sch.grade2+"grade in"+sch.school+"School");
	
	}
	
		class School{
			String school = "jejuelementary";//학교명
			int grade = 6; //학년
			String school2;
			int grade2;
			
		}
		
		
		
		

	}

}
