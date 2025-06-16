package assignment3;

import java.util.Arrays;

public class Assignment3_Q1 {
	
	public static void insertionSort(int arr[], int n) {
		for(int i = 1; i < n; i++) {
			int temp = arr[i];
			int j;
			for(j = i-1; j >= 0; j--) {
				if(temp > arr[j]) {
					arr[j+1] = arr[j];
				}else {
					break;
				}
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {55,44,22,66,11,33};
		int n = arr.length;
		insertionSort(arr, n);
		System.out.println(Arrays.toString(arr));

	}

}
