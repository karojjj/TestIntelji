package com.replit.exercises;

public class Replit83 {

	public static void main(String[] args) {
		/*
		 * Write a program that calculates the sum of elements from each row in a 2D
		 * array and adds them into array of integers
		 * 
		 * For example, if we run rowSums for the following 2D array: //sum = 4 {1,1,
		 * 2}, //sum = 6 {3,1,2}, //sum = 11 {3,5,3}, //sum = 3 {0,1,2} } } Then we
		 * should get the following array back:
		 * 
		 * 4 6 11 3
		 */
		int[][] a = {

				{ 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		int sum=0;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length;j++) {
				sum+=a[i][j];
				
			}
			System.out.println(sum);
			 sum=0; // eger bir onceki ile toplapini isteseydi sum=0; yapmaya gerek kalmaz
		}

	}
}
