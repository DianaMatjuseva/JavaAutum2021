package sef.FinalActivity.FirstActivity;

public class Person {

    public Person(String s, int i) {

    }

    public Person(String name, String surname, int age) {

        this.name = name;
        this.surname = checkIfContainsNumbers(name);
        this.age = age;
    }

    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = checkIfContainsNumbers(name);
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String introducePerson() {
        return String.format("My name is %s and I am %d years old", getName(), getAge());
    }

    public String checkIfContainsNumbers(String str) {
        if (str.matches("[a-zA-Z]+")) {
            return str;
        } else {
            throw new StringContainsNumberException(String.format("Provided string: %s contains number", str));
    }


    }
}
