package com.replit.exercises;

public class Replit93 {

	public static void main(String[] args) {
		/*
		 * For you to do: String �abracadabra alakazam�;
		 * Print out the position of the first occurrence of "c". 
		 * Print out the position of the first occurrence of " ". 
		 * Print out the position of the first occurrence of the variable target1. 
		 * Print out the position of the first* occurrence of the variable target2.
		 */
		String str = "abracadabra alakazam";
	    String target1 = "dab";
	    String target2 = "ABRA";
	    System.out.println(str.indexOf("c"));
	    System.out.println(str.indexOf(" "));
	    System.out.println(str.indexOf("dab"));
	    System.out.println(str.indexOf("ABRA"));
	    
	}

}
