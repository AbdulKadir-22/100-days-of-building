public class StudentClass { //class
    String name;
    int studentID;
    double cgpa;
    static int numberOfStudent;

    //constructor
    StudentClass(String name,int studentID, double cgpa){
        this.name = name;
        this.studentID = studentID;
        this.cgpa = cgpa;
        numberOfStudent++;
    }

    void displayProfile(){
        System.out.println("The Name of student is: " + this.name);
        System.out.println("The studentID of student is: " + this.studentID);
        System.out.println("The CGPA of the student is: " + this.cgpa + "\n\n");
    }

    static void showStudent(){
        System.out.println("Total number of students we have are: " + numberOfStudent);
    }
}
