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
    }
	
	public void rotateWithSameSpace(int[] nums, int k) {
		k = k % nums.length;
		reverseArray(nums, 0, nums.length -1);
		reverseArray(nums, 0, k -1);
		reverseArray(nums, k, nums.length -1);
		
		for(int i = 0; i < nums.length; i++) {
        	System.out.print(nums[i]+ "\t");
        }
	}
	
	public void reverseArray(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6};
		RotateArray ra = new RotateArray();
//		ra.rotate(nums, 3);
		ra.rotateWithSameSpace(nums, 3);
	}
}
