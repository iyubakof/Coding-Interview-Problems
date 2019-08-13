package com.collabera.practice.startwith;

import java.util.Scanner;

public class StartWith {
	void printWords(Character lowerCase, Character upperCase) {
		//variables
		String userIn;
		String[] words;
		
		//prompt user for input
		System.out.print("Write a string and press enter: ");
		Scanner input = new Scanner(System.in);
		userIn = input.nextLine();
		
		//split words of string
		words = userIn.split(" ");
		//cycle through array
		for(int i=0; i<words.length;i++) {
			//check first character
			if(words[i].charAt(0) == lowerCase || words[i].charAt(0) == upperCase) {
				//output
				System.out.println(words[i]);
			}
		}	
		input.close();
	}

}
