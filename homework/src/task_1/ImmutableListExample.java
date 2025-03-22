package task_1;

import java.util.Collections;
import java.util.List;

public class ImmutableListExample {
    private final List<String> items;

    public ImmutableListExample( List<String> items) {
        this.items = Collections.unmodifiableList(items);
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "ImmutableListExample{" +
                "items=" + items +
                '}';
    }
}