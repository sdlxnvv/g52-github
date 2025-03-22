package task_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name = "Murod's department";
        List<ImmutableDepartment> immutableDepartments = new ArrayList<>();
        ImmutableDepartment immutableDepartment = new ImmutableDepartment("department1", "new york");
        ImmutableDepartment immutableDepartment1 = new ImmutableDepartment("department2", "abu dabi");
        ImmutableDepartment immutableDepartment2 = new ImmutableDepartment("department3", "los angelas");
        immutableDepartments.add(immutableDepartment);
        immutableDepartments.add(immutableDepartment1);
        ImmutableUniversity immutableUniversity = new ImmutableUniversity(name, immutableDepartments);
        immutableDepartments.add(immutableDepartment2);
        System.out.println(immutableUniversity);


    }
}
