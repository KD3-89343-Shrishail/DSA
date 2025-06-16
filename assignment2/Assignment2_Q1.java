package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2_Q1 {

	public static int lastIndex(int []arr, int value) {
		int index = -1;
		for(int i = arr.length-1; i >=0; i--) {
			if(arr[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9,6,10};
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the value to find..");
		Scanner sc = new Scanner(System.in);
		int index = lastIndex(arr, sc.nextInt());
		if(index != -1) {
			System.out.println("Last occurence of: "+arr[index]+" at "+index);
		}else {
			System.out.println("Element not exists in the arr");
		}
		sc.close();
	}

}
