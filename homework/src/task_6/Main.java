package task_6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String studentName = "Murod";
        Map<String, Double> grades = new HashMap<>();
        grades.put("key1", 32.1);
        grades.put("key2", 239.2);
        ImmutableStudentGrades immutableStudentGrades = new ImmutableStudentGrades(studentName, grades);
        grades.put("key3", 123.32);
        System.out.println(immutableStudentGrades);
    }
}
