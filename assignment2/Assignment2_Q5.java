package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2_Q5 {
	
	public static int Rank(int []arr, int value) {
		int rank = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= value) {
				rank++;
			}
		}
		return rank == 0 ? -1 : rank;
	}
	public static void main(String[] args) {
		int []arr = {};
		if(arr.length < 1) {
			System.out.println("Empty arr");
			return;
		}
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to find..");
		int index = Rank(arr, sc.nextInt());
		if(index != -1) {
			System.out.println("Rank is "+index);
		}else {
			System.out.println("Element not exists in the arr");
		}
		sc.close();

	}

}
