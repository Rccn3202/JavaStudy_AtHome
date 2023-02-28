package chap13_Generic.Example;

import java.awt.Container;

public class ContainerEx02 {

	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("ȫ�浿");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
	}
}
