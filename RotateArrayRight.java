package com.prog;

public class RotateArrayRight {
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		int n=3;
		System.out.println("Original Array");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]+ " ");
		}
		for (int i = 0; i < n; i++) {
			int j, last;
			last = num[num.length-1];
			for ( j = num.length-1; j > 0; j--) {
				num[j]=num[j-1];
			}
			 num[j]= last;
		}
		System.out.println("After rotate the Array");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}

}
