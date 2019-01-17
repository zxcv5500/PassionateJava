package ch28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort {
    public void sort(List<?> lst) {    // 인스턴스 메소드
        Collections.reverse(lst);
    }
}

/**
 * @author Administrator
 * 인스턴스의 메소드 참조
 * 사실상 상수인 인스턴스 변수를 사용하는 경우 메소드 참조 형식으로 표시할 수 있다.
 */
class ArrangeList3 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);
        JustSort js = new JustSort();			// js는 effectively final(사실상 상수)인 경우에 메소드 참조 방식이 허용된다.

        Consumer<List<Integer>> c = e -> js.sort(e);
        c.accept(ls);
        System.out.println(ls);
//        js = null; //js의 참조를 끊거나 다른 참조 변수를 대입하는 등의 사실상 상수 형태가 아닌 경우 컴파일 단에서 에러 표시함.
    }
}