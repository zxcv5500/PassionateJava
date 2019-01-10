package ch28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort4 {
    public void sort(List<?> lst) {    // 인스턴스 메소드
        Collections.reverse(lst);
    }
}

class ArrangeList4 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);
        JustSort4 js = new JustSort4();

        Consumer<List<Integer>> c = js::sort;
        c.accept(ls);
        System.out.println(ls);
    }
}