package task_9;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String teamName = "nimadur";
        Set<ImmutablePerson> immutablePeople = new HashSet<>();
        ImmutablePerson immutablePerson = new ImmutablePerson("Murod", 16);
        ImmutablePerson immutablePerson1 = new ImmutablePerson("Aziz", 20);
        immutablePeople.add(immutablePerson);
        immutablePeople.add(immutablePerson1);
        ImmutableTeam immutableTeam = new ImmutableTeam(teamName, immutablePeople);
        immutablePeople.add(new ImmutablePerson());
        System.out.println(immutableTeam);

    }
}
