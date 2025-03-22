package task_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String departmentName = "Murod";
        Map<String, List<String>> employeeProjects = new HashMap<>();
        List<String> names = new ArrayList<>();
        names.add("bir");
        names.add("ikki");
        names.add("uch");
        employeeProjects.put("key1", names);
        ImmutableDepartment immutableDepartment = new ImmutableDepartment(departmentName, employeeProjects);
        employeeProjects.put("key23", names);
        System.out.println(immutableDepartment);
    }
}
