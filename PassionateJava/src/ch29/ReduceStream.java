package ch29;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceStream {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
		//* #1
		BinaryOperator<String> lc = (s1, s2)-> {
			if (s1.length() > s2.length()) {
				//System.out.println(s1);
				return s1;
			} else {
				//System.out.println(s2);
				return s2;
			}
		};
		
		String str = ls.stream()
						.reduce("", lc);
		//*/
		
		/* #2
		String str = ls.stream()
						.reduce("", 
							(s1, s2)-> {
								if (s1.length() > s2.length()) {
									//System.out.println(s1);
									return s1;
								} else {
									//System.out.println(s2);
									return s2;
								}
						});
		//*/
		System.out.println(str);
	}

}
