package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
