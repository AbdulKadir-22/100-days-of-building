package Inheritance;

public class Teachers extends Person{
    String Subjects;
    
    Teachers(String firstName, String lastName, String Subjects){
        super(firstName, lastName);
        this.Subjects = Subjects;
    }

    void showSubject(){
        System.out.println("The Subject of " + this.firstName + "is: " + this.Subjects);
    }
}
