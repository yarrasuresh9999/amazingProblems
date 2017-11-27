package com.leet.easy;

/* 
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */

public class RotateArray {

	public void rotate(int[] nums, int k) {
        int[] temp = nums.clone();
        int newIndex;
        int newK = k % temp.length;
        
        for(int i = 0; i < temp.length; i++) {
            if((i+newK) > (temp.length -1)) {
                newIndex = i + newK - temp.length;
            }
            else {
                newIndex = i + newK; 
            }
            nums[newIndex] = temp[i];
        }
        for(int i = 0; i < nums.length; i++) {
        	System.out.print(nums[i]+ "\t");
        }
    }
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6};
		RotateArray ra = new RotateArray();
		ra.rotate(nums, 3);
	}
}
