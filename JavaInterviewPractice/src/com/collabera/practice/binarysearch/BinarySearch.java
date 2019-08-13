package com.collabera.practice.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	//variables
	static int userIn;
	static Integer[] arr = new Integer[5];
	static int result;

	void searchFunction() {
		
		//Prompt user to key in elements
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a number from 0-9 and press enter to fill the array."
							+ "\nDo this 5 times.\n");
		//input
		for(int i = 0;i < arr.length;i++) {
			userIn = sc.nextInt();
			arr[i] = userIn;
		}
			
		//sort array
		Arrays.sort(arr);
		
		//search method
		search(sc);
	}
	
	static void search(Scanner in){
		//variables
		Scanner menu = new Scanner(System.in);
		int sel;
		
		//User keys in element to search
		System.out.println("=====================================================");
		System.out.println("Key in a number from 0-9 to search for in the array.");
		userIn = in.nextInt();
		//binary search
		result = Arrays.binarySearch(arr, userIn);
		if(result >=0) {
			System.out.println(userIn + " was found at position " + result + " in the array.");
			System.out.println("=====================================================");
			//search again or exit
			System.out.print("Enter 1 to search again. Enter 2 to exit: ");
			sel = menu.nextInt();
			if(sel == 1) {
				search(in);
			} else if(sel == 2) {
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}else {
			System.out.println(userIn + " was not found in the array.");
			System.out.println("=====================================================");
			//search again or exit
			System.out.print("Enter 1 to search again. Enter 2 to exit: ");
			sel = menu.nextInt();
			if(sel == 1) {
				search(in);
			} else if(sel == 2) {
				System.out.println("Goodbye!");
				menu.close();
				in.close();
				System.exit(0);
			}
		}
		
	}

}
