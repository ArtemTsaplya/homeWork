package Comparator;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class NameComparator {
    private String name;
    private int age;

    public NameComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }




    public static void main(String[] args) {
        Set<NameComparator> set = new HashSet<>();
        set.add(new NameComparator("Artem", 21));
        set.add(new NameComparator("Lera", 2));
        set.add(new NameComparator("Leha", 7));
        set.add(new NameComparator("Masha", 11));



        set.stream().forEach(s -> System.out.println(s));
    }
}
