import java.util.Scanner;

public class question3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the double number: ");
        double double_num = scanner.nextDouble();

        int int_num = (int) double_num;

        System.out.println("The answer of double is : " + double_num);
        System.out.printf("The answer of int is : " + int_num);

        scanner.close();
    }
}
