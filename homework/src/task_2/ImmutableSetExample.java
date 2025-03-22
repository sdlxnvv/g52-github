package task_2;

import java.util.Set;

public class ImmutableSetExample {
    private final Set<Integer> numbers;

    public ImmutableSetExample(Set<Integer> numbers) {
        this.numbers = Set.copyOf(numbers);
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "ImmutableSetExample{" +
                "numbers=" + numbers +
                '}';
    }
}
