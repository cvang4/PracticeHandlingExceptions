package Validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        //Throws exception for the name length.
        if(name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name cannot be null, empty, or over 40 characters in length.");
        }

        //Throws excpetion for age.
        if(age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120!");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
