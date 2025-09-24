import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {
        // Write a program to calculate the simple interest given Principal, Rate, and
        // Time.
        Scanner scanner = new Scanner(System.in);
        int principal;
        double rate;
        int time;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextInt();

        System.out.print("Enter the rate: ");
        rate = scanner.nextInt();

        System.out.print("Enter the time(in years): ");
        time = scanner.nextInt();

        double simple_interest = (principal * rate * time) / 100;
        System.out.print("The simple interest is: " + simple_interest);

        scanner.close();
    }
}