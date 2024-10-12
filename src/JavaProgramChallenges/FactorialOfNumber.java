package JavaProgramChallenges;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input: A single integer
        int n = scanner.nextInt();

        // Calculate the factorial of n
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;  // Multiply factorial by each i
        }

        // Output: The factorial of the input integer
        System.out.println(factorial);

        // Close the scanner object
        scanner.close();
    }
}