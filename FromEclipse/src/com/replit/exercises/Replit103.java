package com.replit.exercises;
import java.util.Scanner;
public class Replit103 {

	public static void main(String[] args) {
		/*
		 * Write a for loop that will print out each letter of the string s, separated
		 * by spaces, on the same line.
		 * 
		 * Sample input/outputs:
		 * 
		 * In: hello  output: h e l l o
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("In:");
		String s=input.nextLine();
		
		// to loop each character
		for (int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(i)+" ");
		}
		

	}

}
