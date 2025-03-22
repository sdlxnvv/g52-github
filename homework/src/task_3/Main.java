package task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> helper = new HashMap<>();
        helper.put("key1", "murod");
        helper.put("key2", "aziz");
        ImmutableMapExample immutableMapExample = new ImmutableMapExample(helper);
        helper.put("key3", "oybek");
        System.out.println(immutableMapExample);
    }
}
