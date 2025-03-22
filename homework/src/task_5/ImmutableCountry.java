package task_5;

import java.util.Set;

public class ImmutableCountry {
    private final String name;
    private final Set<String> cities;

    public ImmutableCountry(String name, Set<String> cities) {
        this.name = name;
        this.cities = Set.copyOf(cities);
    }

    public String getName() {
        return name;
    }

    public Set<String> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "ImmutableCountry{" +
                "name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }
}
