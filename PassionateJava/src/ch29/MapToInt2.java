package ch29;

import java.util.Arrays;
import java.util.List;

class MapToInt2 {

	public static void main(String[] args) {
List<String> ls = Arrays.asList("Box", "Robot", "Simple");
		
		ls.stream()
			.mapToInt(s->s.length())		// Integer로 반환하지 않고 int형으로 반환 받고 싶은 경우 사용하는 map의 한종류 메서드
			.forEach(n->System.out.print(n + "\t"));
		
		System.out.println();
	}

}
