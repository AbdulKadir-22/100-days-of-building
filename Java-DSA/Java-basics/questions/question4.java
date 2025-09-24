import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 0){
            System.out.println("0 is not odd or even");
        }
        else if(number % 2 == 0){
            System.out.println(number + " is Even");
        }
        else{
            System.out.println(number + "is Odd");
        }
        scanner.close();
    }
    
}
