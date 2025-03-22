package task_2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(32);
        nums.add(2390);
        nums.add(20949);
        ImmutableSetExample immutableSetExample = new ImmutableSetExample(nums);
        nums.add(123);
        System.out.println(immutableSetExample);
    }
}
