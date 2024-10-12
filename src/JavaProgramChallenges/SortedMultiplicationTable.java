package JavaProgramChallenges;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Scanner;

	public class SortedMultiplicationTable {
	    public static void main(String[] args) {
	        // Create a scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Input: A single integer
	        int n = scanner.nextInt();

	        // Create a list to store the multiplication results
	        List<String> multiplicationTable = new ArrayList<>();

	        // Generate the multiplication table
	        for (int i = 1; i <= 10; i++) {
	            // Format: n x i = (n * i)
	            multiplicationTable.add(n + " x " + i + " = " + (n * i));
	        }

	        // Sort the multiplication table based on the product
	        Collections.sort(multiplicationTable, new Comparator<String>() {
	            @Override
	            public int compare(String s1, String s2) {
	                // Extract the product from each string and compare
	                int product1 = Integer.parseInt(s1.split(" = ")[1]);
	                int product2 = Integer.parseInt(s2.split(" = ")[1]);
	                return Integer.compare(product1, product2);
	            }
	        });

	        // Print the sorted multiplication table
	        for (String result : multiplicationTable) {
	            System.out.println(result);
	        }

	        // Close the scanner object
	        scanner.close();
	    
	}

}
