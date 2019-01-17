package ch28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class ArrangeList {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);

        Consumer<List<Integer>> c = l -> Collections.reverse(l);		// l 인자를 던져서 l을 소모하는 람다식 형태인 경우
        																// 메서드 참조 형식으로 사용할 수 있다
        c.accept(ls);
        System.out.println(ls);
    }
}