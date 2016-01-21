package Comparator;

import java.util.*;

public class ExampleComparator {
    private String name;

    public ExampleComparator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ExampleComparator{" +
                "name='" + name + '\'' +
                '}';
    }

    public static class SortByNames implements Comparator<ExampleComparator> {

        public int compare(ExampleComparator o1, ExampleComparator o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void main(String[] args) {
        List<ExampleComparator> list = new ArrayList<>();
        list.add(new ExampleComparator("Book"));
        list.add(new ExampleComparator("Apple"));
        list.add(new ExampleComparator("Juice"));
        list.add(new ExampleComparator("Banana"));
        Collections.sort(list, new ExampleComparator.SortByNames());


        Iterator<ExampleComparator> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}