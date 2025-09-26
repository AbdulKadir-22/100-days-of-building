package Inheritance;

public class Students extends Person{

    double GPA;
    
    Students(String firstName, String lastName, double GPA){
        super(firstName, lastName);
        this.GPA = GPA;
    }

    void showGPA(){
        System.out.println("The GPA of student " + this.firstName + "is: " + this.GPA);
    }
}
