package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2_Q3 {
	
	public static int binarySearch(int []arr, int target) {
		int s = 0;
		int e = arr.length-1;
		int mid = s + (e-s)/2;
		while(s <= e) {
			if(arr[mid] == target) {
				return mid;
			}else if( arr[mid] < target) {
				e= mid-1;
			}else {
				s = mid+1;
			}
			mid = s + (e-s)/2;
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arr = {9, 8, 7,6 ,5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the value to find..");
		Scanner sc = new Scanner(System.in);
		int index = binarySearch(arr, sc.nextInt());
		if(index != -1) {
			System.out.println("Element occur at: "+index+ " and value is: "+arr[index]);
		}else {
			System.out.println("Element not exists in the arr");
		}
		sc.close();

	}

}
