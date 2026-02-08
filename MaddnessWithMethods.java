import java.util.Scanner;

public class MaddnessWithMethods {

    public static void main(String[] args) {
        // We "call" our input method twice to get two separate numbers
        int firstNum = getAnIntFromTheUser();
        int secondNum = getAnIntFromTheUser();

        // We pass those two numbers into our comparison method
        compareTwoInts(firstNum, secondNum);

        // We pass those numbers into our sum method and catch the "returned" result
        int total = sumTwoInts(firstNum, secondNum);
        System.out.println("The sum of the two integers is: " + total);
    }

    // METHOD 1: Asks the user for a number and returns it to main
    public static int getAnIntFromTheUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userNum = input.nextInt();
        return userNum;
    }

    // METHOD 2: Adds two numbers and returns the result
    public static int sumTwoInts(int num1, int num2) {
        return num1 + num2;
    }

    // METHOD 3: Just prints which number is bigger
    public static void compareTwoInts(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal!");
        }
    }
}