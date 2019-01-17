package ch29;

import java.util.Arrays;
import java.util.List;

class MapToInt {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "Robot", "Simple");
		
		ls.stream()
			.map(s->s.length())		// 반환형이 int지만 Integer 반환해야 해서 
									// 오토박싱과 언박싱이 일어나서 성능이 저하될 수 있다 
			.forEach(n->System.out.print(n + "\t"));
		
		System.out.println();
	}

}
