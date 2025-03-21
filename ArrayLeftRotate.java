package day_1;

import java.util.Arrays;

public class ArrayLeftRotate {

	public static void rotateLeft(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}

		int firstElement = arr[0];

		// Shift all elements to the left by one position
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}

		// Move the first element to the end of the array                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		arr[arr.length - 1] = firstElement;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array: " + Arrays.toString(arr));

		rotateLeft(arr);

		System.out.println("Array after Left Rotation: " + Arrays.toString(arr));
	}
}
