package ch29;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStream2 {

	public static void main(String[] args) {
		String[] names = {"YOON", "LEE", "PARK"};
		
		Arrays.stream(names)
				.forEach(s->System.out.println(s));

	}

}
