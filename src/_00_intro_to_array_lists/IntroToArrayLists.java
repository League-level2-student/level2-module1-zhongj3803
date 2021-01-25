package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("this");
		list.add("is");
		list.add("a ");
		list.add("string");
		list.add("arraylist eee");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for (String s:list) {
			System.out.println(s);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i<list.size();i=i+2) {
			System.out.println(list.get(i));
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for (int i = list.size()-1; i>=0;i--) {
			System.out.println(list.get(i));
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println(list.get(4));
	}
}
