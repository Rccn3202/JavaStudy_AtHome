package chap13_Generic.sec01;

public class GenericEx {

	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "æ»≥Á«œººø‰";
		String str = box1.content;
		System.out.println(str);
		
		//Box<Integer> box2 = new Box<String>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
		

	}

}
