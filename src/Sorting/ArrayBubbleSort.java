package Sorting;

import java.util.Scanner;

public class ArrayBubbleSort {
	public int arr[];
	public int length;
private void getElements() {
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter number of elements in array:");
	length = reader.nextInt();
	arr = new int[length];
	System.out.println("Enter array items:");
	for(int i = 0; i <length; i ++) {
		arr[i] = reader.nextInt();
	}
}

private void displayArray() {
	for(int i = 0; i<length; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}

private void sortArray() {
	for(int outer = length-1;outer>=1;outer--) {
		for(int inner = 0; inner<outer; inner++) {
			if(arr[inner]>arr[inner+1])
				swap(inner);
		}
	}
}

private void swap(int inner) {
	int temp = arr[inner];
	arr[inner] = arr[inner+1];
	arr[inner+1]=temp;
}

public  static void main(String args[]) {
	ArrayBubbleSort obj = new ArrayBubbleSort();
	obj.getElements();
	System.out.println("Array entered: ");
	obj.displayArray();
	obj.sortArray();
	System.out.println("Sorted Array: ");
	obj.displayArray();
}
}
