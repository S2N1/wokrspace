package com.seeburger.task;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		CreateArrays array = new CreateArrays();

		CreateArrays array1 = new CreateArrays();

		CreateArrays sumArray = new CreateArrays();

		BigInteger[] bigIntArray = array.createArray();
		BigInteger[] bigIntArray1 = array1.createArray();

		BigInteger[] sumBigIntArray = sumArray.sumArrays(bigIntArray, bigIntArray1);

		System.out.println(Arrays.toString(sumBigIntArray));

	}
}
