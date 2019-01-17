package ch28;

import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 * 자주 사용하는 System.out.println 메소드로 인스턴스 메소드 참조를 다시 한번 사용해 본 코드 
 */
public class ForEachDemo {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Box", "Robot");
		
		// 람다식 기반
		ls.forEach(s->System.out.println(s));
		
		// 람다식 메소드 참조 기반
		ls.forEach(System.out::println);
	}

}
