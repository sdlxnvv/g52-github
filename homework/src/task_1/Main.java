package task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> helper = new ArrayList<>();
        helper.add("aziz");
        helper.add("murod");
        helper.add("ali");
        ImmutableListExample immutableListExample = new ImmutableListExample(helper);
        helper.add("vali");
        System.out.println(immutableListExample);
    }
}
