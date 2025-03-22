package task_9;

public class ImmutablePerson {
    private String name;
    private Integer age;

    public ImmutablePerson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public ImmutablePerson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
