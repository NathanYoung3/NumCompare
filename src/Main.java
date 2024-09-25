import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        double num1 = 0;
        double num2 = 0;
        Scanner scan = new Scanner(System.in);

        //for number 1
        System.out.println("Enter the first number.");
        if (scan.hasNextDouble()) {
            num1 = scan.nextDouble();
        } else {
            System.out.println("You have entered an invalid data type.");
            System.exit(0);
        }

        //for number 2
        System.out.println("Enter the second number.");
        if (scan.hasNextDouble()) {
            num2 = scan.nextDouble();
        } else {
            System.out.println("You have entered an invalid data type.");
            System.exit(0);
        }

        //compares the numbers
        if (num1 > num2) {
            System.out.println("Number one is greater than number two.");
        } else if (num1 < num2) {
            System.out.println("Number one is less than number two.");
        } else {
            System.out.println("Number one and number two are equal.");
        }
    }
}