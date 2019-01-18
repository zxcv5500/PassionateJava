package ch30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Administrator
 *
 */
class StreamOfStream {

	public static void main(String[] args) {
		// ex 1
		Stream.of(11, 22, 33, 44)
			.forEach(n->System.out.print(n + "\t"));
		System.out.println();
		
		// ex 2
		Stream.of("So Simple")
			.forEach(s->System.out.print(s + "\t"));
		System.out.println();
		
		// ex 3
		List<String> sl = Arrays.asList("Toy", "Robot", "Box");		
		Stream.of(sl)			// 리스트 sl 참조변수를 대상으로 스트림을 생성했기 때문에 list참조변수 하나가 있는 스트림을 생성한다.
			.forEach(w->System.out.print(w + "\t"));
		System.out.println();
	}

}
