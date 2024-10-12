package Interview_Programs;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesWithArrayListToSet {
	public static void main(String[] args) {
		// Create an ArrayList and add some elements
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(40);

		// Display ArrayList elements
		System.out.println("ArrayList: " + arrayList);

		// Create a Set (HashSet) to store unique elements and a list for duplicates
		Set<Integer> uniqueSet = new HashSet<>();
		List<Integer> duplicateList = new ArrayList<>();

		// Loop through the ArrayList and find duplicates
		for (Integer item : arrayList) {
			if (!uniqueSet.add(item)) {
				// If item can't be added to Set (meaning it's a duplicate), add to duplicateList
				duplicateList.add(item);
			}
		}

		// Display unique Set and duplicate List
		System.out.println("Unique Set: " + uniqueSet);
		System.out.println("Duplicate List: " + duplicateList);
	}
}



