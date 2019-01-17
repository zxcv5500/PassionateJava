package ch28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Administrator
 * static 메소드의 참조
 * l인자를 받아서 같은 l인자를 소모하는 경우 메소드 참조 방식으로 표시할 수 있다.
 */
class ArrangeList2 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        ls = new ArrayList<>(ls);

        Consumer<List<Integer>> c = Collections::reverse;
        c.accept(ls);
        System.out.println(ls);
    }
}