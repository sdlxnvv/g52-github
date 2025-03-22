package task_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name = "Murod";
        List<String> hobbies = new ArrayList<>();
        hobbies.add("play pubg");
        hobbies.add("play cs2");
        hobbies.add("play football");
        ImmutablePerson immutablePerson = new ImmutablePerson(name, hobbies);
        hobbies.add("play basketball");
        name = "Aziz";
        System.out.println(immutablePerson);
    }
}
