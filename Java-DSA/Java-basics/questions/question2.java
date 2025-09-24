import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the Circle: ");
        double radius = scanner.nextInt(); 
        //Area of Circle
        double Area = radius * radius * Math.PI; 
        System.out.print("The area of the cirle is: " + Area);

        scanner.close();
    }
}
