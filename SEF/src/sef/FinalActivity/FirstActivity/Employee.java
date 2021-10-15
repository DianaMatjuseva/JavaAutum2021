package sef.FinalActivity.FirstActivity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Employee extends Person {

    public String jobTitle;
    public String company;
    public int salary;

    public Employee(String name, int age, String jobTitle, String company, int salary) {

        super("1", 32);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;

    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;

    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String introducePerson() {
        return String.format("My name is %s and I am %d years old. I am working as %s in %s.\n", getName(), getAge(), getJobTitle(), getCompany());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", company=" + company + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void writeEmployeeToTheFile(List<Employee> employees) {
        try {
            FileWriter myWriter = new FileWriter("employees.txt");
            for (Employee employee : employees)
                myWriter.append(String.format("Name: %s. Job title: %s. Company: %s. Salary: %s.\n",
                        employee.getName(), employee.getJobTitle(), employee.getCompany(), employee.getSalary()));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
