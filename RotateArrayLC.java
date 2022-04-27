package com.prog;

public class RotateArrayLC {
	public void rotate(int[] nums, int k) {
        int length = nums.length;
        int temp [] = new int[length];
        for(int i =0; i<length; i++){
                int fp = (i+k)%length;
                temp[fp]=nums[i];
        }
        for(int i=0;i<length;i++){
            nums[i]=temp[i];
        }
}

}
