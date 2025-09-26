package Inheritance;

public class Person {

    String firstName;
    String lastName;
    
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void name(){
        System.out.println("The name of this person is: " + this.firstName + " " + this.lastName);
    }
}
