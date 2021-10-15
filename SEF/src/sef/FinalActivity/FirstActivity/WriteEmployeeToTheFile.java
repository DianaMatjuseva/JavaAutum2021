package sef.FinalActivity.FirstActivity;

import java.util.ArrayList;
import java.util.List;


import static sef.FinalActivity.FirstActivity.Employee.writeEmployeeToTheFile;

public class WriteEmployeeToTheFile {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivan", 25, "QA", "Accenture", 1000);
        Employee employee2 = new Employee("Diana", 21, "QA", "Accenture", 1000);
        Employee employee3 = new Employee("John", 24, "QA", "Accenture", 1000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        writeEmployeeToTheFile(employeeList);
    }
}
