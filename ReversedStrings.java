import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Ask the user for a string
        System.out.print("Enter a string to reverse: ");
        String original = input.nextLine();

        // This will hold the reversed version
        String reversed = "";

        // Loop through the string backwards
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Output the result
        System.out.println("Reversed: " + reversed);

        input.close(); // Good practice to close the scanner!
    }
}