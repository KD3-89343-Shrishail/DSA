package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2_Q4 {

	public static int NthOcurr(int []arr, int nth,  int value) {
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				index++;
			}
			if(index == nth) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8,9,6,10,3,6};
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the  nth occurence value to find..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to find..");
		int index = NthOcurr(arr, sc.nextInt(), sc.nextInt());
		if(index != -1) {
			System.out.println("Last occurence of: "+arr[index]+" at "+index);
		}else {
			System.out.println("Element not exists in the arr");
		}
		sc.close();

	}

}
