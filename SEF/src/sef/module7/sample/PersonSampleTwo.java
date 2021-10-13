package sef.module7.sample;

public class PersonSampleTwo {

	private String name;
	private int age;

	private String gender;
	private final String eyeColor = "blue";

	
	public PersonSampleTwo(String name, int age, String gender){
		setName(name);
		setAge(age);
		setGender(gender);
	}
	
	public final void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("Name cannot be null!");
		}
		this.name = name;
	}
	
	public  String getName(String name){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public final void setAge(int age){
		if(age < 0){
			throw new IllegalArgumentException("Age cannot be negative!");
		}
		this.age = age;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if(gender.equals("male") || gender.equals("female")) {
			this.gender = gender;
		}
		else {
			throw new IllegalArgumentException("Only two possibilities for gender are available - Male or Female");
		}
	}

	public String getEyeColor() {
		return eyeColor;
	}
}


