package study.code.inter;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set = new HashSet<>(list);

        // list를 iterator를 이용하여 출력
        Iterator<Integer> intIter = list.iterator();

        while (intIter.hasNext()) {
            System.out.println(intIter.next());
        }

        // set을 iterator를 이용해서 출력
        Iterator<Integer> setInter = set.iterator();

        while (setInter.hasNext()) {
            System.out.println(setInter.next());
        }
    }
}