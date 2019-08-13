package com.collabera.practice.evenwordcount;

import java.util.Scanner;

public class EvenWordCount {

	static void countWords() {
		//variables
		String userIn;
		String[] words;
		int counter = 0;
		
		//prompt user for input
		System.out.print("Write a string and press enter: ");
		Scanner input = new Scanner(System.in);
		userIn = input.nextLine();
		
		//split words
		words = userIn.split(" ");
		
		//iterate through words in string
		for(int i=0;i<words.length;i++) {
			//check if even character length
			if((words[i].length())%2 == 0) {
				counter++;
			}
		}
		
		//output
		System.out.println("There are " + counter + " even words in this string.");
		input.close();
	}

}
