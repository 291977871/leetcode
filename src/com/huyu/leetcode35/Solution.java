package com.huyu.leetcode35;

/**
 * @author ：HuYu
 * @date ：Created in 2022/4/27 21:57
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        if(nums ==null || nums.length==0){
            return 0;
        }
        for (int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    public int searchInsert2(int[] nums, int target) {
        if(nums ==null || nums.length==0){
            return 0;
        }
        int length = nums.length;
        int left=0,right=length-1,ans = length;
        while (left<=right){
            int mid = ((right-left) >>1) +left;
            if(target <= nums[mid]){
                ans = mid;
                right = mid-1;
            }else{
                left = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        Solution solution = new Solution();
        int i = solution.searchInsert2(nums, target);
        System.out.println(i);
    }


}
