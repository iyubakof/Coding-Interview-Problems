package com.collabera.practice.fizzbuzz;

public class FizzBuzz {

	void printValues() {
		//variables
		String pStr;
		
		//iterate from 1 to 100
		for(int i=1;i<=100;i++) {
			//check conditions
			if(i%3 ==0 & i%5 ==0) {
				pStr = "FizzBuzz";
				System.out.println(pStr);
			}else if(i%3==0) {
				pStr = "Fizz";
				System.out.println(pStr);
			}else if(i%5 == 0) {
				pStr = "Buzz";
				System.out.println(pStr);
			}else {
				System.out.println(i);
			}
		}

	}

}
