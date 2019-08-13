package com.collabera.practice.extractvowels;
import java.util.Scanner;

public class ExtractVowels {

	static void vowelsOnly() {
		
		//prompt user for input
		System.out.print("Write a string and press enter: ");
		Scanner input = new Scanner(System.in);
		String userIn = input.nextLine();
		
		//replace all consonants with nothing
		String vowelsOnly = userIn.replaceAll("[^AaeEiIoOuU]", "");
		
		//output
		System.out.println(vowelsOnly);
		input.close();
	}

}
