package com.prog;

public class ArrayFrequency {
	public static void main(String[] args) {
		int[] ar = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int[] arr = new int[ar.length];
		int visited = -1;
		for (int i = 0; i < ar.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
					arr[j] = visited;
				}
			}
			if (arr[i] != visited)
				arr[i] = count;
		}

		System.out.println("---------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != visited)
				System.out.println("    " + ar[i] + "    |    " + arr[i]);
		}
	}

}
