package java8_features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class F3_StreamsSortExample_NonPrimitive {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("a", 100));
        emp.add(new Employee("b", 700));
        emp.add(new Employee("c", 500));
        emp.add(new Employee("d", 200));

        System.out.println("\nsorting employee object with Name in Descending order");
        Collections.sort(emp, ((o1, o2) ->  (o2.name.compareTo(o1  .name))));
        for (Employee employee:emp) {
            employee.getEmployeeDetails();
        }

        // Sorting using streams api method sorted()
        System.out.println("\nsorting using streams sorted method");
        emp.stream().sorted((o1, o2) -> (o1.salary-o2.salary)).forEach(Employee::getEmployeeDetails);

        // Sorting using Collections method sort()
        System.out.println("\nsorting employee object with salary");
        Collections.sort(emp, ((o1, o2) ->  (o1.salary-o2.salary)));
        for (Employee employee:emp) {
            employee.getEmployeeDetails();
        }


    }
}


class Employee{
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Name: "+name+" Employee Salary : "+salary);
    }

}
