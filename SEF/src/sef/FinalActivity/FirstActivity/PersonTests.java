package sef.FinalActivity.FirstActivity;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PersonTests {

    @Test(expected = StringContainsNumberException.class)
    public void StringContainsNumberExceptionIncorrectObjectTest() {
        Person person = new Person ("1", 32);
        String name = person.getName();
    }

    @Test(expected =  StringContainsNumberException.class)
    public void StringContainsNumberExceptionIncorrectSetNameTest() {
        Person person = new Person("Diana", 32);
        person.setName("1");
    }

    @Test()
    public void nameTest() {
        Person p = new Person("1", 32);
        p.setName("Diana");
        assertEquals("Diana", p.getName());
    }

    @Test()
    public void nameSurname() {
        Person p = new Person("1", 32);
        p.setSurname("Matjuseva");
        assertEquals("Matjuseva", p.getSurname());
    }

    @Test()
    public void nameAge() {
        Person p = new Person("1", 32);
        p.setAge(11);
        assertEquals(11, p.getAge());
    }

    @Test
    public void introduceTest() {
        Person p = new Person("1", 32);
        p.setAge(20);
        p.setName("Diana");
        assertEquals("My name is Diana and I am 32 years old", p.introducePerson());
    }
}

