package JavaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSet is a class implements Set Interface
		//1.Hetrogenious data - allowed
		//2.Insertion Order -  Not preserved (Index not supported)
		//3.Duplicate elements - Not Allowed
		//4.Multiple Null not allowed/ Only single null is allowed
		
		//Declaration
		//HashSet mySet = new HashSet();
		Set<Object> mySet = new HashSet<Object>();
		
		mySet.add("Hakim");
		mySet.add(100);
		mySet.add(10.5);
		mySet.add(300);
		mySet.add(10);
		
		mySet.add(null);
		mySet.add(null);
		
		System.out.println(mySet); //[null, Hakim, 100, 10.0, 200, 300]
		
		//Remove element from set
		System.out.println(mySet.remove(10.5));
		System.out.println("After removing elements from Set :"+mySet);
		
		//Inserting element at specific position - NOT POSSIBLE ***************
		
		//Accessing specific element - NOT POSSIBLE ***************
		
		//Convert HashSet to -->> ArrayList
		ArrayList <Object> al = new ArrayList<Object>(mySet);
		
		System.out.println(al); //[null, Hakim, 100, 10, 300]
		System.out.println("Accessing specific element by index after converting HashSet to ArrayList" + al.get(2));
		
		
		//Read all the element by using for..each loop
		for(Object a:mySet) {
			System.out.println("Reading Elements using forach loop :" +a);
		}
		
		System.out.println("*************************************************:");
		
		//Read all the element by using Iterator
		Iterator<Object> iterator = mySet.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println("Reading Elements using Iterator :" + iterator.next());
		}
		
		//Clearing value from mySet
		mySet.clear();
		System.out.println(mySet);
		
		

		
	}

}
