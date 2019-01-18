package ch30;

import java.util.stream.Stream;

/**
 * @author Administrator
 * Stream.concat()
 * 각 스트림으로 존재하는 것을 합쳐 주는 역할을 함
 */
class ConcateStringStream {

	public static void main(String[] args) {
		Stream<String> ss1 = Stream.of("Cake", "Milk");
		Stream<String> ss2 = Stream.of("Lemon", "Jelly");
		
		// 스트림을 하나로 묶은 후 출력
		Stream.concat(ss1, ss2).forEach(s->System.out.println(s));
	}

}
