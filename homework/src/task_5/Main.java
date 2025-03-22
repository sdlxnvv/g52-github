package task_5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String name = "Murod";
        Set<String> cities = new HashSet<>();
        cities.add("new york");
        cities.add("india");
        ImmutableCountry immutableCountry = new ImmutableCountry(name, cities);
        cities.add("bangladesh");
        System.out.println(immutableCountry);
    }
}
