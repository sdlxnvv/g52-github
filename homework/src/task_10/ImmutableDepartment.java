package task_10;

public class ImmutableDepartment {
    private String departmentName;
    private String departmentAddress;

    public ImmutableDepartment(String departmentName, String departmentAddress) {
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
    }

    public ImmutableDepartment() {
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    @Override
    public String toString() {
        return "ImmutableDepartment{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                '}';
    }
}
