package ch30;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Administrator
 * 기존 스트림의 데이터 기반으로 조건식에 따라서 다수의 데이터로 쪼개고 하나의 스트림에 다시 포함시킨다.
 */
class FlatMapStream {

	public static void main(String[] args) {
		Stream<String> ss1 = Stream.of("MY_AGE", "YOUR_LIFE");
		
		Stream<String> ss2 = ss1.flatMap(s->Arrays.stream(s.split("_")));
		ss2.forEach(s->System.out.print(s + "\t"));
		
		System.out.println();
	}

}
