package Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ExampleSortTreeSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(1);
        list.add(8);
        list.add(23);

        TreeSet<Integer> sortTreeSet = new TreeSet<Integer>(list);
        System.out.println(sortTreeSet);
    }
}
