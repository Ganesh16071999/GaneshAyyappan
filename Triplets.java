package com.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Triplets {
	public static void main(String[] args) {

		HashSet<ArrayList<Integer>> resultSet = new HashSet<ArrayList<Integer>>();

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Length of an Array : ");
		int length = scan.nextInt();

		int[] nums = new int[length];

		System.out.println("Enter '" + length + "' values to insert in an Array");
		for (int i = 0; i < length; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println("Input Array : " + Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums.length; j++) {

				for (int k = 0; k < nums.length; k++) {

					if ((i != j && i != k && j != k) && (nums[i] + nums[j] + nums[k] == 0)) {

						ArrayList<Integer> tempResult = new ArrayList<Integer>();
						tempResult.add(nums[i]);
						tempResult.add(nums[j]);
						tempResult.add(nums[k]);

						Collections.sort(tempResult);
						resultSet.add(tempResult);
					}
				}
			}
		}
		System.out.println("Output Set : " + resultSet);
		scan.close();
	}

}
