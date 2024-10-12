package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration 
		ArrayList myList = new ArrayList();
		
		//List mylist2 = new ArrayList();
		
		//ArrayList <String> myList3 = new ArrayList();
		
		myList.add("Hakim");
		myList.add("Tabassum");
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add("Hakim");
		myList.add("Tabassum");
		
		//Size of Array-list
		System.out.println("Size of ArrayList :" +	myList.size());
		
		//Printing ArrayList
		System.out.println("Printing Data from ArrayList :"+ myList);
		
		//Remove element from ArrayList
		myList.remove(6);
		System.out.println("After removing element at 6th index :" + myList);
		
		//Insert element at specific index
		myList.add(2, "Tabbu");
		System.out.println("After Inserting element at ( index 2:" +myList.get(2)+ ") List is :"+ myList);
		
		//Replace/modify
		myList.set(4, 50);
		System.out.println("After replcaing list element at 4th index:" +myList);
		
		//Accessing specific element 
		System.out.println(myList.get(4));
		
		//Reading elements from ArrayList using For-Loop
		/* 
		  for(int i =0; i<myList.size();i++) {
			System.out.println("myList element at index "+ i + " is : " +myList.get(i));
			}
		*/
		
		//Reading elements from ArrayList using Iterator
		Iterator it = myList.iterator();
		//System.out.println(it.next());
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		//Remove all specific elements from ArrayList
		List myList2 = new ArrayList();
		
		myList2.add("Hakim");
		myList2.add("Tabassum");
		
		myList.removeAll(myList2);
		
		System.out.println("After removing myList2 "+myList2+"elements from myList" +myList);
		
		//Checking ArrayList isEmpty or Not
		System.out.println("Is ArrayList is Empty :" +myList.isEmpty() );
		
		//Remove all Elements from ArrayList / Clear all
		myList.clear();
		System.out.println(myList);
		System.out.println("Is ArrayList is Empty :" +myList.isEmpty());
		
	}

}
