package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class ComplexObjectCollect {

    public static  void main(String args[])
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", new Department("HR", "D01"), 30),
                new Employee("Bob", new Department("IT", "D02"), 28),
                new Employee("Ch", new Department("IT", "D02"), 30),
                new Employee("Charlie", new Department("Finance", "D03"), 35)
        );

        long hrCount=employees.stream().filter(employee-> employee.department.getDepartmentName().equalsIgnoreCase("IT")).count();
        Map<String, List<Employee>> map=employees.stream().collect(Collectors.groupingBy(employee-> employee.department.getDepartmentName()));

        System.out.println("Number of empoyeess in IT "+hrCount);



        // sort employees by age ascending

        List<Employee> sortedEmp = employees.stream()
                .sorted(Comparator.comparingInt(employee -> employee.age))
                .collect(Collectors.toList());

        // List of all employees in IT Department
        List<Employee>empList=employees.stream().filter(employee -> employee.department.getDepartmentName().equalsIgnoreCase("IT")).collect(Collectors.toList());

        // list of employee names in ascending order -- Returns employee list sorted
        List<Employee>empNameList=employees.stream().sorted(Comparator.comparing(employee -> employee.name)).collect(Collectors.toList());

        //return employee names in ascending order
        List<String> empNameListSorted = employees.stream()
                .map(emp -> emp.name)
                .sorted()
                .collect(Collectors.toList());

        //finding oldest emp

        Optional<Employee> oldestEmployee = employees.stream()
                .max(Comparator.comparingInt(emp -> emp.age));


       /* //Nested Sorting -- Department alphabetically, and emp by age
        List<Employee> sortedEmployees = employees.stream()
                .sorted(
                        Comparator.comparing(emp1->emp1.getDepartmentName())
                                .thenComparing(emp -> emp.age)
                )
                .collect(Collectors.toList());*/



    }
}
