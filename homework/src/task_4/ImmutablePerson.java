package task_4;

import java.util.List;

public class ImmutablePerson {
    private final String name;
    private final List<String> hobbies;

    public ImmutablePerson(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = List.copyOf(hobbies);
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
