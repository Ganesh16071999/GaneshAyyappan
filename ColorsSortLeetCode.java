package com.prog;

public class ColorsSortLeetCode {
	 public void sortColors(int[] nums) {
	        int temp=0;
	        int ar[]= new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	           for(int j=i+1;j<nums.length;j++){
	                if(nums[i]>nums[j])  {
	                    temp=nums[i];
	                    nums[i]=nums[j];
	                    nums[j]=temp;

	                    ar[i]=nums[i];
	                } 
	           }
	        }
	        
	        System.out.println(ar);
	    }

}
