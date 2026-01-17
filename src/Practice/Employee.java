package Practice;

public class Employee {
    public String name;
    public Department department;
    public int age;

    public Employee(String name, Department department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
