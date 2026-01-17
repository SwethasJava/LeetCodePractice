package Practice;

public class Department {

    public String departmentName;
    public String departmentNumber;

    public String getDepartmentName() {
        return departmentName;
    }

    public Department(String departmentName, String departmentNumber) {
        this.departmentName = departmentName;
        this.departmentNumber = departmentNumber;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
}
