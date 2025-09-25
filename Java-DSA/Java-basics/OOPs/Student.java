import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentClass student1 = new StudentClass("Abdulkadir",131, 8.80);
        StudentClass student2 = new StudentClass("Sog",28, 7.25);
        StudentClass student3 = new StudentClass("Zed",120, 9.10);

        student1.displayProfile();
        student2.displayProfile();
        student3.displayProfile();



        scanner.close();
    }
}