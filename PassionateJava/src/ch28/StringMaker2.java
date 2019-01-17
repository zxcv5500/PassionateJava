package ch28;

import java.util.function.Function;

/**
 * @author Administrator
 * Function<T, R> 인 참조변수형인 경우 생성자 메서드 참조로 표시할 수 있다.
 */
class StringMaker2 {

	public static void main(String[] args) {
		Function<char[], String> f = String::new;
		
		char[] src = {'R', 'o', 'b', 'o', 't'};
		String str = f.apply(src);
		System.out.println(str);
	}

}
//Function<T, R>    R apply(T t)
