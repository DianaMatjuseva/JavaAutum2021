package sef.FinalActivity.FirstActivity;

import java.util.*;

public class FirstActivity implements Comparator<Employee> {

    public int compare(Employee a, Employee b) {
        return b.salary - a.salary;
    }

    static int i = 1;

    public static void main(String[] args) {

        // create list with object employee

        List<Employee> list = new ArrayList<Employee>();
        Employee employee1 = new Employee("Svetlana", 33, "QA", "Accenture", 1500);
        Employee employee2 = new Employee("John", 27, "Mailman", "postaloffice", 1000);
        Employee employee3 = new Employee("Tomass", 32, "Tester", "Accenture", 1600);
        Employee employee4 = new Employee("Ivan", 26, "Courier", "Bolt Food", 800);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        // printing out numbered unsorted list
        System.out.println("Unsorted List:");
        for (Employee val : list) {
            System.out.println(i++ + "." + val);
        }

        // using collections and sort from collections and comparator package to perform sorting

        Collections.sort(list, new FirstActivity());
        System.out.println();
        System.out.println("Sorted by salary List: ");
        int i = 1;

        // printing out numbered sorted list

        for (Employee val : list) {
            System.out.println(i++ + ". " + val);
        }
    }
}
