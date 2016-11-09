package com.seeburger.task;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateArrays {

	// Creating array

	public BigInteger[] createArray() {
		try {
			BigInteger[] array = new BigInteger[0];
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of your array : ");

			int size = sc.nextInt();
			array = new BigInteger[size];

			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter the numbers of your array : ");
				BigInteger index = sc.nextBigInteger();
				array[i] = index;

			}
			return array;
		} catch (InputMismatchException e) {
			System.out.println("Please enter only numbers!");
		}
		return null;
	}

	// Addition

	public BigInteger[] sumArrays(BigInteger[] arr1, BigInteger[] arr2) {
		try {
			if (compareArr(arr1, arr2)) {
				BigInteger[] sumArr = new BigInteger[arr1.length];
				for (int i = 0; i < arr1.length; i++) {
					sumArr[i] = arr1[i].add(arr2[i]);

				}
				return sumArr;
			} else {
				System.out.println("The arrays that you want to sum have different lenght.");

			}

		} catch (NullPointerException e) {
			System.out.println("There are no numbers in this array, please check your array.");

		}
		return null;
	}

	// Subtraction

	public BigInteger[] substractArrays(BigInteger[] arr1, BigInteger[] arr2) {
		try {
			if (compareArr(arr1, arr2)) {
				BigInteger[] sumArr = new BigInteger[arr1.length];
				for (int i = 0; i < arr1.length; i++) {
					sumArr[i] = arr1[i].subtract(arr2[i]);

				}
				return sumArr;
			} else {
				System.out.println("The arrays that you want to substract have different lenght.");

			}

		} catch (NullPointerException e) {
			System.out.println("There are no numbers in this array, please check your array.");

		}
		return null;
	}

	// Multiplication

	public BigInteger[] multiplyArrays(BigInteger[] arr1, BigInteger[] arr2) {
		try {
			if (compareArr(arr1, arr2)) {
				BigInteger[] sumArr = new BigInteger[arr1.length];
				for (int i = 0; i < arr1.length; i++) {
					sumArr[i] = arr1[i].multiply(arr2[i]);

				}
				return sumArr;
			} else {
				System.out.println("The arrays that you want to multiple have different lenght.");

			}

		} catch (NullPointerException e) {
			System.out.println("There are no numbers in this array, please check your array.");

		}
		return null;
	}

	// Method used for comparing the arrays
	private boolean compareArr(BigInteger[] arr1, BigInteger[] arr2) {
		if (arr1.length == arr2.length) {
			return true;

		}

		return false;

	}
}