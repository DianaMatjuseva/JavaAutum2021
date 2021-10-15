package sef.FinalActivity.FirstActivity;

import sef.FinalActivity.FirstActivity.Person;

public class Students extends Person {

    private String schoolName;

    public Students(String name, int age) {

        super("1", 32);
    }
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchool(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String introducePerson() {
        return String.format("I study in university %d", schoolName);
    }





}
