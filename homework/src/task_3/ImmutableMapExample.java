package task_3;

import java.util.Map;

public class ImmutableMapExample {
    private final Map<String, String> data;

    public ImmutableMapExample(Map<String, String> data) {
        this.data = Map.copyOf(data);
    }

    public Map<String, String> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ImmutableMapExample{" +
                "data=" + data +
                '}';
    }
}