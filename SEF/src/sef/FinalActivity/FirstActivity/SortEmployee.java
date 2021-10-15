package sef.FinalActivity.FirstActivity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {

        // Sort by name and surname

        Employee employee1 = new Employee("Sam", "Hols", 23);
        Employee employee2 = new Employee("Di", "Kri", 22);
        Employee employee3 = new Employee("San", "Lo", 28);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        employeeList.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSurname));
        for (Employee employee :
                employeeList) {
            System.out.println(employee);
        }

    }
}
