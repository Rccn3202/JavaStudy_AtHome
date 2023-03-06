package chap17_Stream.sec04;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx02 {

	public static void main(String[] args) {
		String[] strArray = {"È«±æµ¿", "½Å¿ë±Ç","±è¹Ì³ª"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item+","));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream	= Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item+","));
		System.out.println();
		
	}

}
