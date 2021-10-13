package sef.module7.sample;

public class SetterGetterSample{

	public static void main(String arg[]){
		
		//With exposed impelmentation, an object can have values passed to it
		//that may be contrary to it's design
		
		PersonSampleOne p1 = new PersonSampleOne();
		p1.name=null;
		p1.age=-1000;
		
//		//Will not allow improper fields to be set by throwing an exception
//		PersonSampleTwo p2 = new PersonSampleTwo("John Doe", 10, "male");
//
//		System.out.println("Person nr1 age: " + p1.age);
//		System.out.println("Person nr1 name: " + p1.name);
//
//		System.out.println("Person nr2 age: " + p2.getAge());
////		System.out.println("Person nr2 name: " + p2.getName());

		PersonSampleTwo p3 = new PersonSampleTwo("Sarah Johnson", 22, "female");

//		System.out.println("--- Person info ---");
//		System.out.println("Name and Surname: " + p3.getName());
//		System.out.println("Age: " + p3.getAge());
//		System.out.println("Gender: " + p3.getGender());
	}
}
