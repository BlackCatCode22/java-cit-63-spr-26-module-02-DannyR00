import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking for three numbers
        System.out.print("Enter first integer: ");
        int a = input.nextInt();

        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.print("Enter third integer: ");
        int c = input.nextInt();

        // Finding the largest using nested if-statements
        if (a >= b) {
            if (a >= c) {
                System.out.println("The largest integer is: " + a);
            } else {
                System.out.println("The largest integer is: " + c);
            }
        } else {
            // This part runs if 'b' is bigger than 'a'
            if (b >= c) {
                System.out.println("The largest integer is: " + b);
            } else {
                System.out.println("The largest integer is: " + c);
            }
        }

        input.close();
    }
}